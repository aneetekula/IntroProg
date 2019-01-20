import java.util.Scanner;
public class RomanNumerals {
    public static void main(String[] args)
    {
        //scanner object
        Scanner k = new Scanner(System.in);
        
        //vars;
        int number;
        
        //Heading
        //System.out.println("Roman Numerals Calculator by Aneesh Tekulapally");
        //System.out.println("===============================================");
        
        //getting input
        System.out.print("Chose a number between 1 and 10: ");
        number = k.nextInt();
        
        //classifying
        switch(number) {
            case 1:
            System.out.println("\nNumber = " + number);
            System.out.println("The Roman Numeral is I");
            break;
            
            case 2:
            System.out.println("\nNumber = " + number);
            System.out.println("The Roman Numeral is II");
            break;
            
            case 3:
            System.out.println("\nNumber = " + number);
            System.out.println("The Roman Numeral is III");
            break;
            
            case 4:
            System.out.println("\nNumber = " + number);
            System.out.println("The Roman Numeral is IV");
            break;
            
            case 5:
            System.out.println("\nNumber = " + number);
            System.out.println("The Roman Numeral is V");
            break;
            
            case 6:
            System.out.println("\nNumber = " + number);
            System.out.println("The Roman Numeral is VI");
            break;
            
            case 7:
            System.out.println("\nNumber = " + number);
            System.out.println("The Roman Numeral is VII");
            break;
            
            case 8:
            System.out.println("\nNumber = " + number);
            System.out.println("The Roman Numeral is VIII");
            break;
            
            case 9:
            System.out.println("\nNumber = " + number);
            System.out.println("The Roman Numeral is IX");
            break;
            
            case 10:
            System.out.println("\nNumber = " + number);
            System.out.println("The Roman Numeral is X");
            break;
            
            default:
            System.out.println("\nNumber = " + number + "\nThat is an invalid number");
        }
    }
}