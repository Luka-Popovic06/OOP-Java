package drugaNedelja.Stringovi;

import java.util.Arrays;

public class StringMetode {
    public static void main(String[] args){
        String s = " Dobar Dan ";

        /// 1. length
        System.out.println(s.length());

        /// 2.trim
        //služi da ukloni prazne razmake (space) sa početka i kraja stringa.
        String tr = s.trim();
        System.out.println(tr);

        /// 3.substring [ e1 , e2 )
        //služi da izvuče deo teksta (podstring) iz nekog String-a.
        //Uzima tekst od tog indeksa do kraja stringa ili do granicnika.

        String sub = tr.substring(0,5);
        String sub1 = new String(tr.substring(5));
        System.out.println(sub);

        /// 4.startsWith / endsWith
        // startsWith ==> vraća true ako string počinje sa "nekiTekst"
        // endsWith ==> vraća true ako string zavrsava sa "nekiTekst"
        boolean v1 = tr.startsWith("Dobar");//true
        boolean v2 = tr.endsWith("Dan");//true
        System.out.println(v1+ " " + v2);

        /// 5. toLowerCase / toUpperCase
        //služe da promene sva slova u stringu u mala ili velika slova.
        System.out.println(tr.toUpperCase());
        System.out.println(tr.toLowerCase());

        /// 6. contains
        //služi da proveri da li string sadrži neki podstring.
        //Vraca boolean = true
        System.out.println(tr.contains("Dobar"));

        /// 7. indexOf
        //služi da pronađe poziciju prvog pojavljivanja određenog karaktera ili podstringa u stringu.
        System.out.println(tr.indexOf("D"));//=> 0

        /// 8. charAt(pozicija)
        //služi da dohvati karakter na određenoj poziciji (indeksu) u stringu.
        System.out.println(tr.charAt(0));//=> D

        /// 9. StringBuilder + append(reckoju dodajemo) + insert(pozicija, vrednost koju dodajemo)
        //omogućava da menjaš isti objekat bez pravljenja novih.
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World").append(" a " + tr.length());
        sb.insert(7,"LOL");
        System.out.println(sb);

        /// 10. Integer.parseInt( str --> int)
        //Pretvara string u integer
        int x = Integer.parseInt("123");
        System.out.println("Broj: "+ (x + 7));

        /// 11. split
        //služi da podeli string na više delova i vrati ih kao niz
        String stri = "Luka smeker";
        String[] niz = stri.split(" ");
        System.out.println(Arrays.toString(niz));
        for (String red : niz){
            System.out.printf(red+" ");
        }
        System.out.println();

        /// 12. replace
        //služi da zameni jedan karakter ili deo teksta drugim u stringu.
        String text10 = "Marko je student Racunarskog Fakulteta.";
        String newText = text10.replace("Racunarskog Fakulteta","Raf-a");
        System.out.println(newText);


    }

}
