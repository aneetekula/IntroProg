public class Whileloopinfinite {
    public static void main(String[] args) 
    throws InterruptedException {
        float count = 0;
        
        while (count >= 0) {
            //System.out.println("Adding 1 to the count...");
            //Thread.sleep(1000);
            count ++;
            //System.out.println("count = " + count);
            //Thread.sleep(10);
        }
        System.out.println("count = " + count);
    }
}