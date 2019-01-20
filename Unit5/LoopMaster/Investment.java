import java.util.Scanner;
public class Investment {
    public static void main(String[] args) {
        double pv;
        double lr;
        double hr;
        double r;
        double t;
        double fv;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Invextment Interest Rate Table");
        System.out.println("==============================");
        
        System.out.print("Principal: $");
        pv = keyboard.nextDouble();        
        
        System.out.print("Time: ");
        t = keyboard.nextDouble();
        System.out.print(" years");
        
        System.out.print("Low Rate: ");
        lr = keyboard.nextDouble();
        System.out.print("%");
        
        System.out.print("High Rate: ");
        hr = keyboard.nextDouble();
        System.out.print("%");
    }
}