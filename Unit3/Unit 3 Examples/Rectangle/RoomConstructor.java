import java.util.Scanner;
public class RoomConstructor
{
    public static void mian(String[] args)
    {
        //defining variables
        double roomLenght;
        double roomWidth;
        double totalArea;
        Rectangle6 kitchen, bedroom, den;
        
        //header
        System.out.println("Room Length, Width & Area");
        System.out.println("=========================");
        
        // Create a Scanner object for keyboard input.
        Scanner input = new Scanner(System.in);
        
        
        // Get and store the dimensions of the kitchen.
        System.out.print("What is the kitchen's length ==> ");
        roomLenght = input.nextDouble();
        System.out.print("What is the kitchen's width ===> ");
        roomWidth = input.nextDouble();
        kitchen = new Rectangle6(roomLength, roomWidth);
        
        // Get and store the dimensions of the bedroom.
        System.out.print("What is the bedroom's length ==> ");
        roomLenght = input.nextDouble();
        System.out.print("What is the bedroom's width ===> ");
        roomWidth = input.nextDouble();
        bedroom = new Rectangle6(roomLength, roomWidth);
        
        // Get and store the dimensions of the den.
        System.out.print("What is the den's length ======> ");
        number = input.nextDouble();
        System.out.print("What is the den's width =======> ");
        number = input.nextDouble();
        den = new Rectangle6(roomLength, roomWidth);
        
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
 