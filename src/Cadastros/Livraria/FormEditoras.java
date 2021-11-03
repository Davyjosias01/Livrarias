/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastros.Livraria;

import Cadastros.pastaDAO.editorasDAO;
import Cadastros.classes.editoras;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author davy.scheuermann
 */
public class FormEditoras extends javax.swing.JFrame {

    /**
     * Creates new form Editoras
     */
    public FormEditoras() {
        initComponents();
        carregaDados();
    }

    public void carregaDados() {
        DefaultTableModel tabela = (DefaultTableModel) TB_Editoras.getModel();

        editorasDAO DAO = new editorasDAO();
        tabela.setNumRows(0);

        DAO.listar().forEach((a) -> {
            tabela.addRow(new Object[]{
                a.getId(),
                a.getNome()
            });
        });
    }

    public void pesquisaDados() {
        DefaultTableModel tabela = (DefaultTableModel) TB_Editoras.getModel();
        editorasDAO dao = new editorasDAO();
        tabela.setNumRows(0);

        for (editoras a : dao.pesquisar(TF_Pesquisar.getText())) {
            tabela.addRow(new Object[]{
                a.getId(),
                a.getNome()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LBL_Codigo = new javax.swing.JLabel();
        TF_Codigo = new javax.swing.JTextField();
        LBL_Nome = new javax.swing.JLabel();
        BTT_Cadastrar = new javax.swing.JButton();
        TF_Nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Editoras = new javax.swing.JTable();
        BTT_Alterar = new javax.swing.JButton();
        BTT_Excluir = new javax.swing.JButton();
        BTT_Pesquisar = new javax.swing.JButton();
        TF_Pesquisar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de editoras"));

        LBL_Codigo.setText("Código");

        TF_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_CodigoActionPerformed(evt);
            }
        });

        LBL_Nome.setText("Nome");

        BTT_Cadastrar.setText("Cadastrar");
        BTT_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTT_CadastrarActionPerformed(evt);
            }
        });

        TF_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NomeActionPerformed(evt);
            }
        });

        TB_Editoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        TB_Editoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_EditorasMouseClicked(evt);
            }
        });
        TB_Editoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TB_EditorasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TB_Editoras);

        BTT_Alterar.setText("Alterar");
        BTT_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTT_AlterarActionPerformed(evt);
            }
        });

        BTT_Excluir.setText("Excluir");
        BTT_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTT_ExcluirActionPerformed(evt);
            }
        });

        BTT_Pesquisar.setText("Pesquisar");
        BTT_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTT_PesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBL_Codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBL_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BTT_Cadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(BTT_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTT_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TF_Nome)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TF_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTT_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_Codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_Nome)
                    .addComponent(TF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTT_Cadastrar)
                    .addComponent(BTT_Alterar)
                    .addComponent(BTT_Excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTT_Pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TF_Pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_CodigoActionPerformed

    private void TF_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NomeActionPerformed

    private void BTT_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTT_CadastrarActionPerformed

        editoras e = new editoras();
        editorasDAO DAO = new editorasDAO();
        e.setNome(TF_Nome.getText());
        DAO.cadastrar(e);

        carregaDados();
    }//GEN-LAST:event_BTT_CadastrarActionPerformed

    private void BTT_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTT_AlterarActionPerformed

        editoras e = new editoras();
        editorasDAO DAO = new editorasDAO();
        e.setNome(TF_Nome.getText());
        e.setId(Integer.parseInt(TF_Codigo.getText()));
        DAO.alterar(e);

        carregaDados();
    }//GEN-LAST:event_BTT_AlterarActionPerformed

    private void TB_EditorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_EditorasMouseClicked
        TF_Codigo.setText(TB_Editoras.getValueAt(TB_Editoras.getSelectedRow(), 0).toString());
        TF_Nome.setText(TB_Editoras.getValueAt(TB_Editoras.getSelectedRow(), 1).toString());

    }//GEN-LAST:event_TB_EditorasMouseClicked

    private void BTT_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTT_PesquisarActionPerformed
        pesquisaDados();        
        // TODO add your handling code here:
    }//GEN-LAST:event_BTT_PesquisarActionPerformed

    private void BTT_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTT_ExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTT_ExcluirActionPerformed

    private void TB_EditorasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TB_EditorasKeyPressed
        // Não consigo apagar essa função;
    }//GEN-LAST:event_TB_EditorasKeyPressed

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
            java.util.logging.Logger.getLogger(FormEditoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormEditoras().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTT_Alterar;
    private javax.swing.JButton BTT_Cadastrar;
    private javax.swing.JButton BTT_Excluir;
    private javax.swing.JButton BTT_Pesquisar;
    private javax.swing.JLabel LBL_Codigo;
    private javax.swing.JLabel LBL_Nome;
    private javax.swing.JTable TB_Editoras;
    private javax.swing.JTextField TF_Codigo;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_Pesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
