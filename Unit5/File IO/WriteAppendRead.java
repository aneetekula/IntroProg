import java.util.Scanner;
import java.io.*;
public class WriteAppendRead
{
    public static void main(String[] args) 
    throws IOException
    {
        String choice;
        String filename = ""; // File name
        String friendName; // Friend's name
        int numFriends; // Number of friends

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Would you like to [W]rite or [A]ppend to a file (W or A)?: ");
        choice = keyboard.nextLine();
        
        //write the info
        if (choice.equalsIgnoreCase("W"))
        {
            // Get the number of friends.
            System.out.print("How many friends do you have? ");
            numFriends = keyboard.nextInt();

            // Consume the remaining newline character.
            keyboard.nextLine();

            // Get the filename.
            System.out.print("Enter the filename: ");
            filename = keyboard.nextLine();
            System.out.print("\n");

            //Open the file.
            File file = new File(filename + ".txt");
            
            if (file.exists())
            {
                System.out.print("The file " + (filename + ".txt") + " already exists, press ENTER to EXIT...");
                keyboard.nextLine();

                System.exit(0);
            }

            //open the file
            PrintWriter outputFile = new PrintWriter(filename + ".txt");

            //Get data and write it to the file.
            for (int i = 1; i <= numFriends; i++)
            {
                //Get the name of the friend
                System.out.print("Enter the name of friend number " + i + ": ");
                friendName = keyboard.nextLine();

                //Wirte the name to the file.
                outputFile.println(friendName);
            }

            //Close the file.
            outputFile.close();
        }
        
        //apend the info to a file
        else if (choice.equalsIgnoreCase("A"))
        {
             System.out.print("How many friends do you have? ");
            numFriends = keyboard.nextInt();

            // Consume the remaining newline character.
            keyboard.nextLine();

            // Get the filename.
            System.out.print("Enter the filename: ");
            filename = keyboard.nextLine();
            System.out.print("\n");
            
            FileWriter fwriter = new FileWriter(filename + ".txt", true);
            PrintWriter outputFile = new PrintWriter(fwriter);
            
             for (int i = 1; i <= numFriends; i++)
            {
                //Get the name of the friend
                System.out.print("Enter the name of friend number " + i + ": ");
                friendName = keyboard.nextLine();

                //Wirte the name to the file.
                outputFile.println(friendName);
            }
            
            fwriter.close();
        }
        
        File file = new File(filename + ".txt");
        if(!file.exists())
        {
            System.out.println("The file " + filename + " does not exist.");
            
            System.exit(0);
        }
        
        Scanner inputFile = new Scanner(file);
        
        System.out.println("\nMy Friends");
        System.out.println("==========");
        //display the lines
        while (inputFile.hasNext())
        {
            //read a name
            friendName = inputFile.nextLine();
            
            //display a name
            System.out.println(friendName);
        }
        //close the file
        inputFile.close();
        
    }
}
