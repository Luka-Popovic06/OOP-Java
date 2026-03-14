package drugaNedelja;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/*Ulazni file sadrzi podatke o studentima,
* odvojene zarezom: Ime Prezime, godina/broj smer, ukupan broj bodova
* PR: Marko Markovic, 2026/120 RI, 90
* Podatci se ucitavaju iz ulaznog text fajla
* Svaka linija fajla sadrzi podatke o jednom studentu
* Izdvojiti sve studente koji su polozili ispit(51 >=)
* Za studente koji su polozili potrebno je kreirati novi izlazni fajl => "polozili.txt"
* Format pod. u tom fajlu:
* Broj index-a - Prezime Ime (poeni)*/
public class ObradaRezultata {
    public static void main(String[] args){
        /// Ovaj deo koda u Java služi da kreira objekte koji predstavljaju fajlove u Javi,
        File ulazniFile = new File("./src/p.txt");
        File izlazniFile = new File("polozili.txt");

        try{
            Scanner sc = new Scanner(ulazniFile);
            PrintWriter pw = new PrintWriter(izlazniFile);//služi za pisanje teksta u fajl ili u izlazni tok (stream) na jednostavan način

            while(sc.hasNextLine()){
                String linija = sc.nextLine();//Uzima liniju i pomera pointer na sledecu liniju
                String[] niz = linija.split(",");
                int brBodova = Integer.parseInt(niz[2].trim());
                String[] imePrezime = niz[0].split(" ");
                String ime = imePrezime[0];
                String prezime = imePrezime[1];
                String brIndeksa = niz[1].trim();
                if(brBodova > 51){
                    StringBuilder sb = new StringBuilder();
                    sb.append(brIndeksa).append(" - ").append(prezime).append(" ").append(ime).append(" ").append(brBodova);

                    pw.println(sb);
                }
            }
            sc.close();
            pw.close();
        }catch(Exception e){
            System.out.println("Greska pri radu sa fajlom");
            e.printStackTrace();
        }
    }

}
