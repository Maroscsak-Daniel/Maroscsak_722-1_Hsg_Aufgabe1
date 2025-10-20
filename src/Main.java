import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] noten = {84, 29, 57, 38, 73, 99};
        NotenSystem allenoten = new NotenSystem(noten);
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(allenoten.nichtAusreichendeNoten()));
        System.out.println("Durchschnitt: " + allenoten.durchschnitt());
        System.out.println("Abgerundete Noten: " + Arrays.toString(allenoten.abgerundeteNoten()));
        System.out.println("Maximale abgerundete Note: " + allenoten.maximaleAbgerundeteNote());
    }
}
