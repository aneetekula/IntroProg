public class ConstructorDemo
{
    public static void main(String[] args)
    {
        Rectangle6 box = new Rectangle6(5.0, 15.0);
        
        System.out.println("The box's width is " + box.getWidth());
        System.out.println("The box's lenght is " + box.getLength());
        System.out.println("The box's area is " + box.getArea());
        
        
    }
}