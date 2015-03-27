package binaere_suche;

import java.util.Scanner;

public class binaere_suche_main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        binaere_suche bn1 = new binaere_suche();

        int[] derp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Bitte gesuchtes Element eingeben.");
        int x = sc.nextInt();
        System.out.println("Gesuchtes Element " + x + " gefunden bei Array index: " + bn1.BinarySearch(x, derp));

        sc.close();
    }

}
