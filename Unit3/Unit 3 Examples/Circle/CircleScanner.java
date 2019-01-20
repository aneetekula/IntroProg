import java.util.Scanner;
public class CircleScanner
{
    public static void main(String[] args)
    {
        //Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //header
        System.out.print("Circle Area Calculator");
        System.out.print("\n========================");
        
        //getting input
        System.out.print("\nEnter the radius:");
        double radius = keyboard.nextDouble();
        
        //Constructor
        Circle c = new Circle(radius);
        
        //Getting output
        System.out.print("The radius of the circle is " + c.getRadius());
        System.out.printf("\nThe area of the circle is %,.2f", c.getArea());
    }
}