public class Whileloopbreak {
    public static void main(String[] args) 
    throws InterruptedException {
        float count = 0;
        
        while (count < 15) {
            System.out.println("Playing billiards...");
            Thread.sleep(100);
            count ++;
            System.out.println("count = " + count);
            Thread.sleep(100);
            if (count == 8) {
                break; //break out of loop
            }
        }
    }
}