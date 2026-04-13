package četvrtaNedelja.demonstracije;

public class ChatApp {
    public static void main(String[] args){

        KorisnikManager manager = KorisnikManager.getInstance();
        manager.registracija("Luka","LK","aaB1234","aaB1234");
        manager.registracija("Nikola","Ni","bbN567","bbN567");
        manager.registracija("Mitar","MI","nnB9008","nnB9008");
        manager.registracija("Boban","Bo","kkI56700","kkI56700");
        manager.registracija("Petar","PI","Loo1233","Loo1233");

        Korisnik k1 = manager.prijava("Luka","LK","aaB1234");
        Korisnik k2 = manager.prijava("kalu","Ni","bbN567");
        Korisnik k3 =manager.prijava("Boban","MI","nnB9008");
        Korisnik k4 =manager.prijava("Pera","Bo","kkI56700");
        Korisnik k5 =manager.prijava("Zeka","PI","Loo1233");

        /// 1.Prvo smo dodali korisnika u chat
        JustMeChat jmc1 = new JustMeChat(k1);
        /// pa potom moze da napise poruku
        k1.napisiPoruku(jmc1,"lOL KOLIKO JE SATI");

        JustMeChat jmc2 = new JustMeChat(k2);
        k2.napisiPoruku(jmc2,"King k2 pise");

        PublicChat pc1 = new PublicChat();
        k5.napisiPoruku(pc1,"Luk je zdrav k5 pubCh");
        PublicChat pc2 = new PublicChat();
        k4.napisiPoruku(pc2,"Koliko je sati");

        GroupChat g1 = new GroupChat();//pravim chat
        g1.dodajUGrupu(k3);//dodajem korisnika u grupu
        k3.napisiPoruku(g1,"Grupni chat k3");//i on sada moe da pise u grupi

        GroupChat g2 = new GroupChat();
        g2.dodajUGrupu(k2);
        k2.napisiPoruku(g2,"grupa chat lol ");

        PrivateChat private1 = new PrivateChat(k1,k2);
        k1.napisiPoruku(private1,"Gde si");
        k2.napisiPoruku(private1,"Evome");
        k1.napisiPoruku(private1,"za kolko dolazis");

        PrivateChat private2 = new PrivateChat(k2,k3);
        k3.napisiPoruku(private2,"Koliko je sati");
        k2.napisiPoruku(private2,"09:04");





    }
}
