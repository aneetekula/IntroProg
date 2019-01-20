import java.util.Scanner;
public class FarenheitToCelsuis{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int start;
        int max;
        double f = 0;

        System.out.println("Farenheit to Celsuis");
        System.out.println("=====================");

        System.out.print("Enter the table starting value===>");
        start = keyboard.nextInt();

        System.out.print("Enter the conversion table maximum value===>");
        max = keyboard.nextInt();

        System.out.print("\f");

        System.out.println("Table of Conversions for Inches to Centimeters");
        System.out.println("==============================================");

        System.out.println("Farenheit\tCelsuis");
        System.out.println("---------\t-------");

        for (f = start; f <=max; f++) {
            double c = (f-32) * 5/9;
            System.out.printf("%f\t%.2f\n", f, c);
        }
        System.out.println("Table Complete");
    }
}