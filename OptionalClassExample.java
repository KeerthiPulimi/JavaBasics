import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Bruno", "julie", "Shero", "snicki");

    Optional<String> name = names.stream()
        .filter(str -> str.contains("x"))
        .findFirst()
        .orElse("not found");

    System.out.println(name);
    // System.out.println(name.orElse("not found"));
  }

}
