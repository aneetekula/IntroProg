import java.util.Scanner;
public class LogicalAnd {
    public static void main(String[] args)
    {
        //vars
        int years;
        double salary;
        
        //Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //header
        System.out.println("Loan Qualifier");
        System.out.println("==============");
        
        //getting salary
        System.out.println("What is your salary:");
        salary = keyboard.nextDouble();
        
        //getting years on job
        System.out.println("How many years on the job: ");
        years = keyboard.nextInt();
        
        //Determining if you can get loan
        if (salary >= 50000 && years >= 2)
        {
            System.out.println("You have qualified for the loan.");
        }
        else 
        {
            System.out.println("You have not qualified for the loan.");
        }
    }
}