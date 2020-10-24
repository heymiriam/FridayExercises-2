package week2.arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {


//  static int[] array1= new int[10];
//  static int whereValue() {
//    int val = array1[0];
//    for (int i = 1; i < array1.length; i++)
//      if (array1[i] == val)
//        val = array1[i];
//    return val;
//  }
  public static void main(String[] args) {
    int[] nums = new int[10];

    System.out.print("Array: ");
    int ranNums = 0;
   // int num[] = new int[2];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = i + 1;
      if (nums[i] <= 10) {
        Random ranNum = new Random();
        ranNums = ranNum.nextInt(50) + 1;
        nums[i] = ranNums;

      }
      System.out.print(nums[i] + " ");
    }
    System.out.println(" ");
    Scanner input = new Scanner(System.in);
    System.out.print("Value to find: ");
    String value = input.next();

    }


  }


//    for (int i = 0; i < nums.length; i++) {
//      if (nums.equals(value)) {
//        nums[i] = ranNums;
//        System.out.println(value + "is in slot" + nums.length);
//      }



