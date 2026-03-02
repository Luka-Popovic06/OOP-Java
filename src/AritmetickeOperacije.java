public class AritmetickeOperacije {
    public static void main(String[] args) {
        /// Sabiranje i cake:
        int a = 10, b = 2;
        System.out.println("Los rezultata je: " +a+b); //102 ==> zbog texta pre racunanja sve gleda kao string
        //da bi se ovo gore popravilo stavljamo zagrade ()
        System.out.println("Pravi rezultat je: " + (a+b));
        System.out.println("Oduzimanje: "+ (a-b));
        System.out.println("Mnozenje: "+ (a*b));
        System.out.println("Deljenje: "+ (a/b));

    }

}
