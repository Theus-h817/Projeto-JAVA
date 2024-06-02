
import Conexao.DesenvolvedorDAO;
import Conexao.DesenvolvedorDTO;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.String;
import java.util.List;

public class LinguagemEProeficiencia extends javax.swing.JFrame {

    public LinguagemEProeficiencia() {
        initComponents();
        this.setLocationRelativeTo(null);
        configurarTabela();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Mostrando o formulário anterior quando este JFrame for fechado
                Edicao_programador EditaProg = new Edicao_programador();
                EditaProg.setNome(Nome);
                EditaProg.setDesenvolvedorID(DesenvolvedorID);
                EditaProg.setVisible(true); // Substitua "FormularioAntigo" pelo nome do seu JFrame anterior
            }
        });

    }

    private DesenvolvedorDTO devDTO;
    private int DesenvolvedorID;
    private String Nome;

    void setDesenvolvedorID(int DesenvolvedorID) {
        this.DesenvolvedorID = DesenvolvedorID;

    }

    public int getDesenvolvedorID() {
        return DesenvolvedorID;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
        jLabel_BemVindoUsuario.setText("Bem Vindo " + Nome);
    }

    public String getNome() {
        return Nome;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox_ListaLinguagemProgramacao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_ListaNivelProeficiencia = new javax.swing.JComboBox<>();
        jButton_ExcluirLinguagemProgramacaoENivelProeficiencia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_LinguagemProgramacaoENivelProeficiencia = new javax.swing.JTable();
        jButton_CadastraLinguagemProgramacaoENivelProeficiencia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_BemVindoUsuario = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setText("Linguagem de programação");

        jLabel3.setText("Nivel de conhecimento");

        jButton_ExcluirLinguagemProgramacaoENivelProeficiencia.setText("EXCLUIR COMPETENCIA");
        jButton_ExcluirLinguagemProgramacaoENivelProeficiencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ExcluirLinguagemProgramacaoENivelProeficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirLinguagemProgramacaoENivelProeficienciaActionPerformed(evt);
            }
        });

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

        jButton_CadastraLinguagemProgramacaoENivelProeficiencia.setText("CADASTRAR COMPETÊNCIA");
        jButton_CadastraLinguagemProgramacaoENivelProeficiencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_CadastraLinguagemProgramacaoENivelProeficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastraLinguagemProgramacaoENivelProeficienciaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LINGUAGEM E PROEFICIÊNCIA");

        jLabel_BemVindoUsuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel_BemVindoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BemVindoUsuario.setText("Bem vindo");
        jLabel_BemVindoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel_BemVindoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_CadastraLinguagemProgramacaoENivelProeficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jComboBox_ListaLinguagemProgramacao, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_ListaNivelProeficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ExcluirLinguagemProgramacaoENivelProeficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_BemVindoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_ListaLinguagemProgramacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_ListaNivelProeficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ExcluirLinguagemProgramacaoENivelProeficiencia)
                    .addComponent(jButton_CadastraLinguagemProgramacaoENivelProeficiencia))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Vector<Integer> id_Linguagem = new Vector<Integer>();

    public void carregarLinguagensProgramacao() {
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        carregarLinguagensProgramacao();
        CarregarComboBoxProeficiencia();
        if (getNome() == null) {
            jLabel_BemVindoUsuario.setText("Bem-vindo convidado");
            
        }
        devDTO = new DesenvolvedorDTO();
        devDTO.setDesenvolvedorID(getDesenvolvedorID());
        preencherTabelaLinguagensEProeficiencias(devDTO.getDesenvolvedorID());
    }//GEN-LAST:event_formWindowActivated

    private void jButton_CadastraLinguagemProgramacaoENivelProeficienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastraLinguagemProgramacaoENivelProeficienciaActionPerformed
        int AddLinguagem = jComboBox_ListaLinguagemProgramacao.getSelectedIndex() + 1;
        int AddProeficiencia = jComboBox_ListaNivelProeficiencia.getSelectedIndex() + 1;

        devDTO.setLinguagemEscolhidaID(AddLinguagem);
        devDTO.setProeficienciaID(AddProeficiencia);

        DesenvolvedorDAO devDAO = new DesenvolvedorDAO();
        devDAO.cadastrarLinguagemProeficiencia(devDTO);

        // Preencher a tabela após cadastrar
        preencherTabelaLinguagensEProeficiencias(devDTO.getDesenvolvedorID());
    }//GEN-LAST:event_jButton_CadastraLinguagemProgramacaoENivelProeficienciaActionPerformed

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
            java.util.logging.Logger.getLogger(LinguagemEProeficiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinguagemEProeficiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinguagemEProeficiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinguagemEProeficiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinguagemEProeficiencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CadastraLinguagemProgramacaoENivelProeficiencia;
    private javax.swing.JButton jButton_ExcluirLinguagemProgramacaoENivelProeficiencia;
    private javax.swing.JComboBox<String> jComboBox_ListaLinguagemProgramacao;
    private javax.swing.JComboBox<String> jComboBox_ListaNivelProeficiencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_BemVindoUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_LinguagemProgramacaoENivelProeficiencia;
    // End of variables declaration//GEN-END:variables
}
