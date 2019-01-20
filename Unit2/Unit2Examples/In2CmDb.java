import javax.swing.JOptionPane;
public class In2CmDb
{
    public static void main(String[] args)
    {
        //declare variables
        String inputString;
        double in, cm;
        
        //get user input
        //DIALOG BOXES ONLY ACCEPT STRINGS
        inputString = JOptionPane.showInputDialog(null, "Enter number of Inches:","Inches to Centimeters Converter", 3);
        
        //convert string to double
        in = Double.parseDouble(inputString);
        
        //convert in to cm
        cm = 2.54 * in;
        
        //printf will cause terminl windows to launch 
        //round to 2 decimal places with String.format
        
        String strCm = String.format("%,.2f", cm);
        
        JOptionPane.showMessageDialog(null, in + " Inch(es) = " + cm + " Centmeter(s)", "Inches to Centimeters Converter", 1);
        
        System.exit(0);
    }
}