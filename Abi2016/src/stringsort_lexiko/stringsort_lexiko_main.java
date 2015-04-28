package stringsort_lexiko;

import verkettete_liste.*;

public class stringsort_lexiko_main {

    static String[] data = {"Bauausführung", "Steuer", "Staatsbesitz", "Theologe", "Museumsinsel", "Kulturbesitz", "Ortschaft", "Zukunft"};
    static liste mainList = new liste();
    static stringcompare stg = new stringcompare();

    public static void main(String[] args) {

        // Erstes Element als Startpunkt in die Liste einspeichern
        mainList.append(data[0]);
        mainList.toFirst();
        
        // Durchlaufen des Arrays mit den Input-Daten 
        for (int i = 1; i < data.length; i++) {
            
            // Mit jedem Durchlauf wieder an den Anfang springen
            mainList.toFirst();
            
            // Liste bis zu der Stelle an der der Input eingefügt werden muss durchlaufen
            while((mainList.getObject() != null) && stg.compareStrings((String)mainList.getObject(), data[i]) == 0) {
                
                mainList.next();
                
            }
            
            // Wenn Objekt mitten in der Liste, einfach einfügen
            // Wenn Ende der Liste Objekt an Listenende anfügen.
            if (mainList.getObject() != null) {
                mainList.insert(data[i]);
            } else {
                mainList.append(data[i]);
            }
            
        }
        
        // Schleife zum Ausgeben der Fertig sortierten Liste.
        mainList.toFirst();
        while(mainList.getObject() != null) {
            System.out.println(mainList.getObject());
            mainList.next();
        }
        
    }

}
