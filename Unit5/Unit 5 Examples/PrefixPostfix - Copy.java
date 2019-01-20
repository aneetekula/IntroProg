public class PrefixPostfix {
    public static void main(String[] args) {
        int x = 1;
        
        System.out.println("x = " + x);
        
        System.out.println("x = " + ++x); //prefix
        
        System.out.println("x = " + x++); //postfix
        
        System.out.println("x = " + x);
    }
}