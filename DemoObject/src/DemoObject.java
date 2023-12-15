public class DemoObject { // extends Object implicity

    public void run() {

    }

    public static void main(String[] args) {
        Object o1 = new Object();
        System.out.println(o1.toString()); // java.lang.Object@2f92e0f4

        // DemoObject do1 = (DemoObject) o1; // downcast
        // compile time -> do1 is a object ref with the type of DemoObject. Able to call
        // run().
        // do1.run();
        // runtime -> once the do1 found the object (new Object()) , there is no run()
        // method
        // -> Error
        DemoObject do2 = new DemoObject();
        Object o2 = do2; // upcast
        // compile time -> o2 is a object referance with the type of Object. Able to
        // itself method.
        System.out.println(o2.toString()); // DemoObject@28a418fc
        // runtime must be okay if we just use upcast

        // getClass()
        DemoObject do3 = new DemoObject();
        if (do3.getClass() == DemoObject.class) { // instanceof
            System.out.println("It is DemoObject class");
        }

        Class<?> clas = do3.getClass();
        System.out.println(clas.getName()); // DemoObject
        System.out.println(do3.getClass().getName());

        // equals() hashcode()
        String s1 = "hello";
        String s2 = "abc";
        System.out.println(s1 == s2); // check if same object
        System.out.println(s1.equals(s2)); // check if same value?

        // Object.class
        // public boolean equals(Object obj) {
        // return (this == obj);
        // }

        // String.class
        // public boolean equals(Object anObject) {
        // if (this == anObject) {
        // return true;
        // }
        // return (anObject instanceof String aString)
        // && (!COMPACT_STRINGS || this.coder == aString.coder)
        // && StringLatin1.equals(value, aString.value);
        // }

        // Cat equals()
        //
        Cat c1 = new Cat("ABC", 5);
        Cat c2 = new Cat("ABC", 10);
        Cat c3 = new Cat("DEF", 5);
        Cat c4 = new Cat("IJK", 7);
        Cat c5 = new Cat("ABC", 5);

        System.out.println(c1.equals(c2)); // different age
        System.out.println(c1.equals(c3)); // different name
        System.out.println(c1.equals(c4)); // different age and name
        System.out.println(c1.equals(c5)); // true

        

    }
}
