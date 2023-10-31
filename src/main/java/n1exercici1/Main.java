package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Declaramos ArrayList Months, sin el mes de Agosto");
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

        System.out.println("Añadir mes de Agosto en su lugar correspondiente");
        listMonths.add(7, month12);
        System.out.println();
        System.out.println("Llamamos al metodo para printar con bucle for");
        printList(listMonths);
        System.out.println();
        System.out.println("Creamos el HashSet con el mes de febrero duplicado");
        /*String[] months ={"January","February","March","April","May","June","July","August",
                         "September","October","November","December","February"};*/
        HashSet<Month> hashSetMonths = new HashSet<Month>();
        listMonths.add(month2);
        for (Month month : listMonths) {
            hashSetMonths.add(month);
        }

        System.out.println("Ahora printamos con HashSet y el mes de febrero no nos lo printará");
        System.out.println(hashSetMonths);
        System.out.println();
        System.out.println("Ahora listamos la lista con iterador");
         printListIterator(listMonths);



    }
    private static void printList (ArrayList <Month> listMonths){

        int i = 0;

        for(i=0;i<listMonths.size();i++) {
            System.out.println(listMonths.get(i).getName());
        }

    }

    private static void printListIterator (ArrayList<Month>listMonths) {

        Iterator it = listMonths.iterator();

        while(it.hasNext())
            System.out.println(it.next());

    }
}
