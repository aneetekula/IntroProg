import java.util.Scanner;
public class Alphabetical {
    public static void main(String[] args) {
        //prompt user to enter two words
        /**
         * Create decision strcuture
         * Display the words in alphabetical order
         */
        
        Scanner k = new Scanner(System.in) ;
        
        System.out.print("Enter word one: ");
        String word1 = k.nextLine();
        
        System.out.print("Enter word two: ");
        String word2 = k.nextLine(); 
        
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("The words are the same.");
        }
        else if (word1.compareToIgnoreCase(word2) < 0) {
            System.out.println(word1 + " is before " + word2);
        }
        else if (word1.compareToIgnoreCase(word2) > 0) {
            System.out.println(word2 + " is before " + word1);
        }
    }
}