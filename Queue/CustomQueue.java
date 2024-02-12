
public class CustomQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10 ;    
    int end = 0;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size]; 
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++]  = item;
        return true;
    }

    public int remove() throws Exception{
        if (isEmplty()) {
            System.out.println("queue is empty");
        }
        int removed = data[0];
        // shift the elements//
        for(int i = 1; i<end; i++) {
            data[i-1] = data[i];
        }
        end--; 
        return removed;
    }

    public int front() throws Exception{
        if (isEmplty()) {
            System.out.println("queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " " + "<- ");
        }
        System.out.println("end");
    } 

    public boolean isFull() { 
        return end == data.length;
    }

    public boolean isEmplty() {
        return end == 0;
    }

    public static void main(String[] args) throws Exception {
 
        CustomQueue queue = new CustomQueue(5);
        
        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);
        queue.insert(55);

        queue.display();
    
        queue.remove();

        queue.display();
        
        System.out.println(queue.front());
    }
}
