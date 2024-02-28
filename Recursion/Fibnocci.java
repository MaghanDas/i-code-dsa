package Recursion;

public class Fibnocci {

  // fibnocci series is like sum of prevoius two numbers.
  // 0 1 1 2 3 5 8 13 21
      static int fibnocci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
          return fibnocci(n - 1) + fibnocci(n - 2);
      }
      public static void main(String[] args) {

        int num = 5;
        System.out.println("element is " + fibnocci(num));
  }
}
