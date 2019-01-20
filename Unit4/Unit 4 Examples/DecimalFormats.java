import java.text.DecimalFormat;
public class DecimalFormats
{
    public static void main(String[] args)
    {
        double num1 = 12345.6789;
        System.out.println(num1 + " orginal number");
        System.out.println(); //skip a line
        
        double num2 = .8;
        //create decimal format object
        DecimalFormat format1 = new DecimalFormat("#,##0.00");
        System.out.println(format1.format(num1) + " to 2 decimal places");
        
        DecimalFormat format11 = new DecimalFormat(".#");
        System.out.println(format11.format(num2));
        
        /*
         * 0's have a sepcial characteristic...
         * 0's (not #) add leading and trailing zeroes when use
         */
        DecimalFormat format111 = new DecimalFormat("#.#####");
        System.out.println(format111.format(num1));
        
        DecimalFormat format1111 = new DecimalFormat("0.00000");
        System.out.println(format1111.format(num2));
        
        System.out.println(); //skip a line
        
        //create a DecimalFormat for percentage
        //(multiplies by 100 AND rounds)
        DecimalFormat format2 = new DecimalFormat("####%");
        System.out.println(format2.format(num1));
        
        double num3 = 8;
        //create a DecimalFormat for currency
        DecimalFormat format3 = new DecimalFormat("$#,###.00");
        System.out.println(format3.format(num3));
        
        double num4 = 12.34;
        System.out.println(); //skip a line
        DecimalFormat format4 = new DecimalFormat("#");
        System.out.println(format4.format(num4));
    }
}