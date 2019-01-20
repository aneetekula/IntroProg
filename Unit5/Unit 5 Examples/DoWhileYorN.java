import java.util.Scanner;
public class DoWhileYorN {
    public static void main(String[] args) {
        String input;
        char yn;
        int num=0;
        
        Scanner keyboard = new Scanner(System.in);
        
        do {
            System.out.println("Number of iterations = " + ++num);
            
            System.out.print("Cotinue? (y OR n)===>");
            input= keyboard.nextLine();
            
            System.out.println();
            
            yn=input.charAt(0);
            
        } while (yn== 'Y' || yn == 'y');
        System.out.println("Process Complete");
        }
}
