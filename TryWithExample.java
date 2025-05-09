import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithExample {
  public static void main(String[] args) throws NumberFormatException, IOException {
    int num = 0;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String input = br.readLine();
      if (input.isEmpty()) {
        System.out.println("Invalid input. Please enter a number.");
        return;
      }
      num = Integer.parseInt(input);
      System.out.println(num);
    }
  }
}
