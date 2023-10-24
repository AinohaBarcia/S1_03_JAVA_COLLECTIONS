package n1exercici3;


import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
				/*//hacemos juego
        //metodo para leer archivo paises
        //para leer el pais lo hacemos con while ;String[]countryText = linea.split("") => cogemos el hashMap y le ponemos lo que hay en el archivo .put(ponesPrimera posicion[0],posicion[1])=>retoran el hasMap
        //Metodo para jugar y añadir respuesta en el text
        //creamos nuevo juego (por parametros pedimos user name y el metodo de leer archivo) => y aqui escribimos el score en el archivo*/
        HashMap countriesMap = chargeFileHashMap();

        menu(countriesMap);

    }
    public static void menu (HashMap<String,String>countriesMap) {
        int eleccio;
        boolean seguir= true;
        int score =0;

        do {
            eleccio = pideInt("Quina opció vols escollir:\n0.-Sortir del joc\n1.-Començar partida\n2-Tornar a jugar");

            switch (eleccio) {

                case 0:
                    System.out.println("Has escollit sortir del joc. Adeu!");
                    seguir=false;
                    break;
                case 1:
                    score = letsPlay (pideString ("Quin es el teu nickName"), countriesMap);
                    System.out.println("Tú puntuación es de: "+score+" puntos.");

                    break;
                case 2:
                    //	playAgain()
                default:
                    System.out.println("No has escollit una opció correcta");

            }

        } while (eleccio <=2 && eleccio>0);

    }

    public static int letsPlay (String nickName, HashMap <String,String>countriesMap ) {
        String randomCountry,capital="";
        int score=0;

        for(int i=0;i<3;i++) {
            //for(int i=0;i<10;i++) {
            randomCountry=randomCountry(countriesMap);
            capital =pideString ("Dime la capital de " + randomCountry);
            if(capital.equalsIgnoreCase((countriesMap.get(randomCountry)))){
                System.out.println("Acertaste");
                score++;
            }else {
                System.out.println("Fallaste");
            }

        }
        saveScore(score,nickName);
        return score;
    }
    public static HashMap<String,String> chargeFileHashMap() {

        HashMap<String, String> countriesMap = new HashMap<String,String>();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try (Scanner scanner = new Scanner(new File("/Users/abarcia/eclipse-workspace/S1_03_COLLECTIONS/src/n1exercici3/countries.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                countriesMap.put(parts[0], parts[1]);
                //System.out.println(parts[0]+" "+parts[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();


        }finally{

            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }


        return countriesMap;
    }

    public static String randomCountry (HashMap<String,String> countriesMap) {
        String randomCountry="";

        Random generator = new Random();
        Object[] values = new Object[countriesMap.size()];

        int i = 0;
        for(Map.Entry<String,String> entry : countriesMap.entrySet()) {
            values[i++] = entry.getKey();
        }

        Object randomValue = values [generator.nextInt(values.length)];
        //System.out.println(randomValue);

        randomCountry = randomValue.toString();

        return randomCountry;
    }

    public static void saveScore (int score,String nickName) {

        FileWriter fichero = null;
        PrintWriter pw = null;

        try{

            fichero= new FileWriter("/Users/abarcia/eclipse-workspace/S1_03_COLLECTIONS/src/n1exercici3/gamers.txt");
            pw = new PrintWriter(fichero);
            for (int i = 0; i < 1; i++)
                pw.println(nickName + " "+score+" puntos") ;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }




    public static int pideInt (String mensaje) {
        Scanner input = new Scanner (System.in);
        System.out.println(mensaje);

        return input.nextInt();
    }

    public static String pideString (String mensaje) {
        Scanner input = new Scanner (System.in);
        System.out.println(mensaje);
        return input.nextLine();
    }
}


