package n1exercici2;

import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listNumbers = new ArrayList<Integer>();

        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);

        System.out.println("Vamos a printar la lista original");
        printListNumbers(listNumbers);

        List<Integer> reverseList = new ArrayList<Integer>();

        addListReverseIterator(listNumbers,reverseList);

        System.out.println("Ahora mostramos la lista inversa");
        printReverseList (reverseList);
    }
    public static void printListNumbers (ArrayList<Integer> listNumbers){
        for (Integer elemento : listNumbers) {
            System.out.println(elemento);
        }
    }
    public static void addListReverseIterator (List<Integer> listNumbers, List<Integer>reverseList) {
        ListIterator it = listNumbers.listIterator(listNumbers.size());


        while (it.hasPrevious()) {
            reverseList.add((int)it.previous());

        }

    }
    public static void printReverseList (List<Integer>reverseList) {

        ListIterator it = reverseList.listIterator();

        while(it.hasNext())
            System.out.println(it.next());


    }
}
