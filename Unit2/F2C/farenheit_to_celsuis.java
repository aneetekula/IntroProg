import java.util.Scanner;
public class farenheit_to_celsuis
{
    public static void main(String[] args)
    {
        double f;
        double c;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Farenheit to Celsuis Calculator" + "\n================================");
        System.out.print("\nNumber of Degrees Farenheit=====>");
        f = keyboard.nextDouble();
        
        c = (f-32) * 5/9;
        
        System.out.printf("\nNumber of Degrees Celsuis= %,.4f", c);
        
    }
}