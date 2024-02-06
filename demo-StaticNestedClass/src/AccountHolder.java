import Bank.Account;

public class AccountHolder {
  private String name;
  private Account account;

    public AccountHolder() {

    }

    public AccountHolder(Account account) {
      this.account = account;
    }

    public void serAccount(Account account) {
      this.account = account;
    }

    public Account createAccount(String AccountNo) {
      return new Account(AccountNo);
    }

    public class Account { // Inner class
      private String AccountNo;

      public Account(String AccountNo) {
        this.AccountNo = AccountNo;
      }

      


      public static void main(String[] args) {
        AccountHolder john = new AccountHolder();
        Account johnAccount = john.createAccount("1234");
      }
    
      
    }

}