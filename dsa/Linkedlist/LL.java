package dsa.Linkedlist;

public class LL {
  public static void main(String[] args) {

    Node head = new Node(7);
    head.next = new Node(1);
    head.next.next = new Node(7);
    head.next.next.next = new Node(7);

    // methods on linkedlist...
    // print the list
    head.display(head);
    // size of the list
//    System.out.println("size of list "+ head.sizeOfList(head));
    // add the elements
//    Node append = head.append(3,head);
//    append.display(append);
    Node remove = head.remove(head,7);
    remove.display(remove);

  }
}
