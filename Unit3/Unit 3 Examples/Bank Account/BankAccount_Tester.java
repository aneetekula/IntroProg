import java.util.Scanner;
public class BankAccount_Tester
{
    public static void main(String[] args)
    {
        Bank_Account account;
        double balance;
        double interestRate;
        double pay;
        double cashNeeded;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is your account's starting balance?===>");
        balance = keyboard.nextDouble();
        
        System.out.print("\nWhat is your monthly interest rate?===>");
        interestRate = keyboard.nextDouble();
        
        account = new Bank_Account(balance, interestRate);
        
        System.out.print("\nHow much were you paid this month?===>");
        pay = keyboard.nextDouble(); 
        
        System.out.println("\nWe will deposit your pay into your account.");
        account.deposit(pay);
        System.out.println("Your current balance is $" + account.getBalance());
        
        System.out.print("How much would you like to widthdraw? ");
        cashNeeded = keyboard.nextDouble();
        account.withdraw(cashNeeded);
        System.out.print("\nYour current balance is " + account.getBalance());
        
        account.addInterest();
        
        System.out.println("This month you have earned $" + account.getInterest() + "in interest.");
        System.out.println("Now your balance is $" + account.getBalance());
    }
}
