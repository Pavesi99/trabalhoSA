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

    private int listar;

    private CardLayout cl;

    public ListagemDeColaborador(int a) {
        initComponents();

        this.cl = (CardLayout) this.getLayout();
        this.listar = a;
        this.popularTabela();
    }

    private void limparTabela() {
        ((DefaultTableModel) TblListagemColaborador.getModel()).setNumRows(0);
        TblListagemColaborador.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblListagemColaborador = new javax.swing.JTable();
        painelEdicao = new javax.swing.JPanel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        labelContatos = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        campoFormatadoDD = new javax.swing.JFormattedTextField();
        campoFormatadoTelefone = new javax.swing.JFormattedTextField();
        labelEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoFormatadoNascimento = new javax.swing.JFormattedTextField();
        labelEndereco = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        campoCidade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelBairro = new javax.swing.JLabel();
        labelRua = new javax.swing.JLabel();
        labelCep = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        campoFormatadoCep = new javax.swing.JFormattedTextField();
        campoBairro = new javax.swing.JTextField();
        labelNumeroEndereco = new javax.swing.JLabel();
        campoEnderecoNumero = new javax.swing.JTextField();
        labellNome = new javax.swing.JLabel();
        labelTitolo = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelDateNascimento = new javax.swing.JLabel();
        campoSelecaoTipoColaborador = new javax.swing.JComboBox<>();
        labelFuncao = new javax.swing.JLabel();
        LabelCodigo = new javax.swing.JLabel();
        labelCodigoDoCliente = new javax.swing.JLabel();

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
                "cod", "Nome", "Rua", "Bairro", "Número", "CEP", "Cidade", "Celular", "DDD", "Tipo", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblListagemColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblListagemColaboradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblListagemColaborador);
        if (TblListagemColaborador.getColumnModel().getColumnCount() > 0) {
            TblListagemColaborador.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListagemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(painelListagem, "card3");

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

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar alteraçoes");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        labelBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBairro.setText("Bairro");

        labelRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelRua.setText("Rua");

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

        labellNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labellNome.setText("Nome");

        labelTitolo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitolo.setText("Editar cadastro de colaborador");

        labelDateNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDateNascimento.setText("Data de nascimento");

        campoSelecaoTipoColaborador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoSelecaoTipoColaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gestor", "Outras" }));
        campoSelecaoTipoColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSelecaoTipoColaboradorActionPerformed(evt);
            }
        });

        labelFuncao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFuncao.setText("Funçao");

        LabelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCodigo.setText("Codigo");

        labelCodigoDoCliente.setText("Codigo Do Cliente");

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador1)
            .addComponent(separador2)
            .addComponent(labelContatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalvar))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                                .addComponent(labelBairro)
                                                .addGap(18, 18, 18)
                                                .addComponent(campoBairro))
                                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                                .addComponent(labelCidade)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(labelRua)
                                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(labelCep)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoFormatadoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoRua, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelNumeroEndereco)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                                        .addComponent(labelTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoFormatadoDD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoFormatadoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(labelEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                                        .addComponent(labelDateNascimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoFormatadoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelFuncao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoSelecaoTipoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35))
                                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(labelCodigoDoCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labellNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(121, 121, 121)))
                                .addGap(11, 11, 11)))))
                .addContainerGap())
            .addComponent(labelTitolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addComponent(labelTitolo)
                .addGap(10, 10, 10)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labellNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCodigo)
                    .addComponent(labelCodigoDoCliente))
                .addGap(18, 18, 18)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSelecaoTipoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFuncao)
                    .addComponent(labelDateNascimento)
                    .addComponent(campoFormatadoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(labelEndereco)
                .addGap(3, 3, 3)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCep)
                    .addComponent(campoFormatadoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(campoFormatadoDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFormatadoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnSalvar)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        add(painelEdicao, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void painelListagemComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_painelListagemComponentShown
        // this.limparTabela();

    }

    private void popularTabela() {

        ColaboradorDao col = new ColaboradorDao();
        List<Colaborador> listaColaborador;
        try {
            listaColaborador = col.listarColaboradores();

            DefaultTableModel model = (DefaultTableModel) TblListagemColaborador.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaColaborador.size(); i++) {
                Colaborador c = listaColaborador.get(i);
                lista.add(new Object[]{c.getCodCol(), c.getNomCol(), c.getRuaCol(), c.getBaiCol(), c.getNumCol(), c.getCepCol(), c.getCidCol(), c.getCelCol(), c.getDddCol(), c.getTipCol(), c.getEmaCol()});

            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Obter os Colaboradores do Banco de Dados!");
            Logger.getLogger(ListagemDeColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_painelListagemComponentShown

    private void campoFormatadoNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFormatadoNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFormatadoNascimentoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Colaborador col = new Colaborador();

        col.setNomCol(campoNome.getText());
        String data = campoFormatadoNascimento.getText();;
        String[] date = data.split("/");
        data = date[2] + "-" + date[1] + "-" + date[0];
        col.setDatCol(data);

        String tipo = campoSelecaoTipoColaborador.getSelectedItem().toString();
        if (tipo == "Gestor") {
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
        col.setEstCol(1);
        col.setEquCol(1);
        String cod = LabelCodigo.getText();
        int codigo = Integer.parseInt(cod);
        col.setCodCol(codigo);
        ColaboradorDao coDao = new ColaboradorDao();

        try {
            coDao.alterar(col);
            JOptionPane.showMessageDialog(null, "Cadastro salvo com susesso");
            campoBairro.setText(null);
            campoCidade.setText(null);
            campoEmail.setText(null);
            campoEnderecoNumero.setText(null);
            campoFormatadoCep.setText(null);
            campoFormatadoNascimento.setText(null);
            campoFormatadoTelefone.setText(null);
            campoNome.setText(null);
            campoRua.setText(null);
            LabelCodigo.setText(null);
            this.limparTabela();
            this.popularTabela();
            this.add(painelListagem, "painellist");
            this.cl.show(this, "painellist");
        } catch (SQLException ex) {
            Logger.getLogger(ListagemDeColaborador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha");
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void campoFormatadoCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFormatadoCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFormatadoCepActionPerformed

    private void campoSelecaoTipoColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSelecaoTipoColaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSelecaoTipoColaboradorActionPerformed

    private void TblListagemColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblListagemColaboradorMouseClicked

        int linha = TblListagemColaborador.getSelectedRow();

        String codigo = TblListagemColaborador.getValueAt(linha, 0).toString();
        int codigoCliente = Integer.parseInt(codigo);
        
        if (this.listar == 1) {
            if (linha != -1) {

                try {
                    this.SetClienteTabelaEdicao(codigoCliente);
                } catch (SQLException ex) {
                    Logger.getLogger(ListagemDeColaborador.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.add(painelEdicao, "painelEdicao");
                this.cl.show(this, "painelEdicao");
            }
    }//GEN-LAST:event_TblListagemColaboradorMouseClicked
        else if (this.listar == 3) {

            Object[] options = {"Sim", "Não"};
            int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja Realmente Eliminar Este Colaborador ?", "Atenção!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

            if (opcaoSelecionada == 0) {
                ColaboradorDao colDao = new ColaboradorDao();
                try {
                    colDao.eliminar(codigoCliente);
                    this.limparTabela();
                    this.cl.show(this, "painelListagem");
                } catch (SQLException ex) {
                    
                }
            }
            this.limparTabela();
            this.popularTabela();
            this.add(painelListagem, "painellist");
            this.cl.show(this, "painellist");
        }
    }

    private void SetClienteTabelaEdicao(int codigo) throws SQLException {

        ColaboradorDao colab = new ColaboradorDao();

        Colaborador col = colab.getColaborador(codigo);
        String cod = "" + codigo;
        LabelCodigo.setText(cod);
        campoBairro.setText(col.getBaiCol());
        campoCidade.setText(col.getCidCol());
        campoEmail.setText(col.getEmaCol());

        String num = "" + col.getNumCol();
        campoEnderecoNumero.setText(num);
        String cep = "" + col.getCepCol();
        campoFormatadoCep.setText(cep);
        String ddd = "" + col.getDddCol();
        campoFormatadoDD.setText(ddd);

        String nascimento = col.getDatCol();
        String[] data = nascimento.split("-");
        nascimento = data[2] + data[1] + data[0];

        campoFormatadoNascimento.setText(nascimento);
        String telefone = "" + col.getCelCol();
        campoFormatadoTelefone.setText(telefone);
        campoNome.setText(col.getNomCol());
        campoRua.setText(col.getRuaCol());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JTable TblListagemColaborador;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCodigoDoCliente;
    private javax.swing.JLabel labelContatos;
    private javax.swing.JLabel labelDateNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelNumeroEndereco;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitolo;
    private javax.swing.JLabel labellNome;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelListagem;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    // End of variables declaration//GEN-END:variables
}
