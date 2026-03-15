package drugaNedelja.Demonstracije2;

import java.util.Arrays;

public class Nizovi {
    public static void main(String[] args){
        /// Deklaracija niza
        int[] brojevi = {1,2,3,4,5,6,7};
        String[] imena = {"Maja","Jova","Petar","Toni"};

        System.out.println("Prvi element: "+ brojevi[0]);
        //brojevi.length - kroji elemente u nizu
        System.out.println("Poslednji element: "+ brojevi[brojevi.length - 1]);
        System.out.println("Duzina niza: "+ brojevi.length);

        /// Ispis niza
        System.out.println(Arrays.toString(brojevi));

        /// Kopiranje niza
        //Prva vrednost je niz koji kopiramo; Druga vrednost je nova velicina niza
        int[] noviNiz = Arrays.copyOf(brojevi, brojevi.length+1);
        noviNiz[noviNiz.length - 1] = 10;
        System.out.println(Arrays.toString(noviNiz));

        /// Prolazak kroz niz:
        //For petlja:
        for(int i = 0;i <= noviNiz.length-1;i++){
            System.out.println(noviNiz[i]);
        }
        //For-each petlja
        for (int br : brojevi){
            System.out.println(br);
        }

        System.out.println();

        /// Dvodimenzionalni niz (MATRICE)
        //RED -> KOLONAE
        int[][] matrica={
                {1,2,3,4},
                {5,6,7,8}
        };
        //Ispisivanje matrice
        for(int[] red : matrica){
            for (int element : red){
                System.out.printf(element + "\t");
            }
            System.out.println();
        }

        /// Split stringa u nizu
        //Split metoda nam deli string po nekom limiteru(granicniku)

        String str = "Luka, Marko, Boban";
        String[] imena2 = str.split(",");

        System.out.println(Arrays.toString(imena2));

        /// Zadatak:
        /*Naci ukupan br proizvoda
        * Naci dan kad je najvise proizvoda prodato
        * Izracunati prosecnu prodaju po danu*/
        int[] prodaja = {4,2,70,23,100,3,9};
        int ukupnaProdaja=0;
        int dan = 0;
        for (int br : prodaja){
            ukupnaProdaja+=br;
        }
        int curr = 0 ;
        for (int br : prodaja){
             curr = curr < br ? br : curr;
        }
        for (int br : prodaja){
            dan++;
            if(br == curr) break;
        }

        System.out.println("Ukupna prodaja: " + ukupnaProdaja + " Dan: "+ dan + " Prosek: "+((double)ukupnaProdaja/prodaja.length));

    }

}
