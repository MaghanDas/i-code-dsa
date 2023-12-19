

public class ArrayStack implements Stack{
  private Object[] a;
  private int size;
  public ArrayStack(int capacity) {
    a = new Object[capacity];
  }
  public boolean isEmplty() {
    return (size == 0);
  }
  public Object peek() {
    if (size ==0 )throw new IllegalStateException("STACK IS EMPTY");
    return a[size-1];
  }
  public Object pop() {
    if (size ==0 )throw new IllegalStateException("STACK IS EMPTY");
    Object tmep = a[--size];
    a[size] = null;
    return tmep;
  }

  @Override
  public void push(Object obj) {

  }

  @Override
  public int size() {
    return 0;
  }

  public static void main(String[] args) {
  }
}