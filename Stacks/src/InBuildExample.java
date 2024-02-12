import java.util.LinkedList;
import java.util.Queue;

public class InBuildExample {
    
    public static void main(String[] args) {
        
        // stack follows last in first out ( LIFO)
    //    // elements entered first willbe removed last.

    //     Stack<Integer> stack = new Stack<>();

    //     stack.push(11);
    //     stack.push(22);
    //     stack.push(33);

    //     System.out.println(stack.pop());


    // working wtih queue.

    Queue<Integer> queue = new LinkedList();
   // we have written linkedlist.. because queue is not class, its interface. 
   // whereas stack is a class.

   queue.add(11);
   queue.add(22);
   queue.add(33);

   System.out.println(queue.peek()); // 11
   queue.remove();  //  11 removed
   queue.remove();   // 22 removed
   System.out.println(queue.remove());

   // doubly queue.
   // in this we can add or remove elements from back and end both..
   
    }
}
