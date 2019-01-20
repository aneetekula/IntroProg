import java.util.Scanner;
public class Checkpoint4_3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double commission = 0;
        double sales= 0;
        
        if (sales >= 10000)
        {
            commission = 0.2;
        }
        
        System.out.print("The commission rate is " + commission);
    }
}