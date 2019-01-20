import java.util.Scanner;
public class Payroll
{
    public static void main(String[] args)
    {
        double hoursWorked;
        double payRate;
        double grossPay;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Payroll" + "\n===============");
        System.out.print("\nEnter your hours worked===>");
        hoursWorked = keyboard.nextDouble();
        System.out.print("Enter your hourly pay rate===>");
        payRate = keyboard.nextDouble();
        System.out.printf("\nYou worked %,.2f", hoursWorked); 
        System.out.print(" hours this week.");
        System.out.printf("\nYou earn $%,.2f", payRate); 
        System.out.print(" per hour.");
        
        grossPay = hoursWorked * payRate;
        
        System.out.printf("\nYou earned $%,.2f", grossPay); 
        System.out.print(" gross pay this week.");
    }
}