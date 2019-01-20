import java.util.Scanner;
public class CarScannerDemo
{
    public static void main(String[] args)
    {
        //vars 
        int Year;
        String Make;
        String Model;
        double Speed;
        double Seconds;
        double Acc;
        double Dcc;
        
        //Scanner
        Scanner s = new Scanner(System.in);
        
        //Start outputting etc...
        System.out.print("Car Demonstration");
        System.out.print("\n=================");
        
        //Start asking...
        System.out.print("\nEnter the year of the vehicle===========>");
        Year = s.nextInt();
        
        System.out.print("\nEnter the Make of the vehicle===========>");
        Make = s.next();
        System.out.print("\nEnter the Model of the vehicle==========>");
        Model = s.next();
        
        //create Car object...
        Car c = new Car(Year, Make, Model);
        
        Model = c.getModel();
        
        System.out.print("\n\nHow fast is the " + Model + " traveling?(MPH)==>");
        Speed = s.nextDouble();
        c.setSpeed(Speed);
        //display current speed...
        Speed = c.getSpeed();
        System.out.print("\n\nCurrent Speed = " + Speed + " MPH");
        
        //get accel secs...
        System.out.print("\nFor each second you acceleerate, you will go 1 MPH faster...");
        System.out.print("\nHow many seconds do you want to accelerate?=====>");
        Seconds = s.nextDouble();
        
        c.setSeconds(Seconds);

        //accelerate
        c.Accelerate();
        
        //display current speed again...
        Speed = c.getSpeed();
        System.out.print("\n\nCurrent Speed = " + Speed + " MPH");
        
        //get Brake secs..
        System.out.print("\nFor each second you brake, you will go 5 MPH slower...");
        System.out.print("\nHow many seconds do you want to brake?=====>");
        Seconds = s.nextDouble();
        
        c.setSeconds(Seconds);
        
        //brake...
        c.Deccelerate();
        
        //display current speed again...
        Speed = c.getSpeed();
        System.out.print("\n\nCurrent Speed = " + Speed + " MPH");
        
        System.out.print("\nVehicle = " + Year + " " + Make + " " + Model);
 
    }    
}