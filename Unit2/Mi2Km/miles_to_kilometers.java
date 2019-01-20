import java.util.Scanner;
public class miles_to_kilometers
{
    public static void main(String[] args)
    {
        double mi;
        double km;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Miles to Kilometers Calculator" + "\n================================");
        System.out.print("\nNumber of Miles=====>");
        mi = keyboard.nextDouble();
        
        km = 1.60934 * mi;
        
        System.out.print("\nNumber of Kilometers = " + km);
        System.out.printf("\n\nNumber of Kilometers = %,.4f", km);
        
    }
}