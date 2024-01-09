import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    LinkedList<String> ls = new LinkedList<>();
    ls.add("ABC");
    ls.add("ABC");
    ls.add("ABC");
    ls.add("ABC");
    ls.add("ABC");
    ls.add("ABC");
    ls.add("ABC");
    ls.add("ABC");
    System.out.println(ls);

    ls.remove();
    System.out.println(ls);
    ls.removeFirst();
    System.out.println(ls);
    ls.removeLast();
    System.out.println(ls);

    ls.remove(2);  // remove by index, much slower than arraylist.remove(index)
    System.out.println(ls);

    ls.remove("ABC");
    System.out.println(ls);

    // for-each, contains(), isEmpty()
    System.out.println(ls.get(0));

    

  }
}
