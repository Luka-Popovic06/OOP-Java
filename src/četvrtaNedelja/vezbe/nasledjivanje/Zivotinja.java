package četvrtaNedelja.vezbe.nasledjivanje;

public class Zivotinja {
    private String vrsta;
    public Zivotinja(){
        this.vrsta = "Nepoznata";
    };
    public Zivotinja(String vrsta){
        this.vrsta = vrsta;
    }

    public String getVrsta(){
        return this.vrsta;
    }
    public void setVrsta(String vrsta){
        this.vrsta = vrsta;
    }

    @Override
    public String toString(){
        return String.format("Vrsta životinje: %s",vrsta);
    }

}
