package trećaNedelja.Vezbe.primer1;

public class OsobaGlavniKod {
    public static void main(String[] args){
        Osoba osoba1 = new Osoba();
        osoba1.setIme("Luka");
        System.out.println(osoba1);

        Osoba osoba2 = new Osoba("King","Johan","21892918892");
        osoba2.setIme("Luji");
        System.out.println(osoba2);

    }
}
