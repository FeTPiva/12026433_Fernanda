/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernanda;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Fezitcha
 */
public class Servidor implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    static Socket = cliente;
    static boolean fechou = false;
    

    
        try{
        Scanner teclado = new Scanner(System.in);
        PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
        

        ServerSocket servidor;
        Socket cliente = servidor.accept();
        servidor = new ServerSocket(9000);
        PrintStream saidaRede = new PrintStream(cliente.getOutputStream().getHostAddress());

    }
    catch(IOException e){
            System.out.println(e.getMessage());
    }

}

}
