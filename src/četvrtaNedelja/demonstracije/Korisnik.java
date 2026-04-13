package četvrtaNedelja.demonstracije;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Objects;

public class Korisnik {
    private String prikazanoIme;
    private String korisnickoIme;
    private String lozinka;

    public Korisnik(String ime,String korisnickoIme,String lozinka){
        this.prikazanoIme = ime;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public void neuspelePoruke(Chat chat,Korisnik k, String poruka){
        StringBuilder sb = new StringBuilder();
        sb.append(k.korisnickoIme).append(", poruka:").append(poruka);
        sb.append("[ ");
        if(chat instanceof GroupChat chat1){
            for (Korisnik k1 : chat1.getGrupa()){
                sb.append(k1.getKorisnickoIme()).append("\n");
            }
        }else if(chat instanceof PrivateChat chat2){
            sb.append(chat2.getK1().getKorisnickoIme()).append(", ").append(chat2.getK2().getKorisnickoIme());
        }else if(chat instanceof PublicChat chat3){
            for (Korisnik k2 : KorisnikManager.getInstance().getKorisnici() ){//uzima se instanca zato sto u njega mogu svi da pisu
                sb.append(k2.getKorisnickoIme()).append("\n");
            }
        }
        sb.append("]");

        try{
            PrintWriter pw = new PrintWriter(new FileWriter("neuspelikorisnici.txt", true));
            pw.println(sb.toString());
            pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void napisiPoruku(Chat chat, String poruka){
       if(chat.mozeNapisatiPoruku(this)){
           chat.dodajPoruku(this,poruka);
       }else {
           neuspelePoruke(chat,this,poruka);
       }
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public String getPrikazanoIme() {
        return prikazanoIme;
    }

    public String getLozinka(){
        return lozinka;
    }

    @Override
    public boolean equals(Object obj) {
        Korisnik k = (Korisnik) obj;

        return this.korisnickoIme.equals(k.korisnickoIme) && this.prikazanoIme.equals(k.prikazanoIme) && this.lozinka.equals(k.lozinka);

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(korisnickoIme);
    }
}
