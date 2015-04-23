package stringsort_lexiko;

import verkettete_liste.*;

public class stringsort_lexiko_main {

    static String[] data = {"Bauausführung", "Steuer", "Staatsbesitz", "Theologe", "Museumsinsel", "Kulturbesitz", "Ortschaft", "Zukunft"};
    static liste mainList = new liste();
    static stringcompare stg = new stringcompare();

    public static void main(String[] args) {

        mainList.append(data[0]);
        mainList.toFirst();
        
        for (int i = 1; i < data.length; i++) {
            
            mainList.toFirst();
            
            while((mainList.getObject() != null) && stg.compareStrings((String)mainList.getObject(), data[i]) == 0) {
                
                mainList.next();
                
            }
            
            if (mainList.getObject() != null) {
                mainList.insert(data[i]);
            } else {
                mainList.append(data[i]);
            }
            
        }
        
        mainList.toFirst();
        while(mainList.getObject() != null) {
            System.out.println(mainList.getObject());
            mainList.next();
        }
        
    }

}
