package br.senai.sc.trabalhoFinalSA.views;

import br.sc.senai.Utilidades.EmailWrapper;
import br.senai.sc.trabalhoFinalSA.dao.ColaboradorDao;
import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class PainelCadastroColaborador extends javax.swing.JPanel {

    private CardLayout cl;

    /**
     * Creates new form PainelCadastroColaborador
     */
    public PainelCadastroColaborador() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labellNome = new javax.swing.JLabel();
        labelTitolo = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelDateNascimento = new javax.swing.JLabel();
        campoFormatadoNascimento = new javax.swing.JFormattedTextField();
        labelEndereco = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        labelCep = new javax.swing.JLabel();
        campoFormatadoCep = new javax.swing.JFormattedTextField();
        campoBairro = new javax.swing.JTextField();
        labelNumeroEndereco = new javax.swing.JLabel();
        campoEnderecoNumero = new javax.swing.JTextField();
        campoSelecaoTipoColaborador = new javax.swing.JComboBox<>();
        labelFuncao = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        labelContatos = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        campoFormatadoDD = new javax.swing.JFormattedTextField();
        campoFormatadoTelefone = new javax.swing.JFormattedTextField();
        labelEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        labelNomeUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelRua = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        labelSenhaPadrao = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        labellNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labellNome.setText("Nome");

        labelTitolo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitolo.setText("Cadastro de colaborador");

        labelDateNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDateNascimento.setText("Data de nascimento");

        try {
            campoFormatadoNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoFormatadoNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFormatadoNascimentoActionPerformed(evt);
            }
        });

        labelEndereco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEndereco.setText("Endereço");

        labelCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCidade.setText("Cidade");

        labelBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBairro.setText("Bairro");

        labelCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCep.setText("Cep");

        try {
            campoFormatadoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## ### - ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoFormatadoCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoFormatadoCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFormatadoCepActionPerformed(evt);
            }
        });

        labelNumeroEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumeroEndereco.setText("Numero");

        campoSelecaoTipoColaborador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoSelecaoTipoColaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gestor", "Outras" }));
        campoSelecaoTipoColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSelecaoTipoColaboradorActionPerformed(evt);
            }
        });

        labelFuncao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFuncao.setText("Funçao");

        labelContatos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelContatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelContatos.setText("Contatos");

        labelTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTelefone.setText("Telefone");

        try {
            campoFormatadoDD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoFormatadoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEmail.setText("Email");

        labelNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNomeUsuario.setText("Nome de usuario");

        labelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSenha.setText("Senha padrao:");

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        labelRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelRua.setText("Rua");

        labelSenhaPadrao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelSenhaPadrao.setText("abc123.");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador1)
            .addComponent(separador2)
            .addComponent(labelContatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTitolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelBairro)
                                            .addGap(18, 18, 18)
                                            .addComponent(campoBairro))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelCidade)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(labelRua)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(68, 68, 68)
                                            .addComponent(labelCep)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoFormatadoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoRua, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(labelNumeroEndereco)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(11, 11, 11))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelFuncao)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoSelecaoTipoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labellNome)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(60, 60, 60)
                                            .addComponent(labelDateNascimento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoFormatadoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelTelefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoFormatadoDD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoFormatadoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(labelEmail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(labelSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelSenhaPadrao)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitolo)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labellNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDateNascimento)
                    .addComponent(campoFormatadoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSelecaoTipoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFuncao))
                .addGap(15, 15, 15)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(labelEndereco)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCep)
                    .addComponent(campoFormatadoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBairro)
                    .addComponent(labelNumeroEndereco)
                    .addComponent(campoEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRua)
                    .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(labelContatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(campoFormatadoDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFormatadoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeUsuario)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha)
                    .addComponent(labelSenhaPadrao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoFormatadoNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFormatadoNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFormatadoNascimentoActionPerformed

    private void campoFormatadoCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFormatadoCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFormatadoCepActionPerformed

    private void campoSelecaoTipoColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSelecaoTipoColaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSelecaoTipoColaboradorActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (validarCampos()) {

            Colaborador col = new Colaborador();

            col.setNomCol(campoNome.getText());
            String data = campoFormatadoNascimento.getText();

            String[] date = data.split("/");
            data = date[2] + "-" + date[1] + "-" + date[0];

            col.setDatCol(data);
            String tipo = campoSelecaoTipoColaborador.getSelectedItem().toString();
            String funcao = "";
            if (tipo == "Gestor") {
                funcao = "Gestor";
                col.setTipCol(1);
            } else {
                col.setTipCol(2);
            }

            col.setCidCol(campoCidade.getText());

            col.setBaiCol(campoBairro.getText());
            col.setRuaCol(campoRua.getText());

            String cep = campoFormatadoCep.getText();

            cep = cep.replaceAll("[^0-9]", "");

            col.setCepCol(Integer.parseInt(cep));

            String num = "" + campoEnderecoNumero.getText();
            num = num.replaceAll("[^0-9]", "");

            col.setNumCol(Integer.parseInt(num));

            String ddd = campoFormatadoDD.getText();
            ddd = ddd.replaceAll("[^0-9]", "");

            col.setDddCol(Integer.parseInt(ddd));
            String celular = campoFormatadoTelefone.getText();
            celular = celular.replaceAll("[^0-9]", "");

            col.setCelCol(Integer.parseInt(celular));
            col.setEmaCol(campoEmail.getText());
            col.setUsuCol(campoUsuario.getText());
            col.setSenCol(labelSenhaPadrao.getText());
            col.setEstCol(1);
            col.setEquCol(1);
            ColaboradorDao coDao = new ColaboradorDao();

            EmailWrapper confirmar = new EmailWrapper();
            String mensagem = "Confirme seus dados:" + "\nNome: " + campoNome.getText() + "\tData de nascimento: " + data
                    + "\nFuncao: " + funcao + "\nCidade: " + campoCidade.getText()
                    + "\tCep: " + campoFormatadoCep.getText() + "\nBairro: " + campoBairro.getText() + "\tRua: " + campoRua.getText()
                    + "\tNumero: " + campoEnderecoNumero.getText() + "\nTelefone: (" + campoFormatadoDD.getText() + ") " + campoFormatadoTelefone
                    + "\tEmail: " + campoEmail.getText() + "\nUsuario: " + campoUsuario.getText() + "\tSenha: " + labelSenhaPadrao.getText()
                    + "\nCasso os dados nao estejam coreto entre em contato para autualizar\n\n\nAttgestores";
            String remetente = "Remetente@remetente";
            String asunto = "Confirmacao e cadastro";
            String destinatario = campoEmail.getText();
          
            try {
                coDao.inserir(col);
                confirmar.enviar(remetente, destinatario, asunto, mensagem);
                JOptionPane.showMessageDialog(null, "Cadastro salvo com susesso");

                limparCampos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao salvar cliente");
                Logger.getLogger(PainelCadastroColaborador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private boolean validarCampos() {

        String nome = campoNome.getText();
        if (nome.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o nome");
            return false;
        }
        String nascimento = campoFormatadoNascimento.getText();
        nascimento = nascimento.replaceAll("[^0-9]", "");

       if (nascimento.trim().equals("")) {
            campoFormatadoNascimento.setText("00000000");
            return false;
        }
        String cidade = campoCidade.getText();
        if (cidade.trim() =="") {
            JOptionPane.showMessageDialog(null, "Informe sua cidade");
            return false;
        }
        String cep = campoFormatadoCep.getText();
        cep = cep.replaceAll("[^0-9]", "");

        if (cep.trim() == "") {
            campoFormatadoCep.setText("00000000");
            return false;
        }
        String bairro = campoBairro.getText();
        if (bairro.trim() == "") {
            JOptionPane.showMessageDialog(null, "Informe um bairro");
            return false;
        }

        String rua = campoRua.getText();
        if (rua.trim() == "") {
            campoRua.setText("null");
        }

        String EnderecoNumero = campoEnderecoNumero.getText();
        if (EnderecoNumero.trim() == "") {
            campoEnderecoNumero.setText("00");
        }
        String DDD = campoFormatadoDD.getText();
        DDD = DDD.replaceAll("[^0-9]", "");
        if (DDD.trim() == "") {
            JOptionPane.showMessageDialog(null, "Informe um DDD");
            return false;
        }
        String telefone = campoFormatadoTelefone.getText();
        telefone = telefone.replaceAll("[^0-9]", "");
        if (telefone.trim() == "") {
            JOptionPane.showMessageDialog(null, "Informe um Telefone");
            return false;
        }
        String email = campoEmail.getText();
        if (email.trim() == "") {
            JOptionPane.showMessageDialog(null, "Informe o Email");
            return false;
        }
        String usuario = campoUsuario.getText();
        if (usuario.trim() == "") {
            JOptionPane.showMessageDialog(null, "Informe o nome de usuario");
            return false;
        } else {
            return true;
        }
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void limparCampos() {
        campoBairro.setText(null);
        campoCidade.setText(null);
        campoEmail.setText(null);
        campoEnderecoNumero.setText(null);
        campoFormatadoCep.setText(null);
        campoFormatadoNascimento.setText(null);
        campoFormatadoTelefone.setText(null);
        campoNome.setText(null);
        campoRua.setText(null);
        campoUsuario.setText(null);
        campoFormatadoDD.setText(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEnderecoNumero;
    private javax.swing.JFormattedTextField campoFormatadoCep;
    private javax.swing.JFormattedTextField campoFormatadoDD;
    private javax.swing.JFormattedTextField campoFormatadoNascimento;
    private javax.swing.JFormattedTextField campoFormatadoTelefone;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoRua;
    private javax.swing.JComboBox<String> campoSelecaoTipoColaborador;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelContatos;
    private javax.swing.JLabel labelDateNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JLabel labelNumeroEndereco;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSenhaPadrao;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitolo;
    private javax.swing.JLabel labellNome;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    // End of variables declaration//GEN-END:variables

}
