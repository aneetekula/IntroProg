import java.util.Scanner;
public class Invest {
    public static void main(String[] args) {
        double invested;
        double time;
        double interestRateLow;
        double interestRateHigh;
        double futureValue;
        int option = 1;
        double i;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Investment Interest Rate Table");
        System.out.println("==================================");
        
        System.out.print("Enter principal value(amount invested): ");
        invested = keyboard.nextDouble();
        
        System.out.print("Enter time in years for investment: ");
        time = keyboard.nextDouble();
        
        System.out.print("Enter low interest rate percentage: ");
        interestRateLow = keyboard.nextDouble();
        
        System.out.print("Enter high interest rate percentage: ");
        interestRateHigh = keyboard.nextDouble();
        
        System.out.println("\nOption\tRate\tFuture Value");
        System.out.println("------\t----\t------------");
        
        
        for (i = interestRateLow; i <=interestRateHigh; i = i + 0.5) {
            futureValue = invested * (Math.pow((1 + (i * 0.01)), time));
            System.out.print(option);
            System.out.printf("\t%.2f", i);
            System.out.printf("\t$%,.2f\n", futureValue);
            option++;
        }
    }
}