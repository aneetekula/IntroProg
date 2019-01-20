import java.util.Scanner;
//p.259
public class Conditional
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int score;
        //boolean pf;
        //String pf;
        
        System.out.print("Enter your score===>");
        score = keyboard.nextInt();
        
        System.out.println("Your grade is: " + (score < 60 ? "Fail" : "Pass"));
        //if (score >= 60) {
        //    pf = "Pass";
        //}
        //else {
        //    pf = "Fail";
        //}
        //System.out.print("Grade = " + pf);
    }
}