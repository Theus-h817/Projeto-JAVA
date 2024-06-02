
import Conexao.DesenvolvedorDAO;
import Conexao.DesenvolvedorDTO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Visualizacao extends javax.swing.JFrame {

    public Visualizacao() {
        initComponents();
        this.setLocationRelativeTo(null);

        CarregaDados();
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

    private void CarregaDados() {
        devDTO = new DesenvolvedorDTO();
        devDTO.setProjetoID(getProjetoID());
        devDTO.setNome_do_Projeto(getNome());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel48 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTable_LinguagensUtilizadas = new javax.swing.JTable();
        jButton_LimpaTudoESai = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_CadastroNomeProjeto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_CadastroDescricaoProjeto = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_CadastroCodigoProjeto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(846, 547));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel53.setText("LINGUAGENS DE PROGRAMAÇÃO USADAS");

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

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane51, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_LimpaTudoESai.setText("SAIR");
        jButton_LimpaTudoESai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_LimpaTudoESaiMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("NOME ");

        jTextField_CadastroNomeProjeto.setEditable(false);
        jTextField_CadastroNomeProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CadastroNomeProjetoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("DESCRIÇÃO");

        jTextArea_CadastroDescricaoProjeto.setEditable(false);
        jTextArea_CadastroDescricaoProjeto.setColumns(20);
        jTextArea_CadastroDescricaoProjeto.setRows(5);
        jScrollPane1.setViewportView(jTextArea_CadastroDescricaoProjeto);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("CÓDIGO");

        jTextArea_CadastroCodigoProjeto.setEditable(false);
        jTextArea_CadastroCodigoProjeto.setColumns(20);
        jTextArea_CadastroCodigoProjeto.setRows(5);
        jScrollPane2.setViewportView(jTextArea_CadastroCodigoProjeto);

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
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CadastroNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VISUALIZAÇÃO DE PROJETOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

    private void jButton_LimpaTudoESaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LimpaTudoESaiMouseClicked
        LIstagem_Projetos Lista = new LIstagem_Projetos();
        Lista.setNome(getNome());
        Lista.setDesenvolvedorID(getDesenvolvedorID());
        Lista.setVisible(true);
        setVisible(false);
        dispose();

    }//GEN-LAST:event_jButton_LimpaTudoESaiMouseClicked


    private void jTextField_CadastroNomeProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CadastroNomeProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CadastroNomeProjetoActionPerformed

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

        jTable_LinguagensUtilizadas.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Visualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualizacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LimpaTudoESai;
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
