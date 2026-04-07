package četvrtaNedelja.vezbe.nasledjivanje;

public class Pas extends Zivotinja{
    private String ime;
    private String rasa;

    public Pas(){
        super("Pas");
        this.ime = "Nepoznato";
        this.rasa = "bernardinac";
    }
    public Pas(String ime){
        super("Pas");
        this.ime = ime;
        this.rasa = "bernardinac";
    }

    public Pas(String ime,String rasa){
        super("Pas");
        this.ime = ime;
        this.rasa = rasa;
    }

    public String getIme() {
        return ime;
    }

    public String getRasa() {
        return rasa;
    }

    public void setIme(String ime){
        this.ime = ime;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public String toString(){
        return super.toString() + " Rasa: " + this.rasa +" Ime: "+this.ime;
    }
}
