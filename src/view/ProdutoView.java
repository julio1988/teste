/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.HibernateProdutoDAO;
import entidades.Produto;
import excepton.ValidacaoException;
import java.math.BigDecimal;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import model.TableModelProduto;
import util.LimitaNroCaracteres;

/**
 *
 * @author Julio
 */
public class ProdutoView extends javax.swing.JDialog {

    /**
     * Creates new form Produto
     */
    public ProdutoView(java.awt.Frame parent, boolean modal, TableModelProduto modelProduto) {
        super(parent, modal);
        initComponents();
        p = new Produto();
        produtoDAO = new HibernateProdutoDAO();
        this.modelProduto = modelProduto;
        this.jCheckBoxAtivo.setSelected(true);
    }

    public ProdutoView(java.awt.Frame parent, boolean modal, TableModelProduto modelProduto, Produto produto) {
        super(parent, modal);
        initComponents();
        produtoDAO = new HibernateProdutoDAO();
        this.modelProduto = modelProduto;
        this.jTextFieldDescricao.setText(produto.getNome());
        NumberFormat format = NumberFormat.getInstance();
        this.jFormattedTextFieldPreco.setText(format.format(produto.getPreco()));
        this.jFormattedTextFieldPreco.setValue(new Double(produto.getPreco().doubleValue()));
        this.p = produto;
        this.jCheckBoxAtivo.setSelected(produto.getAtivo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jFormattedTextFieldPreco = new javax.swing.JFormattedTextField();
        jCheckBoxAtivo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");

        jLabelDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDescricao.setText("Descrição: ");
        jLabelDescricao.setToolTipText("");

        jTextFieldDescricao.setColumns(19);
        jTextFieldDescricao.setDocument(new LimitaNroCaracteres(19));
        jTextFieldDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Preço (R$): ");

        jButtonSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jFormattedTextFieldPreco.setColumns(20);
        jFormattedTextFieldPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextFieldPreco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jFormattedTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldPrecoActionPerformed(evt);
            }
        });

        jCheckBoxAtivo.setText("Ativo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxAtivo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescricao)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldPreco)
                                .addGap(347, 347, 347)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAtivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            validarCampos();
            p.setNome(jTextFieldDescricao.getText());
            BigDecimal preco = BigDecimal.ZERO;
            if (jFormattedTextFieldPreco.getValue() instanceof Long) {
                preco = new BigDecimal((Long) jFormattedTextFieldPreco.getValue());
            }
            if (jFormattedTextFieldPreco.getValue() instanceof Double) {
                preco = new BigDecimal((Double) jFormattedTextFieldPreco.getValue());
            }
            preco = preco.setScale(2, BigDecimal.ROUND_HALF_UP);
            p.setPreco(preco);
            p.setAtivo(jCheckBoxAtivo.isSelected());
            if (p != null && p.getId() != null) {
                produtoDAO.atualizar(p);
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
            } else {
                produtoDAO.salvar(p);
                JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");
            }
            this.setVisible(false);
            modelProduto.pesquisar("");
        } catch (ValidacaoException ve) {
            for (String s : ve.getMensagens()) {
                JOptionPane.showMessageDialog(null, s);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar ou atualizar o produto. Erro: " + e);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    public void validarCampos() {
        ValidacaoException ve = new ValidacaoException();
        if (jTextFieldDescricao.getText().isEmpty()) {
            ve.adicionarMensagem("Informe uma descrição para o produto!");
        }
        if (jFormattedTextFieldPreco.getText().isEmpty()) {
            ve.adicionarMensagem("Informe um preço para o produto!");
        } else {
            if (jFormattedTextFieldPreco.getValue() == null) {
                ve.adicionarMensagem("Informe um preço para o produto!");
            }
        }
        ve.lancarException();
    }

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jFormattedTextFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPrecoActionPerformed

    }//GEN-LAST:event_jFormattedTextFieldPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProdutoView dialog = new ProdutoView(new javax.swing.JFrame(), true, null);
                dialog.setLocationRelativeTo(null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private TableModelProduto modelProduto;
    private HibernateProdutoDAO produtoDAO = null;
    private Produto p;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxAtivo;
    private javax.swing.JFormattedTextField jFormattedTextFieldPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDescricao;
    // End of variables declaration//GEN-END:variables
}