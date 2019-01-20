public class Printf
//pg.132
{
    public static void main(String[] args)
    {
        double digit1 = 192.123;
        double digit2 = 186.5432;
        double digit3 = 189.194;
        double digit4 = 56.5689;
        double digit5 = 42.1896;
        double digit6 = 3.987542;
        
        System.out.println("Columns" + "\n==========================");
        System.out.printf("%10.3f", digit1);
        System.out.printf("\n%10.3f", digit2);
        System.out.printf("\n%10.3f", digit3);
        System.out.printf("\n%10.3f", digit4);
        System.out.printf("\n%10.3f", digit5);
        System.out.printf("\n%10.3f\n\n", digit6);
        
        double num1 = 1.856;
        double num2 = 42.881;
        double num3 = 298.734;
        
        System.out.println("Leading Zeros" + "\n==========================");
        System.out.printf("%09.3f", num1);
        System.out.printf("\n%09.3f", num2);
        System.out.printf("\n%09.3f\n\n", num3);
        
        int number1 = 5;
        int number2 = 56;
        int number3 = 568;
        int number4 = 5687;
        int number5 = 56879;
        int number6 = 568791;
        
        System.out.println("Left Justified" + "\n============================");
        System.out.printf("%-7d%-7d", number1, number2);
        System.out.printf("\n%-7d%-7d", number3, number4);
        System.out.printf("\n%-7d%-7d", number5, number6);
    }
}
