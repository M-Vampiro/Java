public class Account {
  private int balance;

  private AccountHolder accountholder;

  // private String type; // Saving, Forex, etc...

  public Account(AccountHolder accountholder) {
    this.balance = 0;
    this.accountholder = accountholder;
  }
  
  public void credit(int amount) { // add
    this.balance += amount;
  }

  public boolean debit(int amount) {
    if (this.balance < amount) {
      return false;
    } else {
      this.balance -= amount;
      return true;
    }

  }
}
