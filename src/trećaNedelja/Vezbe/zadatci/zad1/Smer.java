package trećaNedelja.Vezbe.zadatci.zad1;

public class Smer {
    private String naziv;
    private String sifra;

    public Smer(String naziv,String sifra){
        this.naziv = naziv;
        this.sifra = sifra;
    }

    public void setNaziv(String newNaziv){
        this.naziv = newNaziv;
    }
    public void setSifra(String newSifra){
        this.sifra = sifra;
    }

    public String getNaziv(){
        return naziv;
    }
    public String getSifra(){
        return sifra;
    }
    @Override
    public String toString(){
        return "[Naziv smer: " + naziv + ", Sifra smer: " + sifra + "]";
    }
}
