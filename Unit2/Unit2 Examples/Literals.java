public class Literals

{
    public static void main(String[] args)
    {
        int applesM=20;
        int applesT=12;
        int applesW=17;
        int applesTh=13;
        int applesF=25;
        
        System.out.println("Today we sold " + applesM + " bushels of apples.");
        System.out.print("This week we sold " + (applesM + applesT + applesW + applesTh + applesF) + ("."));
        //+ means concatenation
    }
}