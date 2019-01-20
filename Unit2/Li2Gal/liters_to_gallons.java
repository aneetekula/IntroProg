import java.util.Scanner;
public class liters_to_gallons
{
    public static void main(String[] args)
    {
        double li;
        double gal;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Liters to Gallons Calculator" + "\n================================");
        System.out.print("\nNumber of Liters=====>");
        li = keyboard.nextDouble();
        
        gal = 0.26417205236 * li;
        
        System.out.print("\nNumber of Gallons = " + gal);
        System.out.printf("\n\nNumber of Gallons = %,.4f", gal);
        
    }
}