/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA.views;

import br.senai.sc.trabalhoFinalSA.dao.AgendaDao;
import br.senai.sc.trabalhoFinalSA.modelo.Agenda;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PainelCadastrarTarefaColaborador extends javax.swing.JPanel {

    /**
     * Creates new form PainelCadastrarTarefa
     */
    public PainelCadastrarTarefaColaborador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTituloCadastroDeTarefa = new javax.swing.JLabel();
        LabelDataDeCriacao = new javax.swing.JLabel();
        LabelDataDeFinalizacao = new javax.swing.JLabel();
        cpDataCriacao = new javax.swing.JFormattedTextField();
        cpDataFinalizacao = new javax.swing.JFormattedTextField();
        LabelTituloTarefa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cpDescricaoTarefa = new javax.swing.JTextArea();
        cpTituloTarefa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        LabelTituloCadastroDeTarefa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelTituloCadastroDeTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTituloCadastroDeTarefa.setText("Cadastro de Tarefa");

        LabelDataDeCriacao.setText("Data de Início:");

        LabelDataDeFinalizacao.setText("Data de Entrega:");

        try {
            cpDataCriacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("      ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpDataFinalizacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("       ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        LabelTituloTarefa.setText("Título:");

        jLabel2.setText("Descrição:");

        cpDescricaoTarefa.setColumns(20);
        cpDescricaoTarefa.setRows(5);
        jScrollPane1.setViewportView(cpDescricaoTarefa);

        jLabel3.setText("(Max:50");

        jLabel4.setText("caracteres)");

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelTituloCadastroDeTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelDataDeCriacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataCriacao, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LabelDataDeFinalizacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataFinalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelTituloTarefa)
                        .addGap(18, 18, 18)
                        .addComponent(cpTituloTarefa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelTituloCadastroDeTarefa)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDataDeCriacao)
                    .addComponent(cpDataCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDataDeFinalizacao)
                    .addComponent(cpDataFinalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTituloTarefa)
                    .addComponent(cpTituloTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
 Agenda age = new Agenda();

        age.setCriAge(cpTituloTarefa.getText());
        age.setDesAge(cpDescricaoTarefa.getText());
        String data = cpDataCriacao.getText();
        String[] date = data.split("/");
        data = date[2] + "-" + date[1] + "-" + date[0];
        age.setCriAge(data);
        
        
        String data2 = cpDataFinalizacao.getText();
        String[] date2 = data2.split("/");
        data2 = date2[2] + "-" + date2[1] + "-" + date2[0];
        age.setComAge(data2);
       

        

        AgendaDao ageDao = new AgendaDao();
        
        ageDao.inserir(age, col);
        JOptionPane.showMessageDialog(null, "Tarefa salva com susesso");
            
           
          
        
           
 


    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDataDeCriacao;
    private javax.swing.JLabel LabelDataDeFinalizacao;
    private javax.swing.JLabel LabelTituloCadastroDeTarefa;
    private javax.swing.JLabel LabelTituloTarefa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField cpDataCriacao;
    private javax.swing.JFormattedTextField cpDataFinalizacao;
    private javax.swing.JTextArea cpDescricaoTarefa;
    private javax.swing.JTextField cpTituloTarefa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}