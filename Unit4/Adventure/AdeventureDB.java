/**
 * Created by Aneesh R Tekulapally on 4/6/2017.
 */
import javax.swing.JOptionPane;
public class AdeventureDB {
    public static void main(String[] args) {
        //vars
        String choice;

        //Adventure Object
        Adeventure adeventure = new Adeventure();

        //First Question
        choice = JOptionPane.showInputDialog(null, adeventure.getQuestion1(), "Adventure Time", 3);

        adeventure.setChoice(choice);
        String x = adeventure.Classify(1);

        if (adeventure.answer != false) {

            choice = JOptionPane.showInputDialog(null, adeventure.Classify(1), "Adventure Time", 3);

            adeventure.setChoice(choice);

            x = adeventure.Classify(2);
            if (adeventure.answer != false) {
                choice = JOptionPane.showInputDialog(null, adeventure.Classify(2), "Adventure Time", 3);
                adeventure.setChoice(choice);

                x = adeventure.Classify(3);
                JOptionPane.showMessageDialog(null, adeventure.Classify(3), "Adventure Time", 1);

            }
            else {
                JOptionPane.showMessageDialog(null, adeventure.Classify(2), "Adventure Time", 1);
            }
        }
        else {

            JOptionPane.showMessageDialog(null, adeventure.Classify(1), "Adventure Time", 1);
        }
        System.exit(0);
    }
}
