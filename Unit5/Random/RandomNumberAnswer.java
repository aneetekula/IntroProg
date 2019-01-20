import javax.swing.JOptionPane;
import java.util.Random;
public class RandomNumberAnswer {
    public static void main(String[] arg) {
        int counter = 0;
        int num = 0;
        int input;
        String input2 ;
        char yn = 'y';
        
        Random r = new Random();
        
        num = r.nextInt(99) + 1;
        
        do {
            String inputString = JOptionPane.showInputDialog(null, "Guess random number from 1 to 100: " + "\nNumber = " + num, "Random Numbers",  3);
            input = Integer.parseInt(inputString);
            counter ++;
            if ( input > num) {
                JOptionPane.showMessageDialog(null, "Your guess is to high!", "Random Numbers", 3);
            }
            if (input < num) {
                JOptionPane.showMessageDialog(null, "Your guess is to low!", "Random Numbers", 3);
            }
            if (input == num) {
                input2 = JOptionPane.showInputDialog(null, "You guessed the random number in " + counter + " guesses!" + "\nPlay Again" +
                        " (y or n):", "Random Numbers", 3);
                yn = input2.charAt(0);
                num = r.nextInt(99) + 1;
                counter = 0;
            }
        } while (yn== 'Y' || yn == 'y') ;
    }
}