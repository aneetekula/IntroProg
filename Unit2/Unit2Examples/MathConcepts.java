public class MathConcepts
{
    public static void main(String[] args)
    {
        double num1 = 89012.3456789;
        
        //rounding
        System.out.print("\nRounding)" + "\n==========================");
        System.out.println("\nnum1 = " + num1);
        System.out.printf("num1 rounded to 2 decimal places %, .2f", num1);
        System.out.printf("\nnum1 rounded to 5 decimal places %, .5f", num1);
        System.out.printf("\nnum1 rounded to 0 decimal places %, .0f", num1);
        
        int numOne; 
        //numOne = num1; //can't do this .... possible loss of precesion
        
        numOne = (int)num1; //num1(double) cast as an it(numOne) - truncated
        System.out.println("\nnum1 truncated and cast as an int = " + numOne);
        System.out.printf("formatting with commas using printf = %,d", numOne);
        
       //integer division
       System.out.print("\n\nInteger Division)" + "\n==========================");
       double result = 1/2 * 10;
       System.out.println("\n1/2 * 10 = " + result);
       System.out.println("(obvoiusly incorrect)");
       //1/2 is mot .5, these are not integers, it is 0
       //soultion: create a floating-point calculation
       result = 1/2.0 * 10;
       System.out.println("1/2 * 10 = " + result);
       System.out.println("(correct)");
       //another possibility is to fast the fraction as the double
       
       result = (double)1/2 * 10;
       System.out.println("1/2 * 10 = " + result);
       System.out.println("(correct)");
    }
}