import java.util.Scanner; //needed for scanner class
public class Scanner_Input
{
    public static void main(String[] args)
    {
        String firstName;
        String lastName;
        int pin;
        String studID = "123456";
        System.out.println("School Connections Gateway Portal");
        System.out.println("========================================");
        
        //create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //focus on "user-friendly" prom
        //DON'T USE A PRINTLN STATEMENT!
        
        System.out.print("Enter your first name=====>");
        firstName = keyboard.nextLine();
        //the .nextLine() method handles strngs
        
        System.out.print("Enter your last name here====>");
        lastName = keyboard.nextLine();
        
        System.out.print("Enter your pin number=====>");
        pin = keyboard.nextInt();
        //.nextInt() is for integers
        
        System.out.println("\nHello, " + firstName + " " + lastName);
        System.out.println("Your studentID is " + studID);
        System.out.println("Welcome to the Gateway Portal!");
        
    }
}
