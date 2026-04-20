package chats;

import java.util.ArrayList;
import java.util.List;

public class Logovanje {
    private List<Korisnik> registrovaniKorisnici =  new ArrayList<>();
    private static Logovanje instance;

    //U Singelton funkciji je konstruktor potreban ali je private
    private Logovanje(){}

    public static Logovanje getInstance() {
        if(instance == null){
            instance = new Logovanje();
        }
        return instance;
    }

    //Kad ne postoji u sistemu pa treba da se napravi
    public boolean registracija(String prikazanoIme,String korsinickoIme,String lozinka1,String lozinka2){
        if(!lozinka1.equals(lozinka2)) return false;

        for (Korisnik k : registrovaniKorisnici){
            if(k.getKorisnickoIme().equals(korsinickoIme)) return false;
        }

        if(lozinka1.length() < 8) return false;


        char[] lozinka = lozinka1.toCharArray();
        boolean flag1=false;
        for (char c : lozinka){
            if(c >= 'a' && c <= 'z') flag1 = true;
        }
        boolean flag2=false;
        for (char c : lozinka){
            if(c >= 'A' && c <= 'Z') flag2 = true;
        }
        boolean flag3=false;
        for (char c : lozinka){
            if(c >= '0' && c <= '9') return flag3 = true;
        }

        if(flag1 && flag2 && flag3) {
            Korisnik korisnik = new Korisnik(prikazanoIme,korsinickoIme,lozinka1);
            registrovaniKorisnici.add(korisnik);
            return true;
        }
        else return false;
    }

    //Kada vec ima nalog //pa treba da se prijavi na njega
    public Korisnik prijava(String korisnickoIme,String lozinka){
        for(Korisnik k : registrovaniKorisnici){
            if(k.getKorisnickoIme().equals(korisnickoIme) && k.getLozinka().equals(lozinka)){
                return k;
            }
        }
        return new Korisnik(korisnickoIme,korisnickoIme,lozinka);

    }


}
