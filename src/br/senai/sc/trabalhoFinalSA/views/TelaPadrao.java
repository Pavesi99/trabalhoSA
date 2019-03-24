/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA.views;

import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import br.senai.sc.trabalhoFinalSA.trabalhoFinalFrame;
import javax.swing.JLabel;

/**
 *
 * @author Aluno
 */
public class TelaPadrao extends javax.swing.JPanel {

    
   
    public TelaPadrao(Colaborador colaborador)  {
        initComponents();
     
        jLabelNomeUsuario.setText( colaborador.getNomCol());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeTitulo = new javax.swing.JLabel();
        labelVercao = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        labeTitulo.setFont(new java.awt.Font("Ultra", 1, 48)); // NOI18N
        labeTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeTitulo.setText("Bem Vindo");
        add(labeTitulo);
        labeTitulo.setBounds(90, 0, 710, 110);

        labelVercao.setText("1.0.0");
        add(labelVercao);
        labelVercao.setBounds(760, 380, 26, 14);

        jLabelNomeUsuario.setFont(new java.awt.Font("Ultra", 0, 48)); // NOI18N
        add(jLabelNomeUsuario);
        jLabelNomeUsuario.setBounds(30, 110, 770, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sc/senai/trabalhoFinalSA/imagens/ImagemTelaPadrao.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 400);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel labeTitulo;
    private javax.swing.JLabel labelVercao;
    // End of variables declaration//GEN-END:variables
}
