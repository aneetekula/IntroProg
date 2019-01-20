import java.util.Scanner;
public class TwoNumbersAdd {
    public static void main(String[] args) {
        int input1=1, input2=1, total=0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Type two numbers to be added ...");
        System.out.println("When either number is 0, the program should end.");
        System.out.println("================================================");
        
        while (input1 != 0 & input2 !=0) {
            System.out.print("Number1===>");
            input1 = keyboard.nextInt();
            System.out.print("Number2===>");
            input2 = keyboard.nextInt();
            total = input1 + input2;
            System.out.println("Total = " + total + "\n");
        }
        System.out.println("Goodbye...");
    }
}