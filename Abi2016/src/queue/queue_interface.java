package queue;

public interface queue_interface {

    boolean isEmpty();
    
    void enqueue(Object pObject);
    
    void dequeue();
    
    Object front();
    
}
