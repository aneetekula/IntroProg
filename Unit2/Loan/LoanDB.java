/*
 * Loan Calculator by Aneesh Tekulapally
 */
import javax.swing.JOptionPane;
public class LoanDB
{
    public static void main(String[] args)
    {
        //declaring variables
        double principal;
        double years;
        double annualRate;
        double n; 
        double k;
        double c; 
        
        //declaring string
        String inputString;
        
        //requesting input values
        inputString = JOptionPane.showInputDialog(null, "Enter the principal rate: ", 
                                                 "Loan Calculator", 3);
        principal = Double.parseDouble(inputString); //converting string to double
        
        inputString = JOptionPane.showInputDialog(null, "Enter number of years to pay off loan: ", 
                                                  "Loan Calculator", 3);
        years = Double.parseDouble(inputString); 
        
        inputString = JOptionPane.showInputDialog(null, "Enter annual rate: ", 
                                                  "Loan Calculator", 3);
        annualRate = Double.parseDouble(inputString); 
        
        //calculating values
        n = years * 12;
        k = annualRate / 1200.0;
        c = Math.pow((1 + k), n);
       
        double monthlyPayment = (principal * k * c) / (c - 1);
        double totalInterest = (n * (monthlyPayment))-principal;
       
        //rounding
        String strMonthlyPayment = String.format("%,.2f", monthlyPayment);
        String strTotalInterest = String.format("%,.2f", totalInterest);
        
        //displaying output
        JOptionPane.showMessageDialog(null, "Principal = $" + principal + "\nTime = " + years + " years" + "\nInterest Rate = " +
                                        annualRate  + "%"+ "\n\nMontly Payment = $" + strMonthlyPayment + "\nTotal Interest Paid = $" +
                                        strTotalInterest, "Loan Calculator", 1);
                                        
        System.exit(0);
    }
}