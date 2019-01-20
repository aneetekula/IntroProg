import javax.swing.JOptionPane;
import java.util.Random;
public class RandomNumberDB {
    public static void main(String[] arg) {
        int counter = 0;
        int num = 0;
        int input;
        String input2 ;
        char yn = 'y';
        
        Random r = new Random();
        
        num = r.nextInt(99) + 1;
        
        do {
            String inputString = JOptionPane.showInputDialog(null, "Guess random number from 1 to 100: ", "Random Number Game",  3);
            input = Integer.parseInt(inputString);
            counter ++;
            if ( input > num) {
                JOptionPane.showMessageDialog(null, "Your guess is to high!", "Random Guessing Game", 3);
            }
            if (input < num) {
                JOptionPane.showMessageDialog(null, "Your guess is to low!", "Random Guessing Game", 3);
            }
            if (input == num) {
                input2 = JOptionPane.showInputDialog(null, "You guessed the random number in " + counter + " guesses!" + "\nPlay Again" +
                        " (y or n):", "Random Number Game", 3);
                yn = input2.charAt(0);
                num = r.nextInt(99) + 1;
            }
        } while (yn== 'Y' || yn == 'y') ;
    }
}