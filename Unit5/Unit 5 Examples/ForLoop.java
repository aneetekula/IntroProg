import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        int number = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("For Loop");
        System.out.println("========");
        
        for (number = 1; number <=10; number ++) {//start max, count
            System.out.println("Numner = " + number);
        }
        
        System.out.println("\nDone!");
        
        int num, max;
        
        
        System.out.print("Repeat how many times?===>");
        max = keyboard.nextInt();
        
        for (num =1; num <= max; num ++) {
            System.out.println("Number = " + num);
        }
        System.out.println("\nDone");
    }
}