//this is a tester class
import java.util.Scanner;
public class RectangleSetGet
{
    public static void main(String[] args)
    {
        //create Scanner object
        Scanner input = new Scanner(System.in);
        
        //create a rectangle object
        Rectangle rect = new Rectangle();
        
        //user input
        System.out.print("Enter length of rectangle ==> ");
        double l = input.nextDouble();
        
        System.out.println("Sending the value " + l + " to setLength method.");
        //rect.setLength(10.0); THIS WORKS!!!
        //rect.setLength(l);
        
        System.out.println("Done.");
        
        System.out.print("Enter width of rectangle ==> ");
        double w = input.nextDouble();
        
        System.out.println("Sending the value " + w + " to setWidth method.");
        //rect.setLength(20.0); THIS WORKS!!!
        //rect.setWidth(w);
        
        //method call to multiple arguments
        rect.setLengthANDWidth(l,w);
        
        System.out.println("Done.");
        
        System.out.println("\nGetting the values from the getLength & getWidth methods");
        System.out.println("Length = " + rect.getLength() + "\nWidth = " + rect.getWidth());
        System.out.println("Area = " + rect.getArea());
    }
}