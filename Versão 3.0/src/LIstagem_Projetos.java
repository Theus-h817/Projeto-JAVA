
import Conexao.DesenvolvedorDAO;
import Conexao.DesenvolvedorDTO;
import Conexao.ProjetoDTO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class LIstagem_Projetos extends javax.swing.JFrame {

    public LIstagem_Projetos() {
        initComponents();
        this.setLocationRelativeTo(null);
        preencherTabelaProjetos();

        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                preencherTabelaProjetos();
            }
        });

        jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getSelectedRow();
                    if (selectedRow != -1) {
                        // Recupere a ID da linha selecionada
                        Object idObj = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getValueAt(selectedRow, 0); //ID está na primeira coluna
                        if (idObj != null) {
                            int id = Integer.parseInt(idObj.toString());
                            projetoSelecionado = id;
                            System.out.println("ID selecionada: " + id);
                            // Faça algo com a ID, como carregar detalhes ou atualizar um formulário
                        }
                    }
                }
            }
        });
        jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getSelectedRow();
                    if (selectedRow != -1) {
                        // Recupere a ID da linha selecionada
                        Object idObj = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getValueAt(selectedRow, 0);
                        if (idObj != null) {
                            String id = idObj.toString();
                            System.out.println("ID selecionada: " + id);
                        }
                    }
                }
            }
        });

    }

    private String Nome;
    private int DesenvolvedorID, ContribuicaoID, projetoSelecionado;

    public void setNome(String Nome) {
        this.Nome = Nome;
        if (Nome != null) {
            jLabel2.setText("Bem-vindo " + Nome); // Atualiza o JLabel diretamente ao definir o nome
        } else {
            jLabel2.setText("Bem-vindo convidado");
        }
    }

    public String getNome() {
        return Nome;
    }

    public void setDesenvolvedorID(int DesenvolvedorID) {
        this.DesenvolvedorID = DesenvolvedorID;
    }

    public int getDesenvolvedorID() {
        return DesenvolvedorID;
    }

    public void setContribuicaoID(int ContribuicaoID) {
        this.ContribuicaoID = ContribuicaoID;
    }

    public int getContribuicaoID() {
        return ContribuicaoID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_CriarNovoRepositorio = new javax.swing.JButton();
        jButton_VisualizarRepositorio = new javax.swing.JButton();
        jButton_ExcluirRepositorio = new javax.swing.JButton();
        jButton_ExcluirRepositorio1 = new javax.swing.JButton();
        jButtonDeslogarEVoltaraTeladeLogin = new javax.swing.JButton();
        jButton_EditarRepositorio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE PROJETOS ATIVOS");

        jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Projeto Nº", "NOME DO PROJETO", "CRIADOR(A)", "MODIFICADO POR", "ULTIMA MODIFICAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.setMinimumSize(new java.awt.Dimension(50, 800));
        jScrollPane1.setViewportView(jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou);
        if (jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getColumnModel().getColumnCount() > 0) {
            jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getColumnModel().getColumn(0).setMinWidth(70);
            jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getColumnModel().getColumn(0).setMaxWidth(70);
            jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getColumnModel().getColumn(4).setMinWidth(140);
            jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PROJETOS");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_CriarNovoRepositorio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_CriarNovoRepositorio.setText("CRIAR NOVO PROJETO");
        jButton_CriarNovoRepositorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CriarNovoRepositorioActionPerformed(evt);
            }
        });

        jButton_VisualizarRepositorio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_VisualizarRepositorio.setText("VISUALIZAR  PROJETO");
        jButton_VisualizarRepositorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_VisualizarRepositorioMouseClicked(evt);
            }
        });
        jButton_VisualizarRepositorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisualizarRepositorioActionPerformed(evt);
            }
        });

        jButton_ExcluirRepositorio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_ExcluirRepositorio.setText("EXCLUIR PROJETO");
        jButton_ExcluirRepositorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ExcluirRepositorioMouseClicked(evt);
            }
        });

        jButton_ExcluirRepositorio1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_ExcluirRepositorio1.setText("MEU PERFIL");
        jButton_ExcluirRepositorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirRepositorio1ActionPerformed(evt);
            }
        });

        jButtonDeslogarEVoltaraTeladeLogin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonDeslogarEVoltaraTeladeLogin.setText("SAIR");
        jButtonDeslogarEVoltaraTeladeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeslogarEVoltaraTeladeLoginActionPerformed(evt);
            }
        });

        jButton_EditarRepositorio1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_EditarRepositorio1.setText("EDITAR PROJETO");
        jButton_EditarRepositorio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_EditarRepositorio1MouseClicked(evt);
            }
        });
        jButton_EditarRepositorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarRepositorio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_CriarNovoRepositorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_EditarRepositorio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_VisualizarRepositorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ExcluirRepositorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ExcluirRepositorio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeslogarEVoltaraTeladeLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_CriarNovoRepositorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_EditarRepositorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_VisualizarRepositorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_ExcluirRepositorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_ExcluirRepositorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDeslogarEVoltaraTeladeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton_CriarNovoRepositorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CriarNovoRepositorioActionPerformed
        if (getNome() != null) {
            Cadastro_Projeto cadastro = new Cadastro_Projeto();
            cadastro.setDesenvolvedorID(getDesenvolvedorID());
            cadastro.setNome(getNome());
            this.setVisible(false);
            cadastro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Você precisa de estar logado para realizar esta ação!!!", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_CriarNovoRepositorioActionPerformed

    private void jButton_ExcluirRepositorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirRepositorio1ActionPerformed
        if (getNome() != null) {
            Edicao_programador edicao = new Edicao_programador();
            edicao.setDesenvolvedorID(getDesenvolvedorID());
            edicao.setNome(getNome());
            this.setVisible(false);
            edicao.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Você precisa de estar logado para realizar esta ação!!!", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_ExcluirRepositorio1ActionPerformed

    private void jButtonDeslogarEVoltaraTeladeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeslogarEVoltaraTeladeLoginActionPerformed
        Login_Programador Login = new Login_Programador();
        Nome = "";
        DesenvolvedorID = 0;
        ContribuicaoID = 0;
        Login.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButtonDeslogarEVoltaraTeladeLoginActionPerformed

    public void preencherTabelaProjetos() {
        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        List<DesenvolvedorDTO> projetos = devDAO.listarProjetos();

        DefaultTableModel modelo = (DefaultTableModel) jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

        for (DesenvolvedorDTO projeto : projetos) {
            int projetoID = projeto.getProjetoID();
            String nomeProjeto = projeto.getNome_do_Projeto();
            String nomeCriador = projeto.getNomeCriador();

            DesenvolvedorDTO ultimaContribuicao = devDAO.buscarUltimaContribuicaoPorProjeto(projetoID);
            String dataUltimaModificacao = "N/A";
            String nomeModificadoPor = "N/A";

            if (ultimaContribuicao != null) {
                nomeModificadoPor = devDAO.buscarNomeColaboradorPorID(ultimaContribuicao.getDesenvolvedorID());
                dataUltimaModificacao = ultimaContribuicao.getDataContribuicao();
                //setDesenvolvedorID(ultimaContribuicao.getDesenvolvedorID());
            }

            modelo.addRow(new Object[]{
                projetoID,
                nomeProjeto,
                nomeCriador,
                nomeModificadoPor,
                dataUltimaModificacao
            });
        }

    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (getNome() == null) {
            jLabel2.setText("Bem-vindo convidado");
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton_VisualizarRepositorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_VisualizarRepositorioMouseClicked

    }//GEN-LAST:event_jButton_VisualizarRepositorioMouseClicked

    private void jButton_VisualizarRepositorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisualizarRepositorioActionPerformed
        Visualizacao visualizacao = new Visualizacao();
        visualizacao.setDesenvolvedorID(getDesenvolvedorID());
        visualizacao.setNome(getNome());

        // Recupera a linha e coluna selecionadas na tabela
        int selectedRow = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getSelectedRow();
        int selectedColumn = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getSelectedColumn();

        // Verifica se a seleção é válida
        if (selectedRow >= 0 && selectedColumn >= 0) {
            Object cellValue = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getValueAt(selectedRow, 0);

            // Tenta converter o valor da célula para um número inteiro, se for uma string
            int valor;
            if (cellValue instanceof String) {
                try {
                    valor = Integer.parseInt((String) cellValue);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor selecionado não é um número válido.", "Alerta", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else if (cellValue instanceof Integer) {
                valor = (Integer) cellValue;
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de dado inválido na célula selecionada.", "Alerta", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Define o ID do projeto na instância de edição
            visualizacao.setProjetoID(valor);

            // Exibe a janela de edição e oculta a janela atual
            this.setVisible(false);
            visualizacao.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma célula válida.", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_VisualizarRepositorioActionPerformed

    private void jButton_ExcluirRepositorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ExcluirRepositorioMouseClicked
        int selectedRow = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getSelectedRow();

        if (selectedRow >= 0) {
            Object idObj = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getValueAt(selectedRow, 0);
            String nomeCriador = (String) jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getValueAt(selectedRow, 2);

            if (idObj != null && getNome() != null) {
                int projetoID = Integer.parseInt(idObj.toString());

                if (getNome().equals(nomeCriador)) {
                    DesenvolvedorDAO devDAO = new DesenvolvedorDAO();

                    boolean sucessoAssociacoes = devDAO.excluirAssociacoesPorProjeto(projetoID);
                    boolean sucessoContribuicoes = devDAO.excluirContribuicoesPorProjeto(projetoID);
                    boolean sucessoProjeto = devDAO.excluirProjeto(projetoID);

                    if (sucessoAssociacoes && sucessoContribuicoes && sucessoProjeto) {
                        JOptionPane.showMessageDialog(null, "Repositório excluído com sucesso.", "Alerta", JOptionPane.WARNING_MESSAGE);
                        preencherTabelaProjetos(); // Atualiza a tabela após a exclusão
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao excluir o repositório. Verifique se há dependências.", "Alerta", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Impossível realizar esta ação pois você não é o dono do projeto.", "Alerta", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você precisa estar logado para realizar esta ação!!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela de projetos.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_ExcluirRepositorioMouseClicked

    private void jButton_EditarRepositorio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_EditarRepositorio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_EditarRepositorio1MouseClicked

    private void jButton_EditarRepositorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditarRepositorio1ActionPerformed
        if (getNome() != null) {
            Edicao_Projeto edicao = new Edicao_Projeto();
            edicao.setDesenvolvedorID(getDesenvolvedorID());
            edicao.setNome(getNome());

            // Recupera a linha e coluna selecionadas na tabela
            int selectedRow = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getSelectedRow();
            int selectedColumn = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getSelectedColumn();

            // Verifica se a seleção é válida
            if (selectedRow >= 0 && selectedColumn >= 0) {
                Object cellValue = jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou.getValueAt(selectedRow, 0);

                // Tenta converter o valor da célula para um número inteiro, se for uma string
                int valor;
                if (cellValue instanceof String) {
                    try {
                        valor = Integer.parseInt((String) cellValue);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor selecionado não é um número válido.", "Alerta", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else if (cellValue instanceof Integer) {
                    valor = (Integer) cellValue;
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo de dado inválido na célula selecionada.", "Alerta", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Define o ID do projeto na instância de edição
                edicao.setProjetoID(valor);

                // Exibe a janela de edição e oculta a janela atual
                this.setVisible(false);
                edicao.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione uma célula válida.", "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você precisa de estar logado para realizar esta ação!!!", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_EditarRepositorio1ActionPerformed

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
            java.util.logging.Logger.getLogger(LIstagem_Projetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LIstagem_Projetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LIstagem_Projetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LIstagem_Projetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LIstagem_Projetos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeslogarEVoltaraTeladeLogin;
    private javax.swing.JButton jButton_CriarNovoRepositorio;
    private javax.swing.JButton jButton_EditarRepositorio1;
    private javax.swing.JButton jButton_ExcluirRepositorio;
    private javax.swing.JButton jButton_ExcluirRepositorio1;
    private javax.swing.JButton jButton_VisualizarRepositorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_NomeCriador_CriadorProjeto_UltimaModificacao_QuemModificou;
    // End of variables declaration//GEN-END:variables

}
