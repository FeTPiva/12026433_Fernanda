/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fe;

import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        try {
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
                    out.println(scan.nextLine());
                    String s = in.nextLine();
                    System.out.println(s);

                }
                cliente.close();

                /*ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                saida.flush();
                saida.writeObject(new Date());
                saida.close();
                cliente.close(); */
            }
        } catch (Exception e) {
            System.out.println("erro" + e.getMessage());
        }

    }

}
