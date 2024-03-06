package Trees;

class Node {
  private int data;
  private Node leftChild;
  private Node rightChild;

  public Node(int data) {
    this.data = data;
    this.leftChild = null;
    this.rightChild = null;
  }

  public int getData() {
    return data;
  }

  public Node getLeftChild() {
    return leftChild;
  }

  public Node getRightChild() {
    return rightChild;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void setLeftChild(Node leftChild) {
    this.leftChild = leftChild;
  }

  public void setRightChild(Node rightChild) {
    this.rightChild = rightChild;
  }
}

class BinarySearchTree {
  private Node root;

  public BinarySearchTree() {
    this.root = null;
  }

  public Node getRoot() {
    return root;
  }

  public void insert(int value) {
    root = insert(root, value);
  }

  private Node insert(Node root, int value) {
    if (root == null) {
      return new Node(value);
    }

    if (value < root.getData()) {
      root.setLeftChild(insert(root.getLeftChild(), value));
    } else if (value > root.getData()) {
      root.setRightChild(insert(root.getRightChild(), value));
    }

    return root;
  }

  public void delete(int value) {
    root = delete(root, value);
  }

  private Node delete(Node root, int value) {
    if (root == null) {
      return root;
    }

    if (value < root.getData()) {
      root.setLeftChild(delete(root.getLeftChild(), value));
    } else if (value > root.getData()) {
      root.setRightChild(delete(root.getRightChild(), value));
    } else {
      if (root.getLeftChild() == null) {
        return root.getRightChild();
      } else if (root.getRightChild() == null) {
        return root.getLeftChild();
      }

      root.setData(findMin(root.getRightChild()).getData());
      root.setRightChild(delete(root.getRightChild(), root.getData()));
    }

    return root;
  }

  private Node findMin(Node node) {
    while (node.getLeftChild() != null) {
      node = node.getLeftChild();
    }
    return node;
  }
}

public class Main {
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();

    // Insert some values
    bst.insert(50);
    bst.insert(30);
    bst.insert(20);
    bst.insert(40);
    bst.insert(70);
    bst.insert(60);
    bst.insert(80);

    // Print inorder traversal to verify the insertion
    System.out.println("Inorder Traversal after insertion:");
    inorderTraversal(bst.getRoot());
    System.out.println();

    // Delete a node and print the inorder traversal
    bst.delete(30);
    System.out.println("Inorder Traversal after deletion of 30:");
    inorderTraversal(bst.getRoot());
  }

  private static void inorderTraversal(Node node) {
    if (node != null) {
      inorderTraversal(node.getLeftChild());
      System.out.print(node.getData() + " ");
      inorderTraversal(node.getRightChild());
    }
  }
}
