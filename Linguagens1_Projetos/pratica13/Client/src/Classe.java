


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Classe {

    public static void main(String[] args) {
        // TODO code application logic here

        String serverAddress = JOptionPane.showInputDialog(
                "Informe o ip do servidor \n" + "executando p serviço de chat na porta 9000");
        Socket cliente;
        try {
            cliente = new Socket(serverAddress, 9000);
            System.out.println("Servidor ouvindo porta 9000");

            try (
                Scanner entradaRede = new Scanner(cliente.getInputStream());
                Scanner teclado = new Scanner(System.in);
                PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
                    PrintWriter out = new PrintWriter(cliente.getOutputStream(), true); 
                    )
                {
                    System.out.println(entradaRede.nextLine());
                    String msg = "";
                     
                    while (!msg.equals("tchau!")) {
                        
                        
                                          
                        msg = teclado.nextLine();
                        Thread t1 = new Thread(msg);
                        t1.start();
                        
                           saidaRede.println(msg);
                        msg = entradaRede.nextLine();
                        System.out.println(msg);
                        
                  
                        
                    }
                    
                    System.out.println("aplicação finalizada. pressione enter para fechar o prog");
                    teclado.nextLine();
                    cliente.close();
                }

            } catch (IOException e) {
                
            //Logger.getLogger(Classe.class.getName()).log(Level.SEVERE, null, e); isso aki n tava funcionando n sei pq ,-,
            }
        
         System.exit(0);

                  
         /* try {
            ServerSocket servidor = new ServerSocket(8000);
            System.out.println("Servidor ouvindo porta 12345");
            while (true) {
                Socket cliente = servidor.accept();
                System.out.println("conectouu " + cliente.getInetAddress().getHostAddress());

                PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);   //fazer ou esse ou o do object output stream pra printar as coisas
                out.println("oie bem vindo, seu ip é" + cliente.getInetAddress().getHostAddress());

                Scanner in = new Scanner(cliente.getInputStream()); //entrada do q ta vindo da coneção
                Scanner scan = new Scanner(System.in); // entraad local

                while (cliente.isConnected()) {

                    //  String a = scan.nextLine();
                    // System.out.println(a);
                    
                    String s = in.nextLine();
                    out.println(scan.nextLine());
                    System.out.println(s);
                }
                cliente.close();

                /*ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                saida.flush();
                saida.writeObject(new Date());
                saida.close();
                cliente.close(); 
            }
        } catch (Exception e) {
            System.out.println("erro" + e.getMessage());
        }
         */
    }

}
