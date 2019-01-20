import java.util.Scanner;
public class ifExample1
{
    public static void main(String[] args)
    {
        int input;
        
        //create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Input the number 1 or 2====>");
        input = keyboard.nextInt();
        
        if (input == 1) //relational operator, = assignmnet operator
        {
            System.out.println("You entered the number 1");
        }
        else if (input == 2)
        {
            System.out.println("You entered the number 2");
        }
        else //anything else
        {
            System.out.print("You entered the number" + input + ",\n which is INVALID!");
        }
    }
}