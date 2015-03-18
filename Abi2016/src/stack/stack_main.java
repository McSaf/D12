package stack;

public class stack_main {
    
    public static void main(String[] args) {
        
        stack mainStack = new stack();
        mainStack.push((String)"Hello World1");
        mainStack.push((String)"Hello World2");
        mainStack.push((String)"Hello World3");
        mainStack.push((String)"Hello World4");
        
        
        while(mainStack.top() != null) {
            
            System.out.println((String)mainStack.top());
            mainStack.pop();
            
        }
        
    }
    
}
