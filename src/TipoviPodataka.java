public class TipoviPodataka {
    public static void main (String[] args) {
        byte byteValue = 10; // od -127 do 128 => 8 bit = binary digit
        short shortValue = 36;
        int ceoBroj = 128;

        System.out.println("Ceo broj je " + ceoBroj); //precica za ovo je "sout"
        System.out.println("Byte number is " + byteValue);

        long dugacakBroj = 10000L; //MORA DA SE STAVI NA KRAJU "L" DA BI PROGRAM ZANAO DA NIJE int NEGO long

        /// DECIMALNI BROJ:
        float pi = 3.14F; //Mora i ovde da se stavi "F" da bi znali da je float

        double decimalniBroj = 8.500;//Sad mi netreba nista na kraju zato sto je type doble

        /// Kastovanje:

        //1.Inplicitno Kastovanje:
        //Nemoram rucno ja da mu pisem da se prebaci u neki drugi tip, to on radi sam;
        //Iz manje ČAŠE u veću ČAŠU
        int x = 10;
        double y;
        y = x;
        System.out.println("Vrednost y je "+y);//10.0

        //2.Eksplicitno Kastovanje:
        double b = 1.50;
        int a = (int) b;
        System.out.println("a je "+a);/// bi ce 1 a ne 1.50 (zaokruzi na manju vrednost)

        /// Razlike izmedju dva tipa printovanja:
        System.out.println("L");//Printuje text i automacki stavlja new line - novi red
        //System.out.printf("L");//Printuje text ali ne stavlja new line - ne stavlja novi red

        /// Karakter:
        //Jedno slovo navodi se preko '' --> jednostruki navodnici
        char karakter = 'a';
        char broj = '9';//10 ne bi moglo zato sto brojevi char idu od 1 - 9
        System.out.println(broj);

        char smajli = '\u263A';
        System.out.println(smajli);

        /// String (gledam kao zicu na koju redjam karaktere):
        //Navodi se sa dvostrukim navodnicima ""

        String text = "Luka jede jabuku!";
        System.out.println(text);

        /// Za tacno ili netacno:

        boolean tacno = true;
        boolean netacno = false;

    }
}
