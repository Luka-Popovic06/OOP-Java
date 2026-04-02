package trećaNedelja.Vezbe.primer1;
//proces kreiranja objekta
//klasa sluzi kao kalup za obj
//ovo je sve jedan obj
//ds bi ubacili u njega neki text ili neke inf moramo da napravimo konstruktore(metode)
//koji pristupaju tim njegovim vrednostima i menjaju ih

public class Osoba {
    /// 0.ovo je kalup za objekat
    private String ime;
    private String prezime;
    private String jmbg;
    private int visina;

    public Osoba(){}//razlika po br. parametara

    /// 1.Pravi objekat(ovo je konstruktor)
    public Osoba (String ime, String prezime, String jmbg){
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        //this se odnosi na trenutnu klasu
        //ovde stavljamo vrednosti iz metoda(konstruktora) u klasu(obj)
        //pravimo new class(obj) u memoriji sa tim informacijama
    }

    public Osoba(String ime,String prezime, int visina){}//razlika po tipu

    //Osoba je metod(Konstruktor) dozvoljeno je da imam vise metoda sa raz imenom ako se razlikuju po:
    //br. ulaznih parametara
    //ili ako imaju isti br. parametara moraju da se razlikuju po tipu
    //prvi je bio kod parametara(String String String) a drugi je (String String Int)
    //to jerazlika po tipu

    /// Geteri(metoda koja čita vrednost privatnog polja.)
    /// 2.Pristupa vrednostrima u objektu

    public  String getIme(){
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    /// Seteri(metoda koja menja vrednost privatnog polja.)
    /// 3.Menja vrednosti u objektu(u napravljenom objektu)
    public void setIme(String ime){
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    /* toString je vec definisan metod klase String
      moguce je menjati vec definisan metod (detalinije drugi put) i za to se koristi anotacija @override.
      Ovo je takodie vrsta polimorfizma i naziva se overriding
      Anotacija je dodatni podatak i oznacena je simbolom @ */

    @Override
    public String toString(){
        return "Osoba:{ " +"Ime: "+ this.ime+" Prezime: "+this.prezime+"}";
    }
}
