
public class SIGECOM {

    public static void main(String[] args) {
        try {
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TelaSplash().setVisible(true);
                }
            });
    }catch (Exception ex) {
            // Lidar com a exceção de forma adequada, por exemplo, exibir uma mensagem de erro
            System.err.println("Erro durante a execução do programa: " + ex.getMessage());
        ex.printStackTrace(); // Isso exibirá o rastreamento da pilha no console
        // Você pode adicionar mais ações aqui, como registrar o erro em um arquivo de log
    }

}
}
