import java.util.Scanner;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] arg) {
        int counter = 0;
        int num = 0;
        int input;
        String input2 ;
        char yn = 'y';
        
        Random r = new Random();
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Random Number Guessing Game");
        System.out.println("===========================");
        
        num = r.nextInt(99) + 1;
        
        
        do {
            System.out.println("Answer = " + num);
            System.out.print("Guess random number from 1 to 100===> ");
            input = keyboard.nextInt();
            counter ++;
            if ( input > num) {
                System.out.println("Your guess is to high!\n");
            }
            if (input < num) {
                System.out.println("Your guess is to low!\n");
            }
            if (input == num) {
                System.out.println("You guessed the random number in " + counter + " guesses!");
                System.out.print("Cotinue? (y OR n)===>");
                input2= keyboard.next();
                System.out.println();
                yn = input2.charAt(0);
                num = r.nextInt(99) + 1;
                counter = 0;
                //System.out.print("\f");
            }
        } while (yn== 'Y' || yn == 'y') ;
    }
}