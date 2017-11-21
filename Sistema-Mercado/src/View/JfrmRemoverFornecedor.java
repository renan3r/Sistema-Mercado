/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.EnderecoControle;
import Controle.FornecedorControle;
import Modelo.Endereco;
import Utilitarios.ApenasNumeros;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leticia Ribeiro
 */
public class JfrmRemoverFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form JfrmRemoverFornecedor
     */
    public JfrmRemoverFornecedor() {
        initComponents();
        carregaTabela();
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
        jbtnRemover = new javax.swing.JButton();
        jbtnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblFornecedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Remover Fornecedor");

        jbtnRemover.setText("Remover");
        jbtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoverActionPerformed(evt);
            }
        });

        jbtnSair.setText("Sair");
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        jtblFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblFornecedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnRemover)
                .addGap(33, 33, 33)
                .addComponent(jbtnSair)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRemover)
                    .addComponent(jbtnSair))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSairActionPerformed

    private void jbtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoverActionPerformed
        // TODO add your handling code here:
        //jTblBens.getValueAt(jTblBens.getSelectedRow(),2)
        FornecedorControle forncedorControle = new FornecedorControle ();
        forncedorControle.remover(jtblFornecedor.getValueAt(jtblFornecedor.getSelectedRow(),0));
        DefaultTableModel tableModel = (DefaultTableModel)jtblFornecedor.getModel();
        tableModel.removeRow(jtblFornecedor.getSelectedRow());
        
    }//GEN-LAST:event_jbtnRemoverActionPerformed
 private void carregaTabela(){
            
            ArrayList<Endereco> arrayEndereco = new ArrayList<>();
            EnderecoControle enderecoControle = new EnderecoControle();
            FornecedorControle fornecedorControle = new FornecedorControle();
            DefaultTableModel tableModel = (DefaultTableModel)jtblFornecedor.getModel();           
            tableModel = new DefaultTableModel(new String[]{"Codigo","Nome", "CPF", "Telefone", "Rua", "Numero", "Bairro", "Cidade"},0);
            
         for(int i=0; i < fornecedorControle.buscar().size(); i++){
            for (int j=0;j<enderecoControle.busca().size();j++){
                    if(fornecedorControle.buscar().get(i).getCodigoEndereco()== enderecoControle.busca().get(j).getCodigo()){
                            
                    arrayEndereco.add(enderecoControle.busca().get(j));
              
                    }
                }
        }
            for(int i=0; i < fornecedorControle.buscar().size(); i++){
                
                Object [] dados = {
                    
                    fornecedorControle.buscar().get(i).getCodigo(),
                    fornecedorControle.buscar().get(i).getNomeFornecedor(),
                    fornecedorControle.buscar().get(i).getCpfFornecedor(),
                    fornecedorControle.buscar().get(i).getTelefone(),
                    arrayEndereco.get(i).getRua(),
                    arrayEndereco.get(i).getNumero(),
                    arrayEndereco.get(i).getBairro(),
                    arrayEndereco.get(i).getCidade()};
                    
                    
                tableModel.addRow(dados);
                
            }
            jtblFornecedor.setModel(tableModel);
      
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
            java.util.logging.Logger.getLogger(JfrmRemoverFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmRemoverFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmRemoverFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmRemoverFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmRemoverFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnRemover;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JTable jtblFornecedor;
    // End of variables declaration//GEN-END:variables
}
