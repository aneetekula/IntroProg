import java.util.Scanner;
public class Test_Average
{
   public static void main(String[] args)
   {
       double score1;
       double score2;
       double score3;
       double average;
       
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Test Average" + "\n=============="); 
       System.out.print("\nEnter 3 test scores to find the average...");
       System.out.print("\n\nEnter test score #1===>");
       score1 = keyboard.nextDouble();
       System.out.print("Enter test score #2===>");
       score2 = keyboard.nextDouble();
       System.out.print("Enter test score #3===>");
       score3 = keyboard.nextDouble();
       System.out.printf("\nScore 1 = %,.2f", score1);
       System.out.print("%");
       System.out.printf("\nScore 2 = %,.2f", score2);
       System.out.print("%");
       System.out.printf("\nScore 3 = %,.2f", score3);
       System.out.print("%");
       average = (score1 + score2 + score3)/3;
       System.out.printf("\nAverage = %,.2f", average);
       System.out.print("%");
   }
}