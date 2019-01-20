import javax.swing.JOptionPane;
public class AddressLabelsDB
{
    public static void main(String[] args)
    {
        //getting input
        String fName = JOptionPane.showInputDialog(null, "Enter your first name:", "Address Labels Maker" , 3);
        
        String lName = JOptionPane.showInputDialog(null, "Enter your last name:", "Address Labels Maker" , 3);
        
        String streetAddress = JOptionPane.showInputDialog(null, "Enter your street address:", "Address Labels Maker" , 3);
        
        String cityName = JOptionPane.showInputDialog(null, "Enter your city name:", "Address Labels Maker" , 3);
        
        String stateName = JOptionPane.showInputDialog(null, "Enter your state name:", "Address Labels Maker" , 3);
        
        String zipCode = JOptionPane.showInputDialog(null, "Enter your zip code:", "Address Labels Maker" , 3);
        
        //constructor
        AddressLabels al = new AddressLabels(fName, lName, streetAddress, cityName, stateName, zipCode);
        
        //displaying output
        JOptionPane.showMessageDialog(null, al.getfName() + al.getlName() + "\n" + al.getsAdd() + ".\n" + al.getcityName() 
                    + ", " + al.getstateName() + " " + al.getzipCode(), "Address Labels Maker", 1);
                    
        //exiting
        System.exit(0);
    }
}