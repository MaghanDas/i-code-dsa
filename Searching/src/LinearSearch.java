
// Linear Search
  public class LinearSearch {

    public static void linearSearch(int[] arr, int target) {

      for (int i = 0; i < arr.length; i++) {
        if (target == arr[i]) {
          System.out.println("Element Found at Index : " + i);
          return;
        }
      }
    }

    public static void main(String[] args) {

      int[] arr = { 1, 2, 3, 4, 5 };
      int target = 4;
      LinearSearch.linearSearch(arr, target);
    }
  }

