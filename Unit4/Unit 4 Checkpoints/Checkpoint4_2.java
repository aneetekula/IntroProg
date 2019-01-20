import java.util.Scanner;
public class Checkpoint4_2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double payrateMulti =1;
        double hours;
        System.out.print("Enter # hours workerd:");
        hours = keyboard.nextDouble();
        
        if (hours > 40)
        {
            payrateMulti = 1.5;
        }
        
        System.out.print("Payrate multiplier = " + payrateMulti);
    }
}