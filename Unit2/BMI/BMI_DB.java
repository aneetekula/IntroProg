import javax.swing.JOptionPane;
public class BMI_DB
{
    public static void main(String[] args)
    {
        double weight;
        double weightKilo;
        double height;
        double heightCm;
        double BMI;
        
        String inputString;
        String name;
        
        name = JOptionPane.showInputDialog(null, "Enter your name", "BMI Calculator", 3);
        
        inputString = JOptionPane.showInputDialog(null, "Enter your weight", "BMI Calculator", 3);
        weight = Double.parseDouble(inputString);
        
        inputString = JOptionPane.showInputDialog(null, "Enter your height", "BMI Calculator", 3);
        height = Double.parseDouble(inputString);
        
        weightKilo = 0.453592 * weight;
        heightCm = height * 2.54;
        
        BMI = (weightKilo/(Math.pow(heightCm, 2))) * 10000;
        

        JOptionPane.showMessageDialog(null, "Hello " + name + "," + "\nYour height is " + height + " inches." + "\nYour weight is " + weight + " pounds."  
                               + "\n...calculates a BMI of ..." + "\n=====> " + BMI + " <====" + "\n________________________________" 
                               + "\nUnderweight===>less than 18.5" + "\nNormal weight==>18.5 to 24.9" + "\nOverweight=====>25 to 29.9" + 
                               "\nObesity==========>BMI of 30 or greater", "BMI Calculator", 1);
                            
        System.exit(0);
    }
}