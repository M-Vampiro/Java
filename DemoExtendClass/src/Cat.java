public class Cat extends Animal {

  //  Cat class inherit all public Attributes, Methods
  // Cat did NOT inherit constructor
  // age
  public Cat () {
    // super(); // implicity call Animal() constructor 
  }
 

 
  
  public static void main(String[] args) {
    Cat c1 = new Cat(); // Create a cat obj. -> Cat() -> call Animal()
    c1.setAge(2);




    System.out.println(c1.getAge());
  }






}
