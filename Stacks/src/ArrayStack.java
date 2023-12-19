

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

    if (size == a.length){
      reSize();
    }
    a[size++] = obj;
  }

  private void reSize() {
    Object[] aa = a;
    a = new Object[2 * aa.length];
    System.arraycopy(aa,0,a,0,size);
  }

  @Override
  public int size() {
    return size;
  }
  public static void main(String[] args) {
    ArrayStack fruitCarats = new ArrayStack(10);
    fruitCarats.push("Apples");
    fruitCarats.push("kiwis");
    fruitCarats.push("chiku");
    fruitCarats.push("orange");
    System.out.println(fruitCarats.peek());
    fruitCarats.pop();
    System.out.println(fruitCarats.peek());
    System.out.println(fruitCarats.size());
    fruitCarats.push("Anaar");
    fruitCarats.push("corn");
    System.out.println(fruitCarats.size());

    // another object
    ArrayStack coldDrinkCaraat = new ArrayStack(5);
    coldDrinkCaraat.push("colaNext");
    coldDrinkCaraat.push("pakola");
    coldDrinkCaraat.push("slice");
    coldDrinkCaraat.push("maaza");

  }
  // merge two stacks....
  // return the bottom element.
}