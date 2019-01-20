import java.util.Scanner;
public class AdressLabelsScanner
{
    public static void main(String[] args)
    {
        //creating Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //creating header
        System.out.print("Addres Labels Maker");
        System.out.print("\n====================");
        
        //getting input
        System.out.print("\nEnter your first name: ");
        String fName = keyboard.nextLine();
        
        System.out.print("Enter your last name: ");
        String lName = keyboard.nextLine();
        
        System.out.print("Enter your street address name: ");
        String streetAddress = keyboard.nextLine();
        
        System.out.print("Enter your city name: ");
        String cityName = keyboard.nextLine();
        
        System.out.print("Enter your state name: ");
        String stateName = keyboard.nextLine();
        
        System.out.print("Enter your zipcode: ");
        String zipCode = keyboard.nextLine();
        
        //constructor
        AddressLabels al = new AddressLabels(fName, lName, streetAddress, cityName, stateName, zipCode);
        
        //displaying output
        System.out.print("\n" + al.getfName() + "" + al.getlName() + "\n" + al.getsAdd() + ".\n" + al.getcityName() 
                    + ", " + al.getstateName() + " " + al.getzipCode());
    }
}