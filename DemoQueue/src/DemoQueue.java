import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        // List vs. Queue
        // 1. We cannot access the elements in the queue, Just get the object from the
        // queue head;
        // 2. Queue is FIFO (First in first out)

        // ls.add, remove, get
        ls.add("ABC");
        ls.add("IJK");

        String result = ls.get(0); // ABC
        ls.remove(0);

        Queue<String> qs = new LinkedList<>();
        qs.add("ABC");
        qs.add("IJK");
        System.out.println(qs.poll()); // ABC
        System.out.println(qs.poll()); // IJK

        System.out.println(qs.size()); // 0

        // addFirst, addLast, pollFirst, pollLast,

        Deque<String> ds = new LinkedList<>();
        ds.addFirst("ABC");
        ds.addFirst("BCD");
        ds.addLast("EFG");
        System.out.println(ds);
        System.out.println(ds.pollFirst());
        System.out.println(ds.pollLast());

        System.out.println(ds.peek());
        ds.pollFirst();
        System.out.println(ds.pollLast()); // null
        // System.out.println(ds.remove()); // java.util.NoSuchElementException

        ds.offerFirst("JJJ");
        ds.offerLast("JJJ");

        ds.addFirst("ABC");
        System.out.println(ds);

        int[] nums = new int[] {9,81,33,17,58,42,8,75};
        StringBuilder sb = new StringBuilder("");
        for (int i : nums) {
            sb.append(String.valueOf(i));
        }
        System.out.println(sb.toString());
        int temp = Integer.parseInt(sb.toString());
        System.out.println(temp);
        int[] arr = new int[sb.length()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
            System.out.println(temp % 10);
            System.out.println(temp / 10);
        }
        System.out.println(Arrays.toString(arr));

    }
}
