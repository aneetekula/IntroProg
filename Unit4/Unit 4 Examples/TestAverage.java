import java.util.Scanner;
public class TestAverage{
    public static void main(String[] args)
    {
        //variables
        double score1, score2, score3, average;
        char letter;
        
        //creating Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //header
        System.out.println("This program averages 3 test averages");
        
        //getting score 1
        System.out.print("Enter the score for test 1====>");
        score1 = keyboard.nextDouble();
        
        //getting score 2
        System.out.print("Enter the score for test 2====>");
        score2 = keyboard.nextDouble();
        
        //getting score 3
        System.out.print("Enter the score for test 3====>");
        score3 = keyboard.nextDouble();
        
        //calculating average
        average = (score1 + score2 + score3)/3;
        
        //displaying average and rounding
        System.out.print("The average of the three tests is ");
        System.out.printf("%,.2f\n", average);
        
        //Displaying letter grade
        if(average >= 89.45)
        {
            letter = 'A';
            System.out.println("Letter Grade = " + letter); 
        }
        else if(average >=79.45)
        {
            letter = 'B';
            System.out.println("Letter Grade = " + letter);  
        }
        else if (average >=69.45)
        {
            letter = 'C';
            System.out.println("Letter Grade = " + letter); 
        }
        else if (average >=59.45)
        {
            letter = 'D';
            System.out.println("Letter Grade = " + letter); 
        }
        else if(average < 59.45)
        {
            letter = 'F';
            System.out.println("Letter Grade = " + letter); 
        }
        else if(average < 0)
        {
            System.out.println("Invalid Score!"); 
        }
    }
}