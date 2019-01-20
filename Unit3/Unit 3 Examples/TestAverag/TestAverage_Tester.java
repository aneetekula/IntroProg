/**
 * Program to calculate test average
 */
import java.util.Scanner;
public class TestAverage_Tester
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        //header
        System.out.print("Test Average" + "\n============");
        
        //getting input
        System.out.print("\nEnter the score for test1: ");
        double t1 = keyboard.nextDouble();
        
        System.out.print("Enter the score for test2: ");
        double t2 = keyboard.nextDouble();
        
        System.out.print("Enter the score for test3: ");
        double t3 = keyboard.nextDouble();
        
        TestAverage ta = new TestAverage(t1, t2, t3);
        
        //displaying output
        System.out.print("\nThe score for test 1 is " + ta.getTest1() + "%");
        System.out.print("\nThe score for test 3 is " + ta.getTest2() + "%");
        System.out.print("\nThe score for test 3 is " + ta.getTest3() + "%");
        
        //rounding test average
        System.out.printf("\nThe test average is %,.2f", ta.getAverage());
        System.out.print("%");
    }
}