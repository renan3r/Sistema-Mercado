/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import Utilitarios.ConexaoBD;

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
        jMenuExcluirVenda = new javax.swing.JMenuItem();
        jMenuBuscarVenda = new javax.swing.JMenuItem();
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
        jmnSais = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carrinho.png"))); // NOI18N

        jmnAddFuncionario.setText("Vendas");

        jMenuRealizarVenda.setText("Realizar Venda");
        jmnAddFuncionario.add(jMenuRealizarVenda);

        jMenuExcluirVenda.setText("Excluir Venda");
        jmnAddFuncionario.add(jMenuExcluirVenda);

        jMenuBuscarVenda.setText("Buscar Venda");
        jmnAddFuncionario.add(jMenuBuscarVenda);

        jmnMenu.add(jmnAddFuncionario);

        jmnGerarRelatorio.setText("Produtos");

        jMenuCadastrarProduto.setText("Cadastrar Produto");
        jmnGerarRelatorio.add(jMenuCadastrarProduto);

        jMenuRemoverProduto.setText("Remover Produto");
        jmnGerarRelatorio.add(jMenuRemoverProduto);

        jMenuBuscarProduto.setText("Buscar Produto");
        jmnGerarRelatorio.add(jMenuBuscarProduto);

        jMenuAlterarProduto.setText("Alterar Produto");
        jmnGerarRelatorio.add(jMenuAlterarProduto);

        jmnMenu.add(jmnGerarRelatorio);

        jMenu1.setText("Fornecedor");

        jMenuCadastrarFornecedor.setText("Cadastrar Fornecedor");
        jMenu1.add(jMenuCadastrarFornecedor);

        jMenuRemoverFornecedor.setText("Remover Fornecedor");
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
        jMenu2.add(jMenuAdicionarNotaFiscal);

        jMenuBuscarNotaFiscal.setText("Buscar Nota Fiscal");
        jMenu2.add(jMenuBuscarNotaFiscal);

        jmnMenu.add(jMenu2);

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
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBuscarFornecedorActionPerformed

    private void jMenuAlterarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlterarFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAlterarFornecedorActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuSairActionPerformed

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
    private javax.swing.JMenuItem jMenuAdicionarNotaFiscal;
    private javax.swing.JMenuItem jMenuAlterarFornecedor;
    private javax.swing.JMenuItem jMenuAlterarProduto;
    private javax.swing.JMenuItem jMenuBuscarFornecedor;
    private javax.swing.JMenuItem jMenuBuscarNotaFiscal;
    private javax.swing.JMenuItem jMenuBuscarProduto;
    private javax.swing.JMenuItem jMenuBuscarVenda;
    private javax.swing.JMenuItem jMenuCadastrarFornecedor;
    private javax.swing.JMenuItem jMenuCadastrarProduto;
    private javax.swing.JMenuItem jMenuExcluirVenda;
    private javax.swing.JMenuItem jMenuRealizarVenda;
    private javax.swing.JMenuItem jMenuRemoverFornecedor;
    private javax.swing.JMenuItem jMenuRemoverProduto;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenu jmnAddFuncionario;
    private javax.swing.JMenu jmnGerarRelatorio;
    private javax.swing.JMenuBar jmnMenu;
    private javax.swing.JMenu jmnSais;
    // End of variables declaration//GEN-END:variables
}
