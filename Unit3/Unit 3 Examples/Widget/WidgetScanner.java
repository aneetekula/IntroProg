import java.util.Scanner;
public class WidgetScanner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        //header
        System.out.print("Widget Calculator");
        System.out.print("\n=================");
        
        //input
        System.out.print("\nHow many widgets are needed?====>");
        double widget = keyboard.nextInt();
        
        Widget w = new Widget(widget);
        
        double time = (w.getDays());
        double timeR = Math.ceil(time);
        
        //output
        System.out.printf("It will take %,.0f ", timeR);
        System.out.print("days to create " + w.getWidget() + " widgets.");
    }
}