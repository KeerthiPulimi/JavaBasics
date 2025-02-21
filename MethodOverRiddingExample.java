class Calcu {
  public int add(int n1, int n2) {
    return n1 + n2;
  }

}

class AdvaClac extends Calcu {
  public int add(int n1, int n2) {
    return n1 + n2 + 1;
  }

}

public class MethodOverRiddingExample {
  public static void main(String[] args) {
    AdvaClac obj = new AdvaClac();
    int r1 = obj.add(3, 4);
    System.out.println(r1);

  }

}



// method overriding is when you have a parent class and  a child class with the same name and both classes have same methods and now when you call out the method it overides the parent method 

// 🔹 Key Points of Method Overriding
// ✔️ Same method name, same parameters in both classes
// ✔️ Occurs in parent-child (superclass-subclass) relationships
// ✔️ The child class method overrides the parent method when called using a child class object
// ✔️ Uses runtime polymorphism (method is determined at runtime)
// ✔️ The overridden method should have the same return type or a subtype 
// ✔️ Access modifier should not be more restrictive in the child class (e.g., if public in parent, it cannot be private in child)
