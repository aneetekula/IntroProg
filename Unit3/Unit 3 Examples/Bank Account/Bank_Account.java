public class Bank_Account
{
    private double balance;
    private double interestRate; 
    private double interest;
    
    public Bank_Account(double startBalance, double intRate)
    {
        balance = startBalance;
        interestRate = intRate;
        interest = 0;
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    
    public void addInterest()
    {
        interest = balance * interestRate;
        balance += interest;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public double getInterest()
    {
        return interest;
    }
}