package javaapplication3;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author fefe
 */
public class JavaApplication3 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> lista2 = new ArrayList<String>();

        lista.add("bla bla bla");
        lista.add("bla bla bla");
        lista.add("bla bla bla");

        lista.add(1, "nmr 2,5");
        printList(lista);
        lista.remove(2);
        lista.set(0, "oiahsdfuhsdf");

        lista2.add("original lista 2- 1");
        lista2.add("original lista 2- 2");
        lista2.add("original lista 2- 3");
        lista2.addAll(lista);
        lista2.addAll(1, lista);
        printList(lista2);
        System.out.println(lista2.indexOf("bla bla bla"));

    }

    public static void printList(ArrayList<String> arrayLista) {
        System.out.println("inicio listão\n");
        for (int i = 0; i < arrayLista.size(); i++) {
            System.out.println(arrayLista.get(i));
        }
        System.out.println("fim listãoooo\n");
    }

}
