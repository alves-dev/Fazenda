package InterfaceCadastro;

import OutrasClasses.colorirTabela;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import persistencia.conexao;

public class Animais extends javax.swing.JFrame {

    private int idSelecao; //usado para seleção do animal e passado para a proxima tela (cadastro de animais).

    /* public Animais(int idSelecao) {
        this.idSelecao = idSelecao;
    }
     */
    Date data = new Date();

    private int cod_fazenda;

    /**
     *
     * @param codFazenda
     */
    public Animais(int codFazenda) {
        cod_fazenda = codFazenda;
        
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        try {
            consultaAnimais();
        } catch (SQLException ex) {
            Logger.getLogger(Animais.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Animais() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoNovoAnimal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAnimais = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        pesquisa_botaoPesquisa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pesquisa_id = new javax.swing.JTextField();
        pesquisa_id2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pesquisa_idade = new javax.swing.JTextField();
        pesquisa_combo_status = new javax.swing.JComboBox<>();
        pesquisa_combo_tipoAnimal = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        pesquisa_combo_raca = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        pesquisa_combo_sexo = new javax.swing.JComboBox<>();
        pesquisa_combo_pasto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pesquisa_combo_loteVenda = new javax.swing.JComboBox<>();
        pesquisa_combo_loteCompra = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pesquisa_dataCadastro1 = new com.toedter.calendar.JDateChooser();
        pesquisa_dataAlteracao1 = new com.toedter.calendar.JDateChooser();
        pesquisa_dataCadastro2 = new com.toedter.calendar.JDateChooser();
        pesquisa_dataAlteracao2 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pesquisa_quantidadeRegistros = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Animais");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botaoNovoAnimal.setText("Novo Animal");
        botaoNovoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoAnimalActionPerformed(evt);
            }
        });

        tabelaAnimais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificação", "identificacao2", "Status", "Tipo", "Raça", "Idade", "Pasto", "Lote Compra", "Lote Venda", "Sexo", "Obs", "Data Cadastro", "Alteração"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAnimaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAnimais);
        if (tabelaAnimais.getColumnModel().getColumnCount() > 0) {
            tabelaAnimais.getColumnModel().getColumn(5).setPreferredWidth(35);
            tabelaAnimais.getColumnModel().getColumn(9).setPreferredWidth(35);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros Pesquisa"));

        pesquisa_botaoPesquisa.setText("Pesquisa");
        pesquisa_botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_botaoPesquisaActionPerformed(evt);
            }
        });

        jLabel1.setText("Id:");

        jLabel2.setText("Id 2:");

        jLabel3.setText("Status:");

        jLabel4.setText("Idade:");

        pesquisa_combo_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        pesquisa_combo_tipoAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        jLabel5.setText("Tipo:");

        pesquisa_combo_raca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas" }));

        jLabel6.setText("Raça:");

        pesquisa_combo_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "M", "F" }));

        pesquisa_combo_pasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        pesquisa_combo_pasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_combo_pastoActionPerformed(evt);
            }
        });

        jLabel7.setText("Pasto:");

        jLabel8.setText("Sexo:");

        pesquisa_combo_loteVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        pesquisa_combo_loteCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        jLabel9.setText("Lote Compra:");

        jLabel10.setText("Lote Venda:");

        jLabel11.setText("Data Cadastro:");

        jLabel12.setText("Data alteração:");

        jLabel13.setText("até");

        jLabel14.setText("até");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisa_id, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisa_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pesquisa_idade)
                    .addComponent(pesquisa_combo_status, 0, 65, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisa_combo_tipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisa_combo_raca, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisa_combo_pasto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisa_combo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisa_combo_loteVenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisa_combo_loteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pesquisa_dataCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pesquisa_dataCadastro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pesquisa_dataAlteracao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pesquisa_dataAlteracao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisa_botaoPesquisa)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisa_botaoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(pesquisa_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(pesquisa_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(pesquisa_combo_tipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(pesquisa_combo_pasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(pesquisa_combo_loteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(pesquisa_dataCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquisa_dataCadastro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(pesquisa_id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(pesquisa_combo_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(pesquisa_combo_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(pesquisa_combo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(pesquisa_combo_loteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(pesquisa_dataAlteracao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquisa_dataAlteracao2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addContainerGap())
        );

        pesquisa_quantidadeRegistros.setText("Registros encontrados:");

        jButton1.setText("imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1319, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(pesquisa_quantidadeRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoNovoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoNovoAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisa_quantidadeRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoAnimalActionPerformed
        CadastroAnimal CadastroAnimal = new CadastroAnimal(0, cod_fazenda);
        CadastroAnimal.setVisible(true);

        dispose();
    }//GEN-LAST:event_botaoNovoAnimalActionPerformed

    private void tabelaAnimaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAnimaisMouseClicked

        tabelaAnimais.setDefaultEditor(Object.class, null);
        tabelaAnimais.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { //dar dois cliques para ir para tela cadastrode animas alterar

                    int linhaSelecionada = tabelaAnimais.getSelectedRow();

                    String temp = (String) tabelaAnimais.getValueAt(linhaSelecionada, 0);
                    //setIdSelecao(Integer.parseInt(temp));
                    idSelecao = Integer.parseInt(temp);

                    CadastroAnimal cadAni = new CadastroAnimal(idSelecao, cod_fazenda);
                    cadAni.setVisible(true);

                    dispose();

                }
            }
        });


    }//GEN-LAST:event_tabelaAnimaisMouseClicked

    private void pesquisa_combo_pastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_combo_pastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisa_combo_pastoActionPerformed

    private void pesquisa_botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_botaoPesquisaActionPerformed
        Integer id = null, idade = null;
        String id2 = null, status = null, tipoAnimal = null, raca = null,
                pasto = null, sexo = null, loteCompra = null, loteVenda = null;
        Date dataCadastro1 = null, dataCadastro2 = null, dataAlteracao1 = null, dataAlteracao2 = null;

        if (!pesquisa_id.getText().equals("")) {
            id = Integer.parseInt(pesquisa_id.getText());
        }
        if (!pesquisa_idade.getText().equals("")) {
            idade = Integer.parseInt(pesquisa_idade.getText());
        }

        id2 = pesquisa_id2.getText();
        status = (String) pesquisa_combo_status.getSelectedItem();
        tipoAnimal = (String) pesquisa_combo_tipoAnimal.getSelectedItem();
        raca = (String) pesquisa_combo_raca.getSelectedItem();
        pasto = (String) pesquisa_combo_pasto.getSelectedItem();
        sexo = (String) pesquisa_combo_sexo.getSelectedItem();
        loteCompra = (String) pesquisa_combo_loteCompra.getSelectedItem();
        loteVenda = (String) pesquisa_combo_loteVenda.getSelectedItem();

        if (1 > 3) {

            dataCadastro1 = pesquisa_dataCadastro1.getDate();
            dataCadastro2 = pesquisa_dataCadastro2.getDate();

            dataAlteracao1 = pesquisa_dataAlteracao1.getDate();
            dataAlteracao2 = pesquisa_dataAlteracao2.getDate();
        }

        try {
            filtrarAnimais(id, idade, id2, status, tipoAnimal, raca, pasto, sexo, loteCompra, loteVenda, dataCadastro1, dataCadastro2, dataAlteracao1, dataAlteracao2);
        } catch (SQLException ex) {
            Logger.getLogger(Animais.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pesquisa_botaoPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(Animais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoNovoAnimal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisa_botaoPesquisa;
    private javax.swing.JComboBox<String> pesquisa_combo_loteCompra;
    private javax.swing.JComboBox<String> pesquisa_combo_loteVenda;
    private javax.swing.JComboBox<String> pesquisa_combo_pasto;
    private javax.swing.JComboBox<String> pesquisa_combo_raca;
    private javax.swing.JComboBox<String> pesquisa_combo_sexo;
    private javax.swing.JComboBox<String> pesquisa_combo_status;
    private javax.swing.JComboBox<String> pesquisa_combo_tipoAnimal;
    private com.toedter.calendar.JDateChooser pesquisa_dataAlteracao1;
    private com.toedter.calendar.JDateChooser pesquisa_dataAlteracao2;
    private com.toedter.calendar.JDateChooser pesquisa_dataCadastro1;
    private com.toedter.calendar.JDateChooser pesquisa_dataCadastro2;
    private javax.swing.JTextField pesquisa_id;
    private javax.swing.JTextField pesquisa_id2;
    private javax.swing.JTextField pesquisa_idade;
    private javax.swing.JLabel pesquisa_quantidadeRegistros;
    private javax.swing.JTable tabelaAnimais;
    // End of variables declaration//GEN-END:variables

    public void consultaAnimais() throws SQLException {

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM animais A where a.cod_fazenda = " + cod_fazenda;

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);
        DefaultTableModel tabela = (DefaultTableModel) tabelaAnimais.getModel();

        while (rs.next()) {

            tabela.addRow(new String[]{rs.getString("identificacao"), rs.getString("identificacao2"), rs.getString("status"),
                rs.getString("tipoAnimal"), rs.getString("raca"), rs.getString("idade"), rs.getString("pasto"),
                rs.getString("loteCompra"), rs.getString("loteVenda"), rs.getString("sexo"), rs.getString("obs"),
                rs.getString("dtCadastro"),
                rs.getString("dtUltimaAteracao")});

        }

        tabelaAnimais.setDefaultRenderer(Object.class, new Animais.CellRenderer()); //chama class CellRenderer para centralizar conteudo da tabela

        rs.close();
        pstmtCon.close();
    }

    public int getIdSelecao() {
        return idSelecao;
    }

    public void setIdSelecao(int idSelecao) {
        this.idSelecao = idSelecao;

    }

    private void filtrarAnimais(Integer id, Integer idade, String id2, String status, String tipoAnimal,
            String raca, String pasto, String sexo, String loteCompra, String loteVenda,
            Date dataCadastro1, Date dataCadastro2, Date dataAlteracao1, Date dataAlteracao2) throws SQLException {

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM animais A where A.cod_fazenda = " + cod_fazenda;

        //montar sql
        if (id != null) {
            selectSQL = selectSQL + " and A.identificacao = " + id;
        }
        if (idade != null) {
            selectSQL = selectSQL + " and A.idade = " + idade;
        }
        if (!id2.equals("")) {
            selectSQL = selectSQL + " and A.identificacao2 like '" + id2 + "'";
        }
        if (!status.equals("Todos")) {
            selectSQL = selectSQL + " and A.status like '" + status + "'";
        }
        if (!tipoAnimal.equals("Todos")) {
            selectSQL = selectSQL + " and A.tipoAnimal like '" + tipoAnimal + "'";
        }
        if (!raca.equals("Todas")) {
            selectSQL = selectSQL + " and A.raca like '" + raca + "'";
        }
        if (!pasto.equals("Todos")) {
            selectSQL = selectSQL + " and A.pasto like '" + pasto + "'";
        }
        if (!sexo.equals("Todos")) {
            selectSQL = selectSQL + " and A.sexo = '" + sexo + "'";
        }
        if (!loteCompra.equals("Todos")) {
            selectSQL = selectSQL + " and A.loteCompra = " + loteCompra;
        }
        if (!loteVenda.equals("Todos")) {
            selectSQL = selectSQL + " and A.loteVenda = " + loteVenda;
        }
        if (dataCadastro1 != null) {
            selectSQL = selectSQL + " and A. ";
        }
        if (dataCadastro2 != null) {
            selectSQL = selectSQL + " and A. ";
        }
        if (dataAlteracao1 != null) {
            selectSQL = selectSQL + " and A. ";
        }
        if (dataAlteracao2 != null) {
            selectSQL = selectSQL + " and A. ";
        }

        System.out.println(selectSQL);
        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);
        DefaultTableModel tabela = (DefaultTableModel) tabelaAnimais.getModel();
        limparTabela();

        int registros = 0;
        while (rs.next()) {

            tabela.addRow(new String[]{rs.getString("identificacao"), rs.getString("identificacao2"), rs.getString("status"),
                rs.getString("tipoAnimal"), rs.getString("raca"), rs.getString("idade"), rs.getString("pasto"),
                rs.getString("loteCompra"), rs.getString("loteVenda"), rs.getString("sexo"), rs.getString("obs"),
                rs.getString("dtCadastro"),
                rs.getString("dtUltimaAteracao")});

            registros++;
        }

        pesquisa_quantidadeRegistros.setText("Registros encontrados: " + String.valueOf(registros));

        tabelaAnimais.setDefaultRenderer(Object.class, new Animais.CellRenderer()); //chama class CellRenderer para centralizar conteudo da tabela

        rs.close();
        pstmtCon.close();

    }

    private void limparTabela() {
        DefaultTableModel tabela = (DefaultTableModel) tabelaAnimais.getModel();
        int numeroLinhas = tabela.getRowCount();
        int index = 1;

        while (index <= numeroLinhas) {
            tabela.removeRow(0);
            index++;
        }
    }

    // classe e metodo abaixo usados para centralizar conteudo da tabela
    public class CellRenderer extends DefaultTableCellRenderer {

        public CellRenderer() {
            super();
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            this.setHorizontalAlignment(CENTER);
            Component c = super.getTableCellRendererComponent(table, value, isSelected,
                    hasFocus, row, column);

            return this;
        }

    }

}
