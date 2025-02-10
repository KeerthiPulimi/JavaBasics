class Student {
  int rollno;
  String name;
  int marks;

}

public class ArrayObjectExample {
  public static void main(String[] args) {

    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "snicker";
    s1.marks = 45;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "julie";
    s2.marks = 58;

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "shero";
    s3.marks = 95;

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    // for (int i = 0; i < students.length; i++) {
    // System.out.println(students[i].name + " : " + students[i].marks);

    // }

    for (Student stud : students) {
      System.out.println(stud.name + " :" + stud.marks);
    }

    // int nums[]= new int[4];
    // nums[0]=4;
    // nums[1]=42;
    // nums[2]=43;
    // nums[3]=44;

    // for(int n :nums){
    // System.out.println(n);

    // }

  }

}
