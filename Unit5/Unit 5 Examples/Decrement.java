public class Decrement {
    public static void main(String[] args) 
    throws InterruptedException{
        int count = 3;
        
        System.out.println("count = " + count);
        Thread.sleep(1000); //1000 millisecobds (1 second)
        
        System.out.println("Subtracting 1 to the count....");
        count --;
        Thread.sleep(1000);
        System.out.println("count = " + count);
        Thread.sleep(1000);
        
        System.out.println("Subtracting 1 to the count....");
        count --;
        Thread.sleep(1000);
        System.out.println("count = " + count);
        Thread.sleep(1000);
        
        System.out.println("Substracting 1 to the count....");
        count --;
        Thread.sleep(1000);
        System.out.println("count = " + count);
        Thread.sleep(1000);
    }
}