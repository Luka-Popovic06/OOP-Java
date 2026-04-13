package četvrtaNedelja.demonstracije;

import java.util.ArrayList;
import java.util.List;

public class PrivateChat implements Chat{
    //Moze ovako a moze i u konstruktoru da se napravi: new ArrayList<>();
    private List<String> poruke = new ArrayList<>();
    Korisnik k1;
    Korisnik k2;
    Korisnik prethodniPosiljarac;

    public PrivateChat(Korisnik k1,Korisnik k2){
        this.k1 = k1;
        this.k2 = k2;
    };

    public Korisnik getK1() {
        return k1;
    }

    public Korisnik getK2() {
        return k2;
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
       if(korisnik.equals(k1) || korisnik.equals(k2)){
           if( korisnik.equals(k2) && poruke.isEmpty()) return false;
           // ovde se ispituje da li moze napisati poruku;
           // te je zato predhodniPosiljalac jos uvek null
           //On se dodaje nakon ispisivanja poruke
           if(prethodniPosiljarac == null) return korisnik.equals(k1);

           if(korisnik.equals(k1) && !prethodniPosiljarac.equals(k1)){
               return true;
           }else if(korisnik.equals(k2) && prethodniPosiljarac.equals(k1)){
               return  true;
           }else {
               return false;
           }
       }else{
           return false;
       }
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        this.prethodniPosiljarac = korisnik;
        poruke.add(poruka);
    }


}
