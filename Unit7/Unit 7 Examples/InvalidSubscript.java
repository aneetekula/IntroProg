//p.478-479
//Java Performs Bounds Checking"
//& "Watch Out for Off-by-One Errors"
public class InvalidSubscript {
    public static void main(String[] args) 
    throws InterruptedException {
        int[] values = new int[3];
        
        System.out.println("I will to attempt to store four" + " numbers in a 3-element array");
        
        for (int index = 0; index <= 4; index++) {
            System.out.println("How processing element " + index);
        }
    }
}