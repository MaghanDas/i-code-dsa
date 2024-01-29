package dsa.Linkedlist;

// A linked list is a linear data structure that consists of a sequence of elements, where each element points
//  to the next element in the sequence.

import java.util.Scanner;

public class LL {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("enter size: ");
    int size = sc.nextByte();
    Node head = new Node(sc.nextInt());
    Node temp = head;
    for(int i = 1; i< size; i++) {
      temp.next = new Node(sc.nextInt());
      temp = temp.next;
    }
    System.out.println("printing the elements...");
    head.display(head);
    // methods on linkedlist...
    // print the list
//    head.display(head);
    // size of the list
//    System.out.println("size of list "+ head.sizeOfList(head));
    // add the elements
//    Node append = head.append(3,head);
//    append.display(append);
//    Node remove = head.remove(head,7);
//    remove.display(remove);

  }
}
