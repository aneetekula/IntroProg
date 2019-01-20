import javax.swing.JOptionPane;
public class CurrencyDB
{
    public static void main(String[]args)
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
        
        String inputString;
        
        inputString = JOptionPane.showInputDialog(null, "Enter the number of dollars", "Dollar to World Currenc Calculator", 3);
        
        dollar = Double.parseDouble(inputString);
        euro = Double.parseDouble(inputString);
        yen = Double.parseDouble(inputString);
        pound = Double.parseDouble(inputString);
        franc = Double.parseDouble(inputString);
        canDollar = Double.parseDouble(inputString);
        zimDollar = Double.parseDouble(inputString);
        rial = Double.parseDouble(inputString);
        bitcoin = Double.parseDouble(inputString);
        ounce = Double.parseDouble(inputString);
        
        euro = dollar * .905208;
        yen = dollar * 104.796;
        pound = dollar * .808130;
        franc = dollar * .975670;
        canDollar = dollar * 1.33633;
        zimDollar = dollar * 361.9;
        rial = dollar * 31837.02;
        bitcoin = dollar * .00140874;
        ounce = dollar * .000780794;
        
        String strEuro = String.format("%,.2f", euro);
        String strYen = String.format("%,.2f", yen);
        String strPound = String.format("%,.2f", pound);
        String strFranc = String.format("%,.2f", franc);
        String strCanDollar = String.format("%,.2f", canDollar);
        String strZimDollar = String.format("%,.2f", zimDollar);
        String strRial = String.format("%,.2f", rial);
        String strBitcoin = String.format("%,.9f", bitcoin);
        String strOunce = String.format("%,.9f", ounce);
        
        JOptionPane.showMessageDialog(null, "$ " + dollar + " US dollars (USD) = " + "\n_________________________"
                            + "\n\n(EUR) Euro: " + strEuro + "\n(JPY) Japenese Yen: " + strYen + "\n(GBP) Great Britain Pound(s): " 
                            + strPound + "\n(CHF) Swiss Franc(s): " + strFranc + "\n(CAD) Canadian Dollar(s): " + strCanDollar + 
                            "\n(ZWB) Zimbabwe Dollar(s): " + strZimDollar + "\n(IRR) Iranian Rial: " + strRial +
                            "\n(XBT) Bitcoin(s): " +strBitcoin + "\n(XAU) Gold Ounce(s): " + strOunce, "Dollar to World Currency Calculator", 3);
    }
}