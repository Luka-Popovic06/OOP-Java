package prvaNedelja;

public class MathBiblioteka {
    public static void main(String[] args){
        double r = 4.2;

        final double PI = 3.14;/// Kada Napisemo "final" => to govori racunaru da ne moze da se menja vrednost
        ///  PI = 3.15 ==>OVO NE MOZE IZBACICE GRESKU ZBOG "final"
        double obim = 2 * r * Math.PI;//OVAKO IMPLEMENTIRAMO BIBLIOTEKU
        double povrsina = Math.pow(r, 2) * Math.PI;
        //pow => je za kvadrat (broj_koji_stepenujemo, na_koji_stepen_dizemo)

        System.out.println(obim);
        System.out.println(povrsina);

        System.out.println(Math.max(10,3));///ispisuje veci broj
        System.out.println(Math.min(10,3));///daje manji broj
        System.out.println(Math.sqrt(4));///daje koren nekog broja
        System.out.println(Math.abs(-100));///absolutna vrednost
        System.out.println(Math.random() * 10);///za random broj izmedju 0 - 10
        /// da zaokruzimo na pr. 3 decimale:
        //Koristi se printf (souf)
        System.out.printf("Broj zaokruzen na 3 dec je : %.3f \n", obim);;
    }
}
