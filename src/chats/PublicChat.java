package chats;

import java.util.ArrayList;
import java.util.List;

public class PublicChat implements Chat {
    private List<String> poruke = new ArrayList<>();
    public PublicChat(){}

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        return true;
    }

    public List<String> getPoruke() {
        return poruke;
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        StringBuilder sb = new StringBuilder();
        sb.append(korisnik.getPrikazanoIme()).append(" ==> ").append(poruka);
        poruke.add(sb.toString());//Ne zaboravi da u listu moze samo type String (.toString())
    }
}
