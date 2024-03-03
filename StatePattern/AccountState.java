package StatePattern;

public interface AccountState {
    void activate();
    void suspend();
    void close();
    void deposit(double amount);
    void withdraw(double amount);
}
