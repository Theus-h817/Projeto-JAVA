
import Conexao.DesenvolvedorDAO;
import Conexao.DesenvolvedorDTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class Login_Programador extends javax.swing.JFrame {

    public Login_Programador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_InsereUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_InsereSenha = new javax.swing.JTextField();
        jButton_CadastreSe = new javax.swing.JButton();
        jButton_AcessaLogin = new javax.swing.JButton();
        jButton_EntrarComoConvidado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN DE DESENVOLVEDOR");
        jLabel1.setMaximumSize(new java.awt.Dimension(551, 43));
        jLabel1.setMinimumSize(new java.awt.Dimension(551, 43));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/IMG-20240508-WA0001.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setPreferredSize(new java.awt.Dimension(3110, 3072));

        jLabel3.setText("USUÁRIO");

        jTextField_InsereUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setText("SENHA");

        jButton_CadastreSe.setText("CADASTRE-SE");
        jButton_CadastreSe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_CadastreSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastreSeActionPerformed(evt);
            }
        });

        jButton_AcessaLogin.setText("ACESSAR");
        jButton_AcessaLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AcessaLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_AcessaLoginMouseClicked(evt);
            }
        });
        jButton_AcessaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AcessaLoginActionPerformed(evt);
            }
        });

        jButton_EntrarComoConvidado.setText("ENTRAR COMO CONVIDADO");
        jButton_EntrarComoConvidado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_EntrarComoConvidado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_EntrarComoConvidadoMouseClicked(evt);
            }
        });
        jButton_EntrarComoConvidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EntrarComoConvidadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_CadastreSe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jButton_AcessaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_InsereSenha)
                    .addComponent(jTextField_InsereUsuario)
                    .addComponent(jButton_EntrarComoConvidado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_InsereUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_InsereSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_CadastreSe)
                            .addComponent(jButton_AcessaLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_EntrarComoConvidado)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CadastreSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastreSeActionPerformed
        Cadastro_Programador cadastro = new Cadastro_Programador();
        this.setVisible(false);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jButton_CadastreSeActionPerformed

    private void jButton_AcessaLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AcessaLoginMouseClicked
        String Email = jTextField_InsereUsuario.getText();
        String Senha = jTextField_InsereSenha.getText();

        DesenvolvedorDAO DevDAO = new DesenvolvedorDAO();
        DesenvolvedorDTO DevDTO = DevDAO.loginDesenvolvedor(Email, Senha);

        if (DevDTO != null && DevDAO.conectado == 1) {
            LIstagem_Projetos menu = new LIstagem_Projetos();
            menu.setNome(DevDTO.getNome()); // Passa o nome do desenvolvedor para a tela de listagem
            menu.setDesenvolvedorID(DevDTO.getDesenvolvedorID());
            this.setVisible(false);
            menu.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Login falhou. Verifique suas credenciais.", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_AcessaLoginMouseClicked

    public class Importante {

    }

    private void jButton_AcessaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AcessaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_AcessaLoginActionPerformed

    private void jButton_EntrarComoConvidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EntrarComoConvidadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_EntrarComoConvidadoActionPerformed

    private void jButton_EntrarComoConvidadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_EntrarComoConvidadoMouseClicked
        LIstagem_Projetos menu = new LIstagem_Projetos();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton_EntrarComoConvidadoMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Programador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Programador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AcessaLogin;
    private javax.swing.JButton jButton_CadastreSe;
    private javax.swing.JButton jButton_EntrarComoConvidado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField_InsereSenha;
    private javax.swing.JTextField jTextField_InsereUsuario;
    // End of variables declaration//GEN-END:variables

}
