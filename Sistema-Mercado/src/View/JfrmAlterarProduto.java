/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.ProdutoControle;
import Modelo.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leticia Ribeiro
 */
public class JfrmAlterarProduto extends javax.swing.JFrame {

    /**
     * Creates new form JfrmAlterarProduto
     */
    public JfrmAlterarProduto() {
        initComponents();
        getRootPane().setDefaultButton(jbtnPesquisar);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProduto = new javax.swing.JTable();
        jtxtBuscado = new javax.swing.JTextField();
        jbtnPesquisar = new javax.swing.JButton();
        jbtnSair3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnAlterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblProduto);

        jtxtBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscadoActionPerformed(evt);
            }
        });

        jbtnPesquisar.setText("Pesquisar");
        jbtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPesquisarActionPerformed(evt);
            }
        });

        jbtnSair3.setText("Sair");
        jbtnSair3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSair3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Alterar Produto");

        jbtnAlterar.setText("Alterar");
        jbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSair3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnPesquisar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSair3)
                    .addComponent(jbtnAlterar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscadoActionPerformed

    private void jbtnSair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSair3ActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnSair3ActionPerformed

    private void jbtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPesquisarActionPerformed
        // TODO add your handling code here:
        Produto produto = new Produto();
        produto.setNomeProduto(jtxtBuscado.getText());
        ProdutoControle produtoControle = new ProdutoControle();
        DefaultTableModel modeloTabela = (DefaultTableModel)jtblProduto.getModel();
        modeloTabela = new DefaultTableModel(new String[] {"Código", "Nome do Produto", "Modelo", "Preço de Compra", "Preço de Venda", "Data de Validade", "Fornecedor", "Quantidade Total"}, 0);
        ArrayList<Produto> array = produtoControle.buscar(produto.getNomeProduto());
        ArrayList<Float> arraycodigo = produtoControle.pegaQuantidade(produto.getNomeProduto());
        ArrayList<String> arraycodigo2 = produtoControle.pegaNomeFornecedor(produto.getNomeProduto());
        for(int i = 0; i < array.size();i++){
            Object[] data = {array.get(i).getCodigo(), array.get(i).getNomeProduto(), array.get(i).getModelo(), array.get(i).getPrecoCompra(), array.get(i).getPrecoVenda(), array.get(i).getDataValidade(), arraycodigo2.get(i), arraycodigo.get(i)};
            modeloTabela.addRow(data);
        }
        jtblProduto.setModel(modeloTabela);
        jtblProduto.getColumnModel().getColumn(0).setPreferredWidth(20);
        jtblProduto.getColumnModel().getColumn(1).setPreferredWidth(75);
        jtblProduto.getColumnModel().getColumn(2).setPreferredWidth(20);
        jtblProduto.getColumnModel().getColumn(3).setPreferredWidth(75);
        jtblProduto.getColumnModel().getColumn(4).setPreferredWidth(70);
        jtblProduto.getColumnModel().getColumn(5).setPreferredWidth(75);
        jtblProduto.getColumnModel().getColumn(6).setPreferredWidth(40);
        jtblProduto.getColumnModel().getColumn(7).setPreferredWidth(75);       
    }//GEN-LAST:event_jbtnPesquisarActionPerformed

    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        // TODO add your handling code here:
        ArrayList<Produto> array = new ArrayList<>();
        ArrayList<Float> array2 = new ArrayList<>();
        ArrayList<String> array1 = new ArrayList<>();
        for(int i = 0; i < jtblProduto.getRowCount(); i++){
            Produto produto = new Produto();
            produto.setCodigo(Integer.parseInt(jtblProduto.getValueAt(i, 0).toString()));
            produto.setNomeProduto(jtblProduto.getValueAt(i, 1).toString());
            produto.setModelo(jtblProduto.getValueAt(i, 2).toString());
            produto.setPrecoCompra(Float.parseFloat(jtblProduto.getValueAt(i, 3).toString()));
            produto.setPrecoVenda(Float.parseFloat(jtblProduto.getValueAt(i, 4).toString()));
            produto.setDataValidade(jtblProduto.getValueAt(i, 5).toString());
            array.add(produto);
            array1.add(jtblProduto.getValueAt(i, 6).toString());
            array2.add(Float.parseFloat(jtblProduto.getValueAt(i, 7).toString()));
        }
        ProdutoControle produtoControle = new ProdutoControle();
        produtoControle.updateProduto(array, array1, array2);
        JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
    }//GEN-LAST:event_jbtnAlterarActionPerformed
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
            java.util.logging.Logger.getLogger(JfrmAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmAlterarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnPesquisar;
    private javax.swing.JButton jbtnSair3;
    private javax.swing.JTable jtblProduto;
    private javax.swing.JTextField jtxtBuscado;
    // End of variables declaration//GEN-END:variables
}
