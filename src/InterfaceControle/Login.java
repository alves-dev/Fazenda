/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceControle;

import java.awt.Color;
import AppPackage.AnimationClass;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.conexao;

/**
 *
 * @author helpdesk3
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            pesquisaFazendas();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jbCancelar = new javax.swing.JButton();
        jbLogin = new javax.swing.JButton();
        jtSenha = new javax.swing.JPasswordField();
        jl_mensagem = new javax.swing.JLabel();
        comboFazendas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Login_fundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Login_login.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 204, 51));
        jLabel3.setText("Fazenda:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 204, 51));
        jLabel4.setText("Senha:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, -1, -1));

        jtUsuario.setBorder(null);
        jtUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jtUsuarioMouseMoved(evt);
            }
        });
        jtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtUsuarioMouseExited(evt);
            }
        });
        jtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtUsuarioKeyReleased(evt);
            }
        });
        jPanel2.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 184, 100, -1));

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Login_x.png"))); // NOI18N
        jbCancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbCancelarMouseMoved(evt);
            }
        });
        jbCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCancelarMouseExited(evt);
            }
        });
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 229, 73, 52));

        jbLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Login_v.png"))); // NOI18N
        jbLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbLoginMouseMoved(evt);
            }
        });
        jbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbLoginMouseExited(evt);
            }
        });
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        jPanel2.add(jbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 231, 73, 52));

        jtSenha.setBorder(null);
        jtSenha.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jtSenhaMouseMoved(evt);
            }
        });
        jtSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtSenhaMouseExited(evt);
            }
        });
        jtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSenhaActionPerformed(evt);
            }
        });
        jtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtSenhaKeyReleased(evt);
            }
        });
        jPanel2.add(jtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 209, 100, -1));

        jl_mensagem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_mensagem.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(jl_mensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 286, 180, 10));

        comboFazendas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboFazendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, 20));

        jLabel5.setForeground(new java.awt.Color(0, 204, 51));
        jLabel5.setText("Usuario:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSenhaActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed

        try {
            if (validacaoUsualirio() == true) {
                dispose();
            } else {
                jl_mensagem.setText("Usuario ou senha errados!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbLoginActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMouseMoved
        jtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsuarioMouseMoved

    private void jtUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMouseExited
        jtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsuarioMouseExited

    private void jtSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSenhaMouseExited
        jtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_jtSenhaMouseExited

    private void jtSenhaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSenhaMouseMoved
        jtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jtSenhaMouseMoved

    private void jbLoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLoginMouseMoved
        jbLogin.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));        // TODO add your handling code here:
    }//GEN-LAST:event_jbLoginMouseMoved

    private void jbLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLoginMouseExited
        jbLogin.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_jbLoginMouseExited

    private void jbCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseMoved
        jbCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarMouseMoved

    private void jbCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseExited
        jbCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarMouseExited

    private void jtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtUsuarioKeyReleased
        jtUsuario.setText(jtUsuario.getText().toUpperCase());
    }//GEN-LAST:event_jtUsuarioKeyReleased

    private void jtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSenhaKeyReleased
        jtSenha.setText(jtSenha.getText().toUpperCase());
    }//GEN-LAST:event_jtSenhaKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboFazendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbLogin;
    private javax.swing.JLabel jl_mensagem;
    private javax.swing.JPasswordField jtSenha;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean validacaoUsualirio() throws SQLException {
        boolean validado = false;

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM usuarios A ";

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {
            if (rs.getString("usuario").equals(jtUsuario.getText()) && rs.getString("senha").equals(jtSenha.getText())) {
                Principal prin = new Principal(Integer.parseInt(rs.getString("cod_usuario")), rs.getString("usuario"), (String) comboFazendas.getSelectedItem());
                prin.setVisible(true);
                validado = true;
            }

        }
        rs.close();
        pstmtCon.close();

        return validado;
    }

    private void pesquisaFazendas() throws SQLException {
        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM fazenda A ";

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        comboFazendas.removeAllItems();
        while (rs.next()) {

            comboFazendas.addItem(rs.getString("nome_fazenda"));

        }
        rs.close();
        pstmtCon.close();

    }

}
