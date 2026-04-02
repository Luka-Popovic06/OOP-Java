package trećaNedelja.Vezbe.primer2;

public class Adresa {
    private String ulica;
    private int broj;

    public Adresa(String ulica,int br){
        this.ulica = ulica;
        this.broj = br;
    }

    public String getUlica(){
        return ulica;
    }

    public int getBroj() {
        return broj;
    }

    public void setUlica(String ulica){
        this.ulica = ulica;
    }
    public void setBroj(int br){
        this.broj = br;
    }

    @Override
    public String toString(){
        return "---"+ulica+" "+broj+"---";
    }
}
