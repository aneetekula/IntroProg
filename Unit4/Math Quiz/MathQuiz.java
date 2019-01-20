import java.util.Scanner;
public class MathQuiz {
    public static void main(String[] args) {
        int num;
        int num1;
        int num2;
        
        Scanner k = new Scanner(System.in);
        
        Math m = new Math();
        
        System.out.println("Math Quiz");
        System.out.println("=========");
        
        System.out.print(m.getQuestion());
        num = k.nextInt();
        m.setChoice(num);
        
        System.out.print(m.getClassify());
        
        System.out.print(m.getQuestion1());
        num1 = k.nextInt();
        m.setChoice(num1);
        
        System.out.print(m.getClassify1());
        
        System.out.print(m.getQuestion2());
        num2 = k.nextInt();
        m.setChoice(num2);
        
        System.out.print(m.getClassify2());
    }
}