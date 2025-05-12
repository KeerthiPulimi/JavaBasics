import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterReduceSortExample {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4, 5, 6, 7);

    // Predicate<Integer> p = n -> n % 2 == 0;

    // Function<Integer, Integer> fun = new Function<Integer, Integer>() {
    // public Integer apply(Integer n) {
    // return n * 2;
    // }

    // };

    Stream<Integer> sortedValues = nums.stream()
        .filter(n -> n % 2 == 0)
        .sorted();

    // int result = nums.stream()
    // .filter(n -> n % 2 == 0) // using the predicate to filter even numbers
    // .map(n -> n * 2) // doubling each even number
    // .reduce(0, Integer::sum); // summing the results

    sortedValues.forEach(n -> System.out.println(n));
  }
}
