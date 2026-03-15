package drugaNedelja.Demonstracije2;

import java.util.Scanner;

public class Zadtci1 {
    //izracunati faktorijal broj(int)
    //Faktorijal broja je matematička operacija koja znači da pomnožiš taj
    // broj sa svim pozitivnim celim brojevima manjim od njega, sve do 1.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj = scanner.nextInt();
        int rezultata = 1;
        for(int i = 1; i <= broj; i++ ){
            rezultata *= i;
        }
        System.out.println(rezultata);
    }
}
