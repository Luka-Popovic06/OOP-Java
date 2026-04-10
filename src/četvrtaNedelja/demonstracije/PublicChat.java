package četvrtaNedelja.demonstracije;

import java.util.ArrayList;
import java.util.List;

public class PublicChat implements Chat {
    private List<String> poruke = new ArrayList<>();

    public PublicChat(){}

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        return true;
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        StringBuilder sb = new StringBuilder();
        sb.append(korisnik.getPrikazanoIme()).append(" ==> ").append(poruka);

        poruke.add(sb.toString());//Ovde radimo toString() metodu zato sto nam treba da se lista ispuni sa Stringovima a ne sa poljima tipa StringBuilder
    }
}
