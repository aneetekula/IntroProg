import java.util.Scanner;
public class CellPhoneScanner
{
    public static void main(String[] args)
    {
        //header
        System.out.println("Best Buy Stock Value Calculator");
        System.out.println("===============================");
        
        //user input
        System.out.print("Enter the manufacturer: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        System.out.print("Enter the model number: ");
        String itemName = input.nextLine();
        
        System.out.print("Enter the retail price: $");
        double price = input.nextDouble();
        
        System.out.print("Enter the number of phones in stock: ");
        int stock = input.nextInt();
        
        System.out.println("\nPhone Details and Retail Value of Stock:\n");
        
        //constructor
        CellPhone c = new CellPhone(name, itemName, price, stock);
        
        //display
        System.out.println("Manufacturer: " + c.getName());
        System.out.println("Model Number: " + c.getItemName());
        System.out.println("Retail Price: " + c.getPrice());
        System.out.println("Num in Stock: " + c.getStock());
        System.out.printf("Retail Value of Stock: $%,.2f", c.getValue());
        
    }
}