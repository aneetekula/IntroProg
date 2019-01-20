import javax.swing.JOptionPane;
public class TrapezoidDB
{
    public static void main(String[] args)
    {
        double baseA;
        double baseB;
        double height;
        double area;
        String inputString;
        
        inputString = JOptionPane.showInputDialog(null, "Enter the lenght of the first base.", 
                        "Trapezoid Area Calculator", 3);
                        
        baseA = Double.parseDouble(inputString);
                        
        inputString = JOptionPane.showInputDialog(null, "Enter the lenght of the second base.", 
                        "Trapezoid Area Calculator", 3);
                        
        baseB = Double.parseDouble(inputString);
                        
        inputString = JOptionPane.showInputDialog(null, "Enter the height of the trapezoid.", 
                        "Trapezoid Area Calculator", 3);

        height = Double.parseDouble(inputString);
        
        area = (0.5 * (baseA + baseB)) * height;
        
        String strArea = String.format("%,.2f", area);
        
        JOptionPane.showMessageDialog(null, "The area of the trapezoid is " + strArea + " units.", 
                    "Trapezoid Area Calculator", 1);
                    
        System.exit(0);
    }
}