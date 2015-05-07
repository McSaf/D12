package queue_array;

public class queue_array {

    // Define Vars
    Object[] data;
    int head;
    int count;
    boolean run = false;

    // The one and only constructor
    public queue_array(int length) {

        data = new Object[length];
        head = 0;
        count = data.length;
        System.out.println("Queue is " + data.length + " elements max.");

    }

    public void enq(Object pData) {

        if (empty()) {

            data[head] = pData;

        } else {

            run = true;
            head = 0;

            while (run) {

                if (head <= count - 1) {

                    if (data[head] == null) {

                        data[head] = pData;
                        run = false;

                    }

                    head++;

                }

                if (head == count) {

                    run = false;

                }

            }

        }

    }

    public void deq() {

        data[0] = null;

        for (int i = 1; i < data.length; i++) {

            data[i - 1] = data[i];

        }

        data[data.length - 1] = null;

    }

    public Object front() {

        if (!empty()) {
            head = 0;
            return data[head];
        } else {
            return null;
        }

    }

    public boolean empty() {
        return data[0] == null;
    }

}
