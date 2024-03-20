package Trees.practise;

class Node {
  int data;
  Node left;
  Node right;
  public Node(int data) {
    this.data = data;
  }
}
class Tree {
  private Node root;
  public Tree(){
    root = null;
  }
  public Node getRoot(){ return root;}
  public boolean find(int key) {

    Node current = root;
    while (current.data != key) {  // while no match
      if (key < current.data)
        current = current.left;       // go left ?
      else
        current = current.right;        // or go right
      if (current == null)               // if no child
        return false;                     // didn't find it
    }
    return true;        // found it
  }

  // return node with minimum key value...
  public Node minimum() {
    Node current = root;           // starts at root
    while (current.left != null) {  // untill the bottom
      current = current.left; // goto left   child
    }
    return current;
  }
  public Node maximum() {
    Node current = root;           // starts at root
    while (current.right != null) {  // untill the bottom
      current = current.right; // goto right  child
    }
    return current;
  }

  public void insert(int value) {
    Node newNode = new Node(value);
    if (root == null)  // no node in root
      root = newNode;
    else {
      Node current = root;    // start at root
      Node parent;
      while (true) {
        parent = current;
        if (value < current.data) { // go left ?
          current = current.left;
          if (current == null) {    // if end of line
            parent.left = newNode;    // insert at left
            return;
          }
        } // end if go left..
        else {               // or go right ?
          current = current.right;
          if (current == null) {
            parent.right = newNode;
            return;
          }
        }  // end else go right
      }     // end while
    }       // end else not root
  } // end insert

  public void insertt(int value) {
    root = insertRecursive(root, value);
  }

  private Node insertRecursive(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }

    if (value < current.data) {
      current.left = insertRecursive(current.left, value);
    } else if (value > current.data) {
      current.right = insertRecursive(current.right, value);
    }
    return current;
  }
}
public class Bst {
  public static void main(String[] args) {

    Tree bst = new Tree(12);
//    bst.insert(10);
//    bst.insert(8);
//    bst.insert( 11);
//    bst.insert(9);
//    bst.insert(6);


//    bst.insert(4);
//    inOrder(bst.getRoot());
//    System.out.println();
//    preOrder(bst.getRoot());
//    System.out.println();
//    postOrder(bst.getRoot());
//    System.out.println(bst.find(32));
    System.out.println(bst.minimum().data);
    System.out.println(bst.maximum().data);

  }
  public static void inOrder(Node localroot) {
    if (localroot != null) {
      inOrder(localroot.left);
      System.out.print(localroot.data + " ");
      inOrder(localroot.right);
    }
  }
  public static void preOrder(Node localroot) {
    if (localroot != null) {
      System.out.print(localroot.data + " ");
      preOrder(localroot.left);
      preOrder(localroot.right);
    }
  }
  public static void postOrder(Node localroot) {
    if (localroot != null) {
      postOrder(localroot.left);
      postOrder(localroot.right);
      System.out.print(localroot.data + " ");
    }
  }
}
