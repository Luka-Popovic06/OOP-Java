package četvrtaNedelja.demonstracije;

import java.util.ArrayList;
import java.util.List;

public class JustMeChat implements Chat{

    private List<String> poruke;
    private Korisnik  k1;

    public JustMeChat(Korisnik k1){
        this.k1 = k1;
        this.poruke = new ArrayList<>();//mozemo i ovde da inicializujemo poruke
    }




    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        return korisnik.equals(this.k1);
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        StringBuilder sb = new StringBuilder();
        sb.append(korisnik.getKorisnickoIme()).append(" ==> ").append(poruke.add(poruka));
    }
}
