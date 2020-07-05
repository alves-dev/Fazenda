package InterfaceControle;

import InterfaceControle.JPanelPastos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import persistencia.conexao;

public class ControlePastos extends javax.swing.JFrame {

    private int cod_fazenda;

    public ControlePastos(int codFazenda) {
        cod_fazenda = codFazenda;

        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        try {
            verificaPastos(false);
        } catch (SQLException ex) {
            Logger.getLogger(ControlePastos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ControlePastos() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        resumoOutros = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        resumoQuantidadeAnimais = new javax.swing.JTextField();
        resumoAlimentacao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resumoIdade = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        resumoAreaTotal = new javax.swing.JTextField();
        resumoAreaUtilizada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("outros:");

        resumoOutros.setEnabled(false);
        resumoOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumoOutrosActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Animais"));

        resumoQuantidadeAnimais.setEnabled(false);
        resumoQuantidadeAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumoQuantidadeAnimaisActionPerformed(evt);
            }
        });

        resumoAlimentacao.setEnabled(false);

        jLabel2.setText("alimentação necessaria:");

        jLabel1.setText("Quantidate de animais:");

        jLabel3.setText("idade media:");

        resumoIdade.setEnabled(false);
        resumoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumoIdadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resumoQuantidadeAnimais, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(resumoAlimentacao)
                    .addComponent(resumoIdade))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resumoQuantidadeAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(resumoAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(resumoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pastos"));

        jLabel6.setText("Área m2 utilizada :");

        jLabel5.setText("Área m2 do piquete :");

        resumoAreaTotal.setEnabled(false);

        resumoAreaUtilizada.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resumoAreaTotal)
                    .addComponent(resumoAreaUtilizada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resumoAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resumoAreaUtilizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addGap(112, 112, 112)
                        .addComponent(resumoOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(560, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resumoOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(313, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Resumo", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resumoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumoIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resumoIdadeActionPerformed

    private void resumoOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumoOutrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resumoOutrosActionPerformed

    private void resumoQuantidadeAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumoQuantidadeAnimaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resumoQuantidadeAnimaisActionPerformed

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
            java.util.logging.Logger.getLogger(ControlePastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlePastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlePastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlePastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlePastos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane2;
    public javax.swing.JTextField resumoAlimentacao;
    public javax.swing.JTextField resumoAreaTotal;
    public javax.swing.JTextField resumoAreaUtilizada;
    public javax.swing.JTextField resumoIdade;
    public javax.swing.JTextField resumoOutros;
    public javax.swing.JTextField resumoQuantidadeAnimais;
    // End of variables declaration//GEN-END:variables

    public void verificaPastos(boolean atualiza) throws SQLException {

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM pastos A where a.cod_fazenda = " + cod_fazenda;

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        int areaGeral = 0;
        int totalGeral = 0;
        int areaUtilizadaGeral = 0;

        while (rs.next()) {

            String pasto = rs.getString("pasto");

            JPanelPastos pp = new JPanelPastos();

            jTabbedPane2.addTab(rs.getString("pasto"), pp);
            pp.setFocusable(true);

            int area = Integer.parseInt(rs.getString("area"));
            pp.campoAreaPiquete.setText(String.valueOf(area));
            areaGeral = areaGeral + area;
            resumoAreaTotal.setText(String.valueOf(areaGeral));

            //quantidade
            int total = quantidadeAnimais(Integer.parseInt(rs.getString("cod_pasto")));
            totalGeral = totalGeral + total;

            pp.campoQnatidadeAnimais.setText(String.valueOf(total));
            resumoQuantidadeAnimais.setText(String.valueOf(totalGeral));

            //area utilizada
            int areaUtilizada = areaUtilizada(Integer.parseInt(rs.getString("cod_pasto")));
            areaUtilizadaGeral = areaUtilizadaGeral + areaUtilizada;

            pp.campoAreaUtilizada.setText(String.valueOf(areaUtilizada));
            resumoAreaUtilizada.setText(String.valueOf(areaUtilizadaGeral));

        }

        rs.close();
        pstmtCon.close();

    }

    public int quantidadeAnimais(int codPasto) throws SQLException {

        int total = 0;

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "select count(*) as total FROM animais A where A.cod_pasto = " + codPasto + " and a.cod_status <> 1 and a.cod_status <> 3";

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {

            total = Integer.parseInt(rs.getString("total"));

        }

        rs.close();
        pstmtCon.close();
        return total;

    }

    public int areaUtilizada(int codPasto) throws SQLException {

        int areaUtilizada = 0;

        int bezerrosA = 0;
        int bezerrosB = 0;
        int garrotesA = 0;
        int garrotesB = 0;
        int boisA = 0;
        int boisB = 0;
        int boisVelhosA = 0;
        int boisVelhosB = 0;
        int m2Bezerros = 0;
        int m2Garrotes = 0;
        int m2Bois = 0;
        int m2BoisVelhos = 0;

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "select * FROM animais A where A.cod_pasto = " + codPasto + " and a.cod_status <> 1 and a.cod_status <> 3";
        String selectSQL2 = "select * FROM fazendaConfinamento A where A.cod_fazenda = 1";

        Statement pstmtCon;
        Statement pstmtCon2;
        pstmtCon = conexao.getConexao().createStatement();
        pstmtCon2 = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);
        ResultSet rs2 = pstmtCon2.executeQuery(selectSQL2);

        if (rs2.next()) {
            bezerrosA = rs2.getInt("bezerrosA");
            bezerrosB = rs2.getInt("bezerrosB");
            garrotesA = rs2.getInt("garrotesA");
            garrotesB = rs2.getInt("garrotesB");
            boisA = rs2.getInt("boisA");
            boisB = rs2.getInt("boisB");
            boisVelhosA = rs2.getInt("boisVelhosA");
            boisVelhosB = rs2.getInt("boisVelhosB");
            m2Bezerros = rs2.getInt("m2Bezerros");
            m2Garrotes = rs2.getInt("m2Garrotes");
            m2Bois = rs2.getInt("m2Bois");
            m2BoisVelhos = rs2.getInt("m2BoisVelhos");

        }

        while (rs.next()) {

            int idade = 0;
            idade = Integer.parseInt(rs.getString("idade"));

            if (idade >= bezerrosA || idade <= bezerrosB) {
                areaUtilizada = areaUtilizada + m2Bezerros;
            }
            if (idade >= garrotesA || idade <= garrotesB) {
                areaUtilizada = areaUtilizada + m2Garrotes;
            }
            if (idade >= boisA || idade <= boisB) {
                areaUtilizada = areaUtilizada + m2Bois;
            }
            if (idade >= boisVelhosA || idade <= boisVelhosB) {
                areaUtilizada = areaUtilizada + m2BoisVelhos;
            }

        }

        rs.close();
        rs2.close();
        pstmtCon.close();
        return areaUtilizada;

    }

}
