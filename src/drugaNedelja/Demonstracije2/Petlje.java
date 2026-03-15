package drugaNedelja.Demonstracije2;

public class Petlje {
    public static void main(String[] args){
        /// while
        int i = 1;
        while(i <= 5){
            //krece od 1
            System.out.println("Br. jr "+i);//prvo printuje 1
            i++;
        }

        /// do - while
        do{
            System.out.println(i);
            i++;
        }while (i < 5);

        /// for
        for(int k = 1;k <= 5; k++){
            //krece od 1
            System.out.println("FOR PETLJA: "+k);
        }

        /// FOR - EACH
        //Petlja automatski ide kroz svaki element niza.(ispisuje ga u ovom slucaju)
        int[] niz ={10,20,30,40};
        for(int br : niz){
            System.out.println(br);
        }
        /* for (tip promenljiva : kolekcija) {
            --> kod koji se izvršava za svaki element
           }
        * */
    }
}
