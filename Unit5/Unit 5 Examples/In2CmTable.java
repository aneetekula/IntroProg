import java.util.Scanner;
public class In2CmTable {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int start;
        int max;
        double cm;

        ConverterClass in2CM = new ConverterClass();

        System.out.println("Inches To Centimeters");
        System.out.println("=====================");

        System.out.print("Enter the onersion table starting value===>");
        start = keyboard.nextInt();

        System.out.print("Enter the conversion table maximun value===>");
        max = keyboard.nextInt();

        System.out.print("\f");

        System.out.println("Table of Conversions for Inches to Centimeters");
        System.out.println("==============================================");

        System.out.println("Inches\tCentimeters");
        System.out.println("------\t-----------");

        for (int in = start; in <=max; in++) {
            cm = in2CM.getCm(in);
            System.out.printf("%d\t%.2f", in, cm);
        }
        System.out.println("Table Complete");
    }
}