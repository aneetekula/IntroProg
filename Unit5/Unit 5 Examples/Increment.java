public class Increment {
    public static void main(String[] args) 
    throws InterruptedException{
        int count = 0;
        
        System.out.println("count = " + count);
        Thread.sleep(1000); //1000 millisecobds (1 second)
        
        System.out.println("Adding 1 to the count....");
        count ++;
        Thread.sleep(1000);
        System.out.println("count = " + count);
        Thread.sleep(1000);
        
        System.out.println("Adding 1 to the count....");
        count ++;
        Thread.sleep(1000);
        System.out.println("count = " + count);
        Thread.sleep(1000);
        
        System.out.println("Adding 1 to the count....");
        count ++;
        Thread.sleep(1000);
        System.out.println("count = " + count);
        Thread.sleep(1000);
    }
}