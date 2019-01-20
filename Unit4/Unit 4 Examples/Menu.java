import java.util.Scanner;
public class Menu {
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        String menu = "";
        String message = "";
        //int choice = 0;
        String choice = "";
        
        menu = ("Welcome to Mil-Mail" + "\n==============" + "\n\t1) Check Email" + "\n\t2) Change Account Settings"
                + "\n\t3) Logout" + "\nMake your selection: "); 
                
        System.out.print(menu);
        choice = k.nextLine();
        
        //display
        switch(choice) {
            case "1":
            message = ("\nSelection = 1" + "\nEmail busy ...Sorry, try again later");
            break;
            
            case "2":
            message = ("\nSelection = 2" + "\nAccont manager offline ... Sorry, try again later");
            break;
            
            case "3":
            message = ("\nSelection = 3" + "\nLogging off...Goodbye!");
            break;
            
            default:
            message = ("\nSelection = " + choice + "\nYou made an invalid selection");            
        }
        System.out.println(message);
    }
}