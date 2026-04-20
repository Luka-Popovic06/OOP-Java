package chats;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Korisnik {
    private String prikazanoIme;
    private String korisnickoIme;
    private String lozinka;

    public Korisnik(String prikazanoIme,String korisnickoIme,String lozinka){
        this.prikazanoIme = prikazanoIme;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public void napisiPoruku(Chat chat,String poruka){
        if(chat.mozeNapisatiPoruku(this)){
            if(chat instanceof PrivateChat chat1){
                chat1.dodajPoruku(this,poruka);
            }else if(chat instanceof GroupChat chat2){
                chat2.dodajPoruku(this,poruka);
            }else if(chat instanceof PublicChat chat3){
                chat3.getPoruke().add(poruka);
            }
        }else{
            try{
                PrintWriter pw = new PrintWriter(new FileWriter("loselogovanje.txt",true));
                StringBuilder sb = new StringBuilder();
                sb.append(korisnickoIme).append(" =>>").append(poruka);
                pw.println(sb);
                pw.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public String getPrikazanoIme() {
        return prikazanoIme;
    }

    public void setPrikazanoIme(String prikazanoIme) {
        this.prikazanoIme = prikazanoIme;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public boolean equals(Object obj) {
        Korisnik korisnik = (Korisnik) obj;
        return this.korisnickoIme.equals(korisnik.korisnickoIme);
    }
}
