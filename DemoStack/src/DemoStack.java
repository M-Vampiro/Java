import java.util.List;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        // LIFO - Stack

        Stack<String> ss = new Stack<>();
        // 1. If we use 
        ss.push("ABC");
        ss.push("IJK");
        // Pop-> get the last element
        System.out.println(ss.pop()); // IJK
        System.out.println(ss.pop()); // ABC
        // System.out.println(ss.pop()); // error, We cannot pop on empty stack
    
        






    }
}
