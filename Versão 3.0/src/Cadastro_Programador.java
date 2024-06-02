
import Conexao.DesenvolvedorDAO;
import Conexao.DesenvolvedorDTO;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cadastro_Programador extends javax.swing.JFrame {

    public Cadastro_Programador() {
        initComponents();
        this.setLocationRelativeTo(null);
        configurarTabela();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Mostrando o formulário anterior quando este JFrame for fechado
                Login_Programador login = new Login_Programador();
                login.setVisible(true); // Substitua "FormularioAntigo" pelo nome do seu JFrame anterior
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_LinguagemProgramacaoENivelProeficiencia = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton_CadastraLinguagemProgramacaoENivelProeficiencia = new javax.swing.JButton();
        jButton_ExcluirLinguagemProgramacaoENivelProeficiencia = new javax.swing.JButton();
        jComboBox_ListaNivelProeficiencia = new javax.swing.JComboBox<>();
        jComboBox_ListaLinguagemProgramacao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_ListaEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_ListaCidade = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField_CadastroEmailDesenvolvedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_CadastroNomeDesenvolvedor = new javax.swing.JTextField();
        jPasswordField_CadastroSenhaDesenvolvedor = new javax.swing.JPasswordField();
        jPasswordField_ComparaEValidaSenhaDesenvolvedor = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_SalvaDadosEEnviaAoBancoOConteudoDojTable = new javax.swing.JButton();
        jButton_LimpaDadosSalvos = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(102, 102, 102));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(52, 52, 52));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE DESENVOLVEDOR");

        jTable_LinguagemProgramacaoENivelProeficiencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "LINGUAGEM DE PROGRAMAÇÃO", "PROEFICIÊNCIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_LinguagemProgramacaoENivelProeficiencia);

        jPanel1.setForeground(new java.awt.Color(51, 51, 55));

        jButton_CadastraLinguagemProgramacaoENivelProeficiencia.setText("CADASTRAR COMPETÊNCIA");
        jButton_CadastraLinguagemProgramacaoENivelProeficiencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_CadastraLinguagemProgramacaoENivelProeficiencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CadastraLinguagemProgramacaoENivelProeficienciaMouseClicked(evt);
            }
        });
        jButton_CadastraLinguagemProgramacaoENivelProeficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastraLinguagemProgramacaoENivelProeficienciaActionPerformed(evt);
            }
        });

        jButton_ExcluirLinguagemProgramacaoENivelProeficiencia.setText("EXCLUIR COMPETENCIA");
        jButton_ExcluirLinguagemProgramacaoENivelProeficiencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ExcluirLinguagemProgramacaoENivelProeficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirLinguagemProgramacaoENivelProeficienciaActionPerformed(evt);
            }
        });

        jComboBox_ListaLinguagemProgramacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ListaLinguagemProgramacaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Linguagem de programação");

        jLabel3.setText("Nivel de conhecimento");

        jComboBox_ListaEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_ListaEstadoItemStateChanged(evt);
            }
        });

        jLabel6.setText("Estado");

        jLabel7.setText("Cidade");

        jLabel5.setText("E-Mail");

        jLabel4.setText("Nome");

        jLabel8.setText("Senha");

        jLabel9.setText("Repita sua senha ");

        jButton_SalvaDadosEEnviaAoBancoOConteudoDojTable.setText("SALVAR DADOS");
        jButton_SalvaDadosEEnviaAoBancoOConteudoDojTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_SalvaDadosEEnviaAoBancoOConteudoDojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_SalvaDadosEEnviaAoBancoOConteudoDojTableMouseClicked(evt);
            }
        });

        jButton_LimpaDadosSalvos.setText("LIMPAR DADOS");
        jButton_LimpaDadosSalvos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_LimpaDadosSalvos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimpaDadosSalvosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_CadastroEmailDesenvolvedor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox_ListaEstado, 0, 144, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_CadastroSenhaDesenvolvedor))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addGap(3, 3, 3)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_ListaCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_ComparaEValidaSenhaDesenvolvedor)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_CadastroNomeDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jButton_SalvaDadosEEnviaAoBancoOConteudoDojTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_ListaLinguagemProgramacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_ExcluirLinguagemProgramacaoENivelProeficiencia, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox_ListaNivelProeficiencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_LimpaDadosSalvos, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jButton_CadastraLinguagemProgramacaoENivelProeficiencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_CadastroNomeDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CadastroEmailDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_CadastroSenhaDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField_ComparaEValidaSenhaDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_ListaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox_ListaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_LimpaDadosSalvos)
                    .addComponent(jButton_SalvaDadosEEnviaAoBancoOConteudoDojTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_ListaLinguagemProgramacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_ListaNivelProeficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CadastraLinguagemProgramacaoENivelProeficiencia)
                    .addComponent(jButton_ExcluirLinguagemProgramacaoENivelProeficiencia))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CadastraLinguagemProgramacaoENivelProeficienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastraLinguagemProgramacaoENivelProeficienciaActionPerformed

    }//GEN-LAST:event_jButton_CadastraLinguagemProgramacaoENivelProeficienciaActionPerformed

    private void jButton_LimpaDadosSalvosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpaDadosSalvosActionPerformed
        // TODO add your handling code here:
        jTextField_CadastroNomeDesenvolvedor.setText("");
        jTextField_CadastroEmailDesenvolvedor.setText("");
        jPasswordField_CadastroSenhaDesenvolvedor.setText("");
        jPasswordField_ComparaEValidaSenhaDesenvolvedor.setText("");


    }//GEN-LAST:event_jButton_LimpaDadosSalvosActionPerformed


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        CarregarComboBoxLinguagensProgramacao();
        CarregarComboBoxProeficiencia();
        CarregarComboBoxEstado();
        jComboBox_ListaLinguagemProgramacao.setEnabled(false);
        jComboBox_ListaNivelProeficiencia.setEnabled(false);
        jButton_ExcluirLinguagemProgramacaoENivelProeficiencia.setEnabled(false);
        jButton_CadastraLinguagemProgramacaoENivelProeficiencia.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox_ListaEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_ListaEstadoItemStateChanged
        int selectedIndex = jComboBox_ListaEstado.getSelectedIndex();
        if (selectedIndex >= 0) {
            int estadoID = id_Estado.get(selectedIndex);
            CarregarComboBoxCidade(estadoID);
        }
    }//GEN-LAST:event_jComboBox_ListaEstadoItemStateChanged

    private void jComboBox_ListaLinguagemProgramacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ListaLinguagemProgramacaoActionPerformed

    }//GEN-LAST:event_jComboBox_ListaLinguagemProgramacaoActionPerformed

    private DesenvolvedorDTO devDTO;

    private void jButton_SalvaDadosEEnviaAoBancoOConteudoDojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SalvaDadosEEnviaAoBancoOConteudoDojTableMouseClicked
        int resposta = JOptionPane.showConfirmDialog(null, "Os dados estão corretos?", "confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == JOptionPane.YES_OPTION) {
            String nome = jTextField_CadastroNomeDesenvolvedor.getText();
            String email = jTextField_CadastroEmailDesenvolvedor.getText();
            String senha = new String(jPasswordField_CadastroSenhaDesenvolvedor.getPassword());
            String confirmaSenha = new String(jPasswordField_ComparaEValidaSenhaDesenvolvedor.getPassword());
            int cidadeIndex = jComboBox_ListaCidade.getSelectedIndex();

            if (nome.isEmpty() || email.isEmpty() || senha.isEmpty() || confirmaSenha.isEmpty() || cidadeIndex < 0) {
                JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.", "Alerta", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!senha.equals(confirmaSenha)) {
                JOptionPane.showMessageDialog(null, "As senhas não coincidem. Por favor, verifique.", "Alerta", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int cidadeID = id_Cidade.get(cidadeIndex);

            // Inicialize devDTO aqui e armazene no campo da classe
            devDTO = new DesenvolvedorDTO();
            devDTO.setNome(nome);
            devDTO.setEmail(email);
            devDTO.setSenha(senha);
            devDTO.setCidadeID(cidadeID);
            DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
            devDAO.cadastrarDesenvolvedor(devDTO);

            jComboBox_ListaLinguagemProgramacao.setEnabled(true);
            jComboBox_ListaNivelProeficiencia.setEnabled(true);
            jButton_ExcluirLinguagemProgramacaoENivelProeficiencia.setEnabled(true);
            jButton_CadastraLinguagemProgramacaoENivelProeficiencia.setEnabled(true);
        }
    }//GEN-LAST:event_jButton_SalvaDadosEEnviaAoBancoOConteudoDojTableMouseClicked

    private void configurarTabela() {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[]{"Linguagem", "Proficiência"}, 0
        );
        jTable_LinguagemProgramacaoENivelProeficiencia.setModel(modelo);
    }

    private void preencherTabelaLinguagensEProeficiencias(int colaboradorID) {
        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        List<DesenvolvedorDTO> lista = devDAO.listarLinguagensEProeficiencias(colaboradorID);

        DefaultTableModel modelo = (DefaultTableModel) jTable_LinguagemProgramacaoENivelProeficiencia.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

        for (DesenvolvedorDTO devDTO : lista) {
            modelo.addRow(new Object[]{
                devDTO.getNome_da_Linguagem(),
                devDTO.getNivelProeficiencia()
            });
        }
    }

    private void jButton_CadastraLinguagemProgramacaoENivelProeficienciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CadastraLinguagemProgramacaoENivelProeficienciaMouseClicked
        int AddLinguagem = jComboBox_ListaLinguagemProgramacao.getSelectedIndex() + 1;
        int AddProeficiencia = jComboBox_ListaNivelProeficiencia.getSelectedIndex() + 1;

        if (devDTO == null) {
            JOptionPane.showMessageDialog(null, "Por favor, cadastre o desenvolvedor primeiro.", "Alerta", JOptionPane.ERROR_MESSAGE);
            return;
        }

        devDTO.setLinguagemEscolhidaID(AddLinguagem);
        devDTO.setProeficienciaID(AddProeficiencia);

        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        devDAO.cadastrarLinguagemProeficiencia(devDTO);

        // Preencher a tabela após cadastrar
        preencherTabelaLinguagensEProeficiencias(devDTO.getDesenvolvedorID());
    }//GEN-LAST:event_jButton_CadastraLinguagemProgramacaoENivelProeficienciaMouseClicked

    
    
    
    private void jButton_ExcluirLinguagemProgramacaoENivelProeficienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirLinguagemProgramacaoENivelProeficienciaActionPerformed
        int linha = jTable_LinguagemProgramacaoENivelProeficiencia.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linguagem para remover.", "Alerta", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int colaborador = devDTO.getDesenvolvedorID();
        String NomelinguagemProgramacao = (String) jTable_LinguagemProgramacaoENivelProeficiencia.getValueAt(linha, 0);
        
        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        devDAO.DescadastrarLinguagemProeficiencia(NomelinguagemProgramacao, colaborador);
        
        
        
        // Preencher a tabela após cadastrar
        preencherTabelaLinguagensEProeficiencias(devDTO.getDesenvolvedorID());
    }//GEN-LAST:event_jButton_ExcluirLinguagemProgramacaoENivelProeficienciaActionPerformed

    Vector<Integer> id_Linguagem = new Vector<Integer>();

    public void CarregarComboBoxLinguagensProgramacao() {
        ResultSet rs;
        try {
            DesenvolvedorDAO DevDAO = new DesenvolvedorDAO();
            rs = DevDAO.carregarLinguagensProgramacao();
            while (rs.next()) {
                id_Linguagem.addElement(rs.getInt(1));
                jComboBox_ListaLinguagemProgramacao.addItem(rs.getString(2));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar ComboBox de Cidades:" + erro, "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }

    Vector<Integer> id_Proeficiencia = new Vector<Integer>();

    public void CarregarComboBoxProeficiencia() {
        ResultSet rs;
        try {
            DesenvolvedorDAO DevDAO = new DesenvolvedorDAO();
            rs = DevDAO.carregarNivelProeficiencia();
            while (rs.next()) {
                id_Proeficiencia.addElement(rs.getInt(1));
                jComboBox_ListaNivelProeficiencia.addItem(rs.getString(2));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar ComboBox de Cidades:" + erro, "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }

    Vector<Integer> id_Estado = new Vector<Integer>();

    public void CarregarComboBoxEstado() {
        ResultSet rs;
        try {
            DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
            rs = devDAO.carregarComboBoxEstado();
            while (rs.next()) {
                id_Estado.addElement(rs.getInt(1));
                jComboBox_ListaEstado.addItem(rs.getString(2));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar ComboBox de Estado: " + erro, "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }

    Vector<Integer> id_Cidade = new Vector<Integer>();

    public void CarregarComboBoxCidade(int estadoID) {
        jComboBox_ListaCidade.removeAllItems();
        id_Cidade.clear();
        ResultSet rs;
        try {
            DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
            rs = devDAO.carregarComboBoxCidade(estadoID);
            while (rs.next()) {
                id_Cidade.addElement(rs.getInt(1));
                jComboBox_ListaCidade.addItem(rs.getString(2));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar ComboBox de Cidade: " + erro, "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(Cadastro_Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Programador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CadastraLinguagemProgramacaoENivelProeficiencia;
    private javax.swing.JButton jButton_ExcluirLinguagemProgramacaoENivelProeficiencia;
    private javax.swing.JButton jButton_LimpaDadosSalvos;
    private javax.swing.JButton jButton_SalvaDadosEEnviaAoBancoOConteudoDojTable;
    private javax.swing.JComboBox<String> jComboBox_ListaCidade;
    private javax.swing.JComboBox<String> jComboBox_ListaEstado;
    private javax.swing.JComboBox<String> jComboBox_ListaLinguagemProgramacao;
    private javax.swing.JComboBox<String> jComboBox_ListaNivelProeficiencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_CadastroSenhaDesenvolvedor;
    private javax.swing.JPasswordField jPasswordField_ComparaEValidaSenhaDesenvolvedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_LinguagemProgramacaoENivelProeficiencia;
    private javax.swing.JTextField jTextField_CadastroEmailDesenvolvedor;
    private javax.swing.JTextField jTextField_CadastroNomeDesenvolvedor;
    // End of variables declaration//GEN-END:variables

}
