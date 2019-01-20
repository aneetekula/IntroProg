import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        String name;
        double kg;
        double cm;
        double in;
        double lb;
        
        System.out.print("Enter your name ==============> ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        
        System.out.print("Enter your height in inches ==> ");
        input = new Scanner(System.in);
        in = input.nextDouble();
        
        System.out.print("Enter your weight in pounds ==> ");
        input = new Scanner(System.in);
        lb = input.nextDouble();
        
        cm = in * 2.54;
        kg = lb * 0.453592;
        double BMI = (kg / (Math.pow(cm, 2)) * 10000);
        String strBMI = String.format("%,.2f",BMI);
        
        System.out.println(name + ",\n" +
                           "Your height of " + in + " in.\n" +
                           "and your weight of " + lb + " lbs.\n" +
                           "...calculates a BMI of... \n=====>  " + strBMI + "  <=====\n" +
                           "______________________________\n" +
                           "Underweight =====> less than 18.5\n" +
                           "Normal weight ===> 18.5 to 24.9\n" +
                           "Overweight ======> 25 to 29.9\n" +
                           "Obesity =========> BMI of 30 or greater");
                           
    }
}
