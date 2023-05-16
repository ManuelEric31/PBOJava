public class Account {
    protected double balance;
    protected Account(double initBalance)
    {
        balance = initBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit (double amount)
    {
        balance = balance + amount;
    }
    public void withdraw (double amt) throws OverdraftException {
        if (amt <= balance)
            balance = balance - amt;
        else
            throw new OverdraftException("Dana Anda tidak cukup", balance);
    }
}
