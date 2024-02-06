import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DemoConsumer {
  public static void main(String[] args) {
    Consumer<String> sendEmailFunc = emailAddress -> sendEmail(emailAddress);

    List<String> emails = new ArrayList<>(List.of(""));
    emails.forEach(sendEmailFunc);

    // Common way to use ForEach()
    emails.forEach(x -> {
      sendEmail(x);
    });

    List<Book> books = new ArrayList<>(List.of(new Book(50.0), new Book(100.0)));

    for (Book b : books) {
      System.out.println(b.getPrice());
    }

    books.forEach(x -> {
      System.out.println(x.getPrice());
    });

    







  }

  public static boolean sendEmail(String emailAddress) {
    System.out.println("I am sending Email ..." + emailAddress);
    return true;
  }

}
