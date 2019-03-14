/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA.views;

import br.senai.sc.trabalhoFinalSA.dao.EquipeDao;
import br.senai.sc.trabalhoFinalSA.modelo.Equipe;
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
public class ListagemEquipe extends javax.swing.JPanel {

    /**
     * Creates new form ListagemEquipe
     */
    private CardLayout cl;
    private int codEqu;
    private int linha;
    public ListagemEquipe() {
        initComponents();
        
        this.add(painelListagemEquipe, "painelListagemEquipe");
        this.add(painelEdicao, "painelEdicao");
        
        this.cl  = (CardLayout) this.getLayout();
        cl.show(this, "painelListagemEquipe");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagemEquipe = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagemEquipe = new javax.swing.JTable();
        painelEdicao = new javax.swing.JPanel();
        labelCadastroEquipe = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        cpDescricao = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        painelListagemEquipe.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                painelListagemEquipeComponentShown(evt);
            }
        });

        tblListagemEquipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListagemEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListagemEquipeMouseClicked(evt);
            }
        });
        tblListagemEquipe.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblListagemEquipeComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tblListagemEquipe);

        javax.swing.GroupLayout painelListagemEquipeLayout = new javax.swing.GroupLayout(painelListagemEquipe);
        painelListagemEquipe.setLayout(painelListagemEquipeLayout);
        painelListagemEquipeLayout.setHorizontalGroup(
            painelListagemEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );
        painelListagemEquipeLayout.setVerticalGroup(
            painelListagemEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        add(painelListagemEquipe, "card3");

        labelCadastroEquipe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCadastroEquipe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadastroEquipe.setText("EDIÇÃO DA EQUIPE");

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setText(" Nome:");

        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        labelDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição:");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir Equipe");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCadastroEquipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVoltar)
                                .addGap(49, 49, 49)
                                .addComponent(btnExcluir))
                            .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCadastroEquipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(painelEdicao, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void popularTabela () {
         EquipeDao eq = new EquipeDao ();
        List<Equipe> listaEquipe;
        try {
            listaEquipe = eq.listarEquipes();
            
        DefaultTableModel model = (DefaultTableModel) tblListagemEquipe.getModel();
        List<Object> lista = new ArrayList<Object> ();
        
        for(int i =0 ; i < listaEquipe.size(); i++) {
             Equipe c = listaEquipe.get(i);
             lista.add(new Object[]{c.getNomEqu(), c.getDesEqu()});
    }
        
        for(int idx = 0; idx < lista.size(); idx++) {
            model.addRow((Object []) lista.get(idx));
        }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Obter as Equipes do Banco de Dados!");
            Logger.getLogger(ListagemEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
    private void painelListagemEquipeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_painelListagemEquipeComponentShown
      this.popularTabela();                               
    }//GEN-LAST:event_painelListagemEquipeComponentShown

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed

     private void preencherFormulario(int codigoEquipe){
        EquipeDao equ = new EquipeDao();
        
        try {
            Equipe equipe = equ.getEquipe(codigoEquipe);
            cpNome.setText(equipe.getNomEqu());
            cpDescricao.setText(equipe.getDesEqu());
           
           
        } catch (SQLException ex) {
            Logger.getLogger(ListagemEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.codEqu = codigoEquipe;
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
 
        Equipe equ = new Equipe();
        equ.setNomEqu(cpNome.getText());
        equ.setDesEqu(cpDescricao.getText());
  

        EquipeDao equDao = new EquipeDao();
        try {
            equDao.alterar(equ);
            JOptionPane.showMessageDialog(null,"Cadastro da Equipe Atualizado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao Atualizar o Cadastro da Equipe");
            Logger.getLogger(CadastroEquipe.class.getName()).log(Level.SEVERE,
                null, ex);

        }
        this.cl  = (CardLayout) this.getLayout();
        cl.show(this, "painelListagem");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblListagemEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListagemEquipeMouseClicked
         JOptionPane.showMessageDialog(null, "Você escolheu eliminar o item "+this.linha);
        int linha = tblListagemEquipe.getSelectedRow();
        
        if (linha!= -1) {
            String codigo = tblListagemEquipe.getValueAt(linha, 0).toString();
            int codigoEquipe = Integer.parseInt(codigo);
            this.preencherFormulario(codigoEquipe);
            this.limparTabela();
            this.cl.show(this,"painelEdicao" );
        }
      
    }//GEN-LAST:event_tblListagemEquipeMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
         this.cl  = (CardLayout) this.getLayout();
        cl.show(this, "painelListagemEquipe");
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         JOptionPane.showMessageDialog(null, "Você escolheu eliminar o item "+this.linha);
        Object[] options = {"Sim", "Não"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja realmente eliminar esta equipe ?", "Atenção!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
        if (opcaoSelecionada ==0){
            EquipeDao equDao = new EquipeDao();
             try {
                 equDao.eliminar(this.codEqu);
                 this.limparTabela(); 
                 this.cl.show(this,"painelListagemEquipe");
             } catch (SQLException ex) {
                 Logger.getLogger(ListagemEquipe.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblListagemEquipeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblListagemEquipeComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tblListagemEquipeComponentShown

    private void limparTabela() {

        ((DefaultTableModel) tblListagemEquipe.getModel()).setNumRows(0);

        tblListagemEquipe.updateUI();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField cpDescricao;
    private javax.swing.JTextField cpNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCadastroEquipe;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelListagemEquipe;
    private javax.swing.JTable tblListagemEquipe;
    // End of variables declaration//GEN-END:variables
}
