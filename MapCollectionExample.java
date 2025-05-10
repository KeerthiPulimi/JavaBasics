//Key and value pair can be done by using MAP
//Map is a collection of Key and value pair

import java.util.Map;
import java.util.HashMap;

public class MapCollectionExample {
  public static void main(String[] args) {
    Map<String, Integer> students = new HashMap<>();

    students.put("bruno", 56);
    students.put("Snick", 78);
    students.put("Julie", 88);
    students.put("shero", 77);

    students.put("Snick", 45);

    System.out.println(students.keySet());

    for (String key : students.keySet()) {
      System.out.println(key + ":" + students.get(key));
    }

  }
}

// hashmap will not give you in the order
//
// this is a set and a list combination , keys can be duplicate
