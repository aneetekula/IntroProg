//Aneesh Tekulapally                
import javax.swing.JOptionPane;
public class DiceDemoDB
{
    public static void main(String[] args)
    {
        // Die objects
        Die die1 = new Die();
        Die die2 = new Die();
        Die die = new Die();
        int Total = 0;

        // Display  info.
        die1.roll();
        die2.roll();
        die.setDies(die1.getValue(), die2.getValue());

        // Displaying output
        JOptionPane.showMessageDialog(null, "Rolling the dice...\n" + die1.getValue() + " AND " +
            die2.getValue() + "\nTotal = " + die.getTotal() + "\nStickman Says: " + die.Nickname() , "Dice", 1);

        // Exitting
        System.exit(0);
    }
}
//Aneesh Tekulapally