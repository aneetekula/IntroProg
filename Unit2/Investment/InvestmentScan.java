/*
 * WWP Bank Investment Calculator
 * Matthew Wang and Aneesh Tekulapally period 6 Investment Scanner
 * Online future value calculator:
 * https://www.investor.gov/additional-resources/free-financial-planning-tools/compound-interest-calculator
 * http://www.bankrate.com/calculators/savings/compound-savings-calculator-tool.aspx
 */
import java.util.Scanner;
public class InvestmentScan
{
    public static void main(String[] args)
    {
    //initialize variables
    double principal,rate,T,amount;
    
    //introduce scanner
    Scanner keyboard = new Scanner(System.in);
    
    //header of program
    System.out.println("\nWWP Bank Investment Calculator");
    System.out.println("=====================");
    
    //ask for principal amount
    System.out.print("What is your principal amount: ");
    principal= keyboard.nextDouble();
    
    //ask for interest rate
    System.out.print("What is your interest rate: ");
    rate= keyboard.nextDouble();
    
    //ask for number of times interest is compounded per year
    System.out.print("What is the number of times the interest is compounded each year: ");
    T= keyboard.nextDouble();
    
    //calculate the final amount
    amount =Math.pow((1 + rate /100/ T ), T)* principal;
    
    //Display inputs and outputs
    System.out.println("\nThe principal rate: $" + principal + "\nThe interest rate: " +
                        rate + "%" + "\nThe number of times interest is compounded per year: " + T + " times"); 
    System.out.printf("The resulting amount: $%,.2f", amount);
     }
}