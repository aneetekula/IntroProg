import java.util.Scanner;
public class Trapezoid
{        
       public static void main(String[] args)
       {
        double baseA;
        double baseB;
        double height;
        double fraction = 0.5;
        int fractionOne;
        double area;
           
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Trapezoid Area Calculator" + "\n=========================");
        System.out.print("\nEnter the first base of the trapezoid====>");
        baseA = keyboard.nextDouble();
        
        System.out.print("Enter the second base of the trapezoid=====>");
        baseB = keyboard.nextDouble();
        
        System.out.print("Enter the height of the trapezoid=====>");
        height = keyboard.nextDouble();
        
        fractionOne = (int)fraction;
        area = (fraction * (baseA + baseB)) * height;
        
        System.out.print("The first base is " + baseA + " units.");
        System.out.print("\nThe second base is " + baseB + " units.");
        System.out.print("\nThe height is " + height + " units.");
        System.out.printf("\nThe area of the trapezoid is %,.2f", area); 
        System.out.print(" units.");
        
        /*
         * Resources:
         * Google
         * Casio
         */
    }
}