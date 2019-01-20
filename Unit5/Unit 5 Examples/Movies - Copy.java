import java.util.Scanner;
public class Movies {
    public static void main(String[] args) {
        int input = 0, total = 500;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Movie Theater Has 500 seats");
        System.out.println("=============");
        
        while (total <= 500) {
            System.out.print("Enter number of movie tickets wanted===>");
            input = keyboard.nextInt();
            total = total - input;
            if (total == 0) {
                System.out.println("You purchased the last ticket(s)!");
                break;
            }
            else if (total < 0) {
                System.out.println("You cant purchase this many tickets!");
                total = total + input;
            }
            System.out.println("Tickets Left = " + total + "\n");
        }
        System.out.println("Goodbye...");
    }
}