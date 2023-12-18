package Sorting.Arrays;

public class BubbleSort {

    public static void swap(int[] arr, int i, int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    static int[] bubble(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < (arr.length - 1) - i; j++) {
          if (arr[j] > arr[j + 1]) {
            swap(arr, j, j + 1);
          }
        }
      }
      return arr;
    }

  public static void display(int[] arr){
    for(int array : arr){
      System.out.print(array+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextByte();
    int[] arr = new int[size];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextByte();
    }
      System.out.println("original :");
      display(arr);
      System.out.println("sorted :");
      int[] ans = bubble(arr);
      display(ans);
    }
  }
}
