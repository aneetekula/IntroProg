import java.util.Scanner;
public class Wheelbarrow {
    public static void main(String[] args) {
        int input = 0, total = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Truck's Full capacity is 1000 lbs.");
        System.out.println("==================================");
        
        while (input >= 0)
        {
            System.out.print("Loading wheelbarrow...# of lbs===>");
            input = keyboard.nextInt();
            total = total + input;
            System.out.println("Total lbs. = " + total + "\n");
            if (total == 1000) {
                System.out.println("You are at the 1000 lbs limit!");
                break;
            }
            else if (total > 1000) {
                System.out.println("You are OVER the 1000 lb limit!");
                System.out.println("Remove " + (total - 1000) + "lb(s)");
                break;
            }
        }
        System.out.println("Goodbye...");
    }
}