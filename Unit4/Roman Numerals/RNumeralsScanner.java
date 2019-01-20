import java.util.Scanner;
public class RNumeralsScanner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        RNumerals r = new RNumerals();
        
        System.out.println("Roman Numerals");
        System.out.println("==============");
        
        System.out.print(r.getQuestion());
        int number = keyboard.nextInt();
        r.setNumber(number);
        
        System.out.print(r.getNumeral());
    }
}