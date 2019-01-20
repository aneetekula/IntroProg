import java.util.Scanner;
public class Circle
{        
       public static void main(String[] args)
       {
        double raduis;
        double area;
           
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Circle Area Calculator" + "\n=========================");
        System.out.print("\nEnter the raduis of the circle====>");
        raduis = keyboard.nextDouble(); //inputting raduis
        
        area = Math.pow(raduis, 2) * Math.PI; //area of cirlce
        
        System.out.print("The raduis is " + raduis + " units."); //displaying raduis
        System.out.printf("\nThe area of the cirlce is %,.2f", + area); 
        System.out.print(" units.");
        
        /*
         * Resources:
         * Google
         * Calculator Soup
         */
    }
}