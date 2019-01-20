import java.util.Scanner;
import java.io.*;
public class WriteAppend
{
    public static void main(String[] args) throws IOException
    {
        String filename; // File name
        String friendName; // Friend's name
        int numFriends; // Number of friends

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Get the number of friends.
        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();

        // Consume the remaining newline character.
        keyboard.nextLine();

        // Get the filename.
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();

        //Open the file.
        FileWriter fwriter = new FileWriter(filename + ".txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

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

        System.out.println("Data written to file.");
    }
}
