package chats;

import java.util.List;

public class JustMeChat implements Chat {
    private Korisnik korisnik;
    private List<String> poruke;

    public JustMeChat(Korisnik korisnik){
        this.korisnik = korisnik;
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        if(this.equals(korisnik)) return true;
        return false;
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        StringBuilder sb = new StringBuilder();
        sb.append(korisnik.getPrikazanoIme()).append(" ==> ").append(poruka);
    }
}
