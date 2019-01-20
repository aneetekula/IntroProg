import java.util.Scanner;
public class Triangle
{        
       public static void main(String[] args)
       {
        double base;
        double height;
        double area;
           
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Triangle Area Calculator" + "\n=========================");
        System.out.print("\nEnter the base of the triangle====>"); //inputting base
        base = keyboard.nextDouble();
        
        System.out.print("Enter the height of the triangle=====>");
        height = keyboard.nextDouble(); //inputting height
        
        area = (1.0/2.0) * base * height; //calculting area
        
        System.out.print("The base is " + base + " units."); //displaying output
        System.out.print("\nThe height is " + height + " units.");
        System.out.printf("\nThe area of the triangle is %,.2f", + area); 
        System.out.print(" units.");
        
        /*
         * Resources:
         * Google
         * Casio
         */
    }
}