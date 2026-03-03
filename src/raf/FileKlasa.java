package raf;

import java.io.File;
import java.util.Scanner;

public class FileKlasa {
    public static void main(String[] args) {
        /// Čitanje iz tekstualnog fajla
        //imamo try/catch blok; sluzi da ne bi doslo do pucanja koda
        //ako ne postoji fajl on ce izbaciti natpis da ne postoji
        try{
            Scanner scanner = new Scanner(new File("file.txt"));
        }catch (Exception e){
            System.out.println("Fajl nije pronadjen");
        }

        System.out.println("Nastavio je izvrsavanje....");
    }
}
