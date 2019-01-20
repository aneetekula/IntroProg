import javax.swing.JOptionPane;
public class Payroll_Tester
{
    public static void main(String[] args)
    {
        Payroll p = new Payroll();
        
        //getting input
        String inputString= JOptionPane.showInputDialog(null, "Enter the number of hours worked: ", 
                        "Payroll Calculator", 3);
        double hw = Double.parseDouble(inputString);
        p.sethoursWorked(hw);
        
        String inputString1= JOptionPane.showInputDialog(null, "Enter the hourly pay rate: ", 
                        "Payroll Calculator", 3);
        double pr = Double.parseDouble(inputString1);
        p.setpayRate(pr);
        
        String inputString2= JOptionPane.showInputDialog(null, "Enter the number of dependents: ", 
                        "Payroll Calculator", 3);
        int nod = Integer.parseInt(inputString2);
        p.setnumberOfDependents(nod);
        
        //rounding output
        String grosspay = String.format("%,.2f", p.getGrossPay());
        String FWT = String.format("%,.2f", p.getFWT());
        String netpay = String.format("%,.2f", p.getnetPay());
        
        //displaying output
        JOptionPane.showMessageDialog(null, "The number of hours worked is " + p.gethoursWorked() + 
            "\nThe hourly payrate is $" + p.getpayRate() + "\nThe number of depedents is " 
            + p.getnumberOfDependents() + "\n\nThe gross pay is $" + grosspay + 
            "\nThe FWT is $" + FWT + "\nThe net pay is $" + netpay, "Payroll Calculator", 1);
            
        System.exit(0);
    }
}