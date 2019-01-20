/*
 * WWP Bank Investment Calculator
 * Matthew Wang and Aneesh Tekulapally period 6 Dialog Box
 * Online future value calculator URL: 
 * http://www.bankrate.com/calculators/savings/compound-savings-calculator-tool.aspx
 * https://www.investor.gov/additional-resources/free-financial-planning-tools/compound-interest-calculator
 */
import javax.swing.JOptionPane;
public class InvestmentJar
{
    public static void main(String[] args)
    {
        //initialize variables  
        double principal,rate,T,amount;
            
            //initialize String
            String inputString;
            
            //Ask for principal value, interest rate, and number of times compounded inputs
            inputString = JOptionPane.showInputDialog(null, "Enter principal amount", "Mattew Wang and Aneesh Tekulapally P6", 3);
            principal = Double.parseDouble(inputString);
            
            inputString = JOptionPane.showInputDialog(null, "Enter interest rate percentage", "Mattew Wang and Aneesh Tekulapally P6", 3);
            rate = Double.parseDouble(inputString);
            
            inputString = JOptionPane.showInputDialog(null, "Enter number of times interest is compounded", 
                                        "WWP Bank Investment Calculator", 3);
                                        
            //convert to double value                            
            T = Double.parseDouble(inputString);
            
            //calculate final amount
            amount =Math.pow((1 + rate /100/ T ), T)*principal;
            
            //format and convert final amount to string
            String strAmount;
            strAmount = String.format("%,.2f", amount);
            
            //display final message and exit
            JOptionPane.showMessageDialog(null, "The principal rate: $" + principal + "\nThe interest rate: " +
                                          rate + "%" + "\nThe number of times interest is compounded per year is: " + T + " times"
                                          + "\nThe total amount is: $" + strAmount, "Mattew Wang and Aneesh Tekulapally P6", 1);
                                          
            System.exit(0);
    }
}