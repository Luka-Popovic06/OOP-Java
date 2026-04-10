package četvrtaNedelja.demonstracije;

import java.util.ArrayList;
import java.util.List;

public class GroupChat implements Chat {
    private List<String> poruke = new ArrayList<>();
    private List<Korisnik> grupa = new ArrayList<>();
    private List<Korisnik> posiljaoci = new ArrayList<>();

    public GroupChat(){}

    public void dodajUGrupu(Korisnik korisnik){
        if(!grupa.contains(korisnik)) grupa.add(korisnik);
    }
    public void ukloniIzGrupe(Korisnik korisnik){
        grupa.remove(korisnik);
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        return grupa.contains(korisnik);
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        posiljaoci.add(korisnik);
        poruke.add(poruka);
    }
}
