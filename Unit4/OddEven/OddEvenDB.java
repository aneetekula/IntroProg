import javax.swing.JOptionPane;
public class OddEvenDB
{
    public static void main(String[] args) {
        String inputString;
        double number;
        
        OddEven oe = new OddEven();
        
        inputString = JOptionPane.showInputDialog(null, "Enter an integer: ", "Odd or Even", 3);
        number = Double.parseDouble(inputString);
        oe.setNumber(number);
        
        JOptionPane.showMessageDialog(null, oe.getOddEven(), "Odd or Even", 1);
        
        System.exit(0);
    }
}