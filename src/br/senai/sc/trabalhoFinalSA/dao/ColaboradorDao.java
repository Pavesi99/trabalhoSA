
package br.senai.sc.trabalhoFinalSA.dao;

import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColaboradorDao extends ConnectionFactory {
    
    private Connection con;

    public ColaboradorDao() {
        this.con = this.getConnection();
    }

    public void inserir(Colaborador col) throws SQLException {

        String sql = "insert into colaborador "
                + "(ruaCol, baiCol, "
                + "numCol, cepCol, cidCol, celCol, dddCol,"
                + "tipCol, usuCol, senCol, emaCol, utiCol, datCol, estCol) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, col.getRuaCol());
            st.setString(2, col.getBaiCol());
            st.setString(3, col.getNumCol());
            st.setLong(4, col.getCepCol());
            st.setString(5, col.getCidCol());
            st.setLong(6, col.getCelCol());
            st.setInt(7, col.getDddCol());
            st.setInt(8, col.getTipCol());
            st.setString(9, col.getUsuCol());
            st.setString(10, col.getSenCol());
            st.setString(11, col.getEmaCol());
            st.setString(12, col.getUtiCol());
            st.setString(13, col.getDatCol());
            //verificar se vai comecar como 1 o estCol
            st.setInt(14, 1);

            st.execute();
            st.close();
        }

        this.con.close();

    }

   
    public void eliminar(int estCol) throws SQLException {

        String sql = "update colaborador set estCol = 0";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, estCol);
            st.execute();
            st.close();
        }

        this.con.close();

    }


    public void alterar(Colaborador col) throws SQLException {

        String sql = "update colaborador set ruaCol = ?, baiCol = ?, "
                + "numCol = ?, cepCol = ?, cidCol = ?, celCol = ?, dddCol = ?,"
                + "tipCol = ?, usuCol = ?, senCol = ?, emaCol = ?, utiCol = ?,"
                + " datCol = ?, estCol = ?, where codcli = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
           st.setString(1, col.getRuaCol());
            st.setString(2, col.getBaiCol());
            st.setString(3, col.getNumCol());
            st.setLong(4, col.getCepCol());
            st.setString(5, col.getCidCol());
            st.setLong(6, col.getCelCol());
            st.setInt(7, col.getDddCol());
            st.setInt(8, col.getTipCol());
            st.setString(9, col.getUsuCol());
            st.setString(10, col.getSenCol());
            st.setString(11, col.getEmaCol());
            st.setString(12, col.getUtiCol());
            st.setString(13, col.getDatCol());
            st.setInt(14, 1);
            st.setInt(15, col.getCodCol());

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
                col.setRuaCol(rs.getString("ruaCol"));
                col.setBaiCol(rs.getString("baiCol"));
                col.setNumCol(rs.getString("numCol"));
                

                clientes.add(c);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return clientes;
    }

    public Cliente getCliente(int codcli) throws SQLException {
        String sql = "select * from cliente where codcli = ?";
        Cliente cliente = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codcli);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    cliente = new Cliente();
                    cliente.setCodcli(rs.getInt("codcli"));
                    cliente.setNomcli(rs.getString("nomcli"));
                    cliente.setEndcli(rs.getString("endcli"));
                    cliente.setBaicli(rs.getString("baicli"));
                    cliente.setComcli(rs.getString("comcli"));
                    cliente.setCepcli(rs.getLong("cepcli"));
                    cliente.setCelcli(rs.getLong("celcli"));
                }
            }
            st.close();
        }

        this.con.close();
        return cliente;
    }

}
}
