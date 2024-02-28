package Recursion;

public class Recursion {

  public static void main(String[] args) {
    // Recursion - function calling itself!
    // why recursion > it helps us in solving bigger/complex problems in simple way.
    // we can convert recursion solution in iteration and vice versa.
    // iteration mean loops.
    // space complexity is not constant bcus of recursive calls.
    // when the function is not finished exactly, it will remain in stack,
    // write a function that takes in a number and prints it.
//    print(1);
    print2(5);
     
  }
  static void print(int n) {
    // base condition
    if (n == 5) {
      System.out.println(n);
      return;
    }
    System.out.println(n);
    // recursive call
    print(n+1);
  }
  static void print2(int n){
    if (n == 1){
      System.out.println(n);
      return;
    }
    print2(n-1);
    System.out.println(n);
  }
}
