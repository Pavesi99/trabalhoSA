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
            st.setString(1, equ.getNomEqu());
            st.setString(2, equ.getDesEqu());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void eliminar(int codEqu) throws SQLException {

        String sql = "delete from equipe where codEqu = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codEqu);

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void alterar(Equipe equi) throws SQLException {

        String sql = "update equipe set nomEqu =?, desEqu = ? where codEqu = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, equi.getNomEqu());
            st.setString(2, equi.getDesEqu());
            st.setInt(3, equi.getCodEqu());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public List<Equipe> listarEquipes() throws SQLException {
        String sql = "select * from equipe";
        List<Equipe> equipes = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            equipes = new ArrayList<Equipe>();

            while (rs.next()) {
                Equipe equi = new Equipe();
                equi.setCodEqu(rs.getInt("codEqu"));
                equi.setNomEqu(rs.getString("nomEqu"));
                equi.setDesEqu(rs.getString("desEqu"));

                equipes.add(equi);

            }

            rs.close();
            st.close();

        }

        this.con.close();
        return equipes;
    }

    public Equipe getEquipe(int codEqu) throws SQLException {
        String sql = "select * from equipe where codEqu = ?";
        Equipe equi = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codEqu);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {

                    equi = new Equipe();
                    equi.setCodEqu(rs.getInt("codEqu"));
                    equi.setNomEqu(rs.getString("nomEqu"));
                    equi.setDesEqu(rs.getString("desEqu"));

                }
            }

            st.close();
        }

        this.con.close();
        return equi;
    }

    public int codigoUltimaEquipeSalva() throws SQLException {
        
         String sql = "select * from equipe order by codequ desc limit 1 ";
        
         Equipe equi = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
        
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {

                    equi = new Equipe();
                    equi.setCodEqu(rs.getInt("codEqu"));
                    equi.setNomEqu(rs.getString("nomEqu"));
                    equi.setDesEqu(rs.getString("desEqu"));

                }
            }

            st.close();
        }

        this.con.close();
        return equi.getCodEqu();

    }

}
