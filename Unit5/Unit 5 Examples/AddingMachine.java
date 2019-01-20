import java.util.Scanner;
public class AddingMachine {
    public static void main(String[] args) {
        int total = 0 ,input = 1;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Type numbers to add ... Type 0 to stop");
        System.out.println("======================================");
        while (input !=0) {
            System.out.print("Number===>");
            input = keyboard.nextInt();
            total = total + input;
            System.out.println("Total = " + total + "\n");
        }
        System.out.println("Process complete...");
    }
}