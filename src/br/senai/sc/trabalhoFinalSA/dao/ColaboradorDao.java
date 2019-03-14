
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
                + "tipCol, usuCol, senCol, emaCol, utiCol, datCol, estCol) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, col.getNomCol());
            st.setString(2, col.getRuaCol());
            st.setString(3, col.getBaiCol());
            st.setString(4, col.getNumCol());
            st.setLong(5, col.getCepCol());
            st.setString(6, col.getCidCol());
            st.setLong(7, col.getCelCol());
            st.setInt(8, col.getDddCol());
            st.setInt(9, col.getTipCol());
            st.setString(10, col.getUsuCol());
            st.setString(11, col.getSenCol());
            st.setString(12, col.getEmaCol());
            st.setString(13, col.getUtiCol());
            st.setString(14, col.getDatCol());
            //verificar se vai comecar como 1 o estCol
            st.setInt(15, 1);
            

            st.execute();
            st.close();
        }

        this.con.close();

    }

   public boolean checar(String usuario,String senha)throws SQLException {
         String sql = "select * from colaborador where usuCol = ? and senCol = ?;";
        List<br.senai.sc.trabalhoFinalSA.modelo.Colaborador> colaboradores = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
        st.setString(1, usuario);
        st.setString(2, senha);
        st.execute();
        st.close();
         
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro na autenticação do Usuario e Senha");
          
            return false;
        }
         
        this.con.close();
           return true;
           
        
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

        String sql = "update colaborador set nomCol = ?, ruaCol = ?, baiCol = ?, "
                + "numCol = ?, cepCol = ?, cidCol = ?, celCol = ?, dddCol = ?,"
                + "tipCol = ?, usuCol = ?, senCol = ?, emaCol = ?, utiCol = ?,"
                + " datCol = ?, estCol = ?, where codCol = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, col.getNomCol());
           st.setString(2, col.getRuaCol());
            st.setString(3, col.getBaiCol());
            st.setString(4, col.getNumCol());
            st.setLong(5, col.getCepCol());
            st.setString(6, col.getCidCol());
            st.setLong(7, col.getCelCol());
            st.setInt(8, col.getDddCol());
            st.setInt(9, col.getTipCol());
            st.setString(10, col.getUsuCol());
            st.setString(11, col.getSenCol());
            st.setString(12, col.getEmaCol());
            st.setString(13, col.getUtiCol());
            st.setString(14, col.getDatCol());
            st.setInt(15, col.getEstCol());
            st.setInt(16, col.getCodCol());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public List<Colaborador> listarColaboradores() throws SQLException {
        String sql = "select * from colaborador";
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
                col.setNumCol(rs.getString("numCol"));
       
                 col.setCepCol(rs.getLong("cepCol"));
                    col.setCidCol(rs.getString("cidCol"));
                    col.setCelCol(rs.getLong("celCol"));
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
                    colaborador.setNumCol(rs.getString("numCol"));
                    colaborador.setCepCol(rs.getLong("cepCol"));
                    colaborador.setCidCol(rs.getString("cidCol"));
                    colaborador.setCelCol(rs.getLong("celCol"));
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

}

