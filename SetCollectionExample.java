
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionExample {
  public static void main(String[] args) {
    // Set<Integer> nums = new HashSet<Integer>();
    Set<Integer> nums = new TreeSet<Integer>();

    nums.add(6);
    nums.add(36);
    nums.add(2);
    nums.add(8);
    nums.add(6);

    Iterator<Integer> values = nums.iterator();
    while (values.hasNext())
      System.out.println(values.next());

  }

}

// set dosent have index value and also cant store duplicates
// set is a collection of unique values
// hashset cant give you elements in order but tree set can
// Iterator works like a cursor to go through the set step-by-step.
// It’s needed because Set doesn’t support indexing (no get(i)).
// TreeSet keeps elements sorted, so the output is always in order.
// The loop continues until .hasNext() is false.
