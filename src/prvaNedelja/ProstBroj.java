package prvaNedelja;

import java.util.Scanner;//importujemo class

public class ProstBroj {
    public static void main(String[] args) {
        //ubacujemo class // importujemo je
        //Scanner class sluzi za unos podataka
        Scanner scanner = new Scanner(System.in);//in == input/unos
        System.out.println("Unesite broj: ");

        int broj = scanner.nextInt();/// ceka da mu mi unesemo broj
        System.out.println(broj);

        boolean prost = true;
        if(broj <= 1){
            prost = false;
        }else {
            /// da bi neki broj bio prost, gledamo sve brojeve od 2 do njegovog korena
           /// da bi broj bio prost mora biti podeljen sa 1 i sa samim sobom
           /// najmanji prost broj je 2
            for (int i = 2; i <= Math.sqrt(broj); i++){
                if(broj % i == 0){
                    prost = false;
                    break;
                }
            }
        }

        if(prost){
            System.out.println("Broj je prost");
        }else {
            System.out.println("Broj nije prost");
        }
    }

}
