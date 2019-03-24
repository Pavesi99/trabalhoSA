package br.senai.sc.trabalhoFinalSA.dao;

import br.senai.sc.trabalhoFinalSA.modelo.Agenda;
import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import br.senai.sc.trabalhoFinalSA.modelo.Equipe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgendaEquipeDao extends ConnectionFactory {
    
    private Connection con;
    private Colaborador colaborador;

    public AgendaEquipeDao() {
        this.con = this.getConnection();
    }

   public void inserir(Agenda age, int col, int equ) throws SQLException {

        String sql = "insert into agenda "
                + "(criAge, comAge,codCol,codEqu, titAge, desAge) "
                + "values (?, ?, ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, age.getCriAge());
            st.setString(2, age.getComAge());
            st.setInt(3, col);
            st.setInt(4, equ);

            st.setString(5, age.getTitAge());
            st.setString(6, age.getDesAge());

            st.execute();
            st.close();
        }

        this.con.close();

    }

     public void eliminar(String comAge, String criAge, String desAge, String titAge, int codEqu) throws SQLException {

         Equipe equ = new Equipe();
         Colaborador col = new Colaborador();
         codEqu = col.getEquCol();
         
        String sql = "delete from agenda where criAge = ? and comAge = ? and titAge = ? and desAge = ?"
                + " and codEqu = ? ";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
           st.setString(1, criAge);
            st.setString(2, comAge);
            st.setString(3, titAge);
            st.setString(4, desAge);
            st.setInt(5, codEqu);
            st.execute();
            st.close();
        }

        this.con.close();

    }


    public void alterar(Agenda age, Colaborador equCol) throws SQLException {

        String sql = "update agenda set criAge = ?, comAge = ?, titAge = ?, desAge = ? where criAge = ? and"
                + "comAge = ? and titAge = ? and desAge = ? and codEqu = ? ";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
           st.setString(1, age.getCriAge());
           st.setString(2, age.getTitAge());
           st.setString(3, age.getDesAge());
           st.setString(4, age.getComAge());
           st.setString(5, age.getCriAge());
           st.setString(6, age.getTitAge());
           st.setString(7, age.getDesAge());
           st.setString(8, age.getComAge());
           st.setInt(9, equCol.getEquCol());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public List<Agenda> listarAgenda(int equCol) throws SQLException {
        String sql = "select * from agenda where codEqu = ?";
        List<Agenda> agendas = new ArrayList<Agenda>();
   
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, equCol);
         
            ResultSet rs = st.executeQuery();

            agendas = new ArrayList<Agenda>();

            while (rs.next()) {
                Agenda age = new Agenda();

         
                age.setCriAge(rs.getString("criAge"));
                age.setComAge(rs.getString("comAge"));
                age.setTitAge(rs.getString("titAge"));
                age.setDesAge(rs.getString("desAge"));
               
                agendas.add (age);
               
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return agendas;
    }

  
     public Agenda getAgendaEquipe(int codEqu) throws SQLException {
         
         Colaborador col = new Colaborador();
         codEqu = col.getEquCol();
        String sql = "select * from agenda where codEqu = ?";
        Agenda agenda = null;
 

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codEqu);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                agenda = new Agenda ();
                
                agenda.setCriAge(rs.getString("criAge"));
                agenda.setComAge(rs.getString("comAge"));
                agenda.setTitAge(rs.getString("titAge"));
                agenda.setDesAge(rs.getString("desAge"));
                
                     
                }
            }
            st.close();
        }

        this.con.close();
        return agenda;
    }
    
    
    

}

