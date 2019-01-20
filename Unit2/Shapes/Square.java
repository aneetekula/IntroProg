import java.util.Scanner;
public class Square
{
    public static void main(String[] args)
    {
        double sideLenght; 
        double squareArea;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Square Area Calculator" + "\n=========================");
        System.out.print("\nEnter the side lenght of the square====>");
        sideLenght = keyboard.nextDouble();
        
        squareArea = Math.pow (sideLenght, 2); //area
        
        System.out.print("The side lenght is " + sideLenght + " units.");
        System.out.printf("\nThe area of the square is %,.2f", + squareArea); 
        System.out.print(" units.");
        
        /*
         * Resources:
         * Google
         * Calculator Soup
         */
    }
}