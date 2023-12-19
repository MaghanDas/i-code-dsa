

public class ArrayStack implements Stack{
  private Object[] a;
  private int size;
  public ArrayStack(int capacity) {
    a = new Object[capacity];
  }
  public boolean isEmplty() {
    return (size == 0);
  }
  public static void main(String[] args) {
  }
}