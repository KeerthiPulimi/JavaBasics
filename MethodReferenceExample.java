import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("navin", "Harsh", "jhon");

    List<String> uNames = names.stream()
        // .map(name -> name.toUpperCase())
        .map(String::toUpperCase)
        .toList();

    // System.out.println(uNames);

    uNames.forEach(System.out::println);
  }

}
