package week2.arrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
  public static void main(String[] args){
    ArrayList<Integer> nums = new ArrayList<>();





    for(int i =0; i<10; i++){
      Random randoms = new Random();
      int numbers= randoms.nextInt(100) + 1 ;
      nums.add(numbers);
    }

    System.out.println( "ArrayList: " + nums );
  }


}
