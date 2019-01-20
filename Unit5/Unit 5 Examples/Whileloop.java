public class Whileloop {
    public static void main(String[] args) 
    throws InterruptedException {
        int count = 0;
        
        while (count < 3) {
            System.out.println("Adding 1 to the count...");
            Thread.sleep(1000);
            count ++;
            System.out.println("count = " + count);
            Thread.sleep(1000);
        }
    }
}