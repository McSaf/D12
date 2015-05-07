package queue_array;

public class queue_array_main {

    public static void main(String[] args) {

        queue_array mainData = new queue_array(10);

        // Write Data into the Queue
        for (int i = 0; i <= 11; i++) {

            mainData.enq("Test" + i);

        }

        // Print everything in the Queue
        System.out.println("");
        while (mainData.front() != null) {

            System.out.println(mainData.front());
            mainData.deq();

        }

        // Empty Print as Breakpoint for Debug
        System.out.println("");

    }

}
