package week2.arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LocatingTheLargestValue {
  public static void main(String[] args)  {
    Random randomNum = new Random();

    ArrayList<Integer> randNumber = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      randNumber.add(randomNum.nextInt(100)+1);
    }
    System.out.print("Arraylist: ");
    Collections.sort(randNumber);
    System.out.println(randNumber);
    System.out.println("The largest value is " + randNumber.get(randNumber.size()-1) + " which is in slot " + randNumber.indexOf(randomNum));
  }
}
