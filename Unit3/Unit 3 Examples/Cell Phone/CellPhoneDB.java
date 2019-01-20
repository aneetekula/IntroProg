import javax.swing.JOptionPane;
public class CellPhoneDB
{
    public static void main(String[] args)
    {
        //gettig input
        String name = JOptionPane.showInputDialog(null, "Enter the company name of phone:", 
                            "Best Buy Stock Value Calculator", 3);
                            
        String itemName = JOptionPane.showInputDialog(null, "Enter the phone name:",  
                            "Best Buy Stock Value Calculator", 3);
        
        String inputString = JOptionPane.showInputDialog(null, "Enter the phone price:", 
                            "Best Buy Stock Value Calculator", 3);
        double price = Double.parseDouble(inputString);  //converting                 
            
        inputString = JOptionPane.showInputDialog(null, "Enter the number in stock:", 
                            "Best Buy Stock Value Calculator", 3);
        int stock = Integer.parseInt(inputString); //converting
        
        //Constructor
        CellPhone c = new CellPhone(name, itemName, price, stock);
        
        //rounding
        String strStock = String.format("%,.2f", c.getValue());
        
        //displaying output
        JOptionPane.showMessageDialog(null, "Manufacturer: " + c.getName() + 
                                            "\nModel number: " + c.getItemName() +
                                            "\nRetial price: $" + c.getPrice() +
                                            "\nNumber in stock: " + c.getStock() +
                                            "\nRetail value of stock: $" + strStock, 
                                            "Best Buy Stock Value Calculator", 1);
        
        //exiting
        System.exit(0);
    }
}