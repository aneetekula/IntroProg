import javax.swing.JOptionPane;
public class CircleDB
{
    public static void main(String[] args)
    {
        //getting input
        String inputString = JOptionPane.showInputDialog(null, "Enter the radius of circle: ", 
                    "Circle Area Calculator", 3);
        double radius = Double.parseDouble(inputString);
        
        //Constructor
        Circle c = new Circle(radius);
                    
        String area = String.format("%,.2f", c.getArea());
        
        //getting output
        JOptionPane.showMessageDialog(null, "The radius of the circle is " + c.getRadius() + 
                        "\nThe area of the circle" + area, "Circle Area Calculator", 1);
        
        //exiting
        System.exit(0);
    }
}