public class MultipleStatements {
    public static void main(String[] args) {
        int x, y;
        
        //two counters that increment
        
        for (x=1, y=1; x<=5; x++) {
            System.out.println(x + " plus " + y + " equals " + (x+y)); 
        }
    }
}