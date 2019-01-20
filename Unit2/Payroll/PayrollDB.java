import javax.swing.JOptionPane;
public class PayrollDB
{
    public static void main(String[] args)
    {
        double hoursWorked;
        double payRate;
        double grossPay;
        
        String inputString;
        
        inputString = JOptionPane.showInputDialog(null, "Enter numbers of hoursworked", "Payroll", 3);
        
        hoursWorked = Double.parseDouble(inputString);
        
        inputString = JOptionPane.showInputDialog(null, "Enter payrate", "Payroll", 3);
        
        payRate = Double.parseDouble(inputString);
        
        grossPay = hoursWorked * payRate;
        
        String strGross = String.format("%,.2f", grossPay);
        
        JOptionPane.showMessageDialog(null, "The number of hoursworked is " + hoursWorked + "\nYour payrate is $" + payRate + "\nThe total grosspay is $" + strGross,                       
                                      "Payroll", 1);
        
        System.exit(0);
    }
}