package drugaNedelja.Vezbe2.nabrojiviTipoviPodataka;

public class MainProgram {
    public static void main(String[] args){
        UspehUSkoli prosek = UspehUSkoli.ODLICAN;
        System.out.println(prosek);
        String text = "Koliko7je9sati";
        String[] result = text.split("\\d");//da ga deli kad naidje na broj
        for (String rec : result){
            System.out.printf(rec + ", ");
        }
        System.out.println();
        int[][] numbers = {
                {1,2,3},
                {4,5,6}
        };
        for (int[]red : numbers){
            for (int br : red){
                System.out.print(br + " ");
            }
            System.out.println();
        }
    }
}
