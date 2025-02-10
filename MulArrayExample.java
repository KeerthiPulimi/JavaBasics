public class MulArrayExample {
  public static void main(String[] args) {
    int num[][] = new int[3][];
    num[0] = new int[3];
    num[1] = new int[4];
    num[2] = new int[5];

    // Fill the array with random values (0 to 99)
    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num[i].length; j++) { // Corrected
        num[i][j] = (int) (Math.random() * 10);
      }
    }

    System.out.println("------ Printing Again ------");

    // Print the array again
    for (int i = 0; i < num.length; i++) { // Use num.length
      for (int j = 0; j < num[i].length; j++) { // Use num[i].length
        System.out.print(num[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("------ ENHANCED FOR LOOP ------");

    // Enhanced for loop
    for (int[] row : num) {
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }
}
