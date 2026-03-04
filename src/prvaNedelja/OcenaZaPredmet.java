package prvaNedelja;

import java.util.Scanner;

public class OcenaZaPredmet {
    public static void main(String[] args){
        System.out.println("Unesi br. bodova");
        Scanner scanner = new Scanner(System.in);
        int broj = scanner.nextInt();
        Ocena ocena;
        if(broj < 51){
            ocena = Ocena.PET;
        }else if(broj < 61){
            ocena = Ocena.SEST;
        }else if(broj < 71){
            ocena = Ocena.SEDAM;
        }else if(broj < 81){
            ocena = Ocena.OSAM;
        }else if(broj < 91){
            ocena = Ocena.DEVET;
        }else if(broj <= 100){
            ocena = Ocena.DESET;
        }else{
            ocena = Ocena.PET;
        }

        System.out.println(ocena);
    }
}
