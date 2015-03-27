package stringsorter;

public class stringsorter_main {

    public static void main(String[] args) {
        // Erzeugen des Arrays
        String[] elements = {"Hans", "Hanelore", "Peter", "Werner", "Dagobert"};
        // Set to Uppercase
        for (int i = 0; i < elements.length; i++) {
            elements[i] = elements[i].toUpperCase();
        }
        // Ausgabe
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
        //Leerzeile für besseren Überblick
        System.out.println();

        //Vergleich der ersten Buchstaben
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (((int) elements[i].charAt(0)) > (int) elements[j].charAt(0)) {
                    String tmp = elements[j];
                    elements[j] = elements[i];
                    elements[i] = tmp;
                } //wenn beide Anfangsbuchstaben gleich sind
                else if (((int) elements[i].charAt(0)) == (int) elements[j].charAt(0)) {
                    int zaehler = 1;
                    do {
                        //schleife so lange bis die Buchstaben verschieden sind:
                        //vergleich der jeweils nächsten Buchstaben
                        if (((int) elements[i].charAt(zaehler)) > (int) elements[j].charAt(zaehler)) {
                            String tmp = elements[j];
                            elements[j] = elements[i];
                            elements[i] = tmp;
                        } else if (((int) elements[i].charAt(zaehler)) == (int) elements[j].charAt(zaehler)) {
                            zaehler++;
                        }
                    } while ((((int) elements[i].charAt(zaehler)) == (int) elements[j].charAt(zaehler)));
                }

            }
        }

        //Ausgabe
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }

    }

}
