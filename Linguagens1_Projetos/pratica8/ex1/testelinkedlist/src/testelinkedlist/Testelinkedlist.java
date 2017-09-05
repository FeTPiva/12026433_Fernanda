
package testelinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Testelinkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }
     private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
            
        }
        System.out.println("=========================");
    }
}
