import java.util.Scanner;
public class Currency
{
    public static void main(String[] args)
    {
        double dollar; //US
        double euro; //Europe
        double yen; //Japan
        double pound; //UK
        double franc; //Swiss
        double canDollar; //Canada
        double zimDollar; //Zimbabwe
        double rial; //Iran
        double bitcoin; 
        double ounce; //gold
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Currency Calculator" + "\n===================");
        
        System.out.print("\nEnter the number of US dollars====>");
        dollar = keyboard.nextDouble();
        
        euro = dollar * .905208;
        yen = dollar * 104.796;
        pound = dollar * .808130;
        franc = dollar * .975670;
        canDollar = dollar * 1.33633;
        zimDollar = dollar * 361.9;
        rial = dollar * 31837.02;
        bitcoin = dollar * .00140874;
        ounce = dollar * .000780794;
        
        System.out.printf
    }
}