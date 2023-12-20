import java.util.Scanner;

  public class BinarySearch {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("enter the size of array..");
      int size = sc.nextByte();
      int[] arr = new int[size];
      System.out.println("enter the elements..");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println("displaying the array..");
      displayArray(arr);
      System.out.print("enter the target element..");
      int target = sc.nextInt();
      int elemenFound = BinarySearchInArray(arr,target);
      System.out.println("element found at index " + elemenFound);
    }

    static int BinarySearchInArray(int[] arr, int target) {
      int start = 0;
      int end = arr.length-1;
      while (start <=end) {
        // find the middle element..
        int mid = start+(end - start) / 2;
        if (target > arr[mid]) {
          start = mid+1;
        }
        else if (target < arr[mid]) {
          end = mid-1;
        }
        else {
          return mid;
        }
      }
      return -1;
    }

    static void displayArray(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }

