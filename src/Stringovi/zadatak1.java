package Stringovi;
/*
* Dat je string " Ana-2001 " koji sadrzi ime i godinu rodjenja razdvojenih crticom,
* sa razmacima na pocetku i na kraju
* potrebno je ukloniti suvisne razmake
* zatim izdvojiti ime i godinu rodjenja kao posebne vrednosti
* izracunati koliko godina ima osoba
* I ispisati sve u formatu "Anna, 25*/
public class zadatak1 {
    public static void main(String[] args){
        String podatak = " Ana-2001 ";
        podatak = podatak.trim();
        String ime = podatak.substring(0,3);
        String godina = podatak.substring(4);
        int num = Integer.parseInt(godina);
        int godineOsobe = 2026 - num;
        podatak = podatak.replace("Ana-2001",ime+", "+godineOsobe);
        System.out.println(podatak);
    }

}
