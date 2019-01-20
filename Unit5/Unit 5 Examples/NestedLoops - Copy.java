import java.util.Scanner;
import java.awt.Toolkit;
public class NestedLoops {
    public static void main(String[] args) 
    throws InterruptedException
    {
        int counter = 0;
        String yn = "";
        
        Scanner keyboard = new Scanner(System.in);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        System.out.print("Test alarm system (y or n) ===>");
        yn = keyboard.nextLine();
        
        System.out.print("\f");
        
        while (yn.equalsIgnoreCase("y"))
        {
            counter = 0 ;
            do {
                System.out.print("...testing...");
                tk.beep();
                ++counter;
                Thread.sleep(500);
                System.out.print("\f");
            }while (counter<10);
            System.out.print("Test alarm system again? (y or n)===>");
            yn = keyboard.nextLine();        
            System.out.print("\f");
        }
        System.out.print("Exiting Test Mode!");
    }
}