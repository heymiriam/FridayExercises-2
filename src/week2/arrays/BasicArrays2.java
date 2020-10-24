package week2.arrays;

import java.util.Random;

public class BasicArrays2 {
  public static void main(String[] args) {
    int[] arrSlot = {
      0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
    };

    for(int i =0; i < arrSlot.length; i++){
      Random randomNum = new Random();
      int randomInt = randomNum.nextInt(100) + 1;
      System.out.println("Slot " + arrSlot[i] + " contains a " + randomInt);
    }

  }
}
