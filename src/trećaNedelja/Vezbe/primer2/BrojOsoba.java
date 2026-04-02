package trećaNedelja.Vezbe.primer2;

public class BrojOsoba {
    private static int brojOsoba = 0;
    /// stavljamo STATIC da se vrednosti ne bi menjale od objekta do objekta
    /// Ovako ova vrednost i ove metode vaze za sve objekte
    public static void povecajBrojOsoba(){
        brojOsoba++;
    }

    public static int getBrojOsoba(){
        return brojOsoba;
    }
}
