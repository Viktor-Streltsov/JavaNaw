public class Main {
    public static void main(String[] args) {
        BankAccount viktor = new BankAccount(342434534534L, "Viktor", 1000);
        BankAccount maria = new BankAccount(67890, "Maria", 500);
        BankAccount anna = new BankAccount(11111, "Anna");

        System.out.println("Всего создано счетов: " + BankAccount.getCount());

        viktor.showBalance();
        maria.showBalance();
        anna.showBalance();

        viktor.deposit(200);
        viktor.withdraw(300);
        viktor.transfer(maria, 400);
        viktor.addInterest(5);

        viktor.displayAccountInfo();
        maria.displayAccountInfo();
    }
}