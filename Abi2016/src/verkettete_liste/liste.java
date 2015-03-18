package verkettete_liste;

public class liste implements liste_interface {

    eintrag first;
    eintrag aktuell;
    eintrag last;

    public liste() {

        first = null;
        last = null;
        aktuell = null;

    }

    public boolean isEmpty() {
        return first == null;
    }

    public boolean hasAccess() {
        return aktuell != null;
    }

    public void next() {

        if ((!isEmpty()) && (aktuell != null) && (aktuell != last)) {

            aktuell = aktuell.next;

        } else {

            aktuell = null;

        }

    }

    public void toFirst() {

        if (!isEmpty()) {

            aktuell = first;

        }

    }

    public void toLast() {

        if (!isEmpty()) {

            aktuell = last;

        }

    }

    public Object getObject() {

        if (hasAccess()) {
            return aktuell.data;
        } else {
            return null;
        }

    }

    public void setObject(Object pObject) {

        if (hasAccess() && (pObject != null)) {

            aktuell.data = pObject;

        }

    }

    public void append(Object pObject) {

        eintrag x = new eintrag();
        x.data = pObject;

        if (!isEmpty() && (pObject != null)) {

            last.next = x;
            last = last.next;

        } else if (isEmpty() && (pObject != null)) {

            first = x;
            last = x;
            first.next = last;

        }

    }

    public void insert(Object pObject) {

        if (hasAccess() && (pObject != null)) {

            eintrag tmp = aktuell;
            eintrag prev = null;

            toFirst();

            while (aktuell != tmp) {

                prev = aktuell;
                next();

            }

            prev.next = new eintrag();
            prev.next.data = pObject;
            prev.next.next = tmp;

        } else if (!hasAccess() && (pObject != null)) {

            eintrag x = new eintrag();
            x.data = pObject;

            first = x;
            last = x;
            first.next = last;

        }

    }

    public void concat(liste pList) {

        if (pList != null) {

            if (!pList.isEmpty()) {

                if (!isEmpty()) {

                    last.next = pList.first;
                    last = pList.last;

                } else {

                    first = pList.first;
                    last = pList.last;

                }
            }
        }
        
        pList = null;
    }

    public void remove() {
        
        if (hasAccess() && !isEmpty()) {
            
            if (aktuell == first) {
                
                first = aktuell.next;
                aktuell = null;
                aktuell = first;
                
            } else if (aktuell == last) {
                
                eintrag tmp = aktuell;
                eintrag prev = null;
                toFirst();
                
                while(aktuell != tmp) {
                    
                    prev = aktuell;
                    next();
                    
                }
                
                last = prev;
                aktuell = null;
                tmp = null;
                
            } else {
                
                eintrag tmp = aktuell;
                eintrag prev = null;
                toFirst();
                
                while(aktuell != tmp) {
                    
                    prev = aktuell;
                    next();
                    
                }
                
                prev.next = tmp.next;
                tmp = null;
                
            }
            
        }
    
    }

}
