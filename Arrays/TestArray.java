package Arrays;
import java.util.Scanner;
public class TestArray {
  int[] arr1;
  int size;
  Scanner sc = new Scanner(System.in);
  public TestArray(int n) {
    this.size = n;
    arr1 = new int[n];
  }
  void display() {
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i]+ " ");
    }
    System.out.println();
  }
  int linearSearch(int value ){
    for (int i =0; i<arr1.length; i++) {
      if (value == arr1[i]){
        return i;
      }
    }
    return -1;
  }
  void insert() {
    for (int i = 0; i < arr1.length ; i++) {
      arr1[i] = sc.nextInt();
    }
  }
  void delete(int position) {
    for (int i = 0; i < arr1.length-1 ; i++) {
      if (i>=position-1) {
        arr1[i] = arr1[i+1];
      }
    }
    size--;
  }
  void deleteByVal(int value) {
    //search value
    int index = linearSearch(value);
    // if does then delte it
    if (index == -1) {
      System.out.println("element not found");
    }
    else {
      delete(index+1);
    }
    // otherwise display msg that element not found..
  }

  // sort the array
//  void sort() {

  // leetcode problem
  int[] sumOfTwoNumbers(int target) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = i+1; j < arr1.length; j++) {
        if (arr1[i] + arr1[j] == target) {
          return new int[]{i,j};
        }
      }
    }
    return null;
  }

//  void swap(int[] arr,int i,int j) {
//    int temp = arr[i];
//    arr[i] = arr[j];
//    arr[j] = temp;
//  }
  // bubble sort
//  int[] bubbleSort() {
//    for (int i =0; i< arr1.length-1; i++) {
//      for (int j = 0; j < (arr1.length-1)-i; j++) {
//        if(arr1[j] > arr1[j+1]) {
//          swap(arr1,j,j+1);
//        }
//      }
//    }
//return arr1;
//  }
}

