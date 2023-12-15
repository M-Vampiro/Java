import java.util.Arrays;

public class Account {
  private int balance;
  private Transactions[] transactions;

  private AccountHolder accountholder;

  // private String type; // Saving, Forex, etc...

  public Account(AccountHolder accountholder) {
    this.balance = 0;
    this.accountholder = accountholder;
    this.transactions = new Transactions[0];
  }

  public Account(String name, int age) {
    this.balance = 0;
    this.accountholder = new AccountHolder(name, age);
    this.transactions = new Transactions[0];

  }

  public void addTranaction(Transactions transactions) {
    Transactions[] newArr = Arrays.copyOf(this.transactions, this.transactions.length + 1);
    newArr[newArr.length - 1] = transactions;
    this.transactions = newArr;
  }

  public int balance() {
    int sum = 0;
    for (int i = 0; i < this.transactions.length; i++) {
      // isCredit , amount
      if (this.transactions[i].isCredit()) {
      sum += this.transactions[i].getAmount();
    } else {sum -= this.transactions[i].getAmount();}
  } return sum;

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

    public boolean transfer(Account from, Account to, int amount) {

    }

  
  public static void main(String[] args) {

  }
}
