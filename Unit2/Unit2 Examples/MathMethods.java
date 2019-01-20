public class MathMethods
{
    public static void main(String[] args)
    {
        //Math.pow
        System.out.println("Exponents (to the power of)" + ("\n========================"));
        
        double result = Math.pow(4.0, 2.0);
        System.out.println("4 ^ 2 = " + result);
        
        double num1 = 10;
        double num2 = 3;
        result = Math.pow(num1, num2);
        System.out.println("10 ^ 3 = " + result);
        
        //Math.sqrt
        
        char sqrt = 8730;
        System.out.println("\nSquare root" + "\n===========================");
        System.out.println(sqrt + "9 = " + Math.sqrt(9.0));
        
        double num3 = 25;
        System.out.println(sqrt + "" + num3 + " = " + Math.sqrt(num3));
        
        //Math.PI
        System.out.println("\nPI" + "\n============================");
        
        /*
         * /when given the radius of a cricle, what is the formula for area?
         * //area = pi r squared
         */
        
        double area, radius = 2;
        area = Math.PI * (Math.pow(radius, 2));
        System.out.println("Circle radius = " + radius  +
                 ", Area = " + area);
                 
        System.out.print("Circle raduis = " + radius);
        System.out.printf(", Area = %.1f (rounded)", area);
       
        radius = 5;
        area = Math.PI * (Math.pow(radius, 2));
        System.out.println("\nCircle radius = " + radius  +
                 ", Area = " + area);
                 
       System.out.print("Circle raduis = " + radius);
       System.out.printf(", Area = %,.1f (rounded)", area);
    }   
}