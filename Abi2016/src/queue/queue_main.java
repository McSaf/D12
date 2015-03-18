package queue;

public class queue_main {

    public static void main(String[] args) {
        
        queue mainQueue = new queue();
        mainQueue.enqueue((String)"Hello World1");
        mainQueue.enqueue((String)"Hello World2");
        mainQueue.enqueue((String)"Hello World3");
        mainQueue.enqueue((String)"Hello World4");
        
        while(mainQueue.front() != null) {
            System.out.println((String)mainQueue.front());
            mainQueue.dequeue();
        }
        
    }
    
}
