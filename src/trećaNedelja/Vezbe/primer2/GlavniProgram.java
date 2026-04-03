package trećaNedelja.Vezbe.primer2;

import java.util.Scanner;

public class GlavniProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ime;
        String prezime;
        String ulica;
        int broj;
        System.out.println("Unesite ime:");
       ime=sc.nextLine();
        System.out.println("Unesite prezime:");
       prezime=sc.nextLine();
        System.out.println("Unesite ulicu:");
        ulica = sc.nextLine();
        System.out.println("Unesite br.");
        broj = sc.nextInt();

        //System.out.println(ime +" "+prezime+" "+ulica+" "+broj);

        Adresa adresa = new Adresa(ulica,broj);
        System.out.println(adresa);
        Osoba osoba1 = new Osoba(ime,prezime,adresa);//ovde smo umesto adrese mogli staviti //new Adresa()
        System.out.println(osoba1);

        ///Ako hocu osobu iz nekog drugog paketa:
        //moramo da napravimo tacnu rutu
        trećaNedelja.Vezbe.primer1.Osoba o2=new  trećaNedelja.Vezbe.primer1.Osoba("luka","popovic","123Lu");
        System.out.println(o2);

        Osoba o3 = new Osoba("jon","bon",new Adresa("Kralja MK.",67));

        System.out.println(BrojOsoba.getBrojOsoba());
    }
}
