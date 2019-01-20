import java.util.Scanner;
public class Quiz2_2
/**
 * Program to convert ounces to grams
 */
{
    public static void main(String[] args)
    {
        double ounces;
        double grams;
       
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Ounces to Grams Calculator by Aneesh Tekulapally" +
                         "\n================================================");
        System.out.print("\nEnter the number of ounces to convert to grams===>");
        ounces = keyboard.nextDouble(); //entering user input
        
        System.out.print("\nNumber of ounces inputted is " + ounces + " oz.");
        
        grams = ounces * 28.3495; //formula for ounces to grams
        
        System.out.print("\n\n" + ounces + " Ounce(s) = "); 
        System.out.printf("%,.2f", grams);
        System.out.print(" gram(s).");
        
    }
}
