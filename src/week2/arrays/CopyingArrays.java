package week2.arrays;

import java.util.Random;

public class CopyingArrays {
  public static void main(String[] args) {
    int[] array1 = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
    };

//    int[] nums = new int[10];
//    nums[10] = -7;

 //   int arr1Length = nums.length;
    Random ranNum = new Random();
    int ranNumbers = ranNum.nextInt(50) + 1;
    array1[0]= ranNumbers;
    array1[1]= ranNumbers;
    array1[2]= ranNumbers;
    array1[3]= ranNumbers;
    array1[4]= ranNumbers;
    array1[5]= ranNumbers;
    array1[6]= ranNumbers;
    array1[7]= ranNumbers;
    array1[8]= ranNumbers;
    array1[9]= ranNumbers;
    System.out.print("Array 1: ");
    for(int i = 0; i < array1.length ; i++){
      if(array1.length<=10){
        array1[i]= ranNumbers;
      }
      Random ranNum2 = new Random(2);
      int ranNumbers2 = ranNum2.nextInt(50) + 1;
      System.out.print(ranNumbers2 + " ");
    }
    System.out.println(" ");
    System.out.print("Array 2: ");

    for(int i = 0; i < array1.length ; i++){
      if(array1.length<=10){
        array1[i]= ranNumbers;
        Random ranNum2 = new Random(2);
        int ranNumbers2 = ranNum2.nextInt(50) + 1;
        System.out.print(ranNumbers2 + " ");
      }

    }

  }
}
