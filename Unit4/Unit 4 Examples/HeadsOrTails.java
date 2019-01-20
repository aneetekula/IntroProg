import java.util.Random;
public class HeadsOrTails {
    public static void main(String[] args) {
        //import random object
        Random rand = new Random();
        
        int num;
        String coin = "";
        
        System.out.println("Coin Toss...");
        
        num = rand.nextInt(2);
        
        if (num == 0) {
            coin = "Heads";
        }
        else if (num == 1) {
            coin = "Tails";
        }
        System.out.println("Num = " + num);
        System.out.println("Result = " + coin);
        
        //create conditional
        int bnum;
        bnum = rand.nextInt(2);
        System.out.println("Result 2 = " +  (bnum == 0 ? "Heads" : "Tails"));
    }
}