import javax.swing.JOptionPane;
public class CircleDB
{
    public static void main(String[] args)
    {
        double raduis;
        double area;
        String inputString;
        
        inputString = JOptionPane.showInputDialog(null, "Enter the raduis of the circle.",
                        "Circle Area Calculator", 3);
                        
        raduis = Double.parseDouble(inputString);
        
        area = Math.PI * (Math.pow(raduis, 2));
        
        String strArea = String.format("%,.2f", area);
        
        JOptionPane.showMessageDialog(null, "The area of the cirlce is " + strArea + " units." 
                        , "Circle Area Calculator", 1);
                        
        System.exit(0);
        
    }
}