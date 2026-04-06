package trećaNedelja.Vezbe.zadatci.zad1;

import java.util.Random;

public class Student {
    private int id;
    private String ime;
    private String prezime;
    private double prosek;
    private Smer smer;

    private static int BrojacObjekata = 0;
    private static final Random RANDOM = new Random();
    public static final double PROSEK_ZA_NAGRADU = 9.0;

    public Student(int id,String ime,String prezime,double prosek,Smer smer){
        this.id = ++BrojacObjekata;
        this.ime = ime;
        this.prezime = prezime;
        //(Math.random() * 5)+6
        this.prosek = (RANDOM.nextDouble() * 4) + 6;//6 - 10
        this.smer = smer;
    }

    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public int getId(){
        return id;
    }

    public double getProsek() {
        return prosek;
    }

    public Smer getSmer() {
        return smer;
    }

    public void setIme(String ime){
        this.ime = ime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    public void setSmer(Smer smer) {
        this.smer = smer;
    }

    @Override
    public String toString(){
        return String.format("Broj indeksa: %d %s %s - Prosek: %.2f %s", id, ime, prezime, prosek, smer);
    }

    public boolean dobijaNagradu(){
        return prosek >= PROSEK_ZA_NAGRADU;
    }

}
