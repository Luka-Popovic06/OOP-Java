package chats;

import java.util.ArrayList;
import java.util.List;

public class PrivateChat implements Chat {
    private List<String> poruke = new ArrayList<>();
    private Korisnik k1;
    private Korisnik k2;
    private Korisnik predhodniPosiljalac;

    public PrivateChat(Korisnik k1,Korisnik k2){
        this.k1 = k1;
        this.k2 = k2;
    }


    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        if(!korisnik.equals(k1) || !korisnik.equals(k2)){
            return false;
        }
        if(predhodniPosiljalac != null && predhodniPosiljalac.equals(k1) && korisnik.equals(k1)) return false;
        if(predhodniPosiljalac != null && predhodniPosiljalac.equals(k2) && korisnik.equals(k2)) return false;

        if(predhodniPosiljalac == null && !korisnik.equals(k1)) return false;

        return true;
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        predhodniPosiljalac = korisnik;
        poruke.add(poruka);
    }
}
