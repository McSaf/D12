package stack;

public class stack {

    eintrag first;
    eintrag last;

    public stack() {

        first = null;
        last = null;

    }

    boolean isEmpty() {
        return first == null;
    }

    void push(Object pObject) {

        eintrag x = new eintrag();
        x.data = pObject;

        if (isEmpty()) {

            first = x;
            last = x;

        } else {

            eintrag oldFirst = first;
            first = x;
            first.next = oldFirst;

        }

    }

    void pop() {

        if (!isEmpty()) {
            first = first.next;
        }

    }

    Object getData() {

        if (!isEmpty()) {
            return first.data;
        } else {
            return null;
        }

    }

}
