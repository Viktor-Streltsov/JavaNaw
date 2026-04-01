public class BankAccount {
    private long accountNumber;
    private String owner;
    private double balance;
    private static int count = 0;

    public BankAccount(long accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        count++;
    }

    public BankAccount(long accountNumber, String owner) {
        this(accountNumber, owner, 0);
    }

    public BankAccount() {
        this(0, "Unknown", 0);
    }

    public double getBalance() {
        return balance;
    }

    public static int getCount() {
        return count;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Баланс пополнен на сумму " + amount + " Итог: " + balance);
        } else {
            System.out.println("Ошибка: сумма пополнения должна быть положительной!");
            return;
        }
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Ошибка: недостаточно средств! Доступно: " + this.balance);
            return;
        }

        balance = balance - amount;

        System.out.println("Произошло снятие денег на сумму " + amount + " Итог: " + balance);
    }

    public void showBalance() {
        System.out.println("Баланс: " + balance);
    }

    public void displayAccountInfo() {
        System.out.println("Информация о счете: Владелец - " + owner + " Баланс: " + balance);
    }

    public void transfer(BankAccount targetAccount, double amount) {
        if (amount < 0) {
            System.out.println("Ошибка: сумма перевода должна быть положительной!");
            return;
        }

        if (this.balance < amount) {
            System.out.println("Ошибка: недостаточно средств! Доступно: " + this.balance);
            return;
        }

        if (targetAccount == null) {
            System.out.println("Ошибка: счет получателя не существует!");
            return;
        }

        if (this == targetAccount) {
            System.out.println("Ошибка: нельзя перевести деньги на свой же счет!");
            return;
        }

        this.balance -= amount;
        targetAccount.balance += amount;

        System.out.println("Перевод выполнен успешно!");
        System.out.println("Сумма: " + amount);
        System.out.println("Отправитель: " + this.owner + " (счет: " + this.accountNumber + ")");
        System.out.println("Получатель: " + targetAccount.owner + " (счет: " + targetAccount.accountNumber + ")");
        System.out.println("Ваш баланс: " + this.balance);
    }

    public void addInterest(double interestRate) {
        if (interestRate <= 0) {
            System.out.println("Ошибка: процентная ставка должна быть положительной!");
            return;
        }

        double interest = balance * (interestRate / 100);

        balance += interest;

        System.out.println("Начислены проценты: " + interestRate + "%");
        System.out.println("Сумма процентов: " + interest);
        System.out.println("Новый баланс: " + balance);
    }
}
