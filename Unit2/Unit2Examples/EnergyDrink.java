import javax.swing.JOptionPane;
public class EnergyDrink
{
    public static void main(String[] args)
    {
        int amtCustomer; //amount of customers
        int weekly; //amount of customers that purchase weekly
        int citrusFlavor; //amount of energy drink drinkers that prefer citrus flavors
        String inputString;
        
        inputString = JOptionPane.showInputDialog(null, "Enter the numebr of customers surveyed", "Energy Drink Information", 3);
                      
        amtCustomer = Integer.parseInt(inputString);
        
        weekly = (18/100) * amtCustomer;
        citrusFlavor = weekly * (58/100);
        
        JOptionPane.showMessageDialog(null, "The number of customers in a survey " 
                                    + amtCustomer + "\nThe number of customers that purchase energy drinks on a weekly basis " + weekly + 
                                    "\nThe number of customers that prefer citrus flavored energy drinks are " + citrusFlavor, 
                                    "Energy Drink Information", 1);
                            
    }
}   