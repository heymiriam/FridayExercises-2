package week2.arrays;

import java.util.Random;

public class FindingTheLargestValue {
  static int[] array1= new int[10];
  static int largestValue() {

    int max = array1[0];
    for (int i = 1; i < array1.length; i++)
      if (array1[i] > max)
        max = array1[i];
    return max;
  }
  public static void main(String[] args) {
    System.out.print("Array: ");
    int ranNums = 0;
    //int num[] = new int[2];

    for (int i = 0; i < array1.length; i++) {
      array1[i] = i + 1;
      if (array1[i] <= 10) {
        Random ranNum = new Random();
        ranNums = ranNum.nextInt(50) + 1;
        array1[i] = ranNums;
      }
      System.out.print(array1[i] + " ");
    }
    System.out.println(" ");
    System.out.println("Largest value is " + largestValue());
  }
}


