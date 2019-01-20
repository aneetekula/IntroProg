import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        //values
        String sale = "";
        int totalChange;
        int pay;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        
        //Scanner object
        Scanner keyboard = new Scanner(System.in); 
        
        //header
        System.out.println("Change Calculator");
        System.out.println("=================");
        
        do {
            System.out.print("Enter a number between 1 and 100 inclusive and you will be given change: ");
            pay = keyboard.nextInt();
            if (pay > 100) {
                System.out.println("Number is too high!");
                System.out.print("\nEnter a number between 1 and 100 inclusive and you will be given change: ");
                pay = keyboard.nextInt();
            }
            else if (pay < 0) {
                System.out.println("Number is too low!");
                System.out.print("Enter a number between 1 and 100 inclusive and you will be given change: ");
                pay = keyboard.nextInt();
            }
            totalChange = 100 - pay;
            System.out.println("Total Change = " + totalChange + " cent(s)");
            quarters = totalChange/25;
            totalChange = totalChange % 25;
            dimes = totalChange/10;
            totalChange = totalChange % 10;
            nickels = totalChange/5;
            totalChange = totalChange % 5;
            pennies = totalChange/1;
            System.out.println("Quarters = " + quarters);
            System.out.println("Dimes = " + dimes);
            System.out.println("Nickels = " + nickels);
            System.out.println("Pennies = " + pennies);
            System.out.print("Want to calculate again: "); 
            sale = keyboard.nextLine();
        }while (sale.equalsIgnoreCase("y"));
    }
}