package sorts;

/*********************************************************
 * Main class Framework
 *********************************************************/
import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> test = buildList(12, 15);
    System.out.println("Here is the List to sort:");
    System.out.println("  " + test);
    // create the InsertionSort object
    InsertionSort sortMe = new InsertionSort(test);
    // sort it 
    sortMe.doSort(true);
    System.out.println("After sorting, the result is:");
    System.out.println("  " + sortMe);
  }

  public static ArrayList<Integer> buildList(int len, int max)
  {
    ArrayList<Integer> me = new ArrayList< >();
    for (int j = 0; j < len; j++)
      me.add((int)(Math.random() * max));
    return me;
  }
}
