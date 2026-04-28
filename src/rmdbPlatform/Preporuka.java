package rmdbPlatform;



public class Preporuka implements Oceni {
    private Film film;
    private Recenzija recenzija;
    private Korisnik od;
    private Korisnik kome;

    public Preporuka(Film film, Korisnik od,Korisnik kome){
        this.film = film;
        this.od = od;
        this.kome = kome;
    }

    public Film getFilm() {
        return film;
    }

    @Override
    public boolean ostaviRecenziju(double ocena, String textRecenzije, Korisnik korisnik) {
       if(this.equals(korisnik)){
           if(ocena >= 1 && ocena <= 5){
               recenzija = new Recenzija(ocena,textRecenzije,korisnik);
               return true;
           }
       }
       return false;
    }

}
