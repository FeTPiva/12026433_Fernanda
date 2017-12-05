/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernanda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Fezitcha
 */
public class Servidor extends Thread {

    private static ArrayList<BufferedWriter> clientes;
    private static ServerSocket server;
    private String nome;
    private Socket socket;
    private InputStream input;
    private InputStreamReader read;
    private BufferedReader buffer;

    /**
     * @param args the command line arguments
     */
    public Servidor(Socket s) {

        try {
            input = this.socket.getInputStream();
            read = new InputStreamReader(input);
            buffer = new BufferedReader(read);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void run() {

        try {

            String msg;
            OutputStream out = this.socket.getOutputStream();
            Writer ouw = new OutputStreamWriter(out);
            BufferedWriter bfw = new BufferedWriter(ouw);
            clientes.add(bfw);
            msg = buffer.readLine();
            nome = msg;
            while (!"Sair".equals(msg) && msg != null) {
                msg = buffer.readLine();
                mandarMsg(bfw, msg);
                System.out.println(msg);
            }

        } catch (Exception e) {
            e.getMessage();

        }
    }

    public void mandarMsg(BufferedWriter bwSaida, String msg) throws IOException {
        BufferedWriter bwS;

        for (BufferedWriter bw : clientes) {
            bwS = (BufferedWriter) bw;
            if (!(bwSaida == bwS)) {
                bw.write(nome + " -> " + msg + "\r\n");
                bw.flush();
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            //Cria os objetos necessário para instânciar o servidor
            JLabel lblMessage = new JLabel("Porta do Servidor= (pode alterar se quiser)");
            JTextField txtPorta = new JTextField("12345");
            Object[] texts = {lblMessage, txtPorta};
            JOptionPane.showMessageDialog(null, texts);
            server = new ServerSocket(Integer.parseInt(txtPorta.getText()));
            clientes = new ArrayList<BufferedWriter>();
            JOptionPane.showMessageDialog(null, "Servidor ativo na porta: " + txtPorta.getText());

            while (true) {
                System.out.println("Aguardando conexão...");
                Socket socket = server.accept();
                System.out.println("Cliente conectado...");
                Thread t = new Servidor(socket);
                t.start();
            }
        } catch (Exception e) {

            e.getMessage();
        }
    }
}
