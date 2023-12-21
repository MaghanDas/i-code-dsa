public class LinkedStack implements Stack {
  private  static  class Node {
    Object object;
    Node next;

    Node(Object object, Node n) {
      object = object;
      next = n;
    }
  }
    private Node top;
    private int size;
    public boolean isEmpty(){
      return (size==0);
    }

    @Override
    public Object peek() {
      if (size == 0) throw new IllegalStateException("STAKE IS EMPty");
      return top.object;
    }
    @Override
    public Object pop() {
      Object temp = top.object;
      top = top.next;
      size--;
      return temp;
    }
    @Override
    public void push(Object obj) {
        top = new Node(obj,top);
        size++;
    }
    @Override
    public int size() {
      return size;
    }
  }
}
