
import Conexao.DesenvolvedorDAO;
import Conexao.DesenvolvedorDTO;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Edicao_programador extends javax.swing.JFrame {

    public Edicao_programador() {
        initComponents();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Mostrando o formulário anterior quando este JFrame for fechado
                LIstagem_Projetos Lista = new LIstagem_Projetos();
                Lista.setNome(Nome);
                Lista.setDesenvolvedorID(DesenvolvedorID);
                Lista.setVisible(true);
            }
        });
        configurarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox_ListaEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_ListaCidade = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField_EditaEmailDesenvolvedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_EditaNomeDesenvolvedor = new javax.swing.JTextField();
        jPasswordField_CadastroSenhaDesenvolvedor = new javax.swing.JPasswordField();
        jPasswordField_ComparaEValidaSenhaDesenvolvedor = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_CancelaModificacaoDadosSalvos = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton_SalvaModificacoes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton_AlterarLinguagemProeficiencia = new javax.swing.JButton();
        jButton_ExcluirConta = new javax.swing.JButton();
        jTextField_EstadoDesenvolvedor = new javax.swing.JTextField();
        jTextField_CidadeDesenvolvedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_LinguagemProgramacaoENivelProeficiencia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(51, 51, 55));

        jComboBox_ListaEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_ListaEstadoItemStateChanged(evt);
            }
        });

        jLabel6.setText("Estado");

        jLabel7.setText("Cidade");

        jLabel5.setText("E-Mail");

        jLabel4.setText("Nome");

        jLabel8.setText(" Senha");

        jLabel9.setText("Repita sua senha");

        jButton_CancelaModificacaoDadosSalvos.setText("CANCELAR MODIFICAÇÕES");
        jButton_CancelaModificacaoDadosSalvos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_CancelaModificacaoDadosSalvos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelaModificacaoDadosSalvosActionPerformed(evt);
            }
        });

        jLabel10.setText("Estado");

        jLabel11.setText("Cidade");

        jButton_SalvaModificacoes.setText("SALVA DADOS");
        jButton_SalvaModificacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvaModificacoesActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ZONA DE PERIGO");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton_AlterarLinguagemProeficiencia.setText("MODIFICAR PROEFICIENCIAS");
        jButton_AlterarLinguagemProeficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AlterarLinguagemProeficienciaActionPerformed(evt);
            }
        });

        jButton_ExcluirConta.setText("EXCLUIR CONTA");
        jButton_ExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_AlterarLinguagemProeficiencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_ExcluirConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_AlterarLinguagemProeficiencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_ExcluirConta))
        );

        jTextField_EstadoDesenvolvedor.setEditable(false);

        jTextField_CidadeDesenvolvedor.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_EditaNomeDesenvolvedor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_EditaEmailDesenvolvedor)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox_ListaEstado, 0, 178, Short.MAX_VALUE)
                                            .addComponent(jPasswordField_CadastroSenhaDesenvolvedor))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox_ListaCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPasswordField_ComparaEValidaSenhaDesenvolvedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                            .addComponent(jTextField_CidadeDesenvolvedor)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_CancelaModificacaoDadosSalvos, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(jButton_SalvaModificacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_EstadoDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(346, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_EditaNomeDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_EditaEmailDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_ComparaEValidaSenhaDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_CadastroSenhaDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jTextField_EstadoDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_CidadeDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox_ListaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox_ListaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jButton_SalvaModificacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_CancelaModificacaoDadosSalvos)))
                .addContainerGap())
        );

        jTable_LinguagemProgramacaoENivelProeficiencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
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
        jTable_LinguagemProgramacaoENivelProeficiencia.setEnabled(false);
        jScrollPane1.setViewportView(jTable_LinguagemProgramacaoENivelProeficiencia);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIÇÃO DE DESENVOLVEDOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
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

    private int Estado, DesenvolvedorID;
    private String Nome;

    void setDesenvolvedorID(int DesenvolvedorID) {
        this.DesenvolvedorID = DesenvolvedorID;

    }

    public int getDesenvolvedorID() {
        return DesenvolvedorID;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    Vector<Integer> id_Estado = new Vector<Integer>();

    public void CarregarComboBoxEstado() {
        jComboBox_ListaEstado.removeAllItems(); // Limpar o ComboBox antes de adicionar novos itens
        id_Estado.clear(); // Limpar o vetor antes de adicionar novos itens

        ResultSet rs;
        try {
            DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
            rs = devDAO.carregarComboBoxEstado();
            while (rs.next()) {
                id_Estado.addElement(rs.getInt(1)); // Adicionar ID ao vetor
                jComboBox_ListaEstado.addItem(rs.getString(2)); // Adicionar nome ao ComboBox
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar ComboBox de Estado: " + erro, "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }

    Vector<Integer> id_Cidade = new Vector<Integer>();

    public void CarregarComboBoxCidade(int estadoID) {
        jComboBox_ListaCidade.removeAllItems(); // Limpar o ComboBox antes de adicionar novos itens
        id_Cidade.clear(); // Limpar o vetor antes de adicionar novos itens

        ResultSet rs;
        try {
            DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
            rs = devDAO.carregarComboBoxCidade(estadoID);
            while (rs.next()) {
                id_Cidade.addElement(rs.getInt(1)); // Adicionar ID ao vetor
                jComboBox_ListaCidade.addItem(rs.getString(2)); // Adicionar nome ao ComboBox
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar ComboBox de Cidade: " + erro, "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void jButton_CancelaModificacaoDadosSalvosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelaModificacaoDadosSalvosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CancelaModificacaoDadosSalvosActionPerformed

    private void configurarTabela() {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[]{"Linguagem", "Proficiência"}, 0
        );
        jTable_LinguagemProgramacaoENivelProeficiencia.setModel(modelo);
    }

    private void preencherTabelaLinguagensEProeficiencias() {
        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        List<DesenvolvedorDTO> lista = devDAO.listarLinguagensEProeficiencias(getDesenvolvedorID());

        DefaultTableModel modelo = (DefaultTableModel) jTable_LinguagemProgramacaoENivelProeficiencia.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

        for (DesenvolvedorDTO devDTO : lista) {
            modelo.addRow(new Object[]{
                devDTO.getNome_da_Linguagem(),
                devDTO.getNivelProeficiencia()
            });
        }
    }


    private void jComboBox_ListaEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_ListaEstadoItemStateChanged
        int selectedIndex = jComboBox_ListaEstado.getSelectedIndex();
        if (selectedIndex >= 0) {
            int estadoID = id_Estado.get(selectedIndex);
            CarregarComboBoxCidade(estadoID);
        }
    }//GEN-LAST:event_jComboBox_ListaEstadoItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CarregarComboBoxEstado();
        CarregaInformaçoes();
        preencherTabelaLinguagensEProeficiencias();
    }//GEN-LAST:event_formWindowOpened

    public void CarregaInformaçoes() {
        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        DesenvolvedorDTO devDTO = devDAO.ListaInformacoesDesenvolvedor(getDesenvolvedorID());

        if (devDTO != null) {
            jTextField_EditaNomeDesenvolvedor.setText(devDTO.getNome());
            jTextField_EditaEmailDesenvolvedor.setText(devDTO.getEmail());
            jPasswordField_CadastroSenhaDesenvolvedor.setText(devDTO.getSenha());
            jPasswordField_ComparaEValidaSenhaDesenvolvedor.setText(devDTO.getSenha());

            jTextField_EstadoDesenvolvedor.setText(devDTO.getEstado());
            jTextField_CidadeDesenvolvedor.setText(devDTO.getCidade());
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao carregar informações do desenvolvedor.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void jButton_ExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirContaActionPerformed
        JOptionPane.showMessageDialog(null, "Você está prestes a excluir sua conta! \nseus dados serão apagados porém o projeto permanecerá",
                "Aviso", JOptionPane.WARNING_MESSAGE);

        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja excluir seus projetos? \nApós a exclusão da sua conta você não conseguirá excluir seu repositório",
                "confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Sua conta foi excluida com sucesso", "Aviso", JOptionPane.WARNING_MESSAGE);
            DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
            devDAO.ExcluirDesenvolvedor(getDesenvolvedorID(), jTextField_EditaNomeDesenvolvedor.getText());
        }
    }//GEN-LAST:event_jButton_ExcluirContaActionPerformed

    private void jButton_SalvaModificacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvaModificacoesActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Os dados estão corretos?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == JOptionPane.YES_OPTION) {
            String nome = jTextField_EditaNomeDesenvolvedor.getText();
            String email = jTextField_EditaEmailDesenvolvedor.getText();
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

            // Verificação do índice da cidade
            System.out.println("Cidade Index: " + cidadeIndex);

            // Verificação do ID da cidade
            if (cidadeIndex >= 0 && cidadeIndex < id_Cidade.size()) {
                int cidadeID = id_Cidade.get(cidadeIndex);
                System.out.println("Cidade ID: " + cidadeID);

                DesenvolvedorDTO devDTO = new DesenvolvedorDTO();
                devDTO.setNome(nome);
                devDTO.setEmail(email);
                devDTO.setSenha(senha);
                devDTO.setCidadeID(cidadeID);
                devDTO.setDesenvolvedorID(getDesenvolvedorID()); // Certifique-se de definir o ID do colaborador

                DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
                boolean sucesso = devDAO.atualizarDesenvolvedor(devDTO);

                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Dados do desenvolvedor atualizados com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados do desenvolvedor.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao obter ID da cidade. Verifique se a cidade foi selecionada corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_SalvaModificacoesActionPerformed

    private void jButton_AlterarLinguagemProeficienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AlterarLinguagemProeficienciaActionPerformed
        LinguagemEProeficiencia LingProf = new LinguagemEProeficiencia();
        LingProf.setDesenvolvedorID(getDesenvolvedorID());
        JOptionPane.showMessageDialog(null,getDesenvolvedorID());
        LingProf.setNome(getNome());
        this.setVisible(false);
        LingProf.setVisible(true);

    }//GEN-LAST:event_jButton_AlterarLinguagemProeficienciaActionPerformed

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
            java.util.logging.Logger.getLogger(Edicao_programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edicao_programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edicao_programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edicao_programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edicao_programador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AlterarLinguagemProeficiencia;
    private javax.swing.JButton jButton_CancelaModificacaoDadosSalvos;
    private javax.swing.JButton jButton_ExcluirConta;
    private javax.swing.JButton jButton_SalvaModificacoes;
    private javax.swing.JComboBox<String> jComboBox_ListaCidade;
    private javax.swing.JComboBox<String> jComboBox_ListaEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_CadastroSenhaDesenvolvedor;
    private javax.swing.JPasswordField jPasswordField_ComparaEValidaSenhaDesenvolvedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_LinguagemProgramacaoENivelProeficiencia;
    private javax.swing.JTextField jTextField_CidadeDesenvolvedor;
    private javax.swing.JTextField jTextField_EditaEmailDesenvolvedor;
    private javax.swing.JTextField jTextField_EditaNomeDesenvolvedor;
    private javax.swing.JTextField jTextField_EstadoDesenvolvedor;
    // End of variables declaration//GEN-END:variables

}
