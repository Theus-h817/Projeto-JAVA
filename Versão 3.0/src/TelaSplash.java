
import Conexao.Conexao;
import java.awt.Color;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
import java.sql.Connection;

public class TelaSplash extends javax.swing.JFrame {

    public TelaSplash() {
        initComponents();
        jTextField_MostraStatusConexao.setForeground(new Color(204, 102, 0));
        setLocationRelativeTo(null);
        iniciarCarregamento();
    }

    private void iniciarCarregamento() {

        new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                publish("Carregando bibliotecas");
                TimeUnit.SECONDS.sleep(1);

                publish("Carregando dados");
                TimeUnit.SECONDS.sleep(1);

                publish("Estabelecendo conexão com o servidor");
                TimeUnit.SECONDS.sleep(2);

                // Tentando estabelecer a conexão
                Connection conn = Conexao.getConexao();
                if (conn != null) {
                    publish("Conexão bem sucedida");
                    TimeUnit.SECONDS.sleep(1);
                    // Redirecionar para outra tela
                    SwingUtilities.invokeLater(() -> {
                        new Login_Programador().setVisible(true); // Substitua OutraTela pelo seu JFrame destino
                        dispose();
                    });
                } else {
                    publish("Não foi possível estabelecer conexão com o banco de dados");
                    TimeUnit.SECONDS.sleep(1);
                    System.exit(0);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<String> chunks) {
                for (String text : chunks) {
                    jTextField_MostraStatusConexao.setText(text);
                }
            }
        }.execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField_MostraStatusConexao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("JFrame_Splash"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGOS/Loading Splash (GIF).gif"))); // NOI18N

        jTextField_MostraStatusConexao.setEditable(false);
        jTextField_MostraStatusConexao.setBackground(new java.awt.Color(15, 15, 30));
        jTextField_MostraStatusConexao.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jTextField_MostraStatusConexao.setForeground(new java.awt.Color(204, 102, 0));
        jTextField_MostraStatusConexao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_MostraStatusConexao.setText("jTextField1");
        jTextField_MostraStatusConexao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(15, 15, 29), new java.awt.Color(15, 15, 29), new java.awt.Color(15, 15, 29), new java.awt.Color(15, 15, 29)));
        jTextField_MostraStatusConexao.setCaretColor(new java.awt.Color(204, 102, 0));
        jTextField_MostraStatusConexao.setDisabledTextColor(new java.awt.Color(204, 102, 0));
        jTextField_MostraStatusConexao.setSelectedTextColor(new java.awt.Color(15, 15, 29));
        jTextField_MostraStatusConexao.setSelectionColor(new java.awt.Color(15, 15, 29));
        jTextField_MostraStatusConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MostraStatusConexaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTextField_MostraStatusConexao)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jTextField_MostraStatusConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_MostraStatusConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MostraStatusConexaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MostraStatusConexaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSplash.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSplash.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSplash.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSplash.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSplash().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField_MostraStatusConexao;
    // End of variables declaration//GEN-END:variables
}
