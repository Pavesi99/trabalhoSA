/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.trabalhoFinalSA;

import br.sc.senai.Utilidades.GerenciaDeDados;
import br.sc.senai.Utilidades.ObterData;
import br.senai.sc.trabalhoFinalSA.dao.ColaboradorDao;
import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import br.senai.sc.trabalhoFinalSA.views.CadastroEquipe;

import br.senai.sc.trabalhoFinalSA.views.ListagemAgendaColaborador;
import br.senai.sc.trabalhoFinalSA.views.ListagemAgendaEquipe;
import br.senai.sc.trabalhoFinalSA.views.ListagemDeColaborador;

import br.senai.sc.trabalhoFinalSA.views.PainelCadastroColaborador;

import br.senai.sc.trabalhoFinalSA.views.ListagemEquipe;
import br.senai.sc.trabalhoFinalSA.views.PainelAlterarSenha;
import br.senai.sc.trabalhoFinalSA.views.PainelCadastrarTarefa;
//import br.senai.sc.trabalhoFinalSA.views.PainelCadastroEquipe;
import br.senai.sc.trabalhoFinalSA.views.TelaPadrao;

import java.awt.CardLayout;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class trabalhoFinalFrame extends javax.swing.JFrame {

    private Colaborador colaborador;
    private CardLayout cl;

    public trabalhoFinalFrame() {
        initComponents();
        this.cl = (CardLayout) painelPrincipal.getLayout();

        this.BarraMenu.setVisible(false);

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
        btnEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cpSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuColaborador = new javax.swing.JMenu();
        menuCadastrarColaborador = new javax.swing.JMenuItem();
        menuListarColaborador = new javax.swing.JMenuItem();
        manuAlterarCadastro = new javax.swing.JMenuItem();
        menuExcluirColaborador = new javax.swing.JMenuItem();
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
        menuSenha = new javax.swing.JMenu();
        menuAlterSenha = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setLayout(new java.awt.CardLayout());

        painelLogin.setLayout(null);

        LabelTituloLogin.setFont(new java.awt.Font("Ultra", 1, 24)); // NOI18N
        LabelTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painelLogin.add(LabelTituloLogin);
        LabelTituloLogin.setBounds(10, 40, 527, 0);

        LabelUsuario.setFont(new java.awt.Font("Ultra", 1, 14)); // NOI18N
        LabelUsuario.setText("Usuário:");
        painelLogin.add(LabelUsuario);
        LabelUsuario.setBounds(200, 250, 80, 30);

        cpUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpUsuarioActionPerformed(evt);
            }
        });
        painelLogin.add(cpUsuario);
        cpUsuario.setBounds(280, 250, 330, 30);

        LabelSenha.setFont(new java.awt.Font("Ultra", 1, 14)); // NOI18N
        LabelSenha.setText("Senha:");
        painelLogin.add(LabelSenha);
        LabelSenha.setBounds(210, 280, 70, 30);

        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        painelLogin.add(btnEntrar);
        btnEntrar.setBounds(490, 340, 80, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestao de Pessoas");
        painelLogin.add(jLabel2);
        jLabel2.setBounds(10, 120, 800, 90);

        cpSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpSenhaActionPerformed(evt);
            }
        });
        painelLogin.add(cpSenha);
        cpSenha.setBounds(280, 280, 330, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sc/senai/trabalhoFinalSA/imagens/ImagemLogin.jpg"))); // NOI18N
        painelLogin.add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 380);

        painelPrincipal.add(painelLogin, "card2");

        menuInicio.setText("Inicio");
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInicioMouseClicked(evt);
            }
        });
        BarraMenu.add(menuInicio);

        menuColaborador.setText("Colaborador");

        menuCadastrarColaborador.setText("Cadastrar ");
        menuCadastrarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarColaboradorActionPerformed(evt);
            }
        });
        menuColaborador.add(menuCadastrarColaborador);

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
        menuColaborador.add(menuListarColaborador);

        manuAlterarCadastro.setText("Editar cadastro");
        manuAlterarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuAlterarCadastroActionPerformed(evt);
            }
        });
        menuColaborador.add(manuAlterarCadastro);

        menuExcluirColaborador.setText("Excluir cadastro");
        menuExcluirColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirColaboradorActionPerformed(evt);
            }
        });
        menuColaborador.add(menuExcluirColaborador);

        BarraMenu.add(menuColaborador);

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
        menuAdicionarTarefaColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdicionarTarefaColaboradorActionPerformed(evt);
            }
        });
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

        menuSenha.setText("Senha");

        menuAlterSenha.setText("Alterar senha");
        menuAlterSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterSenhaActionPerformed(evt);
            }
        });
        menuSenha.add(menuAlterSenha);

        BarraMenu.add(menuSenha);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarColaboradorActionPerformed
        PainelCadastroColaborador cadastro = new PainelCadastroColaborador();
        painelPrincipal.add(cadastro, "painelCadastro");
        this.cl.show(painelPrincipal, "painelCadastro");
    }//GEN-LAST:event_menuCadastrarColaboradorActionPerformed

    private void menuAgendaEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendaEquipeActionPerformed
        ListagemAgendaEquipe lae = new ListagemAgendaEquipe(this.colaborador);
        painelPrincipal.add(lae, "painelListagemAgendaEquipe");

        this.cl.show(painelPrincipal, "painelListagemAgendaEquipe");
    }//GEN-LAST:event_menuAgendaEquipeActionPerformed

    private void menuListarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarColaboradorActionPerformed
        ListagemDeColaborador listar = new ListagemDeColaborador(0);
        painelPrincipal.add(listar, "painelListagem");

        this.cl = (CardLayout) painelPrincipal.getLayout();

        cl.show(painelPrincipal, "painelListagem");
    }//GEN-LAST:event_menuListarColaboradorActionPerformed

    private void cpUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpUsuarioActionPerformed

    private void autenticarPaineis() {

        this.BarraMenu.setVisible(true);
        if (this.colaborador.getTipCol() == 2) {
            this.menuColaborador.setVisible(false);
            this.menuCadastrarEquipe.setVisible(false);
            
        }


        TelaPadrao padrao = new TelaPadrao(this.colaborador);
        painelPrincipal.add(padrao, "padrao");
        this.cl.show(painelPrincipal, "padrao");

    }


    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        ColaboradorDao col = new ColaboradorDao();
        ObterData od = new ObterData();
        GerenciaDeDados gd = new GerenciaDeDados();

        try {
            Colaborador c = col.checar(cpUsuario.getText(), cpSenha.getText());

            if (c == null) {
                JOptionPane.showMessageDialog(null, "ERRO AO AUTENTICAR");
                 
            } else {

                this.colaborador = c;
                ArrayList <Colaborador> arrayCol = new ArrayList();
                int codigo = this.colaborador.getCodCol();
                ColaboradorDao colaborador = new ColaboradorDao();

                colaborador.SetarUltimoAcesso(codigo);

                JOptionPane.showMessageDialog(null, "AUTENTICADO COM SUCESSO");
                
               gd.criarPastaColaborador();
               gd.salvarLog(this.colaborador, false);
                this.autenticarPaineis();
                this.cl.show(painelPrincipal, "telaPadrao");

            }

        } catch (SQLException ex) {
            Logger.getLogger(trabalhoFinalFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(trabalhoFinalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "telaPadrao");

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void menuListarColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuListarColaboradorMouseClicked

    }//GEN-LAST:event_menuListarColaboradorMouseClicked

    private void menuListarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarEquipeActionPerformed
        ListagemEquipe le = new ListagemEquipe(this.colaborador);
        painelPrincipal.add(le, "painelListagemEquipe");
        this.cl.show(painelPrincipal, "painelListagemEquipe");
    }//GEN-LAST:event_menuListarEquipeActionPerformed

    private void menuCadastrarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarEquipeActionPerformed
        CadastroEquipe ce = null;
        try {
            ce = new CadastroEquipe();
        } catch (SQLException ex) {
            Logger.getLogger(trabalhoFinalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        painelPrincipal.add(ce, "painelCadastroEquipe");
        this.cl.show(painelPrincipal, "painelCadastroEquipe");
    }//GEN-LAST:event_menuCadastrarEquipeActionPerformed

    private void menuAlterSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterSenhaActionPerformed
        PainelAlterarSenha altSenha = new PainelAlterarSenha();
        painelPrincipal.add(altSenha, "alterarSenha");
        cl.show(painelPrincipal, "alterarSenha");
    }//GEN-LAST:event_menuAlterSenhaActionPerformed

    private void menuAgendaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendaColaboradorActionPerformed
        ListagemAgendaColaborador agenCol = new ListagemAgendaColaborador(this.colaborador);
        painelPrincipal.add(agenCol, "painelagendaCol");
        cl.show(painelPrincipal, "painelagendaCol");
    }//GEN-LAST:event_menuAgendaColaboradorActionPerformed

    private void menuAdicionarTarefaEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdicionarTarefaEquipeActionPerformed
        String painel = "equipe";
        PainelCadastrarTarefa ct = new PainelCadastrarTarefa(this.colaborador, painel);
        painelPrincipal.add(ct, "painelCadastrarTarefa");
        this.cl.show(painelPrincipal, "painelCadastrarTarefa");

    }//GEN-LAST:event_menuAdicionarTarefaEquipeActionPerformed


    private void manuAlterarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuAlterarCadastroActionPerformed

        ListagemDeColaborador listarEAlterar = new ListagemDeColaborador(1);//parametro  1  lista e da opcao de altear

        painelPrincipal.add(listarEAlterar, "painelListagemAlt");
        this.cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "painelListagemAlt");
    }//GEN-LAST:event_manuAlterarCadastroActionPerformed

    private void menuAdicionarTarefaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdicionarTarefaColaboradorActionPerformed
        String painel = "colaborador";
        PainelCadastrarTarefa ct = new PainelCadastrarTarefa(this.colaborador, painel);
        painelPrincipal.add(ct, "painelCadastrarTarefa");
        cl.show(painelPrincipal, "painelCadastrarTarefa");
    }//GEN-LAST:event_menuAdicionarTarefaColaboradorActionPerformed

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        TelaPadrao padrao = new TelaPadrao(this.colaborador);
        painelPrincipal.add(padrao, "telaPadrao");
        this.cl.show(painelPrincipal, "telaPadrao");
    }//GEN-LAST:event_menuInicioMouseClicked

    private void menuExcluirColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirColaboradorActionPerformed
        ListagemDeColaborador excluirCadastro = new ListagemDeColaborador(3);
        painelPrincipal.add(excluirCadastro, "painelListagem");
        this.cl.show(painelPrincipal, "painelListagem");
    }//GEN-LAST:event_menuExcluirColaboradorActionPerformed

    private void cpSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpSenhaActionPerformed

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
    private javax.swing.JPasswordField cpSenha;
    private javax.swing.JTextField cpUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem manuAlterarCadastro;
    private javax.swing.JMenuItem menuAdicionarTarefaColaborador;
    private javax.swing.JMenuItem menuAdicionarTarefaEquipe;
    private javax.swing.JMenuItem menuAgendaColaborador;
    private javax.swing.JMenuItem menuAgendaEquipe;
    private javax.swing.JMenuItem menuAlterSenha;
    private javax.swing.JMenuItem menuCadastrarColaborador;
    private javax.swing.JMenuItem menuCadastrarEquipe;
    private javax.swing.JMenu menuColaborador;
    private javax.swing.JMenu menuConsultarAgenda;
    private javax.swing.JMenuItem menuExcluirColaborador;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuListarColaborador;
    private javax.swing.JMenuItem menuListarEquipe;
    private javax.swing.JMenu menuManterEquipe;
    private javax.swing.JMenu menuSenha;
    private javax.swing.JMenu menuTarefas;
    private javax.swing.JMenu menuVerAgenda;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
