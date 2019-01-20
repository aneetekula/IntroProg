import java.util.Scanner;
public class RoomAreas
{
    public static void main(String[] args)
    {
        double number;
        double totalArea;
        
        //header
        System.out.println("Room Length, Width & Area");
        System.out.println("=========================");
        
        // Create a Scanner object for keyboard input.
        Scanner input = new Scanner(System.in);
        
        // Create three Rectangle objects.
        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();
        
        // Get and store the dimensions of the kitchen.
        System.out.print("What is the kitchen's length ==> ");
        number = input.nextDouble();
        kitchen.setLength(number);
        System.out.print("What is the kitchen's width ===> ");
        number = input.nextDouble();
        kitchen.setWidth(number);
        
        // Get and store the dimensions of the bedroom.
        System.out.print("What is the bedroom's length ==> ");
        number = input.nextDouble();
        bedroom.setLength(number);
        System.out.print("What is the bedroom's width ===> ");
        number = input.nextDouble();
        bedroom.setWidth(number);
        
        // Get and store the dimensions of the den.
        System.out.print("What is the den's length ======> ");
        number = input.nextDouble();
        den.setLength(number);
        System.out.print("What is the den's width =======> ");
        number = input.nextDouble();
        den.setWidth(number);
        
        // Calculate the total area of the rooms.
        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
        
        //display input
        System.out.println("\nKitchen Area = " + kitchen.getArea() +
                           "\nBedroom Area = " + bedroom.getArea() +
                           "\nDen Area = " + den.getArea());
        
        // Display the total area of the rooms.
        System.out.println("\nThe total area of the room is " + totalArea);
    }
}