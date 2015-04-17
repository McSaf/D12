package verkettete_liste_doppelt;

public class verkettete_liste_doppelt_main {

    public static void main(String[] args) {
        
        liste_doppelt mainList = new liste_doppelt();
        mainList.append((String)"Hello World1");
        mainList.append((String)"Hello World2");
        mainList.append((String)"Hello World3");
        mainList.append((String)"Hello World4");
        System.out.println("Is Empty: " + mainList.isEmpty());
        System.out.println("Has Access:" + mainList.hasAccess());
        System.out.print("\n");
        System.out.println("Current List Content:");
        mainList.toFirst();
        System.out.println("Has Access: " + mainList.hasAccess());
        
        while(mainList.getObject() != null) {
            System.out.println(mainList.getObject());
            mainList.next();
        }
        
        mainList.toFirst();
        
        mainList.next();
        mainList.next();
        
        mainList.insert((String)"Hello World5");
        
        System.out.print("\n");
        System.out.println("Testing Insert: ");
        mainList.toFirst();
        
        while(mainList.getObject() != null) {
            System.out.println(mainList.getObject());
            mainList.next();
        }
        
        mainList.toFirst();
        
        mainList.next();
        mainList.next();
        
        mainList.remove();
        
        System.out.print("\n");
        System.out.println("Testing Remove: ");
        mainList.toFirst();
        
        while(mainList.getObject() != null) {
            System.out.println(mainList.getObject());
            mainList.next();
        }
        
        liste_doppelt l2 = new liste_doppelt();
        
        l2.append((String)"Hello World6");
        l2.append((String)"Hello World7");
        l2.append((String)"Hello World8");
        l2.append((String)"Hello World9");
        
        mainList.concat(l2);
        
        System.out.print("\n");
        System.out.println("Testing Concat:");
        mainList.toFirst();
        while(mainList.getObject() != null) {
            System.out.println(mainList.getObject());
            mainList.next();
        }
        
        mainList.toLast();
        System.out.println("\n" + mainList.getObject());
        mainList.previous();
        System.out.println("\n" + mainList.getObject());
        mainList.previous();
        System.out.println("\n" + mainList.getObject());
        mainList.previous();
        System.out.println("\n" + mainList.getObject());
        mainList.previous();
        System.out.println("\n" + mainList.getObject());
        mainList.previous();
        System.out.println("\n" + mainList.getObject());
        mainList.previous();
        System.out.println("\n" + mainList.getObject());
        mainList.previous();
        System.out.println("\n" + mainList.getObject());
        mainList.previous();
        System.out.println("\n" + mainList.getObject());
        mainList.previous();
        
    }
    
}
