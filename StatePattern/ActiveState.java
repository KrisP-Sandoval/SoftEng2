package StatePattern;

public class ActiveState implements AccountState {
    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful. Current balance: " + account.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void suspend() {
        account.setState(new SuspendedState(account));
        System.out.println("Account is suspended.");
    }

    @Override
    public void activate() {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close() {
        account.setState(new ClosedState(account));
        System.out.println("Account is closed.");
    }
}
