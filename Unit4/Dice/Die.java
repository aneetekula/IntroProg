//Aneesh Tekulapally
import java.util.Random;
public class Die
{
    //vats
    private int value; 
    private String message;
    private int num1;
    private int num2;
    private int Total;

    public Die() {
        // sides = numSides;
        roll();
    }

    public void roll() {
        // Create a Random object.
        Random rand = new Random();
        
        value = rand.nextInt(6) + 1;
    }

    public void setDies(int s, int w) {
        num1 = s;
        num2 = w;

        Total = num1 + num2; //getting total
    }

    public int getTotal() {
        return Total;
    }

    public String Nickname() {
        if (Total == 5 || Total == 7 || Total == 9 || Total == 11) {
            switch(Total) {
                case 5:
                message = ("\nFever Five");
                break;

                case 7:
                message = ("\nSeven Out");
                break;

                case 9:
                message = ("\nNina");
                break;

                case 11:
                message = ("\nYo-Leven");
                break;
            }
        } 
        else {
            if (num1 == 1 && num2 == 1) {
                message = ("\nDoubles-Snake Eyes");
            }
            if (num1 == 2 && num2 == 2) {
                message = ("\nDoubles-Ballerina");
            }
            if (num1 == 3 && num2 == 3) {
                message = ("\nDoubles-Brooklyn Forest");
            }
            if (num1 == 4 && num2 == 4) {
                message = ("\nDoubles-Square Pair");
            }
            if (num1 == 5 && num2 == 5) {
                message = ("\nDoubles-Puppy Paws");
            }
            if (num1 == 1 && num2 == 2) {
                message = ("\nDoubles-Acey-Deucey");
            }
            if (num1 == 6 && num2 == 6) {
                message = ("\nDoubles-Boxcars");
            }
        }
        return message;
    }

    public int getValue(){
        return value;
    }
}
//Aneesh Tekulapally