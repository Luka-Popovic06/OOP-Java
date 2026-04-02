package trećaNedelja.Vezbe.primer2;

public class Osoba {
    private String ime;
    private String prezime;
    private Adresa adresa;

    public Osoba(String a,String b,Adresa c){
        ime = a;
        prezime = b;
        adresa = c;
        BrojOsoba.povecajBrojOsoba();
    }

    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public Adresa getAdresa(){
        return adresa;
    }

    public void setIme(String newIme){
        this.ime = newIme;
    }
    public void setPrezime(String newPrezime){
        prezime = newPrezime;
    }
    public void setAdresa(Adresa newAdres){
        adresa = newAdres;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", adresa=" + adresa + //za adresu poziva Override iz class Adresa
                '}';
    }
}
