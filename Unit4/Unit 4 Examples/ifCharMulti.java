import java.util.Scanner;
public class ifCharMulti {
    public static void main(String[] args) {
        //create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //variables
        String input;
        char letter;
        
        System.out.print("Input the letter A for Access===>");
        input = keyboard.nextLine();
        letter = input.charAt(0);
        //letter = Character.toUppperCase(letter); //or toLowerCase
        //letter = keyboard.nextLine().toUpperCase().charAt(0);
        
        if (letter == 'A')
        {
            System.out.println("Access Granted. " + "\nYou entered the letter " + letter);
        }
        else
        {
            System.out.println("Access Denied." + "\nYou entered the letter " + letter);
        }
    }
    }
