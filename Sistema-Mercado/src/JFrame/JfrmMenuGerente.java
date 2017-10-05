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
public class JfrmMenuGerente extends javax.swing.JFrame {

    /**
     * Creates new form JfrmMenuGerente
     */
     ConexaoBD conecta = new ConexaoBD();
    public JfrmMenuGerente() {
        initComponents();
        conecta.conexao();
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
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jmnExcluiFuncionario = new javax.swing.JCheckBoxMenuItem();
        jmnBuscarFuncionario = new javax.swing.JCheckBoxMenuItem();
        jmnAlterarFuncionario = new javax.swing.JCheckBoxMenuItem();
        jmnGerarRelatorio = new javax.swing.JMenu();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jmnConsultarRelatorio = new javax.swing.JCheckBoxMenuItem();
        jmnSais = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrame/manager_icon.png"))); // NOI18N

        jmnAddFuncionario.setText(" Funcionarios");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Adicionar Funcionario");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jmnAddFuncionario.add(jCheckBoxMenuItem1);

        jmnExcluiFuncionario.setSelected(true);
        jmnExcluiFuncionario.setText("Excluir Funcionario");
        jmnExcluiFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnExcluiFuncionarioActionPerformed(evt);
            }
        });
        jmnAddFuncionario.add(jmnExcluiFuncionario);

        jmnBuscarFuncionario.setSelected(true);
        jmnBuscarFuncionario.setText("Buscar Funcionario");
        jmnAddFuncionario.add(jmnBuscarFuncionario);

        jmnAlterarFuncionario.setSelected(true);
        jmnAlterarFuncionario.setText("Alterar Funcionario");
        jmnAddFuncionario.add(jmnAlterarFuncionario);

        jmnMenu.add(jmnAddFuncionario);

        jmnGerarRelatorio.setText("Relatorios");

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("Gerar Relatorios");
        jmnGerarRelatorio.add(jCheckBoxMenuItem6);

        jmnConsultarRelatorio.setSelected(true);
        jmnConsultarRelatorio.setText("Consultar Relatoios");
        jmnGerarRelatorio.add(jmnConsultarRelatorio);

        jmnMenu.add(jmnGerarRelatorio);

        jmnSais.setText("Mais");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Sair");
        jmnSais.add(jCheckBoxMenuItem2);

        jmnMenu.add(jmnSais);

        setJMenuBar(jmnMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jmnExcluiFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnExcluiFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmnExcluiFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmMenuGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jmnAddFuncionario;
    private javax.swing.JCheckBoxMenuItem jmnAlterarFuncionario;
    private javax.swing.JCheckBoxMenuItem jmnBuscarFuncionario;
    private javax.swing.JCheckBoxMenuItem jmnConsultarRelatorio;
    private javax.swing.JCheckBoxMenuItem jmnExcluiFuncionario;
    private javax.swing.JMenu jmnGerarRelatorio;
    private javax.swing.JMenuBar jmnMenu;
    private javax.swing.JMenu jmnSais;
    // End of variables declaration//GEN-END:variables
}
