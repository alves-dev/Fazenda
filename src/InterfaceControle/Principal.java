package InterfaceControle;

import OutrasClasses.relatorios;
import InterfaceCadastro.Animais;
import InterfaceCadastro.CadastroPastos;
import InterfaceCadastro.CadastroRacaAnimal;
import InterfaceCadastro.CadastroStatus;
import InterfaceCadastro.CadastroStatusPastos;
import InterfaceCadastro.CadastroTipoAnimal;
import InterfaceCadastro.Fazenda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;
import persistencia.conexao;
import AppPackage.AnimationClass;
import InterfaceCadastro.Usuarios;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.lang.Runtime;

public class Principal extends javax.swing.JFrame {

    private Date data = new Date();
    private int cod_usu;
    private String nome_Fazenda;

    public Principal(int cod_usuario, String usuario, String nomeFazenda) {

        initComponents();

        jtUsuario.setText(usuario);
        cod_usu = cod_usuario;
        nome_Fazenda = nomeFazenda;
        jtFazenda.setText(nomeFazenda);

        setExtendedState(MAXIMIZED_BOTH);

        try {
            verificaPermissao();
            CalculaIdade(codFazenda());
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Principal() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBotoes = new javax.swing.JPanel();
        botaoControleLotes = new javax.swing.JButton();
        botaoControlePastos = new javax.swing.JButton();
        botaoCompraAnimais = new javax.swing.JButton();
        botaoControleAnimais = new javax.swing.JButton();
        botaoVendaAnimais = new javax.swing.JButton();
        painelResumo = new javax.swing.JPanel();
        jLEsconder = new javax.swing.JLabel();
        jLMais = new javax.swing.JLabel();
        jLCalculadora = new javax.swing.JLabel();
        jLInternet = new javax.swing.JLabel();
        jPanelUsuario = new javax.swing.JPanel();
        jtUsuario = new javax.swing.JTextField();
        jPanelFazenda = new javax.swing.JPanel();
        jtFazenda = new javax.swing.JTextField();
        painelMensagens = new javax.swing.JPanel();
        jTGuiasAnimais = new javax.swing.JTabbedPane();
        jTGuiasPastos = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_fazenda = new javax.swing.JMenu();
        jMenuItem_fazendaFazenda = new javax.swing.JMenuItem();
        jMenuItem_fazendaUsuarios = new javax.swing.JMenuItem();
        jMenu_cadastro = new javax.swing.JMenu();
        jMenuItem_cadastroStatus = new javax.swing.JMenuItem();
        jMenuItem_cadastroPastos = new javax.swing.JMenuItem();
        jMenuItem_cadastroTipoAnimais = new javax.swing.JMenuItem();
        jMenuItem_cadastroRacaAnimais = new javax.swing.JMenuItem();
        jMenuItem_cadastroStatusPastos = new javax.swing.JMenuItem();
        jMenu_ralatorios = new javax.swing.JMenu();
        jMenuItem_ralatorioAnimais = new javax.swing.JMenuItem();
        jMenuItem_ralatorioDetalhesAnimais = new javax.swing.JMenuItem();
        jMenuItem_ralatorioTeste = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        painelBotoes.setBackground(new java.awt.Color(255, 255, 255));
        painelBotoes.setBorder(new javax.swing.border.MatteBorder(null));

        botaoControleLotes.setBackground(new java.awt.Color(255, 255, 255));
        botaoControleLotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Principal_lotes.png"))); // NOI18N
        botaoControleLotes.setBorder(null);
        botaoControleLotes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoControleLotesMouseMoved(evt);
            }
        });
        botaoControleLotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoControleLotesMouseExited(evt);
            }
        });
        botaoControleLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoControleLotesActionPerformed(evt);
            }
        });

        botaoControlePastos.setBackground(new java.awt.Color(255, 255, 255));
        botaoControlePastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Principal_pastos.png"))); // NOI18N
        botaoControlePastos.setBorder(null);
        botaoControlePastos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoControlePastosMouseMoved(evt);
            }
        });
        botaoControlePastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoControlePastosMouseExited(evt);
            }
        });
        botaoControlePastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoControlePastosActionPerformed(evt);
            }
        });

        botaoCompraAnimais.setBackground(new java.awt.Color(255, 255, 255));
        botaoCompraAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Principal_compraAnimais.png"))); // NOI18N
        botaoCompraAnimais.setBorder(null);
        botaoCompraAnimais.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoCompraAnimaisMouseMoved(evt);
            }
        });
        botaoCompraAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCompraAnimaisMouseExited(evt);
            }
        });
        botaoCompraAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCompraAnimaisActionPerformed(evt);
            }
        });

        botaoControleAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Principal_animais.png"))); // NOI18N
        botaoControleAnimais.setBorder(null);
        botaoControleAnimais.setPreferredSize(new java.awt.Dimension(188, 130));
        botaoControleAnimais.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoControleAnimaisMouseMoved(evt);
            }
        });
        botaoControleAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoControleAnimaisMouseExited(evt);
            }
        });
        botaoControleAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoControleAnimaisActionPerformed(evt);
            }
        });

        botaoVendaAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Principal_vendasAnimais.png"))); // NOI18N
        botaoVendaAnimais.setBorder(null);
        botaoVendaAnimais.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botaoVendaAnimaisMouseMoved(evt);
            }
        });
        botaoVendaAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoVendaAnimaisMouseExited(evt);
            }
        });
        botaoVendaAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendaAnimaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addComponent(botaoControleAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoControlePastos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVendaAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addComponent(botaoCompraAnimais)
                        .addGap(18, 18, 18)
                        .addComponent(botaoControleLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoControleAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoControlePastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVendaAnimais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCompraAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoControleLotes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelResumo.setBackground(new java.awt.Color(255, 255, 255));
        painelResumo.setAlignmentX(0.0F);
        painelResumo.setAlignmentY(0.0F);
        painelResumo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLEsconder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Principal_mais_esconder.png"))); // NOI18N
        jLEsconder.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLEsconderMouseMoved(evt);
            }
        });
        jLEsconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLEsconderMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLEsconderMouseExited(evt);
            }
        });
        painelResumo.add(jLEsconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(-55, 554, -1, -1));

        jLMais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Principal_mais.png"))); // NOI18N
        jLMais.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLMaisMouseMoved(evt);
            }
        });
        jLMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMaisMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLMaisMouseExited(evt);
            }
        });
        painelResumo.add(jLMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, -1, -1));

        jLCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Principal_mais_calculadora.png"))); // NOI18N
        jLCalculadora.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLCalculadoraMouseMoved(evt);
            }
        });
        jLCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCalculadoraMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCalculadoraMouseExited(evt);
            }
        });
        painelResumo.add(jLCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-55, 493, -1, -1));

        jLInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Principal_mais_web.png"))); // NOI18N
        jLInternet.setAlignmentX(-40);
        jLInternet.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLInternetMouseMoved(evt);
            }
        });
        jLInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLInternetMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLInternetMouseExited(evt);
            }
        });
        painelResumo.add(jLInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-55, 432, -1, -1));

        jPanelUsuario.setBackground(new java.awt.Color(204, 255, 255));
        jPanelUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario:"));

        jtUsuario.setBackground(new java.awt.Color(204, 255, 255));
        jtUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtUsuario.setBorder(null);
        jtUsuario.setEnabled(false);

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        painelResumo.add(jPanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 120));

        jPanelFazenda.setBackground(new java.awt.Color(102, 255, 102));
        jPanelFazenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Fazenda:"));

        jtFazenda.setBackground(new java.awt.Color(102, 255, 102));
        jtFazenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtFazenda.setBorder(null);
        jtFazenda.setEnabled(false);

        javax.swing.GroupLayout jPanelFazendaLayout = new javax.swing.GroupLayout(jPanelFazenda);
        jPanelFazenda.setLayout(jPanelFazendaLayout);
        jPanelFazendaLayout.setHorizontalGroup(
            jPanelFazendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFazendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanelFazendaLayout.setVerticalGroup(
            jPanelFazendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFazendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        painelResumo.add(jPanelFazenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        painelMensagens.setBackground(new java.awt.Color(255, 255, 255));

        jTGuiasAnimais.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout painelMensagensLayout = new javax.swing.GroupLayout(painelMensagens);
        painelMensagens.setLayout(painelMensagensLayout);
        painelMensagensLayout.setHorizontalGroup(
            painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTGuiasAnimais, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
            .addGroup(painelMensagensLayout.createSequentialGroup()
                .addComponent(jTGuiasPastos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelMensagensLayout.setVerticalGroup(
            painelMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMensagensLayout.createSequentialGroup()
                .addComponent(jTGuiasAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTGuiasPastos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(null);
        jMenuBar1.setOpaque(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(167, 20));

        jMenu_fazenda.setText("Fazenda");
        jMenu_fazenda.setPreferredSize(new java.awt.Dimension(65, 19));
        jMenu_fazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_fazendaActionPerformed(evt);
            }
        });

        jMenuItem_fazendaFazenda.setText("Fazenda");
        jMenuItem_fazendaFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_fazendaFazendaActionPerformed(evt);
            }
        });
        jMenu_fazenda.add(jMenuItem_fazendaFazenda);

        jMenuItem_fazendaUsuarios.setText("Usuarios");
        jMenuItem_fazendaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_fazendaUsuariosActionPerformed(evt);
            }
        });
        jMenu_fazenda.add(jMenuItem_fazendaUsuarios);

        jMenuBar1.add(jMenu_fazenda);

        jMenu_cadastro.setText("Cadastro");
        jMenu_cadastro.setPreferredSize(new java.awt.Dimension(65, 19));

        jMenuItem_cadastroStatus.setText("Status");
        jMenuItem_cadastroStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cadastroStatusActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMenuItem_cadastroStatus);

        jMenuItem_cadastroPastos.setText("Pastos");
        jMenuItem_cadastroPastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cadastroPastosActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMenuItem_cadastroPastos);

        jMenuItem_cadastroTipoAnimais.setText("Tipo de Animas");
        jMenuItem_cadastroTipoAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cadastroTipoAnimaisActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMenuItem_cadastroTipoAnimais);

        jMenuItem_cadastroRacaAnimais.setText("Raça de Animais");
        jMenuItem_cadastroRacaAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cadastroRacaAnimaisActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMenuItem_cadastroRacaAnimais);

        jMenuItem_cadastroStatusPastos.setText("Status Pastos");
        jMenuItem_cadastroStatusPastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cadastroStatusPastosActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMenuItem_cadastroStatusPastos);

        jMenuBar1.add(jMenu_cadastro);

        jMenu_ralatorios.setText("Relatórios");
        jMenu_ralatorios.setPreferredSize(new java.awt.Dimension(65, 19));

        jMenuItem_ralatorioAnimais.setText("Animais");
        jMenuItem_ralatorioAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ralatorioAnimaisActionPerformed(evt);
            }
        });
        jMenu_ralatorios.add(jMenuItem_ralatorioAnimais);

        jMenuItem_ralatorioDetalhesAnimais.setText("Detalhes de Animais");
        jMenuItem_ralatorioDetalhesAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ralatorioDetalhesAnimaisActionPerformed(evt);
            }
        });
        jMenu_ralatorios.add(jMenuItem_ralatorioDetalhesAnimais);

        jMenuItem_ralatorioTeste.setText("relatori teste");
        jMenuItem_ralatorioTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ralatorioTesteActionPerformed(evt);
            }
        });
        jMenu_ralatorios.add(jMenuItem_ralatorioTeste);

        jMenuBar1.add(jMenu_ralatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelMensagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelResumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelMensagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1366, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoControlePastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoControlePastosActionPerformed
        try {
            ControlePastos ControlePastos = new ControlePastos(codFazenda());
            ControlePastos.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoControlePastosActionPerformed

    private void botaoCompraAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCompraAnimaisActionPerformed
        try {
            CompraAnimais compraAnimais = new CompraAnimais(codFazenda());
            compraAnimais.setVisible(true);
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoCompraAnimaisActionPerformed

    private void botaoControleLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoControleLotesActionPerformed
        ControleLotes controleLotes = null;
        try {
            controleLotes = new ControleLotes(codFazenda());
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        controleLotes.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_botaoControleLotesActionPerformed

    private void jMenuItem_cadastroStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cadastroStatusActionPerformed
        CadastroStatus CadastroStatus = new CadastroStatus();
        CadastroStatus.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_cadastroStatusActionPerformed

    private void jMenuItem_cadastroPastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cadastroPastosActionPerformed
        CadastroPastos CadastroPastos = null;
        try {
            CadastroPastos = new CadastroPastos(codFazenda());
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        CadastroPastos.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_cadastroPastosActionPerformed

    private void jMenuItem_cadastroTipoAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cadastroTipoAnimaisActionPerformed
        CadastroTipoAnimal CadastroTipoAnimal = new CadastroTipoAnimal();
        CadastroTipoAnimal.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_cadastroTipoAnimaisActionPerformed

    private void jMenuItem_cadastroRacaAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cadastroRacaAnimaisActionPerformed
        CadastroRacaAnimal CadastroRacaAnimal = new CadastroRacaAnimal();
        CadastroRacaAnimal.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_cadastroRacaAnimaisActionPerformed

    private void jMenuItem_cadastroStatusPastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cadastroStatusPastosActionPerformed
        CadastroStatusPastos CadastroStatusPastos = new CadastroStatusPastos();
        CadastroStatusPastos.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_cadastroStatusPastosActionPerformed

    private void jMenu_fazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_fazendaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_fazendaActionPerformed

    private void jMenuItem_fazendaFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_fazendaFazendaActionPerformed
        Fazenda fazenda = null;
        try {
            fazenda = new Fazenda(codFazenda());
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        fazenda.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_fazendaFazendaActionPerformed

    private void jMenuItem_ralatorioAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ralatorioAnimaisActionPerformed
        conexao conexao = new conexao();

        String relatorio = "Relatórios\\todosAnimais.jasper";

        JasperPrint print = null;

        try {
            print = JasperFillManager.fillReport(relatorio, null, conexao.getConexao());
        } catch (JRException e) {
            System.out.println(e);
        }

        JasperViewer viewer = new JasperViewer(print, false);

        viewer.setVisible(true);

    }//GEN-LAST:event_jMenuItem_ralatorioAnimaisActionPerformed

    private void jMenuItem_ralatorioDetalhesAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ralatorioDetalhesAnimaisActionPerformed
        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM animais A where a.cod_status <> 1 and a.cod_status <> 3";

        Statement pstmtCon = null;
        ResultSet rs = null;
        try {
            pstmtCon = conexao.getConexao().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = pstmtCon.executeQuery(selectSQL);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        String relatorio = "Relatórios\\animaisDetalhes.jasper";

        JasperPrint print = null;
        HashMap parametro = new HashMap();

        parametro.put("teste", 1);

        // print = JasperFillManager.fillReportToFile(relatorio, parametro, jrRS);
        //JasperFillManager.fillReportToFile( relatorio, parametro, jrRS );
        JRResultSetDataSource jrRS2 = new JRResultSetDataSource(rs);
        JasperPrint jasperPrint = null;
        try {
            jasperPrint = JasperFillManager.fillReport(relatorio, new HashMap(), jrRS2);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        JasperViewer.viewReport(jasperPrint, false);

        relatorios rela = new relatorios();
        rela.geraDataSource("animaisDetalhes", new HashMap(), jrRS2);

        //JasperViewer viewer = new JasperViewer(print, false);
        // viewer.setVisible(true);

    }//GEN-LAST:event_jMenuItem_ralatorioDetalhesAnimaisActionPerformed

    private void jMenuItem_ralatorioTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ralatorioTesteActionPerformed
        /*
          conexao conexao = new conexao();

        String relatorio = "Relatórios\\teste.jasper";

        JasperPrint print = null;
        HashMap parametro = new HashMap();
        Object select = "select * from animais a where a.identificacao in (1,2,3,4)";

        parametro.put("consulta", select);
        parametro.put("tete", 1234);
        

        try {
            print = JasperFillManager.fillReport(relatorio, parametro, conexao.getConexao());
        } catch (JRException e) {
            System.out.println(e);
        }

        JasperViewer viewer = new JasperViewer(print, false);

        viewer.setVisible(true);
         */

        Object select = "select * from animais a where a.identificacao in (1,2,4)";

        HashMap parametros = new HashMap();
        parametros.put("consulta", select);
        parametros.put("tete", 1234);

        relatorios rela = new relatorios();
        rela.geraConsultaParamentro("teste", parametros);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_ralatorioTesteActionPerformed

    private void jLMaisMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMaisMouseMoved
        jLMais.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        AnimationClass ac = new AnimationClass();
        ac.jLabelXRight(-55, 0, 10, 5, jLEsconder);
        ac.jLabelXRight(-55, 0, 10, 5, jLCalculadora);
        ac.jLabelXRight(-55, 0, 10, 5, jLInternet);
    }//GEN-LAST:event_jLMaisMouseMoved

    private void jLMaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMaisMouseExited
        jLMais.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));

    }//GEN-LAST:event_jLMaisMouseExited

    private void jLEsconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEsconderMouseClicked
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -55, 10, 5, jLEsconder);
        ac.jLabelXLeft(0, -55, 10, 5, jLCalculadora);
        ac.jLabelXLeft(0, -55, 10, 5, jLInternet);


    }//GEN-LAST:event_jLEsconderMouseClicked

    private void jLCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCalculadoraMouseClicked
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -55, 10, 5, jLEsconder);
        ac.jLabelXLeft(0, -55, 10, 5, jLCalculadora);
        ac.jLabelXLeft(0, -55, 10, 5, jLInternet);

        try {
            Runtime ru;
            ru = Runtime.getRuntime();
            Process pr = ru.exec("Calc");
            pr.waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_jLCalculadoraMouseClicked

    private void jLInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLInternetMouseClicked
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -55, 10, 5, jLEsconder);
        ac.jLabelXLeft(0, -55, 10, 5, jLCalculadora);
        ac.jLabelXLeft(0, -55, 10, 5, jLInternet);

        try {
            Desktop.getDesktop().browse(URI.create("https://www.youtube.com/watch?v=OnYRLPSoUtM"));
        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_jLInternetMouseClicked

    private void jLEsconderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEsconderMouseMoved
        jLEsconder.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLEsconderMouseMoved

    private void jLCalculadoraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCalculadoraMouseMoved
        jLCalculadora.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLCalculadoraMouseMoved

    private void jLInternetMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLInternetMouseMoved
        jLInternet.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jLInternetMouseMoved

    private void jLInternetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLInternetMouseExited
        jLInternet.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_jLInternetMouseExited

    private void jLCalculadoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCalculadoraMouseExited
        jLCalculadora.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_jLCalculadoraMouseExited

    private void jLEsconderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEsconderMouseExited
        jLEsconder.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_jLEsconderMouseExited

    private void jLMaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMaisMouseClicked
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -55, 10, 5, jLEsconder);
        ac.jLabelXLeft(0, -55, 10, 5, jLCalculadora);
        ac.jLabelXLeft(0, -55, 10, 5, jLInternet);

        jLMais.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        AnimationClass ac2 = new AnimationClass();
        ac2.jLabelXRight(-55, 0, 10, 5, jLEsconder);
        ac2.jLabelXRight(-55, 0, 10, 5, jLCalculadora);
        ac2.jLabelXRight(-55, 0, 10, 5, jLInternet);
    }//GEN-LAST:event_jLMaisMouseClicked

    private void botaoControleAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoControleAnimaisActionPerformed
        try {
            Animais Animais = new Animais(codFazenda());
            Animais.setVisible(true);        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoControleAnimaisActionPerformed

    private void botaoCompraAnimaisMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCompraAnimaisMouseMoved
        botaoCompraAnimais.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        botaoCompraAnimais.setToolTipText("Compra de Animais");
    }//GEN-LAST:event_botaoCompraAnimaisMouseMoved

    private void botaoControleAnimaisMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoControleAnimaisMouseMoved
        botaoControleAnimais.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        botaoControleAnimais.setToolTipText("Comtrole de Animais");
    }//GEN-LAST:event_botaoControleAnimaisMouseMoved

    private void botaoControlePastosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoControlePastosMouseMoved
        botaoControlePastos.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        botaoControlePastos.setToolTipText("Comtrole de Pastos");
    }//GEN-LAST:event_botaoControlePastosMouseMoved

    private void botaoControleLotesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoControleLotesMouseMoved
        botaoControleLotes.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        botaoControleLotes.setToolTipText("Comtrole de Lotes");
    }//GEN-LAST:event_botaoControleLotesMouseMoved

    private void botaoControleAnimaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoControleAnimaisMouseExited
        botaoControleAnimais.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));

    }//GEN-LAST:event_botaoControleAnimaisMouseExited

    private void botaoControlePastosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoControlePastosMouseExited
        botaoControlePastos.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));

    }//GEN-LAST:event_botaoControlePastosMouseExited

    private void botaoCompraAnimaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCompraAnimaisMouseExited
        botaoCompraAnimais.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));

    }//GEN-LAST:event_botaoCompraAnimaisMouseExited

    private void botaoControleLotesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoControleLotesMouseExited
        botaoControleLotes.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));

    }//GEN-LAST:event_botaoControleLotesMouseExited

    private void botaoVendaAnimaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVendaAnimaisMouseExited
        botaoVendaAnimais.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_botaoVendaAnimaisMouseExited

    private void botaoVendaAnimaisMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVendaAnimaisMouseMoved
        botaoVendaAnimais.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        botaoVendaAnimais.setToolTipText("Vendas de Animais");
    }//GEN-LAST:event_botaoVendaAnimaisMouseMoved

    private void botaoVendaAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendaAnimaisActionPerformed
        try {
            VendasAnimais vendaAnimais = new VendasAnimais(codFazenda());
            vendaAnimais.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoVendaAnimaisActionPerformed

    private void jMenuItem_fazendaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_fazendaUsuariosActionPerformed
        Usuarios usu = new Usuarios();
        usu.setVisible(true);
    }//GEN-LAST:event_jMenuItem_fazendaUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCompraAnimais;
    private javax.swing.JButton botaoControleAnimais;
    private javax.swing.JButton botaoControleLotes;
    private javax.swing.JButton botaoControlePastos;
    private javax.swing.JButton botaoVendaAnimais;
    private javax.swing.JLabel jLCalculadora;
    private javax.swing.JLabel jLEsconder;
    private javax.swing.JLabel jLInternet;
    private javax.swing.JLabel jLMais;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_cadastroPastos;
    private javax.swing.JMenuItem jMenuItem_cadastroRacaAnimais;
    private javax.swing.JMenuItem jMenuItem_cadastroStatus;
    private javax.swing.JMenuItem jMenuItem_cadastroStatusPastos;
    private javax.swing.JMenuItem jMenuItem_cadastroTipoAnimais;
    private javax.swing.JMenuItem jMenuItem_fazendaFazenda;
    private javax.swing.JMenuItem jMenuItem_fazendaUsuarios;
    private javax.swing.JMenuItem jMenuItem_ralatorioAnimais;
    private javax.swing.JMenuItem jMenuItem_ralatorioDetalhesAnimais;
    private javax.swing.JMenuItem jMenuItem_ralatorioTeste;
    private javax.swing.JMenu jMenu_cadastro;
    private javax.swing.JMenu jMenu_fazenda;
    private javax.swing.JMenu jMenu_ralatorios;
    private javax.swing.JPanel jPanelFazenda;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JTabbedPane jTGuiasAnimais;
    private javax.swing.JTabbedPane jTGuiasPastos;
    private javax.swing.JTextField jtFazenda;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelMensagens;
    private javax.swing.JPanel painelResumo;
    // End of variables declaration//GEN-END:variables

    public int CalculaIdade(int codFazenda) throws SQLException {

        int idade = 0;
        int anoCadastro = 0, mesCadastro = 0, diaCadastro = 0;
        //int anoAtual = 0, mesAtual = 0, diaAtual = 0;

        // outro tipo de dados pada datas
        //System.out.println("ano: " + dataAtual.get(Calendar.YEAR));
        //System.out.println("mes : " + ( dataAtual.get(Calendar.MONTH) + 1));
        //System.out.println("dia do mes: " + dataAtual.get(Calendar.DAY_OF_MONTH));
        //System.out.println("dia da semana: " + dataAtual.get(Calendar.DAY_OF_WEEK));
        //System.out.println("dia do ano: " + dataAtual.get(Calendar.DAY_OF_YEAR));
        //anoAtual = dataAtual.get(Calendar.YEAR);
        //mesAtual = dataAtual.get(Calendar.MONTH) + 1; // mais 1 pelo falo de janeiro ser = 0
        //diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
        Date dataCadastroBanco = null;

        //define datas
        Calendar dataCadastro = Calendar.getInstance();

        Calendar hoje = Calendar.getInstance();

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM animais A where a.cod_status <> 1 and a.cod_status <> 3 and a.cod_fazenda = " + codFazenda;

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        String avisos = " ";
        int alterado = 0;

        while (rs.next()) {

            dataCadastroBanco = rs.getDate("dtCadastro");

            SimpleDateFormat yyyy = new SimpleDateFormat("yyyy");
            anoCadastro = Integer.parseInt(yyyy.format(dataCadastroBanco));

            SimpleDateFormat MM = new SimpleDateFormat("MM");
            mesCadastro = Integer.parseInt(MM.format(dataCadastroBanco));

            SimpleDateFormat dd = new SimpleDateFormat("dd");
            diaCadastro = Integer.parseInt(dd.format(dataCadastroBanco));

            dataCadastro.set(anoCadastro, mesCadastro, diaCadastro);

            //calcula diferença
            idade = (hoje.get(Calendar.YEAR) * 12 + hoje.get(Calendar.MONTH))
                    - (dataCadastro.get(Calendar.YEAR) * 12 + dataCadastro.get(Calendar.MONTH));

            if (idade == -1) {
                idade += 1;
            }

            if (rs.getInt("loteCompra") > 0) {

                idade = idade + rs.getInt("idade");
            }
            if (idade != rs.getInt("idade")) {

                String updateSQL = "UPDATE animais SET idade = " + String.valueOf(idade)
                        + " where identificacao = " + rs.getInt("identificacao");

                System.out.println("arrumar data de ultima alteração");

                try (PreparedStatement pstmt = conexao.getConexao().prepareStatement(updateSQL)) {
                    pstmt.executeUpdate();
                }

                alterado++;
                avisos = avisos + " \n Animal de codigo - " + rs.getInt("identificacao") + " alterado!";
            }

        }
        //areaAvisos.setText(avisos + "\n Total de registros alterados: " + String.valueOf(alterado));

        JPainelAnimais pa = new JPainelAnimais();
        jTGuiasAnimais.addTab("Animais", pa);
        pa.jlMensagem.setText("Total de animais alterados : " + alterado);

        rs.close();
        pstmtCon.close();

        return idade;

    }

    private void verificaPatos() {
        //implementar metodo
    }

    private void verificaPermissao() throws SQLException {
        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM permissoes A where a.cod_usuario = " + cod_usu;

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {

            if (rs.getBoolean("fazenda") == false) {
                jMenuItem_fazendaFazenda.setEnabled(false);
            }
            if (rs.getBoolean("controle_lotes") == false) {
                botaoControleLotes.setEnabled(false);
            }
            if (rs.getBoolean("controle_animais") == false) {
                botaoControleAnimais.setEnabled(false);
            }
            if (rs.getBoolean("vendas") == false) {
                botaoVendaAnimais.setEnabled(false);
            }
            if (rs.getBoolean("compras") == false) {
                botaoCompraAnimais.setEnabled(false);
            }
            if (rs.getBoolean("controle_pastos") == false) {
                botaoControlePastos.setEnabled(false);
            }
            if (rs.getBoolean("relatorios") == false) {
                jMenu_ralatorios.setEnabled(false);
            }
        }

        rs.close();
        pstmtCon.close();
    }

    private int codFazenda() throws SQLException {
        int cod = 0;

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM fazenda A where a.nome_fazenda like '" + nome_Fazenda + "'";

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {

            cod = rs.getInt("cod_fazenda");
        }

        return cod;
    }

}
