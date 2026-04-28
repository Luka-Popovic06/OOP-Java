package rmdbPlatform;

public class Recenzija {
    private double ocena;
    private String komentar;
    private Korisnik korisnik;

    public Recenzija(double ocena,String komentar, Korisnik korisnik){
        this.ocena = ocena;
        this.komentar = komentar;
        this.korisnik = korisnik;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public double getOcena() {
        return ocena;
    }

    public String getKomentar() {
        return komentar;
    }
}
