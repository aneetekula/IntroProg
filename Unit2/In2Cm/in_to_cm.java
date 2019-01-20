import java.util.Scanner;
public class in_to_cm
{
    public static void main(String[] args)
    {
        //psuedocode
        //get the number of inches from user
        //convert inches to cm
        //display inches and convert cm
        
        double in;
        double cm;
        
        //create scanner object
        
        Scanner input = new Scanner(System.in);
        
        //heading
        System.out.println("Aneesh LLC Inches to Centimeters Calculator" + 
                "\n===========================================");
        
        //get # of inches
        System.out.print("Number of Inches to convert to Centimeters===>");
        in = input.nextDouble();
        
        //convert in to cm
        
        cm = in * 2.54;
        //display result
        System.out.println("\n" + in + " Inch(es) = " + cm + " Centimeter(s)");
        System.out.printf("\n" + in + " Inches(es) = %,.4f Centimeter(s)", cm);
    }
}