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
    
    Agenda agenda1 = new Agenda();

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

     public void eliminar(String criAge, String comAge, String titAge, String desAge, int codEqu) throws SQLException {
         
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


    public void alterar(Agenda age, Colaborador equCol, Agenda agenda) throws SQLException {
       

        String sql = "update agenda set criAge = ?, comAge = ?, titAge = ?, desAge = ? where criAge = ? and "
                + "comAge = ? and titAge = ? and desAge = ? and codEqu = ? ";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
           st.setString(1, age.getCriAge());
           st.setString(2, age.getComAge());
           st.setString(3, age.getTitAge());
           st.setString(4, age.getDesAge());
            System.out.println(age.getCriAge()+age.getComAge()+age.getTitAge()+age.getDesAge());
           st.setString(5, agenda.getCriAge());
           st.setString(6, agenda.getComAge());
           st.setString(7, agenda.getTitAge());
           st.setString(8, agenda.getDesAge());
          System.out.println(agenda.getCriAge()+agenda.getComAge()+agenda.getTitAge()+agenda.getDesAge());
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

  
     public Agenda getAgendaEquipe(int codEqu, String criAge, String comAge, String titAge, String desAge) throws SQLException {
         
 
        String sql = "select * from agenda where codEqu = ? and criAge = ? and comAge = ? and titAge = ? and desAge";
        Agenda agenda = null;
 

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codEqu);
            st.setString(2, criAge);
            st.setString(3, comAge);
            st.setString(4, titAge);
            st.setString(5, desAge);
            
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

