/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA.views;

import br.senai.sc.trabalhoFinalSA.dao.ColaboradorDao;
import br.senai.sc.trabalhoFinalSA.dao.EquipeDao;
import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import br.senai.sc.trabalhoFinalSA.modelo.Equipe;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastroEquipe extends javax.swing.JPanel {
    private int codigoEquipe;
    private CardLayout cl;
    public CadastroEquipe() throws SQLException {

    
        initComponents();
         this.cl = (CardLayout) this.getLayout();

        EquipeDao ee=new EquipeDao();
        int cod= ee.codigoUltimaEquipeSalva();
        this.codigoEquipe=(cod+1);
        labelEquipe.setText("Equipe: "+(cod+1));

        
    }
    private void limparTabela() {
        ((DefaultTableModel) tabelaColaboradoresSemEquipe.getModel()).setNumRows(0);
        tabelaColaboradoresSemEquipe.updateUI();
          ((DefaultTableModel) tabelaColaboradoresDaNovaEquipe.getModel()).setNumRows(0);
        tabelaColaboradoresDaNovaEquipe.updateUI();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroEquipe = new javax.swing.JPanel();
        labelCadastroEquipe = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        cpDescricao = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalvar = new javax.swing.JButton();
        PainelCadastroEquipe = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaColaboradoresSemEquipe = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaColaboradoresDaNovaEquipe = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelEquipe = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        labelCadastroEquipe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCadastroEquipe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadastroEquipe.setText("CADASTRO DA EQUIPE");

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setText(" Nome:");

        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        labelDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroEquipeLayout = new javax.swing.GroupLayout(CadastroEquipe);
        CadastroEquipe.setLayout(CadastroEquipeLayout);
        CadastroEquipeLayout.setHorizontalGroup(
            CadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
            .addGroup(CadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CadastroEquipeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(CadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelCadastroEquipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroEquipeLayout.createSequentialGroup()
                            .addComponent(btnSalvar)
                            .addGap(56, 56, 56))
                        .addGroup(CadastroEquipeLayout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(CadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CadastroEquipeLayout.createSequentialGroup()
                                    .addGroup(CadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 57, Short.MAX_VALUE)))))
                    .addContainerGap()))
        );
        CadastroEquipeLayout.setVerticalGroup(
            CadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
            .addGroup(CadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CadastroEquipeLayout.createSequentialGroup()
                    .addContainerGap()
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
                    .addComponent(btnSalvar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(CadastroEquipe, "card2");

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
        tabelaColaboradoresDaNovaEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaColaboradoresDaNovaEquipeMouseClicked(evt);
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

        javax.swing.GroupLayout PainelCadastroEquipeLayout = new javax.swing.GroupLayout(PainelCadastroEquipe);
        PainelCadastroEquipe.setLayout(PainelCadastroEquipeLayout);
        PainelCadastroEquipeLayout.setHorizontalGroup(
            PainelCadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PainelCadastroEquipeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(PainelCadastroEquipeLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(96, 96, 96))
        );
        PainelCadastroEquipeLayout.setVerticalGroup(
            PainelCadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEquipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(PainelCadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        add(PainelCadastroEquipe, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Equipe equ = new Equipe();
        equ.setNomEqu(cpNome.getText());
        equ.setDesEqu(cpDescricao.getText());

        
        EquipeDao equDao = new EquipeDao();
        try {
            equDao.inserir(equ);
            JOptionPane.showMessageDialog(null,"Equipe inserida com Sucesso!");
            this.add(PainelCadastroEquipe, "painelcc");
                this.cl.show(this, "painelcc");
                this.popularTabelaSemEquipe();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao Inserir o Equipe");
            Logger.getLogger(CadastroEquipe.class.getName()).log(Level.SEVERE,
                    null, ex);
         
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed

    private void tabelaColaboradoresSemEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaColaboradoresSemEquipeMouseClicked
        int linha = tabelaColaboradoresSemEquipe.getSelectedRow();
        String codigo = tabelaColaboradoresSemEquipe.getValueAt(linha, 0).toString();
        int codigoCliente = Integer.parseInt(codigo);
        ColaboradorDao cc=new ColaboradorDao();
        try {
            cc.cadastrarEquipe(codigoCliente, this.codigoEquipe);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limparTabela();
        this.popularTabelaEquipeAtual();
        this.popularTabelaSemEquipe();

    }//GEN-LAST:event_tabelaColaboradoresSemEquipeMouseClicked

    private void tabelaColaboradoresDaNovaEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaColaboradoresDaNovaEquipeMouseClicked
         int linha = tabelaColaboradoresDaNovaEquipe.getSelectedRow();
        String codigo = tabelaColaboradoresDaNovaEquipe.getValueAt(linha, 0).toString();
        int codigoCliente = Integer.parseInt(codigo);
        ColaboradorDao cc=new ColaboradorDao();
        try {
            cc.cadastrarEquipe(codigoCliente, 1);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limparTabela();
        this.popularTabelaEquipeAtual();
        this.popularTabelaSemEquipe();

    }//GEN-LAST:event_tabelaColaboradoresDaNovaEquipeMouseClicked
private void popularTabelaSemEquipe() {

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

        ColaboradorDao cool = new ColaboradorDao();
        List<Colaborador> listaColaborador;
        try {
            listaColaborador = cool.listarColaboradoresEquipe(this.codigoEquipe);
            DefaultTableModel model = (DefaultTableModel) tabelaColaboradoresDaNovaEquipe.getModel();
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
    private javax.swing.JPanel CadastroEquipe;
    private javax.swing.JPanel PainelCadastroEquipe;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cpDescricao;
    private javax.swing.JTextField cpNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCadastroEquipe;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelEquipe;
    private javax.swing.JLabel labelNome;
    private javax.swing.JTable tabelaColaboradoresDaNovaEquipe;
    private javax.swing.JTable tabelaColaboradoresSemEquipe;
    // End of variables declaration//GEN-END:variables
}
