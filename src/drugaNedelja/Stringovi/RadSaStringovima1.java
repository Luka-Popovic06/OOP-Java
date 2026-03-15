package drugaNedelja.Stringovi;

//String OvoNeMozeBitiPolje = "jer je van klase";

import java.util.Scanner;

public class RadSaStringovima1 {
    static String OvdeMozeBitiPolje;//ovo je globalna promenljiva
    public static void main(String[] args){
        /* U javi su Stringovi ne promenljivi (immutable) objekti klase string
        * dok su u C-u nizovi karaktera
        * Strring => ne tipican objekat*/

        OvdeMozeBitiPolje = "Boban !!!";
        System.out.println(OvdeMozeBitiPolje.charAt(1));
        System.out.println("Unesi br");
        Scanner scannerBr = new Scanner(System.in);
        int x = scannerBr.nextInt();
        System.out.println("Broj: " + (x + 9));

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime:");
        String ime = sc.nextLine();
        System.out.println("Unesite prezime:");
        String prezime = sc.nextLine();

        System.out.println(ime.trim() + ", " + prezime.trim());

        StringBuilder sb = new StringBuilder();
        sb.append("Luka").append(" !!! ").append(prezime);
        sb.insert(10," KING");
        System.out.println(sb);
        /// PRETVARANJE STRINGA TO INTEGER
        String br = "900";
        int num = Integer.parseInt(br);
        System.out.println(8+num);

        char num2 = '6';
        int num3 = num2 - '0';
        System.out.println(num3);
        /// Praksa je da se scanner zatvori
        scannerBr.close();
        sc.close();
    }
}
