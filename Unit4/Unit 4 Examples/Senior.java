import java.util.Scanner;
public class Senior
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        
        System.out.println("Senior");
        System.out.println("=======");
        
        System.out.print("What is your age: ");
        age = keyboard.nextInt();
        
        if (age <=0 || age >= 121) //logical or pipes
        {
            System.out.println("Age out of range!");
        }
        //else if (!(age < 1 && age <=64)) //logical and (ampersands) 
        else if (!(age < 65 && age <=120)) //logical not
        {
            System.out.println("You are not eligible for Medicare");
        }
        else if (age >= 64 && age <= 120)
        {
            System.out.println("You are eligible for Medicare.");
        }
        //else if (age >= 121)
        //{
        //    System.out.println("You are eligible for Medicare");
        //}
    }
}