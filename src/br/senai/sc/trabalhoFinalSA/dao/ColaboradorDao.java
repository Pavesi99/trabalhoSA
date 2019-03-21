package br.senai.sc.trabalhoFinalSA.dao;

import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ColaboradorDao extends ConnectionFactory {

    private Connection con;

    public ColaboradorDao() {
        this.con = this.getConnection();
    }

    public void inserir(Colaborador col) throws SQLException {

        String sql = "insert into colaborador "
                + "(nomCol,ruaCol, baiCol, "
                + "numCol, cepCol, cidCol, celCol, dddCol,"
                + "tipCol, usuCol, senCol, emaCol, utiCol, datCol, estCol, equCol) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, md5(?), ?, ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, col.getNomCol());
            st.setString(2, col.getRuaCol());
            st.setString(3, col.getBaiCol());
            st.setInt(4, col.getNumCol());
            st.setInt(5, (int) col.getCepCol());
            st.setString(6, col.getCidCol());
            st.setInt(7, (int) col.getCelCol());
            st.setInt(8, col.getDddCol());
            st.setInt(9, col.getTipCol());
            st.setString(10, col.getUsuCol());
            st.setString(11, col.getSenCol());
            st.setString(12, col.getEmaCol());
            st.setString(13, col.getUtiCol());
            st.setString(14, col.getDatCol());
            //verificar se vai comecar como 1 o estCol
            st.setInt(15, col.getEstCol());
            st.setInt(16, col.getEquCol());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public Colaborador checar(String usuario, String senha) throws SQLException {
        String sql = "select * from colaborador where usuCol = ? and senCol = md5(?);";
        List<br.senai.sc.trabalhoFinalSA.modelo.Colaborador> colaboradores = null;
        Colaborador colaborador = null;
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, usuario);
            st.setString(2, senha);
            
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    colaborador = new Colaborador();
                    colaborador.setCodCol(rs.getInt("codCol"));
                    colaborador.setNomCol(rs.getString("nomCol"));
                    colaborador.setRuaCol(rs.getString("ruaCol"));
                    colaborador.setBaiCol(rs.getString("baiCol"));
                    colaborador.setNumCol(rs.getInt("numCol"));
                    colaborador.setCepCol(rs.getInt("cepCol"));
                    colaborador.setCidCol(rs.getString("cidCol"));
                    colaborador.setCelCol(rs.getInt("celCol"));
                    colaborador.setDddCol(rs.getInt("dddCol"));
                    colaborador.setTipCol(rs.getInt("tipCol"));
                    colaborador.setUsuCol(rs.getString("usuCol"));
                    colaborador.setSenCol(rs.getString("senCol"));
                    colaborador.setEmaCol(rs.getString("emaCol"));
                    colaborador.setUtiCol(rs.getString("utiCol"));
                    colaborador.setDatCol(rs.getString("datCol"));
                    colaborador.setEstCol(rs.getInt("estCol"));
                    colaborador.setEquCol(rs.getInt("equCol"));

                }
            }
            
            st.close();

        } catch (SQLException ex) {

            return null;
        }

        this.con.close();
        return colaborador;

    }

    public void eliminar(int estCol) throws SQLException {

        String sql = "update colaborador set estCol = 2";
//estatus = 0 significa que o colaborador esta inativel
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(2, estCol);
            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void alterar(Colaborador col) throws SQLException {
        System.out.println("aaaa"+col.getCodCol());
        String sql = "update colaborador set nomCol = ?, ruaCol = ?, baiCol = ?, "
                + "numCol = ?, cepCol = ?, cidCol = ?, celCol = ?, dddCol = ?,"
                + "tipCol = ?, emaCol = ?, utiCol = ?,"
                + " datCol = ?, estCol = ? where codCol = ?";
        System.out.println("get"+col.getCodCol());
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, col.getNomCol());
            st.setString(2, col.getRuaCol());
            st.setString(3, col.getBaiCol());
            st.setInt(4, col.getNumCol());
            st.setInt(5, col.getCepCol());
            st.setString(6, col.getCidCol());
            st.setInt(7, col.getCelCol());
            st.setInt(8, col.getDddCol());
            st.setInt(9, col.getTipCol());
            st.setString(10, col.getEmaCol());
            st.setString(11, col.getUtiCol());
            st.setString(12, col.getDatCol());
            st.setInt(13, col.getEstCol());
            st.setInt(14, col.getCodCol());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public List<Colaborador> listarColaboradores() throws SQLException {
        String sql = "select * from colaborador where estCol=1";
        List<Colaborador> colaboradores = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            colaboradores = new ArrayList<Colaborador>();

            while (rs.next()) {
                Colaborador col = new Colaborador();
                col.setCodCol(rs.getInt("codCol"));
                col.setNomCol(rs.getString("nomCol"));
                col.setRuaCol(rs.getString("ruaCol"));
                col.setBaiCol(rs.getString("baiCol"));
                col.setNumCol(rs.getInt("numCol"));

                col.setCepCol(rs.getInt("cepCol"));
                col.setCidCol(rs.getString("cidCol"));
                col.setCelCol(rs.getInt("celCol"));
                col.setDddCol(rs.getInt("dddCol"));
                col.setTipCol(rs.getInt("tipCol"));
                col.setUsuCol(rs.getString("usuCol"));
                col.setSenCol(rs.getString("senCol"));
                col.setEmaCol(rs.getString("emaCol"));
                col.setUtiCol(rs.getString("utiCol"));
                col.setDatCol(rs.getString("datCol"));
                col.setEstCol(rs.getInt("estCol"));

                colaboradores.add(col);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return colaboradores;
    }

    public Colaborador getColaborador(int codCol) throws SQLException {

        String sql = "select * from colaborador where codCol = ?";

        Colaborador colaborador = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codCol);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    colaborador = new Colaborador();
                    colaborador.setCodCol(rs.getInt("codCol"));
                    colaborador.setNomCol(rs.getString("nomCol"));
                    colaborador.setRuaCol(rs.getString("ruaCol"));
                    colaborador.setBaiCol(rs.getString("baiCol"));
                    colaborador.setNumCol(rs.getInt("numCol"));
                    colaborador.setCepCol(rs.getInt("cepCol"));
                    colaborador.setCidCol(rs.getString("cidCol"));
                    colaborador.setCelCol(rs.getInt("celCol"));
                    colaborador.setDddCol(rs.getInt("dddCol"));
                    colaborador.setTipCol(rs.getInt("tipCol"));
                    colaborador.setUsuCol(rs.getString("usuCol"));
                    colaborador.setSenCol(rs.getString("senCol"));
                    colaborador.setEmaCol(rs.getString("emaCol"));
                    colaborador.setUtiCol(rs.getString("utiCol"));
                    colaborador.setDatCol(rs.getString("datCol"));
                    colaborador.setEstCol(rs.getInt("estCol"));

                }
            }
            st.close();
        }

        this.con.close();
        return colaborador;
    }
    
 public void alterarSenha(int cod,String senha) throws SQLException {
        String sql = "update colaborador set senCol = md5(?) where codCol = ?";
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
           st.setString(1, senha);
            st.setInt(2, cod);
            st.execute();
            st.close();
        }

        this.con.close();

    }
  public void SetarUltimoAcesso(int codCliente) throws SQLException {


        String sql = "update colaborador set utiCol = CURDATE() where  codCol =?";


      
//estatus = 0 significa que o colaborador esta inativel

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
           
            st.setInt(1,codCliente);
            st.execute();
            st.close();
        }

        this.con.close();

    }
}
