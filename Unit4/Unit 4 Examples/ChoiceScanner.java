import java.util.Scanner;
public class ChoiceScanner
{
    public static void main(String[] args)
    {
        //variables
        String letter;
        
        //create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        Choice c = new Choice();
        
        //Header
        System.out.println("Closet Planet Question");
        System.out.println("========================");
        
        //getting question
        System.out.print(c.getQuestion());
        letter = keyboard.nextLine();
        
        //set user's choice
        c.setChoice(letter);
        
        //display result
        System.out.println("You chose " + c.getChoice() + "\n" + c.classify());
        
        System.out.println("Press enter to move on to the next question");
        keyboard.nextLine();
        System.out.print("\f");
        
        //getting question 2
        System.out.print("\n"+ c.getQuestion2());
        letter = keyboard.nextLine();
        
        //user's choice
        c.setChoice(letter);
        
        //display result
        System.out.println("You chose " + c.getChoice() + "\n" + c.classify2());
        
        System.out.println("Press enter to move on to the next question");
        keyboard.nextLine();
        System.out.print("\f");
        
        
        //getting question 3
        System.out.print("\n" + c.getQuestion3());
        letter = keyboard.nextLine();
        
        //user's choice
        c.setChoice(letter);
        
        //display result
        System.out.println("You chose " + c.getChoice() + "\n" + c.classify3());
        
        System.out.println("Press enter to end the program");
        keyboard.nextLine();
        System.out.print("\f");
        
    }
}