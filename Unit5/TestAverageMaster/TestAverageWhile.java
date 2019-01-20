import java.util.Scanner;
import java.text.DecimalFormat; 
public class TestAverageWhile {
    public static void main(String[] args) {
        double test1;
        double test2;
        double test3;
        double testCounter = 3;
        double average;
        double total;
        double nextTest;
        String input = "y";
        
        Scanner keyboard = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat();
        
        System.out.println("Test Average");
        System.out.println("============");
        
        System.out.print("Enter score or test 1: ");
        test1 = keyboard.nextDouble();
        
        System.out.print("Enter score for test 2: ");
        test2 = keyboard.nextDouble();
        
        System.out.print("Enter score for test 3: ");
        test3 = keyboard.nextDouble();
        
        total = test1 + test2 + test3;
        average = total/testCounter;
        
        System.out.println("Average = " + average);
        
        System.out.print("Do you want to enter another test (Y or N): ");
        input = keyboard.next();
       
        while (input.equalsIgnoreCase("y")) {//yn == 'y' || yn == 'Y') 
            System.out.print("\nEnter score for another test: ");
            nextTest = keyboard.nextDouble();
            testCounter++;
            total = total + nextTest;
            average = total/testCounter;
            System.out.println("Average = " + average);
            nextTest = 0;
            System.out.print("Do you want to enter another test: ");
            input = keyboard.next();
        }
    }
}