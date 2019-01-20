import javax.swing.JOptionPane;
public class Li2GalDB
{
    public static void main(String[] args)
    {
        double li, gal;
        String inputString;
        
        inputString = JOptionPane.showInputDialog(null, "Enter number of liters:", "Liters to Gallons Calculator", 3);
        
        li = Double.parseDouble(inputString);
        
        gal = li * 0.26417205236;
        
        String strGal = String.format("%,.2f", gal);
        
        JOptionPane.showMessageDialog(null, li + " liters = " + strGal + " gallons", 
                                        "Liters to Gallons Calculator", 1);
                                        
        System.exit(0);
    }
}