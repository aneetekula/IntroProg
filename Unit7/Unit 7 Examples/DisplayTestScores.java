import java.util.Scanner;

public class DisplayTestScores
{
    public static void main(String[] args)
    {
        int numTests; // Number of tests
        int[] tests; // To reference an array of scores
        int testAverage = 0;
        int total =0;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the number of test scores.
        System.out.print("How many tests do you have? ");
        numTests = keyboard.nextInt();

        // Create an array to hold that number of scores.
        tests = new int[numTests];

        // Get the individual test scores.
        for (int index = 0; index < tests.length; index++)
        {
            System.out.print("Enter test score "
                + (index + 1) + ": ");
            tests[index] = keyboard.nextInt();
        }
        // Display the test scores.
        System.out.println();
        System.out.println("Here are the scores you entered:");
        for (int index = 0; index < tests.length; index++)
        {
              System.out.println(tests[index]);
              total = tests[index] + total;
              testAverage =total/numTests;
        }
        
        System.out.println("Test Average: " + testAverage);
    }
}