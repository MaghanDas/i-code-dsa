package dsa.Linkedlist;

import com.github.weisj.jsvg.N;

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
  public Node append(int x, Node head) {
    Node newNode = new Node(x);
    if (head == null) {
      head = newNode;
      return head;
    }
    Node temp = head;
    while (temp.next!= null) {
      temp = temp.next;
    }
    temp.next = newNode;
    return head;
  }
  public Node insert(Node head) {

    return head;
  }

  public Node remove(Node head,int x) {
    Node temp = head;
    if (head.value == x) {
      head = head.next;
    }
    while (temp != null ){
      if (temp.next.value == x) {
        temp.next = temp.next.next;
      }
      temp = temp.next;
    }
    return head;
  }
}
