/**
 * Created by Aneesh R Tekulapally on 3/29/2017.
 */
import javax.swing.JOptionPane;
public class LanguageDB {
    public static void main(String[] args) {
        //vars
        String inputString;

        //Language object
        Language l = new Language();

        //getting input
        inputString = JOptionPane.showInputDialog(null, l.getQuestion1(), "Latin Translation Calculator", 3);
        l.setWord1(inputString);

        //classifying
        JOptionPane.showMessageDialog(null, l.classify1(), "Latin Translation Calculator", 1);

        //getting input
        inputString = JOptionPane.showInputDialog(null, l.getQuestion2(), "Latin Translation Calculator", 3);
        l.setWord2(inputString);

        //classifying
        JOptionPane.showMessageDialog(null, l.classify2(), "Latin Translation Calculator", 1);

        //getting input
        inputString = JOptionPane.showInputDialog(null, l.getQuestion3(), "Latin Translation Calculator", 3);
        l.setWord3(inputString);

        //classifying
        JOptionPane.showMessageDialog(null, l.classify3(), "Latin Translation Calculator", 1);

        //getting input
        inputString = JOptionPane.showInputDialog(null, l.getQuestion4(), "Latin Translation Calculator", 3);
        l.setWord4(inputString);

        //classifying
        JOptionPane.showMessageDialog(null, l.classify4(), "Latin Translation Calculator", 1);

        //getting input
        inputString = JOptionPane.showInputDialog(null, l.getQuestion5(), "Latin Translation Calculator", 3);
        l.setWord5(inputString);

        //classifying
        JOptionPane.showMessageDialog(null, l.classify5(), "Latin Translation Calculator", 1);
        
        System.exit(0);
    }
}
