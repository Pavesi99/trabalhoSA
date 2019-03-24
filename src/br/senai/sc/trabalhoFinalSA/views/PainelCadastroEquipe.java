/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA.views;

import br.senai.sc.trabalhoFinalSA.dao.ColaboradorDao;
import br.senai.sc.trabalhoFinalSA.dao.EquipeDao;
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
 * @author ivan rezini
 */
public class PainelCadastroEquipe extends javax.swing.JPanel {

    private int codigoEquipe;
    public PainelCadastroEquipe() throws SQLException {
        initComponents();
        EquipeDao ee=new EquipeDao();
        int cod= ee.codigoUltimaEquipeSalva();
        this.codigoEquipe=cod;
        labelEquipe.setText("Equipe: "+cod);

        this.popularTabelaSemEquipe();
    }
    private void limparTabela() {
        ((DefaultTableModel) tabelaColaboradoresSemEquipe.getModel()).setNumRows(0);
        tabelaColaboradoresSemEquipe.updateUI();
          ((DefaultTableModel) tabelaColaboradoresDaNovaEquipe.getModel()).setNumRows(0);
        tabelaColaboradoresDaNovaEquipe.updateUI();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaColaboradoresSemEquipe = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaColaboradoresDaNovaEquipe = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelEquipe = new javax.swing.JLabel();

        tabelaColaboradoresSemEquipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaColaboradoresSemEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaColaboradoresSemEquipeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaColaboradoresSemEquipe);

        tabelaColaboradoresDaNovaEquipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaColaboradoresDaNovaEquipe);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Colaboradores");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nova Equipe");

        labelEquipe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEquipe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEquipe.setText("Equipe:  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(143, 143, 143)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(labelEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEquipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaColaboradoresSemEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaColaboradoresSemEquipeMouseClicked
   int linha = tabelaColaboradoresSemEquipe.getSelectedRow();
        String codigo = tabelaColaboradoresSemEquipe.getValueAt(linha, 0).toString();
        int codigoCliente = Integer.parseInt(codigo);
        ColaboradorDao cc=new ColaboradorDao();
        try {
            cc.cadastrarEquipe(codigoCliente, this.codigoEquipe);
        } catch (SQLException ex) {
            Logger.getLogger(PainelCadastroEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limparTabela();
        this.popularTabelaEquipeAtual();
        this.popularTabelaSemEquipe();
        
    }//GEN-LAST:event_tabelaColaboradoresSemEquipeMouseClicked
private void popularTabelaSemEquipe() {
this.limparTabela();
        ColaboradorDao col = new ColaboradorDao();
        List<Colaborador> listaColaborador;
        try {
            listaColaborador = col.listarColaboradorParaCadastroEquipe();

            DefaultTableModel model = (DefaultTableModel) tabelaColaboradoresSemEquipe.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaColaborador.size(); i++) {
                Colaborador c = listaColaborador.get(i);
                lista.add(new Object[]{c.getCodCol(), c.getNomCol()});

            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Obter os Colaboradores do Banco de Dados!");
            Logger.getLogger(ListagemDeColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        private void popularTabelaEquipeAtual() {

        ColaboradorDao col = new ColaboradorDao();
        List<Colaborador> listaColaborador;
        try {
            listaColaborador = col.listarColaboradorParaCadastroEquipe();

            DefaultTableModel model = (DefaultTableModel) tabelaColaboradoresSemEquipe.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaColaborador.size(); i++) {
                Colaborador c = listaColaborador.get(i);
                lista.add(new Object[]{c.getCodCol(), c.getNomCol()});

            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Obter os Colaboradores do Banco de Dados!");
            Logger.getLogger(ListagemDeColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                             


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelEquipe;
    private javax.swing.JTable tabelaColaboradoresDaNovaEquipe;
    private javax.swing.JTable tabelaColaboradoresSemEquipe;
    // End of variables declaration//GEN-END:variables
}
