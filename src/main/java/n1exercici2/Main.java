package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        //Lista <Integer>
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();

        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);

        //Declaramos segundo Array para ñadir primera en orden inverso*/
        List<Integer> reverseList = new ArrayList<Integer>();

        //Llamamos método para añadir items en la lista inversa
        addListReverseIterator(listNumbers,reverseList);

        //Llamamos método para printar lista invertida

        printReverseList (reverseList);
    }
    //Método para añadir a otra List con los elementos de la primera en orden inverso
    public static void addListReverse (List<Integer> listNumbers, List<Integer>reverseList) {

        int number = 0;

        for(int i=listNumbers.size();i>0;i--) {

            number = listNumbers.get(i-1);
            reverseList.add(number);
        }
        System.out.println(reverseList);

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
