package rmdbPlatforma;

import java.util.List;

public class Film implements Oceni {
    private String naziv;
    private String reziser;
    private KategorijaFilma kategorijaFilma = KategorijaFilma.NEOCENJENO;
    private List<Recenzija> recenzije;
    private List<Preporuka> preporuke;
    private double prosecnaOcenaFilma;


    public Film(String naziv,String reziser){
        this.naziv = naziv;
        this.reziser = reziser;
    }

    public double getProsecnaOcenaFilma() {
        return prosecnaOcenaFilma;
    }

    @Override
    public boolean ostaviRecenziju(double ocena, String textRecenzije, Korisnik korisnik) {
        for(Recenzija r : recenzije){
            if(r.getKorisnik().equals(korisnik)) return false;
        }
        if(ocena < 1 || ocena > 5) return false;
        if(!korisnik.isAnoniman()){
            Recenzija recenzija = new Recenzija(ocena,textRecenzije, korisnik);
            recenzije.add(recenzija);
        }else {
            Recenzija recenzija = new Recenzija(ocena,textRecenzije, null);
            recenzije.add(recenzija);
        }

        double sumaOcena = 0.0;
        for(Recenzija r : recenzije){
            if(r.getKorisnik() != null){
                sumaOcena+=r.getOcena();
            }
        }
        prosecnaOcenaFilma/=sumaOcena;

        if(prosecnaOcenaFilma == 0){
            kategorijaFilma = KategorijaFilma.NEOCENJENO;
        }else if(prosecnaOcenaFilma <= 1){
            kategorijaFilma = KategorijaFilma.NOIR_KATASTROFI;
        }else if(prosecnaOcenaFilma <= 2){
            kategorijaFilma = KategorijaFilma.LOS_SCENARIJO;
        }else if(prosecnaOcenaFilma <= 3){
            kategorijaFilma = KategorijaFilma.ZLATNA_SREDINA;
        }else if(prosecnaOcenaFilma <= 4){
            kategorijaFilma = KategorijaFilma.BLOCKBUSTER_HIT;
        }else if(prosecnaOcenaFilma <= 5){
            kategorijaFilma = KategorijaFilma.MAJSTORSKO_DELO;
        }

        return true;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getReziser() {
        return reziser;
    }

    public KategorijaFilma getKategorijaFilma() {
        return kategorijaFilma;
    }

    public List<Recenzija> getRecenzije() {
        return recenzije;
    }

    public List<Preporuka> getPreporuke() {
        return preporuke;
    }
}
