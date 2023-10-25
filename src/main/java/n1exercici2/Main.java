package n1exercici2;

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

        List<Integer> reverseList = new ArrayList<Integer>();

        addListReverseIterator(listNumbers,reverseList);


        System.out.println("Printa la lista inversa");
        printReverseList (reverseList);
    }
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
