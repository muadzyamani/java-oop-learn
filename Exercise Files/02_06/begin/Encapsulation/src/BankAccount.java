public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
      this.owner = owner;
      this.balance = Math.max(startingBalance, 0);
    }

    public String getOwner() {
      return this.owner;
    }

    public double getBalance() {
      return this.balance;
    }

    public double withdraw(double amount) {
      if (amount <= this.balance) {
        this.balance -= amount;
        return amount;
      }
      return 0;
    }

    public double deposit(double amount) {
      if (amount > 0) {
        this.balance += amount;
        return amount;
      }
      return 0;
    }
}
