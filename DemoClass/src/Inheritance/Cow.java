package Inheritance;

public class Cow extends Animal {
  public String eat(String food) {
    return "[Cow] is eating " + food + " ...";
  }

  // Polymorphism + Overloading (Not Overriding)

  public static void main(String[] args) {
    Animal cow = new Cow(); // Complie time / Run time
    // Complie time: cow obj. can access which methods
    System.out.println(cow.eat()); // the object has 2 methods: eat(), eat(String food)
    // "cow" object reference is declared by Animal
    // so it can call eat() only, but not eat(String food)

    // Runtime : find the object pointing to.
    // The object is created by "Cow" class.

   // System.out.println(cow.eat("Something")); // Compile error: The method eat() in the type Animal is not applicable for the arguments (String)
   Animal cow2 = new Animal();
   // System.out.println(cow2.eat("Something")); // Compile error: Animal.class has no eat(String) method
  }
}
