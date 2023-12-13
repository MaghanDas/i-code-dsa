package dsa.Linkedlist;
import java.util.Scanner;

// A linked list is a data structure that consists of a sequence of elements, where each element points
//  to the next element in the sequence...

// node class to represent each element in the linkedlist.
  public class Node {
    int value;
    Node next;
    public Node(int value) {
      this.value = value;
    }
    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
    Scanner sc = new Scanner(System.in);

    // method to print the list
     public void display(Node head) {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.value+" ");
        temp = temp.next;
      }
       System.out.println();
    }
    // method to get the size of the list.
    public int sizeOfList(Node head) {
      int count = 0;
      Node temp = head;
      while (temp != null) {
        count += 1;
        temp = temp.next;
      }
      return count;
    }
    // method to add the element in list.
    public Node append(int x, Node head) {
      Node newNode = new Node(x);
      if (head == null) {
        head = newNode;
        return head;
      }
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
      return head;
    }

    // method to find sum of all elements in list.
    public int sum(Node head) {
      int sum = 0;
      for (Node temp = head; temp != null; temp = temp.next) {
        sum += temp.value;
      }
      return sum;
    }

    // insert method to insert element in the list.
    public Node insert(Node head, int x) {
      if (head == null || head.value > x) {
        head = new Node(x, head);
        return head;
      }
      Node temp = head;
      while (temp.next != null) {
        if (temp.next.value > x) {
          break;
        }
        temp = temp.next;
      }
      temp.next = new Node(x, temp.next);
      return head;
    }

    public Node insertFirst(Node head, int value) {
      if (head == null) {
        head = new Node(value, head);
        return head;
      }
      Node temp = new Node(value, head);
      temp.next = head;
      head = temp;
      return head;
    }

    public Node insertLast(Node head, int value) {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node(value, temp.next);
      return head;
    }

//    public Node remove(Node head, int x) {
//      Node temp = head;
//      if (head.value == x) {
//        head = head.next;
//      }
//      while (temp != null) {
//        if (temp.next.value == x) {
//          temp.next = temp.next.next;
//        }
//        temp = temp.next;
//      }
//      return head;
//    }

    public Node remove(Node head, int x) {
      if (head.value == x) {
        head = head.next;
      }
      Node temp = head;
      while (temp != null) {
        if (temp.value == x) {
          if (temp.next.value ==x);
          temp = temp.next;
        }

        temp = temp.next;
      }
      return head;
    }
  }

