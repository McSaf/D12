package queue;

public class queue implements queue_interface{

    eintrag first;
    eintrag last;
    
    public queue() {
        
        first = null;
        last = null;
        
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(Object pObject) {
        
        eintrag x = new eintrag();
        x.data = pObject;
        
        if (isEmpty()) {
            
            first = x;
            last = x;
            
        } else {
            
            last.next = x;
            last = last.next;
            
        }
    
    }

    public void dequeue() {
        
        if (!isEmpty()) {
            
            first = first.next;
        } else if (first == last) {
            
            first = null;
            last = null;
        
        }
    
    }

    public Object front() {
        
        if (!isEmpty()) {
            
            return first.data;
            
        } else {
            
            return null;
        
        }
    
    }
    
}
