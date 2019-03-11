/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA.dao;

import br.senai.sc.trabalhoFinalSA.modelo.Equipe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class EquipeDao extends ConnectionFactory {
    
    private Connection con;
    
    public EquipeDao() {
        this.con = this.getConnection();
    }
// A revisar

    public void inserir(Equipe equ) throws SQLException {
        
        String sql = "insert into equipe "
                + "(nomEqu,desEqu) "
                + "values (?, ?);";
        
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(2, equ.getNomEqu());
            st.setString(3, equ.getDesEqu());
            
            st.execute();
            st.close();
        }
        
        this.con.close();
        
    }
    
    public void eliminar(int codEqu) throws SQLException {
        
        String sql = "delete from Equipe where codcli = ?";
        
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codEqu);
            st.execute();
            st.close();
        }
        
        this.con.close();
        
    }
    
    public void alterar(Equipe equi) throws SQLException {
        
        String sql = "update Equipe set nomEqu = ?, desEqu = ?";
        
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, equi.getNomEqu());
            st.setString(2, equi.getDesEqu());
            
            st.execute();
            st.close();
        }
        
        this.con.close();
        
    }
    
    public List<Equipe> listarEquipes() throws SQLException {
        String sql = "select * from Equipe";
        List<Equipe> equipes = null;
        
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            
            equipes = new ArrayList<Equipe>();
            
            while (rs.next()) {
                Equipe equi = new Equipe();
                equi.setCodEqu(rs.getInt("codEqu"));
                equi.setNomEqu(rs.getString("nomEqu"));
                equi.setDesEqu("desEqu");
               
                equipes.add(equi);
                
            }
            
            rs.close();
            st.close();
            
        }
        
        this.con.close();
        return equipes;
    }
    
    public Equipe getEquipe(int codcli) throws SQLException {
        String sql = "select * from Equipe where codcli = ?";
     Equipe equi = null;
        
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codcli);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    
                     equi = new Equipe();
                equi.setCodEqu(rs.getInt("codEqu"));
                equi.setNomEqu(rs.getString("nomEqu"));
                equi.setDesEqu("desEqu");
                
                     }
            }
            st.close();
        }
        
        this.con.close();
        return equi;
    }
    
}
