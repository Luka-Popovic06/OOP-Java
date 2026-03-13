package Stringovi;

public class PoredjenjeStringova {
    public static void main(String[] args){
        /// String pool
        // String Pool je posebna memorijska oblast gde Java čuva
        //jedinstvene String objekte kako bi štedela memoriju i ubrzala rad programa.

        String str1 = "string1";//ista lokacija
        String str2 = "string1";//ista lokacija

        //Ova dva stringa pokazuju na istu mem.lokaciju
        //String ne pravi opet nov text u mem. lok. nego pretrazi da li vec ima isti text
        //ako postoji on samo prespoji novu promenljivu na tu lokaciju

        String str3 = "string 2 lol";//razlicita lokacija

        ///Memory heap
        /*Heap memorija je deo memorije gde se čuvaju objekti i instance klasa tokom
        izvršavanja programa.Sve što napraviš pomoću new ide u Heap memoriju.*/
        //Koristimo konstruktor
        String str4 = new String("string1");


        /// equals poredjenje (vrednost)
        //Gleda vrednosti unutar samih stringova
        boolean equals1 = str1.equals(str2);//true
        boolean equals2 = str2.equals(str4);//true ; ovo je tacno zato sto ne gleda referencu; nego samo vrednost
        boolean equals3 = str1.equals(str3);//false
        System.out.println(equals1);
        System.out.println(equals2);
        System.out.println(equals3);
        System.out.println();

        /// == poredjenje (referenci)
        boolean equals4 = str1 == str2;
        boolean equals5 = str1 == str3;
        boolean equals6 = str1 == str4;//Ovo ce biti false posto se sad ide preko reference;

        System.out.println(equals4);
        System.out.println(equals6);
        System.out.println(equals5);
    }
}
