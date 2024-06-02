
import Conexao.DesenvolvedorDAO;
import Conexao.DesenvolvedorDTO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Edicao_Projeto extends javax.swing.JFrame {

    public Edicao_Projeto() {
        initComponents();
        this.setLocationRelativeTo(null);
        CarregarComboBoxLinguagensProgramacao();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Mostrando o formulário anterior quando este JFrame for fechado
                LIstagem_Projetos Lista = new LIstagem_Projetos();
                Lista.setNome(Nome);
                Lista.setVisible(true);
            }
        });
    }

    private DesenvolvedorDTO devDTO;
    private int DesenvolvedorID, ProjetoID, ContribuicaoID;
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

    void setProjetoID(int ProjetoID) {
        this.ProjetoID = ProjetoID;
    }

    public int getProjetoID() {
        return ProjetoID;
    }

    void setContribuicaoID(int ContribuicaoID) {
        this.ContribuicaoID = ContribuicaoID;
    }

    public int getContribuicaoID() {
        return ContribuicaoID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_CadastroNomeProjeto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_CadastroDescricaoProjeto = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_CadastroCodigoProjeto = new javax.swing.JTextArea();
        jButton_EnviaConteudo = new javax.swing.JButton();
        jButton_LimpaTudo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jComboBox_ListaLinguagemProgramacao = new javax.swing.JComboBox<>();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTable_LinguagensUtilizadas = new javax.swing.JTable();
        jButton_AdicionaLinguagem = new javax.swing.JButton();
        jButton_RemoveLinguagem = new javax.swing.JButton();
        jButton_LimpaTudoESai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("NOME ");

        jTextField_CadastroNomeProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CadastroNomeProjetoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("DESCRIÇÃO");

        jTextArea_CadastroDescricaoProjeto.setColumns(20);
        jTextArea_CadastroDescricaoProjeto.setRows(5);
        jScrollPane1.setViewportView(jTextArea_CadastroDescricaoProjeto);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("CÓDIGO");

        jTextArea_CadastroCodigoProjeto.setColumns(20);
        jTextArea_CadastroCodigoProjeto.setRows(5);
        jScrollPane2.setViewportView(jTextArea_CadastroCodigoProjeto);

        jButton_EnviaConteudo.setText("ENVIAR");
        jButton_EnviaConteudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_EnviaConteudoMouseClicked(evt);
            }
        });

        jButton_LimpaTudo.setText("LIMPAR");
        jButton_LimpaTudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_LimpaTudoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_CadastroNomeProjeto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_EnviaConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton_LimpaTudo, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CadastroNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_EnviaConteudo)
                    .addComponent(jButton_LimpaTudo)))
        );

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIÇÃO DE PROJETOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel53.setText("LINGUAGENS DE PROGRAMAÇÃO USADAS");

        jComboBox_ListaLinguagemProgramacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_ListaLinguagemProgramacaoMouseClicked(evt);
            }
        });

        jTable_LinguagensUtilizadas.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
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
                "ID", "LINGUAGENS UTILIZADAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane51.setViewportView(jTable_LinguagensUtilizadas);
        if (jTable_LinguagensUtilizadas.getColumnModel().getColumnCount() > 0) {
            jTable_LinguagensUtilizadas.getColumnModel().getColumn(0).setMinWidth(45);
            jTable_LinguagensUtilizadas.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jButton_AdicionaLinguagem.setText("ADICIONAR");
        jButton_AdicionaLinguagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_AdicionaLinguagemMouseClicked(evt);
            }
        });

        jButton_RemoveLinguagem.setText("REMOVER");
        jButton_RemoveLinguagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RemoveLinguagemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_ListaLinguagemProgramacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(jButton_AdicionaLinguagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_RemoveLinguagem)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox_ListaLinguagemProgramacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_AdicionaLinguagem)
                    .addComponent(jButton_RemoveLinguagem))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_LimpaTudoESai.setText("SAIR");
        jButton_LimpaTudoESai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_LimpaTudoESaiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_LimpaTudoESai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_LimpaTudoESai))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        devDTO = new DesenvolvedorDTO();
        devDTO.setProjetoID(getProjetoID());
        preencherTabelaContribuicoesELinguagens(getProjetoID());

        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        devDAO.ListaInformacoesProjeto(devDTO);
        jTextField_CadastroNomeProjeto.setText(devDTO.getNome_do_Projeto());
        jTextArea_CadastroDescricaoProjeto.setText(devDTO.getDescricao_do_Projeto());
        jTextArea_CadastroCodigoProjeto.setText(devDTO.getCodigo_do_Projeto());
        setContribuicaoID(devDTO.getContribuicaoID());

        jComboBox_ListaLinguagemProgramacao.setVisible(false);
        jButton_AdicionaLinguagem.setVisible(false);
        jButton_RemoveLinguagem.setVisible(false);
        jTable_LinguagensUtilizadas.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jTextField_CadastroNomeProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CadastroNomeProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CadastroNomeProjetoActionPerformed

    private void jButton_LimpaTudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LimpaTudoMouseClicked
        jTextField_CadastroNomeProjeto.setText("");
        jTextArea_CadastroDescricaoProjeto.setText("");
        jTextArea_CadastroCodigoProjeto.setText("");
    }//GEN-LAST:event_jButton_LimpaTudoMouseClicked

    private void jButton_LimpaTudoESaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LimpaTudoESaiMouseClicked
        LIstagem_Projetos Lista = new LIstagem_Projetos();
        Lista.setNome(getNome());
        Lista.setDesenvolvedorID(getDesenvolvedorID());
        Lista.setVisible(true);
        setVisible(false);
        dispose();


    }//GEN-LAST:event_jButton_LimpaTudoESaiMouseClicked

    private void jButton_AdicionaLinguagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AdicionaLinguagemMouseClicked
        int AddLinguagem = jComboBox_ListaLinguagemProgramacao.getSelectedIndex() + 1;

        if (getContribuicaoID() < 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma contribuição válida.", "Alerta", JOptionPane.ERROR_MESSAGE);
            return;
        }

        devDTO = new DesenvolvedorDTO();
        devDTO.setLinguagemEscolhidaID(AddLinguagem);
        devDTO.setNome(getNome());
        devDTO.setContribuicaoID(getContribuicaoID());

        boolean itemJaExiste = false;

        // Verifica se a JTable está vazia
        if (jTable_LinguagensUtilizadas.getRowCount() > 0) {
            for (int i = 0; i < jTable_LinguagensUtilizadas.getRowCount(); i++) {
                if (jComboBox_ListaLinguagemProgramacao.getSelectedItem().equals(jTable_LinguagensUtilizadas.getValueAt(i, 1))) {
                    itemJaExiste = true;
                    break;
                }
            }
        }

        if (itemJaExiste) {
            JOptionPane.showMessageDialog(null, "Item já cadastrado", "Alerta", JOptionPane.ERROR_MESSAGE);
        } else {
            DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
            devDAO.cadastrarLinguagemProjeto(devDTO);
            preencherTabelaContribuicoesELinguagens(getProjetoID());
        }


    }//GEN-LAST:event_jButton_AdicionaLinguagemMouseClicked


    private void jButton_EnviaConteudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_EnviaConteudoMouseClicked
        String Nome = jTextField_CadastroNomeProjeto.getText();
        String Descricao = jTextArea_CadastroDescricaoProjeto.getText();
        String Codigo = jTextArea_CadastroCodigoProjeto.getText();
        int ID = getDesenvolvedorID();

        // Verifica se os campos estão preenchidos
        if (Nome.isEmpty() || Descricao.isEmpty() || Codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Alerta", JOptionPane.ERROR_MESSAGE);
        }

        // Atualizar projeto no banco de dados
        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        
        devDTO = new DesenvolvedorDTO();
        devDTO.setDesenvolvedorID(ID);
        devDTO.setProjetoID(getProjetoID());
        devDTO.setNome_do_Projeto(Nome);
        devDTO.setDescricao_do_Projeto(Descricao);
        devDTO.setCodigo_do_Projeto(Codigo);

        boolean atualizadoProjeto = devDAO.atualizarProjeto(devDTO);
        boolean atualizadoContribuicao = devDAO.atualizarContribuicao(devDTO);

        if (atualizadoProjeto && atualizadoContribuicao) {
            JOptionPane.showMessageDialog(null, "Projeto atualizado com sucesso!", "Alerta", JOptionPane.WARNING_MESSAGE);
            jComboBox_ListaLinguagemProgramacao.setVisible(true);
            jButton_AdicionaLinguagem.setVisible(true);
            jButton_RemoveLinguagem.setVisible(true);
            jTable_LinguagensUtilizadas.setEnabled(true);

//            LIstagem_Projetos Lista = new LIstagem_Projetos();
//            Lista.setNome(getNome());
//            Lista.setDesenvolvedorID(getDesenvolvedorID());
//            Lista.setVisible(true);
//            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o projeto.", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_EnviaConteudoMouseClicked

    private void jComboBox_ListaLinguagemProgramacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_ListaLinguagemProgramacaoMouseClicked

    }//GEN-LAST:event_jComboBox_ListaLinguagemProgramacaoMouseClicked

    private void jButton_RemoveLinguagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RemoveLinguagemMouseClicked
        int linha = jTable_LinguagensUtilizadas.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linguagem para remover.", "Alerta", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int linguagemID = (int) jTable_LinguagensUtilizadas.getValueAt(linha, 0);
        DesenvolvedorDTO devDTO = new DesenvolvedorDTO();
        devDTO.setContribuicaoID(getContribuicaoID()); // Certifique-se que o ContribuicaoID está correto
        devDTO.setLinguagemID(linguagemID);

        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        boolean sucesso = devDAO.excluirLinguagemProjeto(devDTO);

        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Linguagem removida com sucesso.", "Alerta", JOptionPane.WARNING_MESSAGE);
            preencherTabelaContribuicoesELinguagens(getProjetoID()); // Atualiza a tabela após remoção
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao remover linguagem.", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_RemoveLinguagemMouseClicked

    private void preencherTabelaContribuicoesELinguagens(int projetoID) {
        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        List<Integer> contribuicoes = devDAO.listarContribuicoesPorProjeto(projetoID);

        DefaultTableModel modelo = (DefaultTableModel) jTable_LinguagensUtilizadas.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

        Set<Map.Entry<Integer, String>> linguagensUnicas = new HashSet<>();

        for (int contribuicaoID : contribuicoes) {
            Map<Integer, String> linguagens = devDAO.listarLinguagensPorContribuicao(contribuicaoID);
            linguagensUnicas.addAll(linguagens.entrySet()); // Adiciona todas as linguagens, evitando duplicatas
        }

        for (Map.Entry<Integer, String> linguagem : linguagensUnicas) {
            modelo.addRow(new Object[]{linguagem.getKey(), linguagem.getValue()});
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
            java.util.logging.Logger.getLogger(Edicao_Projeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edicao_Projeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edicao_Projeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edicao_Projeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edicao_Projeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AdicionaLinguagem;
    private javax.swing.JButton jButton_EnviaConteudo;
    private javax.swing.JButton jButton_LimpaTudo;
    private javax.swing.JButton jButton_LimpaTudoESai;
    private javax.swing.JButton jButton_RemoveLinguagem;
    private javax.swing.JComboBox<String> jComboBox_ListaLinguagemProgramacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JTable jTable_LinguagensUtilizadas;
    private javax.swing.JTextArea jTextArea_CadastroCodigoProjeto;
    private javax.swing.JTextArea jTextArea_CadastroDescricaoProjeto;
    private javax.swing.JTextField jTextField_CadastroNomeProjeto;
    // End of variables declaration//GEN-END:variables

}
