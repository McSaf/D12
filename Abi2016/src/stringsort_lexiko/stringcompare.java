package stringsort_lexiko;

public class stringcompare {

    public int compareStrings(String str1, String str2) {

        // Maximale Iterationen der For-Schleife bestimmen -> Sonst NullPointer
        int length1 = str1.length();
        int length2 = str2.length();
        int max = Math.min(length1, length2);

        char[] str1Char = str1.toLowerCase().toCharArray();
        char[] str2Char = str2.toLowerCase().toCharArray();

        // Durchlaufen der Char Arrays bis zum ende des Kürzeren Strings.
        for (int i = 0; i < max; i++) {

            // Wenn beide Buchstaben gleich sind
            if (str1Char[i] == str2Char[i]) {

                // Wird am Ende der For-Schleife Ausgeführt
                if (i == max - 1) {

                    // Da die Arrays wenn es zur Ausführung dieser Anweisungen
                    // kommt gleich sein müssen wird die letzte Unterscheidung
                    // der Arrays basierend auf der länge des Inputs gemacht.
                    if (length1 < length2) {

                        return 0;

                    } else if (length1 > length2) {

                        return 1;

                    } else {

                        System.err.println("Input is Equal");
                        return 0;

                    }

                }

                // String 2 ist vor String 1 einzuordnen
            } else if ((int) str1Char[i] > (int) str2Char[i]) {

                return 1;

                // String 1 ist vor String 2 einzuordnen
            } else if ((int) str1Char[i] < (int) str2Char[i]) {

                return 0;

            }

        }

        // Dieses Return Statement sollte eigentlich nie aufgerufen werden.
        // Endet Offensichtlich in einer Exception.
        return Integer.valueOf(null);

    }

}
