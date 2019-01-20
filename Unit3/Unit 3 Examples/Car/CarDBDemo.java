//import statement...
import javax.swing.JOptionPane;
public class CarDBDemo
{
    public static void main(String[] args)
    {
        //vars 
        int Year;
        String Make;
        String Model;
        double Speed;
        double Seconds;
        double speed1 = 0;
        String inputString;
        double acc;
        double dcc;
      
        inputString = JOptionPane.showInputDialog(null, "Enter the Year of the Car", "Car Simulator", 3);
        Year = Integer.parseInt(inputString);
       
        Make = JOptionPane.showInputDialog(null, "Enter the Make of the Car", "Car Simulator", 3);
       
        Model = JOptionPane.showInputDialog(null, "Enter the Model of the Car", "Car Simulator", 3);
        
        //create Car object...
        Car c = new Car(Year, Make, Model);
        
        Model = c.getModel();
        
        inputString = JOptionPane.showInputDialog(null, "How fast is the " + Model + " traveling?(MPH)", "Car Simulator", 3);
        Speed = Double.parseDouble(inputString);
        c.setSpeed(Speed);
        
        //display current speed...
        Speed = c.getSpeed();
        speed1 = Speed;

        //get accel secs...
        inputString = JOptionPane.showInputDialog(null, "Current Speed = " + Speed + " MPH" + 
                "\n\nFor each second you accelerate, you will go 1 MPH faster..." + 
                "\nHow many seconds do you want to accelerate?", "Car Simulator", 1);
        Seconds = Double.parseDouble(inputString);
        acc = Seconds;
        c.setSeconds(Seconds);
        
        //accelerate
        c.Accelerate();
        
        //display current speed again...
        Speed = c.getSpeed();

        //get Brake secs..

        inputString = JOptionPane.showInputDialog(null, "Current Speed = " + Speed + " MPH" + 
                "\n\nFor each second you brake, you will go 5 MPH slower..." + 
                "\nHow many seconds do you want to brake?", "Car Simulator", 1);
        Seconds = Double.parseDouble(inputString);
        dcc = Seconds;
        c.setSeconds(Seconds);
        
        //brake...
        c.Deccelerate();
        
        //display current speed again...
        Speed = c.getSpeed();

        

        JOptionPane.showMessageDialog(null, "Speed Test for " + Year + " " + Make + " " + Model + "..." + "\nOriginal Speed: "
                    + speed1 + " MPH" + "\nAcceleration Time: " + acc + " second(s)" + "\nBraking Time: "
                    + dcc + " second(s)" + "\nFinal Speed: " + c.getSpeed() + " MPH", "Car Simulator", 1);

        //exiting 
        System.exit(0);
        }
}