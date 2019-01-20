public class Payroll
{
    public static void main(String[] args)
    {
       double hoursWorked=39.25;
       double hourlyRate=8.33;
       double grossPay;
       
       grossPay= hoursWorked * hourlyRate;
       
       System.out.println("Payroll Calculation" + "\n======================");
       System.out.println("The number of hours worked is " + hoursWorked + ".");
       System.out.println("The hourly rate is $" + hourlyRate + ".");
       System.out.println("The total grosspay is $" + grossPay + ".");
       
       //printf is a print formatter
       
       System.out.printf("\nGrosspay = $%,.3f", grossPay);
       
       //% - all print froamts begin with %
       //, - display commas where nesscary
       //.2 - rounds to 2 decimal places
       //f - signifies you are formatting a double
       //d- signfies you are formatting a int
    }
}