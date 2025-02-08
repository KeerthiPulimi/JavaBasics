public class MulArrayExample {
  public static void main(String[] args) {
    int num[][] = new int[3][4];

    // Fill the array with random values (0 to 99)
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        num[i][j] = (int) (Math.random() * 100); // Corrected
        // System.out.print(num[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("------ Printing Again ------");

    // Print the array again
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(num[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("------ ENHANCED ARRAY ------");

    // enhanced for loop
    for (int n[] : num) {
      for (int m : n) {
        System.out.print(m + " ");
      }
      System.out.println();

    }
  }
}
