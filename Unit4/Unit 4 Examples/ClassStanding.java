//import statements
import java.util.Scanner;
public class ClassStanding
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int grade;
        
        System.out.println("Genesis Scheduling for WW-P");
        System.out.println("===========================");
        
        System.out.print("What grade are you in: ");
        grade = keyboard.nextInt();
        
        if (grade <= 7 || grade >=12)
        {
            System.out.println("You are in an invalid grade number");
        }
    }
}