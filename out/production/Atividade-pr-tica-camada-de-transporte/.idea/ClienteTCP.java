// ClienteTCP.java
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteTCP {
    public static void main(String[] args) {
        final String SERVIDOR = "127.0.0.1";
        final int PORTA = 65432;

        try (Socket socket = new Socket(SERVIDOR, PORTA)) {
            System.out.println("Conectado ao servidor em " + SERVIDOR + ":" + PORTA);

            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            String mensagem;
            while (true) {
                System.out.print("Você: ");
                mensagem = scanner.nextLine();
                saida.println(mensagem);
                if (mensagem.equalsIgnoreCase("sair")) {
                    break;
                }
                String resposta = entrada.readLine();
                System.out.println("Servidor: " + resposta);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}