public class NotenSystem {

    private int[] allenoten;

    public NotenSystem(int[] allenoten) {
        this.allenoten = allenoten;
    }

    public int[] nichtAusreichendeNoten() {
        int count = 0;
        for (int note : allenoten) {
            if (note < 40) count++;
        }

        int[] ergebnis = new int[count];
        int index = 0;
        for (int note : allenoten) {
            if (note < 40) {
                ergebnis[index] = note;
                index++;
            }
        }
        return ergebnis;
    }

    public double durchschnitt() {
        double summe = 0;
        double ergebnis = 0;
        for (int note : allenoten) {
            summe += note;
        }
        ergebnis = summe / allenoten.length;
        return Math.round(ergebnis * 100.0) / 100.0;
    }

    public int[] abgerundeteNoten() {
        int[] ergebnis = new int[allenoten.length];
        for (int i = 0; i < allenoten.length; i++) {
            int note = allenoten[i];
            if (note >= 38) {
                int naechstesVielfaches = ((note / 5) + 1) * 5;
                if (naechstesVielfaches - note < 3) {
                    note = naechstesVielfaches;
                }
            }
            ergebnis[i] = note;
        }
        return ergebnis;
    }

    public int maximaleAbgerundeteNote() {
        int[] abgerundet = abgerundeteNoten();
        int max = abgerundet[0];
        for (int note : abgerundet) {
            if (note > max) {
                max = note;
            }
        }
        return max;
    }

    // Hauptmethode zum Testen

}

