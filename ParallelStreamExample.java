import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamExample {
  private static int sum1;

  public static void main(String[] args) {
    int size = 10000;
    List<Integer> nums = new ArrayList<>(size);

    Random ran = new Random();

    for (int i = 1; i <= size; i++) {
      nums.add(ran.nextInt(100));

    }

    int sum1 = nums.stream()
        .map(i -> i * 2)
        .reduce(0, (c, e) -> c + e);

    long startSeq = System.currentTimeMillis();

    int sum2 = nums.stream()
        .map(i -> {
          try {
            Thread.sleep(1);
          } catch (Exception e) {

          }
          return i * 2;
        })
        .mapToInt(i -> i)
        .sum();

    long endseq = System.currentTimeMillis();

    long startPara = System.currentTimeMillis();

    int sum3 = nums.parallelStream()
        .map(i -> {
          try {
            Thread.sleep(1);
          } catch (Exception e) {

          }
          return i * 2;
        })
        .mapToInt(i -> i)
        .sum();

    long endPara = System.currentTimeMillis();

    // System.out.println(nums);

    System.out.println(sum1 + " " + sum2 + " " + sum3);
    System.out.println(endseq - startSeq);

    System.out.println(endPara - startPara);

  }

}
