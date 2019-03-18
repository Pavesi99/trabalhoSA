/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA;

import br.senai.sc.trabalhoFinalSA.dao.ColaboradorDao;
import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import br.senai.sc.trabalhoFinalSA.views.CadastroEquipe;
import br.senai.sc.trabalhoFinalSA.views.ExcluirColaborador;
import br.senai.sc.trabalhoFinalSA.views.ListagemDeColaborador;

import br.senai.sc.trabalhoFinalSA.views.PainelCadastroColaborador;

import br.senai.sc.trabalhoFinalSA.views.ListagemEquipe;
import br.senai.sc.trabalhoFinalSA.views.PainelAlterarSenha;

import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class trabalhoFinalFrame extends javax.swing.JFrame {

    private Colaborador colaborador;
    public trabalhoFinalFrame() {
        initComponents();
          
        ListagemDeColaborador lt = new ListagemDeColaborador ();
        PainelCadastroColaborador cadastro= new PainelCadastroColaborador();
        PainelAlterarSenha altSenha= new PainelAlterarSenha();
        ExcluirColaborador ec = new ExcluirColaborador();
        ListagemEquipe le = new ListagemEquipe();
        CadastroEquipe ce = new CadastroEquipe();

      painelPrincipal.add(painelLogin, "telaPadrao");
        painelPrincipal.add(lt , "painelListagem");

       painelPrincipal.add(cadastro,"painelCadastro");

        painelPrincipal.add(ec , "painelExcluir");
        painelPrincipal.add(le, "painelListagemEquipe");
        painelPrincipal.add(ce, "painelCadastroEquipe");
      painelPrincipal.add(altSenha,"alterarSenha");
        
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "telaPadrao");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        LabelTituloLogin = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        cpUsuario = new javax.swing.JTextField();
        LabelSenha = new javax.swing.JLabel();
        cpSenha = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        menuManterColaborador = new javax.swing.JMenu();
        menuCadastrarColaborador = new javax.swing.JMenuItem();
        menuListarColaborador = new javax.swing.JMenuItem();
        menuManterEquipe = new javax.swing.JMenu();
        menuCadastrarEquipe = new javax.swing.JMenuItem();
        menuListarEquipe = new javax.swing.JMenuItem();
        menuConsultarAgenda = new javax.swing.JMenu();
        menuTarefas = new javax.swing.JMenu();
        menuAdicionarTarefaEquipe = new javax.swing.JMenuItem();
        menuAdicionarTarefaColaborador = new javax.swing.JMenuItem();
        menuVerAgenda = new javax.swing.JMenu();
        menuAgendaColaborador = new javax.swing.JMenuItem();
        menuAgendaEquipe = new javax.swing.JMenuItem();
        manuSenha = new javax.swing.JMenu();
        menuAlterSenha = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setLayout(new java.awt.CardLayout());

        LabelTituloLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTituloLogin.setText("GESTÃO DE PESSOAS");

        LabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelUsuario.setText("Usuário:");

        cpUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpUsuarioActionPerformed(evt);
            }
        });

        LabelSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelSenha.setText("Senha:");

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelTituloLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelLoginLayout.createSequentialGroup()
                                .addComponent(LabelUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLoginLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(LabelSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpSenha))))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnEntrar)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloLogin)
                .addGap(59, 59, 59)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuario)
                    .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSenha)
                    .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnEntrar)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        painelPrincipal.add(painelLogin, "card2");

        menuManterColaborador.setText("Colaborador");

        menuCadastrarColaborador.setText("Cadastrar ");
        menuCadastrarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarColaboradorActionPerformed(evt);
            }
        });
        menuManterColaborador.add(menuCadastrarColaborador);

        menuListarColaborador.setText("Listar ");
        menuListarColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuListarColaboradorMouseClicked(evt);
            }
        });
        menuListarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarColaboradorActionPerformed(evt);
            }
        });
        menuManterColaborador.add(menuListarColaborador);

        BarraMenu.add(menuManterColaborador);

        menuManterEquipe.setText("Equipe");

        menuCadastrarEquipe.setText("Cadastrar");
        menuCadastrarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarEquipeActionPerformed(evt);
            }
        });
        menuManterEquipe.add(menuCadastrarEquipe);

        menuListarEquipe.setText("Listar");
        menuListarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarEquipeActionPerformed(evt);
            }
        });
        menuManterEquipe.add(menuListarEquipe);

        BarraMenu.add(menuManterEquipe);

        menuConsultarAgenda.setText("Consultar Agênda");

        menuTarefas.setText("Tarefas");

        menuAdicionarTarefaEquipe.setText("Adicionar Tarefa a Equipe");
        menuAdicionarTarefaEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdicionarTarefaEquipeActionPerformed(evt);
            }
        });
        menuTarefas.add(menuAdicionarTarefaEquipe);

        menuAdicionarTarefaColaborador.setText("Adicionar Tarefa ao Colaborador");
        menuTarefas.add(menuAdicionarTarefaColaborador);

        menuConsultarAgenda.add(menuTarefas);

        menuVerAgenda.setText("Ver Agênda");

        menuAgendaColaborador.setText("Agenda do Colaborador");
        menuAgendaColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendaColaboradorActionPerformed(evt);
            }
        });
        menuVerAgenda.add(menuAgendaColaborador);

        menuAgendaEquipe.setText("Agenda da Equipe");
        menuAgendaEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendaEquipeActionPerformed(evt);
            }
        });
        menuVerAgenda.add(menuAgendaEquipe);

        menuConsultarAgenda.add(menuVerAgenda);

        BarraMenu.add(menuConsultarAgenda);

        manuSenha.setText("Senha");

        menuAlterSenha.setText("Alterar senha");
        menuAlterSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterSenhaActionPerformed(evt);
            }
        });
        manuSenha.add(menuAlterSenha);

        BarraMenu.add(manuSenha);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarColaboradorActionPerformed
       CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "painelCadastro");
    }//GEN-LAST:event_menuCadastrarColaboradorActionPerformed

    private void menuAgendaEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendaEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAgendaEquipeActionPerformed

    private void menuListarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarColaboradorActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "painelListagem");
    }//GEN-LAST:event_menuListarColaboradorActionPerformed

    private void cpUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
    ColaboradorDao col = new ColaboradorDao();

        try {
            Colaborador c = col.checar(cpUsuario.getText(), cpSenha.getText());

            if (c == null) {
                JOptionPane.showMessageDialog(null, "ERRO AO AUTENTICAR");
            } else {
                this.colaborador = c;
           
                JOptionPane.showMessageDialog(null, "AUTENTICADO COM SUCESSO");
            }

        } catch (SQLException ex) {
            Logger.getLogger(trabalhoFinalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnEntrarActionPerformed

    private void menuListarColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuListarColaboradorMouseClicked
       
    }//GEN-LAST:event_menuListarColaboradorMouseClicked

    private void menuListarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarEquipeActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "painelListagemEquipe");
    }//GEN-LAST:event_menuListarEquipeActionPerformed

    private void menuCadastrarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarEquipeActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "painelCadastroEquipe");
    }//GEN-LAST:event_menuCadastrarEquipeActionPerformed

    private void menuAlterSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterSenhaActionPerformed
         CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "alterarSenha");
    }//GEN-LAST:event_menuAlterSenhaActionPerformed

    private void menuAgendaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendaColaboradorActionPerformed



    }//GEN-LAST:event_menuAgendaColaboradorActionPerformed

    private void menuAdicionarTarefaEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdicionarTarefaEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAdicionarTarefaEquipeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(trabalhoFinalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trabalhoFinalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trabalhoFinalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trabalhoFinalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trabalhoFinalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelTituloLogin;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JTextField cpSenha;
    private javax.swing.JTextField cpUsuario;
    private javax.swing.JMenu manuSenha;
    private javax.swing.JMenuItem menuAdicionarTarefaColaborador;
    private javax.swing.JMenuItem menuAdicionarTarefaEquipe;
    private javax.swing.JMenuItem menuAgendaColaborador;
    private javax.swing.JMenuItem menuAgendaEquipe;
    private javax.swing.JMenuItem menuAlterSenha;
    private javax.swing.JMenuItem menuCadastrarColaborador;
    private javax.swing.JMenuItem menuCadastrarEquipe;
    private javax.swing.JMenu menuConsultarAgenda;
    private javax.swing.JMenuItem menuListarColaborador;
    private javax.swing.JMenuItem menuListarEquipe;
    private javax.swing.JMenu menuManterColaborador;
    private javax.swing.JMenu menuManterEquipe;
    private javax.swing.JMenu menuTarefas;
    private javax.swing.JMenu menuVerAgenda;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
