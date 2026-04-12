package četvrtaNedelja.demonstracije;

import java.util.Objects;

public class Korisnik {
    private String prikazanoIme;
    private String korisnickoIme;
    private String lozinka;

    public Korisnik(String ime,String korisnickoIme,String lozinka){
        this.prikazanoIme = ime;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public void napisiPoruku(Chat chat, String poruka){
       if(chat.mozeNapisatiPoruku(this)){
           chat.dodajPoruku(this,poruka);
       }
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public String getPrikazanoIme() {
        return prikazanoIme;
    }

    @Override
    public boolean equals(Object obj) {
        Korisnik k = (Korisnik) obj;

        return this.korisnickoIme.equals(k.korisnickoIme) && this.prikazanoIme.equals(k.prikazanoIme) && this.lozinka.equals(k.lozinka);

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(korisnickoIme);
    }
}
