import java.util.Scanner;
public class Discount
{
    public static void main(String[] args)
    {
        double price;
        double discountRate;
        double discountAmt;
        double discountPrice;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Discount" + "\n===========");
        System.out.print("\nEnter the price of the item(s) ===>$");
        price = keyboard.nextDouble();
        System.out.print("Enter the discount %================>");
        discountRate = keyboard.nextDouble();
        System.out.print("\nThe orginal price is " + price);
        
        discountAmt = price * (discountRate/100);
        
        System.out.print("\nThe " + discountRate + "%"); 
        System.out.printf(" discount $%,.2f", discountAmt);

        discountPrice = price - discountAmt;
        
        System.out.printf("\nThe sales price is $%,.2f", discountPrice);
    }
}