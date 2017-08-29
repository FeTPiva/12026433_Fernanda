/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadecomprasbonita;

import java.util.ArrayList;

/**
 *
 * @author Aluno 07
 */
public class ListaDeCompras {
    ArrayList<String> compras = new ArrayList<String>();
    
    public void adicionarItem(String a){
        compras.add(a);
    }
    public void removerItem(String a){
        compras.remove(a);
    }
    
    
    public void printList(ArrayList<String> arrayLista) {
        System.out.println("inicio listão\n");
        for (int i = 0; i < arrayLista.size(); i++) {
            System.out.println(arrayLista.get(i));
        }
        System.out.println("fim listãoooo\n");
        
    }
    public void print2(ArrayList<String> arrayLista){
        System.out.println(arrayLista);
    }
    
}
