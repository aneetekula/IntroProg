/**
 * Created by Aneesh R Tekulapally on 3/29/2017.
 */
import javax.swing.JOptionPane;
public class LanguageAns {
    public static void main(String[] args) {
        //vars
        String inputString;

        //Language object
        Language l = new Language();

        //getting input
        inputString = JOptionPane.showInputDialog(null, l.getQuestion1(), "salve", 3);
        l.setWord1(inputString);

        //classifying
        JOptionPane.showMessageDialog(null, l.classify1(), "salve", 1);

        //getting input
        inputString = JOptionPane.showInputDialog(null, l.getQuestion2(), "vale", 3);
        l.setWord2(inputString);

        //classifying
        JOptionPane.showMessageDialog(null, l.classify2(), "vale", 1);

        //getting input
        inputString = JOptionPane.showInputDialog(null, l.getQuestion3(), "bellum", 3);
        l.setWord3(inputString);

        //classifying
        JOptionPane.showMessageDialog(null, l.classify3(), "bellum", 1);

        //getting input
        inputString = JOptionPane.showInputDialog(null, l.getQuestion4(), "cibus", 3);
        l.setWord4(inputString);

        //classifying
        JOptionPane.showMessageDialog(null, l.classify4(), "cibus", 1);

        //getting input
        inputString = JOptionPane.showInputDialog(null, l.getQuestion5(), "somnum", 3);
        l.setWord5(inputString);

        //classifying
        JOptionPane.showMessageDialog(null, l.classify5(), "somnum", 1);

        System.exit(0);
    }
}
