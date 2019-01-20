import java.util.Scanner;
public class TimeScanner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        Time t = new Time();
        
        System.out.println("Time Calculator");
        System.out.println("================");
        
        System.out.print(t.getQuestion());
        int seconds = keyboard.nextInt();
        t.setSeconds(seconds);
        
        System.out.print(t.getCalculation());
    }
}