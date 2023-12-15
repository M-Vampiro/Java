import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transactions { // Entry
  // enum

  // String description
  // String from
  private boolean isCredit;
  private LocalDateTime datetime;
  private int amount;

  public void Transaction(LocalDateTime dateTime, boolean isCredit, int amount) {
    this.datetime = datetime;
    this.isCredit = isCredit;
    this.amount = amount;
  }
  public boolean isCredit() {
    return this.isCredit;
  }
  
  public void Transaction(boolean isCredit, int amount) {
    this(LocalDateTime.now() , isCredit , amount);
  }

  public int getAmount() {
    return this.amount;
  }

  @Override
  public String toString() {
    return "Transaction(" //
    + "datetime: " + this.datetime //
    + ", isCredit" + this.isCredit//
    + ", Amount=" + this.amount//
    + ")";
  }

}
