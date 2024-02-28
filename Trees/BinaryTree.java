package Trees;

public class BinaryTree {
  Object root;
  BinaryTree left, right;
  BinaryTree(Object root) {
    this.root = root;
  }
    BinaryTree(Object root, BinaryTree left, BinaryTree right) {
      this.root = root;
      this.left = left;
      this.right = right;
    }
    Object setRoot(Object root) {
    Object temp = this.root;
    this.root= root;
    return temp;
    }
    BinaryTree setLeft(BinaryTree left) {
    BinaryTree temp = this.left;
    this.left = left;
    return temp;
    }
  BinaryTree setRight(BinaryTree right) {
    BinaryTree temp = this.right;
    this.right = right;
    return temp;
  }

    public String toString(){
    StringBuffer buf = new StringBuffer(" ");
    if (left != null) buf.append(left + ",");
    buf.append(root);

    if (right != null) buf.append("," + right);
      return buf+ " ";
    }
  public String preOrder(){
    StringBuffer buf = new StringBuffer(" ");
    buf.append(root);
    if (left != null) buf.append(left.preOrder() + " ");
    if (right != null) buf.append(" " + right.preOrder());
    return buf+ " ";
  }
  public String postOrder(){
    StringBuffer buf = new StringBuffer(" ");
    if (left != null) buf.append(left.postOrder() + " ");
    if (right != null) buf.append(" " + right.postOrder());
    buf.append(root);
    return buf+ " ";
  }

  public static void main(String[] args) {

    BinaryTree left = new BinaryTree('B');
    BinaryTree right = new BinaryTree('C');
    BinaryTree root = new BinaryTree('A',left,right);
    System.out.println(root.toString());
    System.out.println("********************");
    System.out.println(root.preOrder());
    System.out.println("********************");
    System.out.println(root.postOrder());

    // Make a method isLeaf which return boolean.
    // make sizeMethod that counts total numbers of leaves/nodes.
    // mkae height method
    // make boolean search method.
  }
}
