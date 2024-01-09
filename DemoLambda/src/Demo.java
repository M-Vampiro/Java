public class Demo {
  public static void main(String[] args) {
    // Inner Class
    Walkable person = new Walkable() {
      @Override
      public void walk() {
        System.out.println("Walking ... ");
      }
    };
    person.walk(); // Walking ...

    // Lambda Expresion
    // 1. We don't need to write down method signature for the walk() method, Why?
    // because the interface has only one method
    // 2. "()" is the input parameters of the walk method
    // 3. As walk method is void return type, you don't have to return anything inside the code block
    // 4. Limitation: it can only be used when where is ONLY ONE method in interface
    // 5. If there is only one statement inside the code block, don't need to add () and return
    // 6. Don't need to specify the input parameter types
    Walkable person2 = () -> {
      System.out.println("hello");
      System.out.println("hello world");
    };

    // What we learn in week 3
    Walkable person3 = new Person();
    person3.walk();

    person2.walk();

    // (salary, bonus). refers to the compute(int x, int y) in the interface Calculable
    Calculable addition = (salary, bonus) -> salary + bonus;
    System.out.println(addition.compute(10, 3)); // 13
    
    Calculable multiply = (price, quantity) -> price * quantity;
    System.out.println(multiply.compute(300, 10)); // 3000
    
  }


}
