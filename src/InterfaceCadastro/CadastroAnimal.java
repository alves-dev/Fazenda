package InterfaceCadastro;

import ClassesDados.animais;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import persistencia.IncluirEditarDAO;
import persistencia.conexao;

public class CadastroAnimal extends javax.swing.JFrame {

    animais animais = new animais();
    IncluirEditarDAO ani;
    Date dataSistema = new Date();

    //variaveis para o metodo codSelecaoCombo
    private String selecao;
    private int codSelecao;
    private int acaoCod;

    //variavel usada no metodo verivicaoSalvar
    private boolean verificacaoOK = false;  // se false não verificado ou verificado com erros 

    // variavel para codigo do animal que vem da tela anterior para ser alterardo
    private int codAnimalTelaAnterior;

    // true = novo cadastro; false = alterar cadastro
    private boolean novoCadastro = true;

    private int cod_fazenda;
    
    public CadastroAnimal(int codAnimalTelaAnterior, int codFazenda) {
        cod_fazenda = codFazenda;
        
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        this.codAnimalTelaAnterior = codAnimalTelaAnterior;

        try {
            consultaStatus();
            consultaTipoAnimal();
            consultaPasto();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (codAnimalTelaAnterior == 0) {

            campoDtCadastro.setDate(dataSistema);
            campoDtUltimaAteracao.setDate(dataSistema);
            campoLoteCompra.setText("0");
            campoIdade.setText("0");

            novoCadastro = true;     // true = novo cadastro; false = alterar cadastro

        }

        if (codAnimalTelaAnterior > 0) {
            novoCadastro = false; // true = novo cadastro; false = alterar cadastro

            try {
                consultaAnimalSelecionado();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroAnimal.class.getName()).log(Level.SEVERE, null, ex);
            }
            campoDtUltimaAteracao.setDate(dataSistema);
        }
    }

    private CadastroAnimal() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoSalvar = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        campoDtUltimaAteracao = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        campoLoteVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoIdade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoSegundaIdentificação = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoObs = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        campoLoteCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoIdentificação = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoDtCadastro = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboTipoAnimal = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        comboPasto = new javax.swing.JComboBox<>();
        comboRaca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Animal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoNovo.setText("Novo");
        botaoNovo.setEnabled(false);
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.setEnabled(false);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        campoDtUltimaAteracao.setEnabled(false);

        jLabel12.setText("Data de Alteração:");

        campoLoteVenda.setEnabled(false);
        campoLoteVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoteVendaActionPerformed(evt);
            }
        });

        jLabel4.setText("Lote de Venda:");

        campoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdadeActionPerformed(evt);
            }
        });

        jLabel10.setText("Idade:");

        jLabel11.setText("Observações:");

        campoSegundaIdentificação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSegundaIdentificaçãoActionPerformed(evt);
            }
        });
        campoSegundaIdentificação.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoSegundaIdentificaçãoKeyReleased(evt);
            }
        });

        campoObs.setColumns(20);
        campoObs.setRows(5);
        jScrollPane1.setViewportView(campoObs);

        jLabel2.setText("Segunda Identificação:");

        campoLoteCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoteCompraActionPerformed(evt);
            }
        });

        jLabel3.setText("Lote de Compra:");

        campoIdentificação.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoIdentificação.setEnabled(false);
        campoIdentificação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdentificaçãoActionPerformed(evt);
            }
        });

        jLabel1.setText("Identificação");

        campoDtCadastro.setEnabled(false);

        jLabel13.setText("Data de Cadastro:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        jLabel5.setText("Status:");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        jLabel6.setText("Tipo do Animal:");

        comboTipoAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        comboTipoAnimal.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboTipoAnimalPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboTipoAnimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboTipoAnimalKeyReleased(evt);
            }
        });

        jLabel7.setText("Raça:");

        jLabel8.setText("Pasto:");

        jLabel9.setText("Sexo:");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Masculino", "Feminino" }));

        comboPasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        comboRaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        comboRaca.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboPasto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(comboRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(comboPasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoSegundaIdentificação, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoLoteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoLoteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(campoIdentificação, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDtUltimaAteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoIdentificação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(campoDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(campoSegundaIdentificação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(campoLoteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(campoLoteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel10)
                            .addGap(8, 8, 8))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(campoDtUltimaAteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoNovo)
                    .addComponent(botaoSalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoIdentificaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdentificaçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdentificaçãoActionPerformed

    private void campoSegundaIdentificaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSegundaIdentificaçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSegundaIdentificaçãoActionPerformed

    private void campoLoteCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoteCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLoteCompraActionPerformed

    private void campoLoteVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoteVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLoteVendaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Animais Animais = new Animais(cod_fazenda);
        Animais.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void campoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdadeActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

        int identificacao; // retorna codigo de cadastro

        //novoCadastro: true = novo cadastro; false = alterar cadastro
        verifcacaoSalvar();
        if (verificacaoOK == true) {
            preencherAnimais();

            try {

            } catch (Exception error) {
                JOptionPane.showMessageDialog(this, "Erro" + error.getMessage());
            }

            try {
                ani = new IncluirEditarDAO();
                if (novoCadastro == true) {
                    identificacao = ani.IncluirAnimais(animais);
                    campoIdentificação.setText(String.valueOf(identificacao));
                    JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                    posSalvar();
                }
                if (novoCadastro == false) {
                    int codUpdate = Integer.parseInt(campoIdentificação.getText());
                    identificacao = ani.AlterarAnimais(animais, codUpdate);
                    JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                    posSalvar();
                    novoCadastro = true;
                }
            } catch (SQLException | HeadlessException error) {
                JOptionPane.showMessageDialog(this, "Operação não realizada" + error.getMessage());
            }
            botaoSalvar.setEnabled(false);
            verificacaoOK = false; // setar como falso para o proximo cadastro                    
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void campoSegundaIdentificaçãoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSegundaIdentificaçãoKeyReleased
        campoSegundaIdentificação.setText(campoSegundaIdentificação.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSegundaIdentificaçãoKeyReleased

    private void comboTipoAnimalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboTipoAnimalKeyReleased
        try {
            filtroRaca();
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(CadastroAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboTipoAnimalKeyReleased

    private void comboTipoAnimalPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboTipoAnimalPopupMenuWillBecomeInvisible
        try {
            filtroRaca();
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(CadastroAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboTipoAnimalPopupMenuWillBecomeInvisible

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        botaoNovo.setEnabled(false);
        botaoSalvar.setEnabled(true);

        campoIdentificação.setText("");
        campoSegundaIdentificação.setText("");
        campoLoteCompra.setText("0");
        campoIdade.setText("0");

        comboStatus.setSelectedIndex(0);
        comboTipoAnimal.setSelectedIndex(0);
        comboRaca.setSelectedIndex(0);
        comboPasto.setSelectedIndex(0);
        comboSexo.setSelectedIndex(0);

        campoObs.setText("");

        campoDtCadastro.setDate(dataSistema);
        campoDtUltimaAteracao.setDate(dataSistema);

        campoSegundaIdentificação.setEnabled(true);
        campoLoteCompra.setEnabled(true);
        campoIdade.setEnabled(true);

        comboStatus.setEnabled(true);
        comboPasto.setEnabled(true);
        comboTipoAnimal.setEnabled(true);
        comboRaca.setEnabled(true);
        comboSexo.setEnabled(true);
        campoObs.setEnabled(true);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSalvar;
    private com.toedter.calendar.JDateChooser campoDtCadastro;
    private com.toedter.calendar.JDateChooser campoDtUltimaAteracao;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoIdentificação;
    private javax.swing.JTextField campoLoteCompra;
    private javax.swing.JTextField campoLoteVenda;
    private javax.swing.JTextArea campoObs;
    private javax.swing.JTextField campoSegundaIdentificação;
    private javax.swing.JComboBox<String> comboPasto;
    private javax.swing.JComboBox<String> comboRaca;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JComboBox<String> comboTipoAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    // End of variables declaration//GEN-END:variables

    private void preencherAnimais() {

        int idade = Integer.parseInt(campoIdade.getText());
        int loteCompra = Integer.parseInt(campoLoteCompra.getText());
        int loteVenda = 0;

        char sexo = 'M';
        if (comboSexo.getSelectedItem() == "Feminino") {
            sexo = 'F';
        }

        animais.setIdentificacao2(campoSegundaIdentificação.getText());

        animais.setStatus((String) comboStatus.getSelectedItem());

        // acaoCod: 1 = Satatus / 2 = tipo de animal / 3 = raça / 4 =pasto
        acaoCod = 1;
        selecao = animais.getStatus();
        try {
            codSelecaoCombo();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }

        animais.setCod_status(codSelecao);

        animais.setTipoAnimal((String) comboTipoAnimal.getSelectedItem());

        acaoCod = 2;
        selecao = animais.getTipoAnimal();
        try {
            codSelecaoCombo();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }

        animais.setCod_tipoAnimal(codSelecao);

        animais.setRaca((String) comboRaca.getSelectedItem());

        acaoCod = 3;
        selecao = animais.getRaca();
        try {
            codSelecaoCombo();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }

        animais.setCod_raca(codSelecao);
        System.out.println("cod raca: " + animais.getCod_raca());

        animais.setIdade(idade);

        animais.setPasto((String) comboPasto.getSelectedItem());

        acaoCod = 4;
        selecao = animais.getPasto();
        try {
            codSelecaoCombo();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }

        animais.setCod_pasto(codSelecao);
        animais.setLoteCompra(loteCompra);
        animais.setLoteVenda(loteVenda);
        animais.setSexo(sexo);
        animais.setObs(campoObs.getText());
        animais.setDtCadastro(campoDtCadastro.getDate());
        animais.setDtUltimaAteracao(campoDtUltimaAteracao.getDate());
        animais.setCod_fazenda(cod_fazenda);
    }

    public void posSalvar() {

        botaoNovo.setEnabled(true);

        campoSegundaIdentificação.setEnabled(false);
        campoLoteCompra.setEnabled(false);
        campoIdade.setEnabled(false);

        comboStatus.setEnabled(false);
        comboPasto.setEnabled(false);
        comboTipoAnimal.setEnabled(false);
        comboRaca.setEnabled(false);
        comboSexo.setEnabled(false);

        campoObs.setEnabled(false);
    }

    public void consultaStatus() throws SQLException {

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM STATUS A ";

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {

            comboStatus.addItem(rs.getString("status"));

        }

        rs.close();
        pstmtCon.close();

    }

    public void consultaTipoAnimal() throws SQLException {

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM tipoAnimal A ";

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {

            comboTipoAnimal.addItem(rs.getString("descricao"));

        }

        rs.close();
        pstmtCon.close();

    }

    public void consultaPasto() throws SQLException {

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM pastos A where a.cod_fazenda = " + cod_fazenda;

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {

            comboPasto.addItem(rs.getString("pasto"));

        }

        rs.close();
        pstmtCon.close();

    }

    private void verifcacaoSalvar() {
        int indexStatus = comboStatus.getSelectedIndex();
        int indexTipoAnimal = comboTipoAnimal.getSelectedIndex();
        int indexRaca = comboRaca.getSelectedIndex();
        int indexPasto = comboPasto.getSelectedIndex();
        int indexSexo = comboSexo.getSelectedIndex();

        if (indexStatus > 0 && indexTipoAnimal > 0 && indexRaca > 0 && indexPasto > 0 && indexSexo > 0) {
            verificacaoOK = true; // se true, verificado com sucesso
        } else {
            JOptionPane.showMessageDialog(this, "Selecionar OPÇÕES");
        }
    }

    public void filtroRaca() throws SQLException {

        int index = comboTipoAnimal.getSelectedIndex();

        comboRaca.removeAllItems();
        comboRaca.addItem("Selecionar");
        comboRaca.setSelectedIndex(0);

        if (index > 0) {
            comboRaca.setEnabled(true);

            //comboRaca.setRequestFocusEnabled(true);
            String descricao = (String) comboTipoAnimal.getSelectedItem();

            conexao conexao = new conexao();
            conexao.getConexao();
            String selectSQL = "SELECT * FROM racaAnimais A WHERE A.tipoDescricao LIKE '" + descricao + "'";

            Statement pstmtCon;
            pstmtCon = conexao.getConexao().createStatement();

            ResultSet rs = pstmtCon.executeQuery(selectSQL);

            while (rs.next()) {

                comboRaca.addItem(rs.getString("raca"));

            }

            rs.close();
            pstmtCon.close();

        }
        if (index == 0) {
            comboRaca.setEnabled(false);
            comboRaca.setSelectedIndex(0);
        }

    }

    // usado para indentificar os codigos das palavras dos combos box
    private void codSelecaoCombo() throws SQLException {

        conexao conexao = new conexao();
        conexao.getConexao();

        String selectSQL = "";
        if (acaoCod == 1) {
            selectSQL = "SELECT * FROM status A WHERE A.status LIKE '" + selecao + "'";
        }
        if (acaoCod == 2) {
            selectSQL = "SELECT * FROM tipoAnimal A WHERE A.descricao LIKE '" + selecao + "'";
        }
        if (acaoCod == 3) {
            selectSQL = "SELECT * FROM racaAnimais A WHERE A.raca LIKE '" + selecao + "'";
        }
        if (acaoCod == 4) {
            selectSQL = "SELECT * FROM pastos A WHERE A.pasto LIKE '" + selecao + "'";
        }

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {

            if (acaoCod == 1) {
                codSelecao = Integer.parseInt(rs.getString("cod_status"));
            }
            if (acaoCod == 2) {
                codSelecao = Integer.parseInt(rs.getString("cod_tipo"));
            }
            if (acaoCod == 3) {
                codSelecao = Integer.parseInt(rs.getString("cod_raca"));
            }
            if (acaoCod == 4) {
                codSelecao = Integer.parseInt(rs.getString("cod_pasto"));
            }
        }

        rs.close();
        pstmtCon.close();

    }

    public void consultaAnimalSelecionado() throws SQLException {

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM animais A WHERE A.identificacao = " + codAnimalTelaAnterior;

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {

            campoIdentificação.setText(rs.getString("identificacao"));
            campoSegundaIdentificação.setText(rs.getString("identificacao2"));
            comboStatus.setSelectedItem(rs.getString("status"));
            comboTipoAnimal.setSelectedItem(rs.getString("tipoAnimal"));

            filtroRaca();
            comboRaca.setSelectedItem(rs.getString("raca"));

            campoIdade.setText(rs.getString("idade"));
            comboPasto.setSelectedItem(rs.getString("pasto"));
            campoLoteCompra.setText(rs.getString("loteCompra"));
            campoLoteVenda.setText(rs.getString("loteVenda"));

            if (rs.getString("sexo").equals("M")) {
                comboSexo.setSelectedIndex(1);

            } else {
                comboSexo.setSelectedIndex(2);

            }

            campoObs.setText(rs.getString("obs"));
            campoDtCadastro.setDate(rs.getDate("dtCadastro"));
            campoDtUltimaAteracao.setDate(rs.getDate("dtUltimaAteracao"));

        }

        rs.close();
        pstmtCon.close();
    }

}
