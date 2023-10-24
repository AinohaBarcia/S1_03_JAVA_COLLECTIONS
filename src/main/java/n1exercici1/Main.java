package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Month> listMonths = new ArrayList<Month>();

        Month month1 = new Month("January");
        Month month2 = new Month("February");
        Month month3 = new Month("March");
        Month month4 = new Month ("April");
        Month month5 = new Month ("May");
        Month month6 = new Month ("June");
        Month month7 = new Month ("July");
        Month month8 = new Month ("September");
        Month month9 = new Month ("October");
        Month month10 = new Month ("November");
        Month month11 = new Month ("December");
        Month month12 = new Month ("August");

        listMonths.add(month1);
        listMonths.add(month2);
        listMonths.add(month3);
        listMonths.add(month4);
        listMonths.add(month5);
        listMonths.add(month6);
        listMonths.add(month7);
        listMonths.add(month8);
        listMonths.add(month9);
        listMonths.add(month10);
        listMonths.add(month11);

        //Añadir mes de Agosot en su lugar correspondiente
        //listMonths.add(7, month12);

        //Llamamos al metodo para printar con bucle for
        //printList(listMonths);

        //Montamos el HashSet
        HashSet<String> hashSetMonths = new HashSet<String>();
        hashSetMonths.add("January");
        hashSetMonths.add("February");
        hashSetMonths.add("March");
        hashSetMonths.add("April");
        hashSetMonths.add("May");
        hashSetMonths.add("June");
        hashSetMonths.add("July");
        hashSetMonths.add("August");
        hashSetMonths.add("September");
        hashSetMonths.add("October");
        hashSetMonths.add("November");
        hashSetMonths.add("December");
        hashSetMonths.add("February");

        //Printa la lista sin repetir el último Stringque hemos añadido que està repetido.
        System.out.println(hashSetMonths);

        //Printar ArrayList con Iterador
       // printListIterator(listMonths);



    }
    //Método para recorrer ArrayList con bucle for
    public static void printList (ArrayList <Month> listMonths){

        int i = 0;

        for(i=0;i<listMonths.size();i++) {
            System.out.println(listMonths.get(i).getName());
        }

    }
    //Método para iterar ArrayList
    public static void printListIterator (ArrayList<Month>listMonths) {

        Iterator it = listMonths.iterator();

        while(it.hasNext())
            System.out.println(it.next());

    }
}
