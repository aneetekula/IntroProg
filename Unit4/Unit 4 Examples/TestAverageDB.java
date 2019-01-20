import javax.swing.JOptionPane;
public class TestAverageDB
{
    public static void main(String[] args)
    {
        //variables
        double score1, score2, score3, average;
        char letter;
        
        //getting test1 and converting
        String inputString = JOptionPane.showInputDialog(null, "Enter the score for test 1", "Score Average Calculator",
                        3);
        score1 = Double.parseDouble(inputString);
        
        //getting test2 and converting
        inputString = JOptionPane.showInputDialog(null, "Enter the score for test 2", "Score Average Calculator",
                        3);
        score2 = Double.parseDouble(inputString);
        
        //getting test3 and converting
        inputString = JOptionPane.showInputDialog(null, "Enter the score for test 3", "Score Average Calculator",
                        3);
        score3 = Double.parseDouble(inputString);
        
        //caclutating average
        average = (score1 + score2 + score3)/3;
        
        //rounding
        String strAverage = String.format("%,.2f", average);
        
       
        //if statement
       if(average >= 89.45)
        {
            letter = 'A';
            JOptionPane.showMessageDialog(null, "The average of three tests is " + strAverage + "\nLetter Grade: " + letter, "Score Average Calculator", 1);
        }
        else if(average >=79.45)
        {
            letter = 'B';
            JOptionPane.showMessageDialog(null, "The average of three tests is " + strAverage + "\nLetter Grade: " + letter, "Score Average Calculator", 1);
        }
        else if (average >=69.45)
        {
            letter = 'C';
            JOptionPane.showMessageDialog(null, "The average of three tests is " + strAverage + "\nLetter Grade: " + letter, "Score Average Calculator", 1);
        }
        else if (average >=59.45)
        {
            letter = 'D';
            JOptionPane.showMessageDialog(null, "The average of three tests is " + strAverage + "\nLetter Grade: " + letter, "Score Average Calculator", 1); 
        }
        else if(average < 59.45)
        {
            letter = 'F';
            JOptionPane.showMessageDialog(null, "The average of three tests is " + strAverage + "\nLetter Grade: " + letter, "Score Average Calculator", 1); 
        }
        else if(average < 0)
        {
            JOptionPane.showMessageDialog(null, "Invalid Score", "Score Average Calculator", 1);
        }
    }
}