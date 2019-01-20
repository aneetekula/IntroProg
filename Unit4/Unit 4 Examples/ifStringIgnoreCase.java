import java.util.Scanner;
public class ifStringIgnoreCase {
    public static void main(String[] args) {
        //create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //variables
        String input;
        //char letter;
        
        System.out.print("Input the letter A for Access===>");
        input = keyboard.nextLine();
        //letter = input.charAt(0);
        //letter = Character.toUppperCase(letter); //or toLowerCase
        //letter = keyboard.nextLine().toUpperCase().charAt(0);
        
        //can use variale.lenght() to determine how many chars in String
        if (input.equalsIgnoreCase("A"))  { //not case sensistive
            System.out.println("Access Granted. " + "\nYou entered A");
        }
        else if (input.equalsIgnoreCase("B")) {
            System.out.println("You entered B");
        }
         else if (input.equalsIgnoreCase("C")) {
            System.out.println("You entered C");
        }
        else {
            System.out.println("Access Denied." + "\nYou entered " + input);
        }
    }
    }
