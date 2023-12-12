package dsa.Linkedlist;

import java.util.Scanner;

public class Node {
  int value;
  Node next;
  public Node(int value) {
    this.value = value;
  }
  public Node(int value,Node next) {
    this.value = value;
    this.next = next;
  }
  Scanner sc = new Scanner(System.in);
  public void display(Node head) {
    Node temp = head;
    while ( temp != null ) {
      System.out.println("elements are "+ temp.value);
      temp = temp.next;
    }
  }
  public int sizeOfList(Node head) {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      count += 1;
      temp = temp.next;
    }
    return count;
  }
  public Node insert(Node head) {
    
  }
}
