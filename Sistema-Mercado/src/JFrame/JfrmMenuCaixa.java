/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

/**
 *
 * @author Leticia Ribeiro
 */
public class JfrmMenuCaixa extends javax.swing.JFrame {

    /**
     * Creates new form JfrmMenuCaixa
     */
    public JfrmMenuCaixa() {
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

        jLabel1 = new javax.swing.JLabel();
        jmnMenu = new javax.swing.JMenuBar();
        jmnAddFuncionario = new javax.swing.JMenu();
        jMenuRealizarVenda = new javax.swing.JMenuItem();
        jMenuRemoverVenda = new javax.swing.JMenuItem();
        jMenuBuscarVenda = new javax.swing.JMenuItem();
        jMenuAlterarVenda = new javax.swing.JRadioButtonMenuItem();
        jmnGerarRelatorio = new javax.swing.JMenu();
        jMenuCadastrarProduto = new javax.swing.JMenuItem();
        jMenuRemoverProduto = new javax.swing.JMenuItem();
        jMenuBuscarProduto = new javax.swing.JMenuItem();
        jMenuAlterarProduto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuCadastrarFornecedor = new javax.swing.JMenuItem();
        jMenuRemoverFornecedor = new javax.swing.JMenuItem();
        jMenuBuscarFornecedor = new javax.swing.JMenuItem();
        jMenuAlterarFornecedor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuAdicionarNotaFiscal = new javax.swing.JMenuItem();
        jMenuBuscarNotaFiscal = new javax.swing.JMenuItem();
        jMenuRemoverNotaFiscal = new javax.swing.JRadioButtonMenuItem();
        jMenuAdicionarEstoque = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenuRemoverEstoque = new javax.swing.JRadioButtonMenuItem();
        jmnSais = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carrinho.png"))); // NOI18N

        jmnAddFuncionario.setText("Vendas");

        jMenuRealizarVenda.setText("Realizar Venda");
        jMenuRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRealizarVendaActionPerformed(evt);
            }
        });
        jmnAddFuncionario.add(jMenuRealizarVenda);

        jMenuRemoverVenda.setText("Remover Venda");
        jMenuRemoverVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRemoverVendaActionPerformed(evt);
            }
        });
        jmnAddFuncionario.add(jMenuRemoverVenda);

        jMenuBuscarVenda.setText("Buscar Venda");
        jMenuBuscarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBuscarVendaActionPerformed(evt);
            }
        });
        jmnAddFuncionario.add(jMenuBuscarVenda);

        jMenuAlterarVenda.setSelected(true);
        jMenuAlterarVenda.setText("Alterar Venda");
        jmnAddFuncionario.add(jMenuAlterarVenda);

        jmnMenu.add(jmnAddFuncionario);

        jmnGerarRelatorio.setText("Produtos");

        jMenuCadastrarProduto.setText("Cadastrar Produto");
        jMenuCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarProdutoActionPerformed(evt);
            }
        });
        jmnGerarRelatorio.add(jMenuCadastrarProduto);

        jMenuRemoverProduto.setText("Remover Produto");
        jMenuRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRemoverProdutoActionPerformed(evt);
            }
        });
        jmnGerarRelatorio.add(jMenuRemoverProduto);

        jMenuBuscarProduto.setText("Buscar Produto");
        jMenuBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBuscarProdutoActionPerformed(evt);
            }
        });
        jmnGerarRelatorio.add(jMenuBuscarProduto);

        jMenuAlterarProduto.setText("Alterar Produto");
        jMenuAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlterarProdutoActionPerformed(evt);
            }
        });
        jmnGerarRelatorio.add(jMenuAlterarProduto);

        jmnMenu.add(jmnGerarRelatorio);

        jMenu1.setText("Fornecedor");

        jMenuCadastrarFornecedor.setText("Cadastrar Fornecedor");
        jMenuCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastrarFornecedor);

        jMenuRemoverFornecedor.setText("Remover Fornecedor");
        jMenuRemoverFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRemoverFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuRemoverFornecedor);

        jMenuBuscarFornecedor.setText("Buscar Fornecedor");
        jMenuBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBuscarFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuBuscarFornecedor);

        jMenuAlterarFornecedor.setText("Alterar Fornecedor");
        jMenuAlterarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlterarFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAlterarFornecedor);

        jmnMenu.add(jMenu1);

        jMenu2.setText("Nota Fiscal");

        jMenuAdicionarNotaFiscal.setText("Adicionar Nota Fiscal");
        jMenuAdicionarNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAdicionarNotaFiscalActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAdicionarNotaFiscal);

        jMenuBuscarNotaFiscal.setText("Buscar Nota Fiscal");
        jMenuBuscarNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBuscarNotaFiscalActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuBuscarNotaFiscal);

        jMenuRemoverNotaFiscal.setSelected(true);
        jMenuRemoverNotaFiscal.setText("Remover Nota Fiscal");
        jMenu2.add(jMenuRemoverNotaFiscal);

        jmnMenu.add(jMenu2);

        jMenuAdicionarEstoque.setText("Estoque");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Adicionar Estoque");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenuAdicionarEstoque.add(jRadioButtonMenuItem3);

        jMenuRemoverEstoque.setSelected(true);
        jMenuRemoverEstoque.setText("Remover Estoque");
        jMenuAdicionarEstoque.add(jMenuRemoverEstoque);

        jmnMenu.add(jMenuAdicionarEstoque);

        jmnSais.setText("Mais");

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jmnSais.add(jMenuSair);

        jmnMenu.add(jmnSais);

        setJMenuBar(jmnMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(320, 243));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarFornecedorActionPerformed
        // TODO add your handling code here:
        JfrmBuscarFornecedor buscarFornecedor = new JfrmBuscarFornecedor();
        buscarFornecedor.setLocationRelativeTo(null);
        buscarFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuBuscarFornecedorActionPerformed

    private void jMenuAlterarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlterarFornecedorActionPerformed
        // TODO add your handling code here:
        JfrmAlterarFornecedor alterarFornecedor = new JfrmAlterarFornecedor();
        alterarFornecedor.setLocationRelativeTo(null);
        alterarFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuAlterarFornecedorActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRealizarVendaActionPerformed
        // TODO add your handling code here:
        JfrmRealizaVenda realizaVenda = new JfrmRealizaVenda();
        realizaVenda.setLocationRelativeTo(null);
        realizaVenda.setVisible(true);
    }//GEN-LAST:event_jMenuRealizarVendaActionPerformed

    private void jMenuRemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRemoverVendaActionPerformed
        // TODO add your handling code here:
        JfrmRemoverVenda excluirVenda = new JfrmRemoverVenda();
        excluirVenda.setLocationRelativeTo(null);
        excluirVenda.setVisible(true);
    }//GEN-LAST:event_jMenuRemoverVendaActionPerformed

    private void jMenuBuscarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarVendaActionPerformed
        // TODO add your handling code here:
        JfrmBuscarVenda buscarVenda = new JfrmBuscarVenda();
        buscarVenda.setLocationRelativeTo(null);
        buscarVenda.setVisible(true);
    }//GEN-LAST:event_jMenuBuscarVendaActionPerformed

    private void jMenuCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarProdutoActionPerformed
        // TODO add your handling code here:
        JfrmCadastrarProduto cadastrarProduto = new JfrmCadastrarProduto();
        cadastrarProduto.setLocationRelativeTo(null);
        cadastrarProduto.setVisible(true);
    }//GEN-LAST:event_jMenuCadastrarProdutoActionPerformed

    private void jMenuRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRemoverProdutoActionPerformed
        // TODO add your handling code here:
        JfrmRemoverProduto removerProdutor = new JfrmRemoverProduto();
        removerProdutor.setLocationRelativeTo(null);
        removerProdutor.setVisible(true);
    }//GEN-LAST:event_jMenuRemoverProdutoActionPerformed

    private void jMenuBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarProdutoActionPerformed
        // TODO add your handling code here:
        JfrmBuscarProduto buscarProduto = new JfrmBuscarProduto();
        buscarProduto.setLocationRelativeTo(null);
        buscarProduto.setVisible(true);
    }//GEN-LAST:event_jMenuBuscarProdutoActionPerformed

    private void jMenuAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlterarProdutoActionPerformed
        // TODO add your handling code here:
        JfrmAlterarProduto alterarProduto = new JfrmAlterarProduto();
        alterarProduto.setLocationRelativeTo(null);
        alterarProduto.setVisible(true);
    }//GEN-LAST:event_jMenuAlterarProdutoActionPerformed

    private void jMenuCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarFornecedorActionPerformed
        // TODO add your handling code here:
        JfrmCadastrarFornecedor cadastrarFornecedor = new JfrmCadastrarFornecedor();
        cadastrarFornecedor.setLocationRelativeTo(null);
        cadastrarFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuCadastrarFornecedorActionPerformed

    private void jMenuRemoverFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRemoverFornecedorActionPerformed
        // TODO add your handling code here:
        JfrmRemoverFornecedor removerFornecedor = new JfrmRemoverFornecedor();
        removerFornecedor.setLocationRelativeTo(null);
        removerFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuRemoverFornecedorActionPerformed

    private void jMenuAdicionarNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAdicionarNotaFiscalActionPerformed
        // TODO add your handling code here:
        JfrmCadastrarNotaFiscal adcionarNotaFiscal = new JfrmCadastrarNotaFiscal();
        adcionarNotaFiscal.setLocationRelativeTo(null);
        adcionarNotaFiscal.setVisible(true);
    }//GEN-LAST:event_jMenuAdicionarNotaFiscalActionPerformed

    private void jMenuBuscarNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarNotaFiscalActionPerformed
        // TODO add your handling code here:
        JfrmBuscarNotaFiscal buscarNotaFiscal = new JfrmBuscarNotaFiscal();
        buscarNotaFiscal.setLocationRelativeTo(null);
        buscarNotaFiscal.setVisible(true);
    }//GEN-LAST:event_jMenuBuscarNotaFiscalActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmMenuCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmMenuCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAdicionarEstoque;
    private javax.swing.JMenuItem jMenuAdicionarNotaFiscal;
    private javax.swing.JMenuItem jMenuAlterarFornecedor;
    private javax.swing.JMenuItem jMenuAlterarProduto;
    private javax.swing.JRadioButtonMenuItem jMenuAlterarVenda;
    private javax.swing.JMenuItem jMenuBuscarFornecedor;
    private javax.swing.JMenuItem jMenuBuscarNotaFiscal;
    private javax.swing.JMenuItem jMenuBuscarProduto;
    private javax.swing.JMenuItem jMenuBuscarVenda;
    private javax.swing.JMenuItem jMenuCadastrarFornecedor;
    private javax.swing.JMenuItem jMenuCadastrarProduto;
    private javax.swing.JMenuItem jMenuRealizarVenda;
    private javax.swing.JRadioButtonMenuItem jMenuRemoverEstoque;
    private javax.swing.JMenuItem jMenuRemoverFornecedor;
    private javax.swing.JRadioButtonMenuItem jMenuRemoverNotaFiscal;
    private javax.swing.JMenuItem jMenuRemoverProduto;
    private javax.swing.JMenuItem jMenuRemoverVenda;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JMenu jmnAddFuncionario;
    private javax.swing.JMenu jmnGerarRelatorio;
    private javax.swing.JMenuBar jmnMenu;
    private javax.swing.JMenu jmnSais;
    // End of variables declaration//GEN-END:variables
}
