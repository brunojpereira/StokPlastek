/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;


/**
 *
 * @author Bruno
 */

public class GuiPrincipal extends javax.swing.JFrame {
    public static JInternalFrame frmCargo = new JInternalFrame("Cadastrar Cargos", false,true,false,true);
    public static JInternalFrame frmCliente = new JInternalFrame("Cadastrar Clientes", false,true,false,true);
    public static JInternalFrame frmCidade = new JInternalFrame("Cadastrar Cidades", false,true,false,true);
    public static JInternalFrame frmCadProduto = new JInternalFrame("Cadastrar Produtos", false,true,false,true);
    public static JInternalFrame frmNovoPedido = new JInternalFrame("Pedidos", false,true,false,true);
    public static JInternalFrame frmCadFuncionario = new JInternalFrame("Cadastrar Funcionarios", false,true,false,true);
    public static JInternalFrame frmLotes = new JInternalFrame("Controle de Produção - Lotes", true,true,true,true);
    public static JInternalFrame frmTarefas = new JInternalFrame("Tarefas", true,true,true,true);
    public static JInternalFrame frmOcupacaoFuncionarios = new JInternalFrame("Ocupação Atual dos Funcionários", true,true,true,true);
    public static JInternalFrame frmEstoque = new JInternalFrame("Controle de Estoque", false,true,false,true);
    public static JInternalFrame frmBuscarLote = new JInternalFrame("Buscar Lote", false,true,false,true);
    public static JInternalFrame frmHistorico = new JInternalFrame("Histórico", false,true,false,true);
    
    /**
     * Creates new form frmPrincipal
     */
    public GuiPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        botNovoPedido = new javax.swing.JButton();
        botLinhaProducao = new javax.swing.JButton();
        mdiPrincipal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblData = new javax.swing.JLabel();
        bmnPrincipal = new javax.swing.JMenuBar();
        mnuCadastros = new javax.swing.JMenu();
        imnCadCargos = new javax.swing.JMenuItem();
        imnCadCidades = new javax.swing.JMenuItem();
        imnCadClientes = new javax.swing.JMenuItem();
        imnCadFuncionarios = new javax.swing.JMenuItem();
        imnCadProdutos = new javax.swing.JMenuItem();
        mnuMovimentacao = new javax.swing.JMenu();
        imnNovoPedido = new javax.swing.JMenuItem();
        mnuProducao = new javax.swing.JMenu();
        imnLinhaProducao = new javax.swing.JMenuItem();
        imnBuscarLote = new javax.swing.JMenuItem();
        imnTarefas = new javax.swing.JMenuItem();
        imnOcupacaoFunc = new javax.swing.JMenuItem();
        imnHistorico = new javax.swing.JMenuItem();
        mnuSobre = new javax.swing.JMenu();
        imnSobreSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok - Gerenciamento de Produção e de Pessoal");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("frmPrincipal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setAlignmentX(5.0F);
        jToolBar1.setAlignmentY(5.0F);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToolBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        botNovoPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botNovoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Pedidos.png"))); // NOI18N
        botNovoPedido.setText("Pedidos");
        botNovoPedido.setFocusable(false);
        botNovoPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botNovoPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoPedidoActionPerformed(evt);
            }
        });
        jToolBar1.add(botNovoPedido);

        botLinhaProducao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botLinhaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Editar.png"))); // NOI18N
        botLinhaProducao.setText("Linha de Produção");
        botLinhaProducao.setFocusable(false);
        botLinhaProducao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botLinhaProducao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botLinhaProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLinhaProducaoActionPerformed(evt);
            }
        });
        jToolBar1.add(botLinhaProducao);

        javax.swing.GroupLayout mdiPrincipalLayout = new javax.swing.GroupLayout(mdiPrincipal);
        mdiPrincipal.setLayout(mdiPrincipalLayout);
        mdiPrincipalLayout.setHorizontalGroup(
            mdiPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mdiPrincipalLayout.setVerticalGroup(
            mdiPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("Usuário Operando o Sistema");

        lblData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblData.setText("Data do Dia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuario)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mnuCadastros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuCadastros.setText("Cadastros");
        mnuCadastros.setContentAreaFilled(false);

        imnCadCargos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        imnCadCargos.setText("Cargos");
        imnCadCargos.setContentAreaFilled(false);
        imnCadCargos.setDoubleBuffered(true);
        imnCadCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadCargosActionPerformed(evt);
            }
        });
        mnuCadastros.add(imnCadCargos);

        imnCadCidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        imnCadCidades.setText("Cidades");
        imnCadCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadCidadesActionPerformed(evt);
            }
        });
        mnuCadastros.add(imnCadCidades);

        imnCadClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        imnCadClientes.setText("Clientes");
        imnCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadClientesActionPerformed(evt);
            }
        });
        mnuCadastros.add(imnCadClientes);

        imnCadFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        imnCadFuncionarios.setText("Funcionários");
        imnCadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadFuncionariosActionPerformed(evt);
            }
        });
        mnuCadastros.add(imnCadFuncionarios);

        imnCadProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        imnCadProdutos.setText("Produtos");
        imnCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadProdutosActionPerformed(evt);
            }
        });
        mnuCadastros.add(imnCadProdutos);

        bmnPrincipal.add(mnuCadastros);

        mnuMovimentacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuMovimentacao.setText("Movimentação");

        imnNovoPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        imnNovoPedido.setText("Pedidos");
        imnNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnNovoPedidoActionPerformed(evt);
            }
        });
        mnuMovimentacao.add(imnNovoPedido);

        bmnPrincipal.add(mnuMovimentacao);

        mnuProducao.setText("Produção");

        imnLinhaProducao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        imnLinhaProducao.setText("Linha de Produção");
        imnLinhaProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnLinhaProducaoActionPerformed(evt);
            }
        });
        mnuProducao.add(imnLinhaProducao);

        imnBuscarLote.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        imnBuscarLote.setText("Buscar Lote");
        imnBuscarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnBuscarLoteActionPerformed(evt);
            }
        });
        mnuProducao.add(imnBuscarLote);

        imnTarefas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        imnTarefas.setText("Visualizar Tarefas");
        imnTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnTarefasActionPerformed(evt);
            }
        });
        mnuProducao.add(imnTarefas);

        imnOcupacaoFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        imnOcupacaoFunc.setText("Ocupação dos Funcionários");
        imnOcupacaoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnOcupacaoFuncActionPerformed(evt);
            }
        });
        mnuProducao.add(imnOcupacaoFunc);

        imnHistorico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        imnHistorico.setText("Histórico");
        imnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnHistoricoActionPerformed(evt);
            }
        });
        mnuProducao.add(imnHistorico);

        bmnPrincipal.add(mnuProducao);

        mnuSobre.setText("Sobre");

        imnSobreSistema.setText("Sistema");
        imnSobreSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnSobreSistemaActionPerformed(evt);
            }
        });
        mnuSobre.add(imnSobreSistema);

        bmnPrincipal.add(mnuSobre);

        setJMenuBar(bmnPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mdiPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mdiPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imnCadCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadCargosActionPerformed
        criarQuadroInterno(new GuiCargo(), frmCargo);
    }//GEN-LAST:event_imnCadCargosActionPerformed
    
    private void imnCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadClientesActionPerformed
        //criarQuadroInterno(new FrmCadCliente(), frmCadCliente);
        
    }//GEN-LAST:event_imnCadClientesActionPerformed
    private void frmCargoWindowClosing(java.awt.event.WindowEvent evt){
        
    }
    private void imnCadCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadCidadesActionPerformed
        criarQuadroInterno(new GuiCidade(), frmCidade);
    }//GEN-LAST:event_imnCadCidadesActionPerformed

    private void imnCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadProdutosActionPerformed
        //criarQuadroInterno(new FrmCadProduto(), frmCadProduto);
    }//GEN-LAST:event_imnCadProdutosActionPerformed

    private void imnNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnNovoPedidoActionPerformed
        //criarQuadroInterno(new FrmPedidos(-1), frmNovoPedido);
    }//GEN-LAST:event_imnNovoPedidoActionPerformed

    private void imnCadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadFuncionariosActionPerformed
        //criarQuadroInterno(new FrmCadFuncionario(), frmCadFuncionario);
    }//GEN-LAST:event_imnCadFuncionariosActionPerformed

    private void calendarioPrincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calendarioPrincipalKeyPressed

    }//GEN-LAST:event_calendarioPrincipalKeyPressed

    private void calendarioPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioPrincipalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarioPrincipalMousePressed

    private void calendarioPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioPrincipalMouseClicked
   
    }//GEN-LAST:event_calendarioPrincipalMouseClicked

    private void calendarioPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioPrincipalMouseEntered
 
    }//GEN-LAST:event_calendarioPrincipalMouseEntered

    private void calendarioPrincipalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioPrincipalMouseReleased

    }//GEN-LAST:event_calendarioPrincipalMouseReleased

    private void calendarioPrincipalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioPrincipalPropertyChange

    }//GEN-LAST:event_calendarioPrincipalPropertyChange

    private void imnLinhaProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnLinhaProducaoActionPerformed
        //new FrmLotes().setVisible(true);
        
    }//GEN-LAST:event_imnLinhaProducaoActionPerformed

    private void imnTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnTarefasActionPerformed
        //criarQuadroInterno(new FrmTarefas(), frmTarefas);
    }//GEN-LAST:event_imnTarefasActionPerformed

    private void imnOcupacaoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnOcupacaoFuncActionPerformed
        //criarQuadroInterno(new FrmConsultaFuncionarios(), frmOcupacaoFuncionarios);
    }//GEN-LAST:event_imnOcupacaoFuncActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //FrmLogin.cnnLogin.desconectar();
    }//GEN-LAST:event_formWindowClosed

    private void imnBuscarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnBuscarLoteActionPerformed
        //criarQuadroInterno(new FrmBuscaLote(), frmBuscarLote);
    }//GEN-LAST:event_imnBuscarLoteActionPerformed

    private void imnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnHistoricoActionPerformed
        //criarQuadroInterno(new FrmHistorico(), frmHistorico);
    }//GEN-LAST:event_imnHistoricoActionPerformed

    private void botNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNovoPedidoActionPerformed
        //criarQuadroInterno(new FrmPedidos(-1), frmNovoPedido);
    }//GEN-LAST:event_botNovoPedidoActionPerformed

    private void botLinhaProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLinhaProducaoActionPerformed
        //new FrmLotes().setVisible(true);
    }//GEN-LAST:event_botLinhaProducaoActionPerformed

    private void imnSobreSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnSobreSistemaActionPerformed
        //new FrmSobre().setVisible(true);
    }//GEN-LAST:event_imnSobreSistemaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente sair do sistema?",
                "Confirmação",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    public static void criarQuadroInterno(JFrame Frm, JInternalFrame frm) {                                           
        frm.setContentPane(Frm.getContentPane());
        mdiPrincipal.add(frm);
        frm.setSize(Frm.getSize());
        frm.setLocation((mdiPrincipal.getWidth()/2)-(Frm.getWidth()/2), (mdiPrincipal.getHeight()/2)-(frm.getHeight()/2));
        frm.setVisible(true);
        frm.show();
    }  
   
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
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmnPrincipal;
    private javax.swing.JButton botLinhaProducao;
    private javax.swing.JButton botNovoPedido;
    private javax.swing.JMenuItem imnBuscarLote;
    private javax.swing.JMenuItem imnCadCargos;
    private javax.swing.JMenuItem imnCadCidades;
    private javax.swing.JMenuItem imnCadClientes;
    private javax.swing.JMenuItem imnCadFuncionarios;
    private javax.swing.JMenuItem imnCadProdutos;
    private javax.swing.JMenuItem imnHistorico;
    private javax.swing.JMenuItem imnLinhaProducao;
    private javax.swing.JMenuItem imnNovoPedido;
    private javax.swing.JMenuItem imnOcupacaoFunc;
    private javax.swing.JMenuItem imnSobreSistema;
    private javax.swing.JMenuItem imnTarefas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblUsuario;
    public static javax.swing.JDesktopPane mdiPrincipal;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenu mnuMovimentacao;
    private javax.swing.JMenu mnuProducao;
    private javax.swing.JMenu mnuSobre;
    // End of variables declaration//GEN-END:variables
}

