package četvrtaNedelja.demonstracije;

import java.util.ArrayList;
import java.util.List;

public class KorisnikManager {
    /// Kad nam treba jedna instanca koja vazi za sve:
    ///1.Pojenta sa singeltonom je da imamo jednu instancu koja vazi za ceo program
    private List<Korisnik> korisnici;
    private static KorisnikManager instance;///2.PRAVIMO TU JEDNU INSTANCU

    /// 3.Konstruktor moramo da ga setujemo na private;
    /// zato sto ne zelimo da mu iko pristupi
    private KorisnikManager(){
        this.korisnici = new ArrayList<>();
    }

    /// 4.Funkcija za getovanje Instance
    public static KorisnikManager getInstance() {
        /// 5.Setujemo instancu
        if(instance == null){
            instance = new KorisnikManager();//AKO NE POSTOJI NAPRAVI INSTANCU
        }
        return instance;//AKO POSTOJI VRATI INSTACU
    }

    /// /////////////////////////////////////////////////////////

    /// Nemam nalog
    public boolean registracija(String prikazanoIme, String korisnickoIme,String lozinka1,String lozinka2){

        //1.Ako su iste lozinke
        if(!lozinka1.equals(lozinka2)) return false;

        //2.Da li ne postoji korisnik sa isti imenom
        for(Korisnik k : korisnici){
            if(k.getKorisnickoIme().equals(korisnickoIme)) return false;
        }

        //3.Da li lozinka ima 8 karaktera
        if(lozinka1.length()<8) return false;

        //4.Da li popstoji bar jedan broj u okviru lozinke
        boolean flag1 = false;
        for(char c : lozinka1.toCharArray()){
            if(c >= '0' && c <= '9'){
                flag1 = true;
                break;
            }
        }

        //5.da li sadrzi Mala i velika slova
        boolean flag2 = false;
        for (char c : lozinka1.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                flag2 = true;
                break;
            }
        }

        boolean flag3 = false;
        for (char c : lozinka1.toCharArray()){
            if(c >= 'A' && c <= 'Z') {
                flag3 = true;
                break;
            }
        }


       if(flag1 && flag2 && flag3) {
           Korisnik k1 = new Korisnik(prikazanoIme,korisnickoIme,lozinka1);
           korisnici.add(k1);
           return true;
       }
       return false;

    }




    /// Imam vec nalog
    public Korisnik prijava(String ime,String korisnickoIme,String lozinka){

        for(Korisnik k : korisnici){
            if(k.getKorisnickoIme().equals(korisnickoIme) && k.getLozinka().equals(lozinka)){
                return k;
            }
        }
        return new Korisnik(ime, korisnickoIme,lozinka);
    }

    public List<Korisnik> getKorisnici() {
        return korisnici;
    }
}
