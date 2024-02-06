public class DemoStaticNestedClass { // Outer Class

    public static class Calculator{ // Nested Class
        // Attributes
        private int value;

        // Constructor
        public Calculator(int value) {
            this.value = value;
        }

        // Instance Method

        public int add(int y) {
            return this.value += y;
        }

        public int getValue() {
            return this.value;
        }
    }
    public static void main(String[] args) {
        DemoStaticNestedClass d = new DemoStaticNestedClass();

        DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass.Calculator(100);

        Calculator calculator = new Calculator(100);

    }
}
