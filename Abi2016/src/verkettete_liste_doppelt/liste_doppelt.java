package verkettete_liste_doppelt;

public class liste_doppelt implements liste_doppelt_interface {

    eintrag first;
    eintrag aktuell;
    eintrag last;

    public liste_doppelt() {

        first = null;
        aktuell = null;
        last = null;

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

    public void previous() {

        if ((!isEmpty()) && (aktuell != null) && (aktuell != first)) {

            aktuell = aktuell.previous;

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

        if (!isEmpty() && pObject != null) {

            last.next = x;
            last.next.previous = last;
            last = last.next;

        } else if (isEmpty() && pObject != null) {

            first = x;
            last = x;
            first.next = last;
            last.previous = first;

        }

    }

    public void insert(Object pObject) {

        if (hasAccess() && pObject != null) {

            eintrag tmp = aktuell;
            eintrag prev = aktuell.previous;

            prev.next = new eintrag();
            prev.next.data = pObject;
            prev.next.previous = prev;
            prev.next.next = tmp;
            prev.next.next.previous = prev.next;

        } else if (!hasAccess() && pObject != null) {

            eintrag x = new eintrag();
            x.data = pObject;

            first = x;
            last = x;
            first.next = last;
            last.previous = first;

        }

    }

    public void concat(liste_doppelt pList) {

        if (pList != null) {

            if (!pList.isEmpty()) {

                if (!isEmpty()) {

                    last.next = pList.first;
                    pList.first.previous = last;
                    last = pList.last;

                } else {

                    first = pList.first;
                    last = pList.last;

                }

            }

        }

    }

    public void remove() {

        if (hasAccess() && !isEmpty()) {

            if (aktuell == first) {

                first = aktuell.next;
                aktuell = null;
                aktuell = first;
                aktuell.previous = null;

            } else if (aktuell == last) {

                eintrag tmp = aktuell;
                eintrag prev = aktuell.previous;

                last = prev;
                aktuell = null;
                last.next = null;
                tmp = null;

            } else {

                eintrag tmp = aktuell;
                eintrag prev = aktuell.previous;

                prev.next = tmp.next;
                tmp.next.previous = prev;
                tmp = null;

            }

        }

    }

}
