public class Calculate
{
    public static void main(String[] args)
    {
       // variables where numbers are stored
      
       int num1= 5, num2=10, num3=15, num4=20;
       
       // varibales where calucaltions are stored
       int add, sum, mult, div;
       //calculations
       
       add = num1 + num2;
       sum= num4 - num2;
       mult= num1 * num3;
       div= num4/num1;
       
       //display
       System.out.println("My Calculations");
       System.out.println("==============================");
       System.out.println(num1 + " + " + num2 + " = " + add);
       System.out.println(num4 + " - " + num2 + " = " + sum);
       System.out.println(num1 + " * " + num3 + " = " + mult);
       System.out.println(num4 + " / " + num1 + " = " + div);
    }
}