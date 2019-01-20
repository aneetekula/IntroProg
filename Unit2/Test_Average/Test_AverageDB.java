/**
 * Test Average Calculator Program
 */
import javax.swing.JOptionPane;
public class Test_AverageDB
{
    public static void main(String[] args)
    {
        double score1, score2, score3, average;
        
        String inputString;
        
        inputString = JOptionPane.showInputDialog(null, "Enter score for test 1: ", "Test Average Calculator", 3);
        
        score1 = Double.parseDouble(inputString);
        
        inputString = JOptionPane.showInputDialog(null, "Enter score for test 2: ", "Test Average Calculator", 3);
        
        score2 = Double.parseDouble(inputString);
        
        inputString = JOptionPane.showInputDialog(null, "Enter score for test 3: ", "Test Average Calculator", 3);
        
        score3 = Double.parseDouble(inputString);
        
        average = (score1 + score2 + score3)/3;
        
        String strAvg = String.format("%,.2f", average);
        
        JOptionPane.showMessageDialog(null, "The score for test 1 is: " + score1 + "%" + "\nThe score for test 2 is: " + score2 + "%" 
                                      + "\nThe score for test 3 is: " + score3 + "%" + "\nThe average of the three tests is: " + strAvg +
                                      "%", "Test Average Calculator", 1);
        
        System.exit(0);
    }
}