//if you want to work only with importing and fetching data then collection is good but if you want to work with indexes you can use list

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<Integer>();
    // Collection<Integer> nums = new ArrayList<Integer>();

    nums.add(6);
    nums.add(36);
    nums.add(2);
    nums.add(8);

    // System.out.println(nums);

    System.out.println(nums.get(2));
    System.out.println(nums.indexOf(6));

    // for (Object n : nums) {
    // int num = (Integer) n;
    // System.out.println(num);
    // }

  }

}
