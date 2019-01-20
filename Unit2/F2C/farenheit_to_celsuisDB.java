/**
 * F2C Calculator Program
 */
import javax.swing.JOptionPane;
public class farenheit_to_celsuisDB
{
    public static void main(String[] args)
    {
        String inputString;
        
        double F, C;
        
        inputString = JOptionPane.showInputDialog(null, "Enter number of degrees Farenehit", 
                                                  "Farenheit to Celsuis Calculator", 3);
                                                  
        F = Double.parseDouble(inputString); //converting to dobule
        
        C = (F-32) * 5/9; //converting to Celsuis
        
        String strC = String.format("%,.2f", C); //formatting string
        
        JOptionPane.showMessageDialog(null, F + " degrees farenheit is: " + strC + " degrees celsuis",
                                      "Farenheit to Celsuis Calculator", 1);
        
        System.exit(0);
    }
}