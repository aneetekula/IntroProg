import javax.swing.JOptionPane;
public class SquareDB
{
    public static void main(String[] args)
    {
        double l; //l is for lenght
        double area;
        String inputString;
        
        inputString = JOptionPane.showInputDialog(null, "Enter the side lenght of the square", 
                      "Square Area Calaculator", 3);
                    
        l = Double.parseDouble(inputString);
        
        area = Math.pow(l, 2);
        
        String strArea = String.format("%,.2f", area);
        
        JOptionPane.showMessageDialog(null, "The total area of the square is: " + strArea + " units.", "Sqaure Area Calculotor", 1);
        
        System.exit(0);
    }
}