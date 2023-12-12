package dsa.Linkedlist;

public class LL {
  public static void main(String[] args) {

    Node head = new Node(1);
    head.next = new Node(2);

    // methods on linkedlist...
    // print the list
    head.display(head);
    // size of the list
    System.out.println(head.sizeOfList(head));
    // add the elements


  }
}
