package drugaNedelja;

public class Grananje {
    public static void main(String[] args){
        ///IF - ELSE IF - ELSE
        int broj = 15;
        if(broj > 20){
            System.out.println("Broj "+broj+" je veci od 20");
        }else if(broj > 10){
            System.out.println("Broj "+broj+" je veci od 10");
        }else{
            System.out.println("Broj "+broj+" je 10 ili je manji od 10");
        }

        /// TERNARNI operator
        int broj2 = 10;
        String text1 = (broj2 % 2 == 0) ? "Broj je paran" : "Broj je neparan";
        System.out.println(text1);

        /// SWITCH / CASE
        int dan = 3;
        switch(dan){
            case 1:
                System.out.println("Ponedeljak");
                break;
            case 2:
                System.out.println("Utorak");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Četvratak");
                break;
            case 5:
                System.out.println("Petak");
                break;
            case 6:
                System.out.println("Subota");
                break;
            case 7:
                System.out.println("Nedelja");
                break;
            default:
                System.out.println("Lose ste uneli broj");
        }


    }
}
