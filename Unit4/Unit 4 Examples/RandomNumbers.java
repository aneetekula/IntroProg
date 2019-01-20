import java.util.Random;
//pg.72 ranges for data types
public class RandomNumbers {
    public static void main(String[] args) {
        int inum;
        int xnum;
        double dnum;
        int znum;
        
        //random object
        Random random1 = new Random();
        
        inum = random1.nextInt();
        System.out.println(inum + " random integer");
         
        dnum = random1.nextDouble();
        System.out.println(dnum + " random double");
        
        xnum = random1.nextInt((10)+ 1) * -1;
        System.out.println(xnum + " num from -1 to -10");
        
        znum = random1.nextInt((100) + 1) * -1;
        System.out.println(znum + " num from -1 to -100");
    }
}