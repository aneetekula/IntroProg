import javax.swing.JOptionPane;
public class TriangleDB
{
    public static void main(String[] args)
    {
        double base;
        double height;
        String inputString;
        
        inputString = JOptionPane.showInputDialog(null, "Enter the base of the traingle.", 
                      "Triangle Area Calculator", 3);
                      
        base = Double.parseDouble(inputString);
        
        inputString = JOptionPane.showInputDialog(null, "Enter the height of the triangle.",
                      "Triangle Area Calculator",3);
                      
        height = Double.parseDouble(inputString);
        
        double area;
        
        area = 0.5 * base * height;
        
        String strArea = String.format("%,.2f", area);
        
        JOptionPane.showMessageDialog(null, "The area of the triangle is " + strArea + " units.", 
                        "Triangle Area Calculator", 1);
                        
        System.exit(0);
        
    }
}