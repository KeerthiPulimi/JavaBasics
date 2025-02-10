public class StringBufferExample {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("keerthi");

    sb.append("pulimi");

    sb.deleteCharAt(7);

    sb.insert(0, "java");

    sb.setLength(30);

    System.out.println(sb);

    // String str= sb.toString();

  }

}
