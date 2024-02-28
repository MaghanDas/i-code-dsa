package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array:");
    byte size = sc.nextByte();

    TestArray arr = new TestArray(size);
    System.out.println("enter the elements of array:");
    arr.insert();
    System.out.println("before deletion");
    arr.display();
  //  arr.sort();
    arr.display();
//    System.out.println("enter the target element for two sum: ");
//    int twoSumNumber = sc.nextInt();
//    System.out.println(Arrays.toString(arr.sumOfTwoNumbers(twoSumNumber)));

//    arr.delete(3)
//    arr.display()
//    arr.deleteByVal(3);
//    arr.display();

//    arr.deleteByVal(3);
//    arr.display();
//   arr.bubbleSort();
//   arr.display();
  }
}

