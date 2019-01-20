import javax.swing.JOptionPane;
public class miles_to_kilometersDB
{
    public static void main(String[] args)
    {
        String inputString;
        
        double mi, km;
        
        inputString = JOptionPane.showInputDialog(null, "Number of miles: ", "Miles to Kilometers Calculator", 3);
        
        mi = Double.parseDouble(inputString);
        
        km = mi * 1.60934;
        
        String strKm = String.format("%.2f", km);
        
        JOptionPane.showMessageDialog(null, mi + " Number of Mile(s) = " + strKm + " Number of Kilometer(s)", "Miles to Kilometers Calculator", 1); 
        
        System.exit(0);
    }
}