import java.util.Scanner;
public class Boolean
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int score;
        boolean pf;
        
        System.out.print("Enter your score===>");
        score = keyboard.nextInt();
        
        if (score >= 60) {
            pf = true;
        }
        else {
            pf = false;
        }
        System.out.print("Passing = " + pf);
    }
}