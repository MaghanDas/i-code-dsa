package Recursion;

public class factorialNumber {

  public static void main(String[] args) {

//    int result = factorial(0);
//    System.out.println("factorial is " + result);

    // factorial with recursion
    int result2 = factorialWithRecursion(6);
    System.out.println(result2);
  }

  static int factorialWithRecursion(int i) {
    // base condition.
    if (i < 2){
      return i;
    }
    return i*factorialWithRecursion(i-1);
  }

//  static int factorial(int num) {
//    int fact = 1;
//    for (int i =1; i<=num; i++) {
//      fact *= i;
//    }
//    return fact;
//  }
}
