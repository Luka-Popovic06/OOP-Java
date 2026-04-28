package rmdbPlatform;

import java.util.List;

public class Korisnik {
    private String korisnickoIme;
    private boolean anoniman;
    private List<Preporuka> preporuke;

    public Korisnik(String korisnickoIme, boolean anoniman){
        this.korisnickoIme = korisnickoIme;
        this.anoniman = anoniman;
    }

    public void preporuci(Film film, List<Korisnik> korisnici){
        for (Korisnik k : korisnici){
            Preporuka preporuka = new Preporuka(film,this,k);
            preporuke.add(preporuka);
        }
    }
    public void dajMisljenje(Oceni oceni, double ocena, String komentar){
        oceni.ostaviRecenziju(ocena,komentar,this);
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public boolean isAnoniman() {
        return anoniman;
    }

    public void setAnoniman(boolean anoniman) {
        this.anoniman = anoniman;
    }

    public List<Preporuka> getPreporuke() {
        return preporuke;
    }

    public void setPreporuke(List<Preporuka> preporuke) {
        this.preporuke = preporuke;
    }

    @Override
    public boolean equals(Object obj) {
        Korisnik k = (Korisnik) obj;

        return this.equals(k);
    }
}
