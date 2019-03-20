/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA.views;

import br.senai.sc.trabalhoFinalSA.dao.AgendaColaboradorDao;
import br.senai.sc.trabalhoFinalSA.modelo.Agenda;
import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import br.senai.sc.trabalhoFinalSA.views.ListagemEquipe;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class ListagemAgendaColaborador extends javax.swing.JPanel {

    private Colaborador c;

    private CardLayout cl;

    public ListagemAgendaColaborador(Colaborador colaborador) {

        initComponents();
        this.c = colaborador;

        this.add(ListagemAgenda, "painelListagemAgenda");
        this.cl = (CardLayout) this.getLayout();
        cl.show(this, "painelListagemAgenda");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListagemAgenda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagemAgenda = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        ListagemAgenda.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ListagemAgendaComponentShown(evt);
            }
        });

        tblListagemAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data de Criação", "Data de Entrega", "Título", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblListagemAgenda.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblListagemAgendaComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tblListagemAgenda);

        javax.swing.GroupLayout ListagemAgendaLayout = new javax.swing.GroupLayout(ListagemAgenda);
        ListagemAgenda.setLayout(ListagemAgendaLayout);
        ListagemAgendaLayout.setHorizontalGroup(
            ListagemAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        ListagemAgendaLayout.setVerticalGroup(
            ListagemAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        add(ListagemAgenda, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tblListagemAgendaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblListagemAgendaComponentShown
        System.out.println("ghsdhsdhdsdhdshgds");
        this.popularTabela();
        System.out.println("ghsdhsdhdsdhdshgds");
    }//GEN-LAST:event_tblListagemAgendaComponentShown

    private void ListagemAgendaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ListagemAgendaComponentShown
        this.popularTabela();
    }//GEN-LAST:event_ListagemAgendaComponentShown
    private void popularTabela() {
        AgendaColaboradorDao age = new AgendaColaboradorDao();
        List<Agenda> listaAgenda;
        System.out.println("pasou aki");
        try {
            listaAgenda = age.listarAgendaColaborador(this.c.getCodCol());
            System.out.println("pasou aki tambem");
            DefaultTableModel model = (DefaultTableModel) tblListagemAgenda.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaAgenda.size(); i++) {
                System.out.println("asgagdf");
                Agenda a = listaAgenda.get(i);
                lista.add(new Object[]{a.getCriAge(), a.getComAge(),
                    a.getTitAge(), a.getDesAge()});
            }

            for (int idx = 0; idx < lista.size(); idx++) {
                System.out.println("asga444444444444df");
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Obter as Tarefas do Banco de Dados!");
            Logger.getLogger(ListagemEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ListagemAgenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListagemAgenda;
    // End of variables declaration//GEN-END:variables
}
