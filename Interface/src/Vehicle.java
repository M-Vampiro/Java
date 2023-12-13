public interface Vehicle { // Vehicle is a abstract word.

    // Interface has no instance variable

    int x = 10; // implicitly public static final

    // interface is a contract with abstract behaviors (abstract methods)

    // if a class implements an interface .it has to implement all its abstact methods
    // (all or nothing)

    void start(); // Implicitily public abstract method

    void stop();

    void accelerate();

    void brake();

    public static void main(String[] args) {
        // x -> static
        System.out.println(Vehicle.x); //10
    }

    // After Java 8
    // default instance method

    default boolean test() {
        return true;
    }


}
