import java.text.DecimalFormat;
public class OddEven
{
    private double number;
    public String message;
    
    public OddEven()
    {
       //no-arg constructor
    }
 
    public void setNumber(double n) {
        number = n;
    }
    
    public double getNumber() {
        return number;
    }
    
    public String getOddEven() {
        DecimalFormat format1 = new DecimalFormat("#");
        if (number % 2 == 0) {
            message = "The number " + format1.format(number) + " is even.";
        }
        else if (number % 2 == 1) {
            message = "The number " + format1.format(number) + " is odd.";
        }
        else {
            message = "Number " + number + " is INVALID!" + "\nYou must enter a whole number";
        }
        return message;
    }
}