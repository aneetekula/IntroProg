import java.util.Scanner;
public class CheckPoint_24
{
    public static void main(String[] args)
    {
        int userNum;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter one of the numbers " +
            "1, 2, or 3: ");
        userNum = keyboard.nextInt();
        
        switch(userNum) {
            case 1:
            System.out.println("You entered " + userNum);
            System.out.println("That is number one");
            break;
            
            case 2:
            System.out.println("You entered " + userNum);
            System.out.println("That is number two");
            break;
            
            case 3:
            System.out.println("You entered " + userNum);
            System.out.println("That is number three");
            break;
            
            default:
            System.out.println("You entered " + userNum);
            System.out.println("That is an invalid number");
            break;
        }
    }
}