package atividadetransporte;// ServidorTCP.java
import java.io.*;
import java.net.*;

public class ServidorTCP {
    public static void main(String[] args) {
        final int PORTA = 65432;
        try (ServerSocket servidor = new ServerSocket(PORTA)) {
            System.out.println("Servidor aguardando conexões na porta " + PORTA);
            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente.getInetAddress());

            BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter saida = new PrintWriter(cliente.getOutputStream(), true);

            String mensagem;
            while ((mensagem = entrada.readLine()) != null) {
                if (mensagem.equalsIgnoreCase("sair")) {
                    System.out.println("Conexão encerrada pelo cliente.");
                    break;
                }
                System.out.println("Cliente: " + mensagem);
                saida.println("Mensagem recebida: " + mensagem);
            }

            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
