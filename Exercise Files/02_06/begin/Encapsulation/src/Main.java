public class Main {

    public static void main(String[] args) {
      BankAccount account = new BankAccount("Ahmad", 100000);

      account.withdraw(10000);
      System.out.println(account.getBalance());
    }
}
