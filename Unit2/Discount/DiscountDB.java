/**
 * Discount Program
 */
import javax.swing.JOptionPane;
public class DiscountDB
{
    public static void main(String[] args)
    {
        double price;
        double discountRate;
        double discountAmt;
        double discountPrice;
        
        String inputString;
        
        inputString = JOptionPane.showInputDialog(null, "Enter the price of object: ", "Discount", 3);
        
        price = Double.parseDouble(inputString);
        
        inputString = JOptionPane.showInputDialog(null, "Enter the discount rate: ", "Discount", 3);
        
        discountRate = Double.parseDouble(inputString);
        
        discountAmt = price * (discountRate/100);
        
        discountPrice = price - discountAmt;
        
        String strRate = String.format("%,.2f", discountAmt);
        
        String strPrice = String.format("%,.2f", discountPrice);
        
        JOptionPane.showMessageDialog(null, "The orginal price of object is $" + price + "\nThe discount rate is " + discountRate + "%" + "\nThe discount amount is $" +
                                      strRate + "\nThe discount price is $" + strPrice, "Discount", 1);
    }
}