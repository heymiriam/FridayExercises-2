package week2.arrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
  public static void main(String[] args){
    ArrayList<Integer> nums = new ArrayList<>();

    for(int i =0; i<10; i++){
      Random randoms = new Random();
      int numbers= randoms.nextInt(50) + 1 ;
      nums.add(numbers);
    }
    System.out.println( "ArrayList: " + nums );
     Scanner scan = new Scanner(System.in);
    System.out.println("Value to find ");
     int ranNumbers = scan.nextInt();
      if(nums.contains(ranNumbers)){
      System.out.println(ranNumbers + " is in the Arraylist");
      }

  }
}
