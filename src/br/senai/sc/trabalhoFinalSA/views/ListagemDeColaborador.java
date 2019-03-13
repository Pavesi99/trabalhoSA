/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA.views;

import br.senai.sc.trabalhoFinalSA.dao.ColaboradorDao;
import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
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
public class ListagemDeColaborador extends javax.swing.JPanel {

    /**
     * Creates new form ListagemDeColaborador
     */
    private CardLayout cl;
    public ListagemDeColaborador() {
        initComponents();
        
        this.add(painelListagem, "painelListagem");
        
        this.cl  = (CardLayout) this.getLayout();
        cl.show(this, "painelListagem");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblListagemColaborador = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        painelListagem.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                painelListagemComponentShown(evt);
            }
        });

        TblListagemColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Rua", "Bairro", "Número", "CEP", "Cidade", "Celular", "DDD", "Tipo", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblListagemColaborador);

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelListagemLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
            .addGroup(painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelListagemLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(painelListagem, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void painelListagemComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_painelListagemComponentShown
        ColaboradorDao col = new ColaboradorDao ();
        List<Colaborador> listaColaborador;
        try {
            listaColaborador = col.listarColaboradores();
            
        DefaultTableModel model = (DefaultTableModel) TblListagemColaborador.getModel();
        List<Object> lista = new ArrayList<Object> ();
        
        for(int i =0 ; i < listaColaborador.size(); i++) {
             Colaborador c = listaColaborador.get(i);
             lista.add(new Object[]{c.getNomCol(), c.getRuaCol(), c.getBaiCol(), c.getNumCol(), c.getCepCol(), c.getCidCol(), c.getCelCol(), c.getDddCol(), c.getTipCol(), c.getEmaCol()});
    }
        
        for(int idx = 0; idx < lista.size(); idx++) {
            model.addRow((Object []) lista.get(idx));
        }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Obter os Colaboradores do Banco de Dados!");
            Logger.getLogger(ListagemDeColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_painelListagemComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblListagemColaborador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelListagem;
    // End of variables declaration//GEN-END:variables
}
