package InterfaceControle;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import persistencia.conexao;

public class ControleLotes extends javax.swing.JFrame {

    private int cod_fazenda;

    public ControleLotes(int codFazenda) {
        cod_fazenda = codFazenda;

        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        try {
            consultaLotes();
        } catch (SQLException ex) {
            Logger.getLogger(ControleLotes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ControleLotes() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTLotes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contro de Lotes");

        jTLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Lote", "Status", "Pasto", "Animais Compra", "Machos Compra", "Fêmea Compra", "Arroba Compra", "Manejo Compra", "Total compra", "ArrobaTotal_Compra", "ArrobaMedia_Compra", "Idade compra", "Animais venda", "Machos venda", "Fêmea venda", "Arroba venda", "Manejo Venda", "Total venda", "ArrobaTotal_Venda", "ArrobaMedia_Venda", "Idade venda", "Animais mortos", "Periodo Confinamento", "Data Compra", "Data Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTLotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTLotesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTLotes);
        if (jTLotes.getColumnModel().getColumnCount() > 0) {
            jTLotes.getColumnModel().getColumn(0).setResizable(false);
            jTLotes.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTLotes.getColumnModel().getColumn(1).setResizable(false);
            jTLotes.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTLotes.getColumnModel().getColumn(2).setResizable(false);
            jTLotes.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTLotes.getColumnModel().getColumn(3).setResizable(false);
            jTLotes.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTLotes.getColumnModel().getColumn(4).setResizable(false);
            jTLotes.getColumnModel().getColumn(4).setPreferredWidth(110);
            jTLotes.getColumnModel().getColumn(5).setResizable(false);
            jTLotes.getColumnModel().getColumn(5).setPreferredWidth(110);
            jTLotes.getColumnModel().getColumn(6).setResizable(false);
            jTLotes.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTLotes.getColumnModel().getColumn(7).setResizable(false);
            jTLotes.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTLotes.getColumnModel().getColumn(8).setResizable(false);
            jTLotes.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTLotes.getColumnModel().getColumn(9).setResizable(false);
            jTLotes.getColumnModel().getColumn(9).setPreferredWidth(90);
            jTLotes.getColumnModel().getColumn(10).setResizable(false);
            jTLotes.getColumnModel().getColumn(10).setPreferredWidth(150);
            jTLotes.getColumnModel().getColumn(11).setResizable(false);
            jTLotes.getColumnModel().getColumn(11).setPreferredWidth(150);
            jTLotes.getColumnModel().getColumn(12).setResizable(false);
            jTLotes.getColumnModel().getColumn(12).setPreferredWidth(90);
            jTLotes.getColumnModel().getColumn(13).setResizable(false);
            jTLotes.getColumnModel().getColumn(13).setPreferredWidth(90);
            jTLotes.getColumnModel().getColumn(14).setResizable(false);
            jTLotes.getColumnModel().getColumn(14).setPreferredWidth(90);
            jTLotes.getColumnModel().getColumn(15).setResizable(false);
            jTLotes.getColumnModel().getColumn(15).setPreferredWidth(90);
            jTLotes.getColumnModel().getColumn(16).setResizable(false);
            jTLotes.getColumnModel().getColumn(16).setPreferredWidth(90);
            jTLotes.getColumnModel().getColumn(17).setResizable(false);
            jTLotes.getColumnModel().getColumn(17).setPreferredWidth(90);
            jTLotes.getColumnModel().getColumn(18).setResizable(false);
            jTLotes.getColumnModel().getColumn(18).setPreferredWidth(80);
            jTLotes.getColumnModel().getColumn(19).setResizable(false);
            jTLotes.getColumnModel().getColumn(19).setPreferredWidth(130);
            jTLotes.getColumnModel().getColumn(20).setResizable(false);
            jTLotes.getColumnModel().getColumn(20).setPreferredWidth(130);
            jTLotes.getColumnModel().getColumn(21).setResizable(false);
            jTLotes.getColumnModel().getColumn(21).setPreferredWidth(90);
            jTLotes.getColumnModel().getColumn(22).setResizable(false);
            jTLotes.getColumnModel().getColumn(22).setPreferredWidth(130);
            jTLotes.getColumnModel().getColumn(23).setResizable(false);
            jTLotes.getColumnModel().getColumn(23).setPreferredWidth(150);
            jTLotes.getColumnModel().getColumn(24).setResizable(false);
            jTLotes.getColumnModel().getColumn(24).setPreferredWidth(90);
            jTLotes.getColumnModel().getColumn(25).setResizable(false);
            jTLotes.getColumnModel().getColumn(25).setPreferredWidth(80);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1306, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Lotes", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTLotesMouseClicked
        jTLotes.setDefaultEditor(Object.class, null);
        jTLotes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { //dar dois cliques para ir para tela cadastrode specifico do lote

                    int linhaSelecionada = jTLotes.getSelectedRow();

                    String id = (String) jTLotes.getValueAt(linhaSelecionada, 0);
                    String lote = (String) jTLotes.getValueAt(linhaSelecionada, 1);

                    JPanelLotes pl = new JPanelLotes(id);
                    pl.setFocusable(true);
                    jTabbedPane1.addTab(lote, pl);
                    pl.setFocusable(true);

                }
            }
        });
    }//GEN-LAST:event_jTLotesMouseClicked

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
            java.util.logging.Logger.getLogger(ControleLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleLotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTLotes;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void consultaLotes() throws SQLException {

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM lotes A where a.cod_fazenda = " + cod_fazenda;

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {

            DefaultTableModel tabela = (DefaultTableModel) jTLotes.getModel();
            tabela.addRow(new String[]{rs.getString("id_lote"), rs.getString("numeroLote"), rs.getString("statusLote"), rs.getString("pasto"),
                rs.getString("qtdAnimais_Compra"), rs.getString("qtdMachos_Compra"), rs.getString("qtdFemea_Compra"), rs.getString("rsArroba_Compra"),
                rs.getString("rsManejo_Compra"), rs.getString("rsTotal_Compra"), rs.getString("kgArrobaTotal_Compra"),
                rs.getString("kgArrobaMedia_Compra"), rs.getString("idade_Compra"), rs.getString("qtdAnimais_Venda"),
                rs.getString("qtdMachos_Venda"), rs.getString("qtdFemea_Venda"), rs.getString("rsArroba_Venda"),
                rs.getString("rsManejo_Venda"), rs.getString("rsTotal_Venda"), rs.getString("kgArrobaTotal_Venda"),
                rs.getString("kgArrobaMedia_Venda"), rs.getString("idade_Venda"), rs.getString("animaiMortos"),
                rs.getString("periodoConfinamento"), rs.getString("dt_Compra"), rs.getString("dt_Venda")});

        }

        jTLotes.setAutoResizeMode(jTLotes.AUTO_RESIZE_OFF); //adiciona barra de rolagem horizontal na tabela
        jTLotes.setDefaultRenderer(Object.class, new CellRenderer()); //chama class CellRenderer para centralizar conteudo da tabela

        rs.close();
        pstmtCon.close();

    }

    public void removerAba() {
        jTabbedPane1.removeTabAt(1);

    }

    // classe e metodo abaixo usados para centralizar conteudo da tabela
    public class CellRenderer extends DefaultTableCellRenderer {

        public CellRenderer() {
            super();
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            this.setHorizontalAlignment(CENTER);
            return super.getTableCellRendererComponent(table, value, isSelected,
                    hasFocus, row, column);
        }
    }

}
