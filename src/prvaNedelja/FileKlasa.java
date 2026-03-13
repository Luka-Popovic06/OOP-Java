package prvaNedelja;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileKlasa {
    public static void main(String[] args) {

        /// 1. Čitanje iz tekstualnog fajla
        //imamo try/catch blok; sluzi da ne bi doslo do pucanja koda
        //ako ne postoji fajl on ce izbaciti natpis da ne postoji
        try{
            /// Učitavanje fajla (selektovanje fajla)
            Scanner scanner = new Scanner(new File("file.txt"));
            /// Čitanje iz njega/Čitanje iz selektovanog fajla
            StringBuilder stringBuilder = new StringBuilder();

            //Dokle god ima novi red vrti petlju
            while (scanner.hasNextLine()){
                //Svaki put kad se izvrsi petlja on doda novu liniju u strBuilder
                stringBuilder.append(scanner.nextLine());//dodaj, nadovezi
                //.nextLine da ide na sledecu liniju

                //ovo ubacujemo da nam ne pise sve u jednom redu
                if(scanner.hasNextLine()){
                    stringBuilder.append("\n");
                }
            }
            System.out.println(stringBuilder.toString());

            scanner.close();
        }catch (Exception e){
            System.out.println("Fajl nije pronadjen");

        }

        /// 2. Pisanje u tekstualnom fajlu:
        try{
            FileWriter fw = new FileWriter("file.txt", true);
            fw.write("RAF");
            fw.write("\n");
            fw.close();
        }catch(Exception e){
            System.out.println("Greska");
        }
        System.out.println("Nastavio je izvrsavanje....");
    }
}
