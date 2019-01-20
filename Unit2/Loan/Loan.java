/*
 * Loan Calculator by Aneesh Tekulapally
 */
import java.util.Scanner;
public class Loan
{
    public static void main(String[] args)
    {
       //defining variables
       double principal;
       double years;
       double annualRate;
       
       //Asking Input
       System.out.println("Loan Calculator");
       System.out.println("===============");
       
       System.out.print("Enter the amount of the loan (principal) ===============> $");
       Scanner input = new Scanner(System.in);
       principal = input.nextDouble();
       
       System.out.print("Enter the number of years for the loan to be paid off ==> ");
       years = input.nextDouble();       
       
       System.out.print("Enter the annual interest rate of the loan =============> ");
       annualRate = input.nextDouble();
       
       //Calculations
       double n = years * 12;
       double k = annualRate / 1200.0;
       double c = Math.pow((1 + k), n);
       
       double monthlyPayment = (principal * k * c) / (c - 1);
       
       //Displaying output and rounding
       System.out.printf("\n\nPrincipal = $%,.2f", principal);
       System.out.printf("\nTime = %,.2f years", years);
       System.out.println("\nInterest Rate " + annualRate + "%.");
       System.out.printf("\nMonthly Payment = $%,.2f", monthlyPayment);
       System.out.printf("\nTotal Interest Paid = $%,.2f", (n * monthlyPayment) - principal);
       
    }
}