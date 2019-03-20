/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA.views;

import br.senai.sc.trabalhoFinalSA.dao.AgendaDao;
import br.senai.sc.trabalhoFinalSA.modelo.Agenda;
import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vilmarpavesijunior
 */
public class ListagemAgendaEquipe extends javax.swing.JPanel {


    public ListagemAgendaEquipe() {
        initComponents();
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListagemAgenda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagemAgenda = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        tblListagemAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data de Criação", "Data de Entrega", "Título", "Descrição"
            }
        ));
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
        this.popularTabela();
    }//GEN-LAST:event_tblListagemAgendaComponentShown
private void popularTabela () {
        AgendaDao age = new AgendaDao ();
        List<Agenda> listaAgenda;
        try {
            listaAgenda= age.listarAgenda();
            
        DefaultTableModel model = (DefaultTableModel) tblListagemAgenda.getModel();
        List<Object> lista = new ArrayList<Object> ();
        
        for(int i =0 ; i < listaAgenda.size(); i++) {
             Agenda a = listaAgenda.get(i);
             lista.add(new Object[]{a.getCriAge(), a.getComAge(),
                 a.getTitAge(),a.getDesAge()});
    }
        
        for(int idx = 0; idx < lista.size(); idx++) {
            model.addRow((Object []) lista.get(idx));
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
