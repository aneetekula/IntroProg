import java.util.Scanner;
import java.io.*;
//Aneesh Tekulapally
public class MultipleFieldsMethod
{
    public static String phonename;
    public static double price;
    public static Scanner keyboard = new Scanner(System.in);

    private static void showChoices()
    throws IOException
    {
        System.out.print("\f");
        System.out.println("Best Phones");
        System.out.println("===========");
        System.out.print("[V]iew or [A]ppend Database [V or A]?: ");
        String choice = keyboard.nextLine();
        if (choice.equalsIgnoreCase("V"))
        {
            viewData();
        }
        else if (choice.equalsIgnoreCase("A"))
        {
            appendData();
        }
    }

    public static void main(String[] args)
    throws IOException
    {
        String exit = "";
        char x = ' ';
        do 
        {
            showChoices();

            System.out.print("\nEnter 'X' to [E]XIT or 'C' to [C]ontinue using database(X or C): ");
            exit = keyboard.nextLine();
            x = exit.charAt(0);
            x = Character.toUpperCase(x);
        }while (x != 'X');

    }

    private static void viewData()
    throws IOException
    {
        File file = new File("phone.txt");

        if(!file.exists() || file.length() == 0)
        {
            System.out.println("\nFile does not exist or is empty.");
        }
        else
        {
            Scanner inputFile = new Scanner(file);

            System.out.print("\f");

            System.out.println("My phones");
            System.out.println("=========");
            System.out.println("Phones\t\t\t\t\tPrice");
            System.out.println("=====\t\t\t\t\t=====");

            int n = 1;

            while (inputFile.hasNext())
            {
                System.out.printf("%3d", n++);
                System.out.print(" ");

                phonename = inputFile.nextLine();

                System.out.printf("%-35s", phonename);

                price = inputFile.nextDouble();

                System.out.printf("$%5.2f", price);

                System.out.print("\n");

                inputFile.nextLine();
            }

            inputFile.close();
        }
    }

    private static void appendData()
    throws IOException
    {
        FileWriter fwriter = new FileWriter("phone.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

        System.out.println("Type 'end' as the phone name to STOP entering phones");
        do
        {
            System.out.println();
            System.out.print("Enter the name of the phones: ");
            phonename = keyboard.nextLine();

            if (phonename.equalsIgnoreCase("end"))
            {
                break;
            }
            else if (!(phonename.equalsIgnoreCase("end")))
            {
                System.out.print("Enter the price of the phones: $");
                price = keyboard.nextDouble();

                keyboard.nextLine();

                outputFile.print(phonename);

                outputFile.println();

                outputFile.print(price);

                outputFile.println();
            }
        }while (!(phonename.equalsIgnoreCase("end")));
        fwriter.close();
    }
}

