import java.util.Scanner;
public class OddEvenScanner
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        double number;
        
        OddEven oe = new OddEven();
        
        System.out.println("Odd or Even Calculator");
        System.out.println("======================");
        
        System.out.print("Enter an integer: ");
        number = keyboard.nextDouble();
        oe.setNumber(number);
        
        System.out.print(oe.getOddEven());
    }
}