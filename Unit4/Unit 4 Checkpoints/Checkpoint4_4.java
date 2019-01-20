import java.util.Scanner;
public class Checkpoint4_4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        boolean max = false;
        double fees = 0;

        System.out.println("fees= " + fees);
        System.out.println("max = " + max);
        max = true;
        
        if (max == true)
        {
            fees = 50;
        }

        System.out.println("fees" + fees);
        System.out.println("max" + max);
    }
}