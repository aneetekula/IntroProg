import java.util.Scanner;
public class Flags
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int score;
        //boolean pf;
        String pf;
        
        System.out.print("Enter your score===>");
        score = keyboard.nextInt();
        
        if (score >= 60) {
            pf = "Pass";
        }
        else {
            pf = "Fail";
        }
        System.out.print("Grade = " + pf);
    }
}