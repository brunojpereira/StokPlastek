/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bean.LoginBean;
import controller.LoginController;
import dao.*;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Bruno
 */

public class GuiLogin extends javax.swing.JFrame {
    public static ResultSet rsLogin = null;
    List<LoginBean> lista;
    /**
     * Creates new form FrmLogin
     */
    public GuiLogin() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        ConexaoMySQL.getInstance();
        LoginController login = new LoginController();
        lista=login.consultar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panLogin = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome_usuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha_usuario = new javax.swing.JPasswordField();
        botEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso ao Sistema");
        setAlwaysOnTop(true);
        setResizable(false);

        panLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informe seus dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        panLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteicones/Cadeado.png"))); // NOI18N
        lblNome.setText("Nome:");

        txtNome_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome_usuarioActionPerformed(evt);
            }
        });
        txtNome_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNome_usuarioKeyPressed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteicones/Chave2.png"))); // NOI18N
        lblSenha.setText("Senha:");

        txtSenha_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSenha_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenha_usuarioFocusGained(evt);
            }
        });
        txtSenha_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenha_usuarioKeyPressed(evt);
            }
        });

        botEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteicones/Entrar.png"))); // NOI18N
        botEntrar.setText("Entrar");
        botEntrar.setIconTextGap(15);
        botEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLoginLayout = new javax.swing.GroupLayout(panLogin);
        panLogin.setLayout(panLoginLayout);
        panLoginLayout.setHorizontalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addComponent(lblSenha)
                        .addGap(16, 16, 16)
                        .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSenha_usuario)))
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panLoginLayout.setVerticalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNome_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome_usuarioActionPerformed

    private boolean verificarLogin(){
        try {
            for(LoginBean i : lista){
                if(i.getUsuario().equals(txtNome_usuario.getText())){
                    if(i.getSenha().equals(String.valueOf(txtSenha_usuario.getPassword()))){
                        this.setVisible(false);
                        
                        new GuiPrincipal().setVisible(true);
                        return true;
                    }
                }
            }
            JOptionPane.showMessageDialog(this,"Senha ou usuário incorreto(s)");
            txtNome_usuario.requestFocus();
            rsLogin.beforeFirst();
            return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao entrar: " + ex);
            Logger.getLogger(GuiLogin.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    private void botEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEntrarActionPerformed
        verificarLogin();
    }//GEN-LAST:event_botEntrarActionPerformed

    private void txtSenha_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenha_usuarioKeyPressed
        if(evt.getKeyCode()==VK_ENTER){
            verificarLogin();
        }
    }//GEN-LAST:event_txtSenha_usuarioKeyPressed

    private void txtNome_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNome_usuarioKeyPressed
        if(evt.getKeyCode()==VK_ENTER){
            verificarLogin();
        }
    }//GEN-LAST:event_txtNome_usuarioKeyPressed

    private void txtSenha_usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenha_usuarioFocusGained

    }//GEN-LAST:event_txtSenha_usuarioFocusGained

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
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GuiLogin().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GuiLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(GuiLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botEntrar;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel panLogin;
    private javax.swing.JTextField txtNome_usuario;
    private javax.swing.JPasswordField txtSenha_usuario;
    // End of variables declaration//GEN-END:variables
}