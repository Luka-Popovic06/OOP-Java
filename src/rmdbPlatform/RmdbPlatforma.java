package rmdbPlatform;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.MIN_VALUE;

public class RmdbPlatforma {
    private List<Film> filmovi = new ArrayList<>();
    private List<Korisnik> korisnici = new ArrayList<>();

    public RmdbPlatforma(){}

    public String najboljiReziser(){
        String najboljiReziser="";
        double max_ocena = MIN_VALUE;
        double ukupnaProsecnaOcena=0.00;
        double sumaOcena = 0.00;
        int brojOcena=0;
        for(Film f : filmovi){
            for(Film f2 : filmovi){
                if(f.getReziser().equals(f2.getReziser())){
                    sumaOcena += f.getProsecnaOcenaFilma();
                    brojOcena++;
                }
            }
            ukupnaProsecnaOcena=sumaOcena/brojOcena;
            if(max_ocena < ukupnaProsecnaOcena) {
                max_ocena = max_ocena < ukupnaProsecnaOcena ? ukupnaProsecnaOcena : max_ocena;
                najboljiReziser = f.getReziser();
            }
            ukupnaProsecnaOcena = 0;
            sumaOcena = 0;
            brojOcena = 0;
        }
        return najboljiReziser;
    }
    public List<Film> vratiPreporucene(Korisnik korisnik){
        List<Film> preporuke = new ArrayList<>();
        for (Preporuka p : korisnik.getPreporuke()){
            preporuke.add(p.getFilm());
        }
        return preporuke;
    }

}
