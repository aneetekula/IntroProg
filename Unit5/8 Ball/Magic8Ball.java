import java.util.Scanner;
import java.util.Random;
public class Magic8Ball {
    public static void main(String[] args) {
        //header
        System.out.println("Magic 8 Ball");
        System.out.println("============");
        
        //objects
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        //vars
        int s = 0;
        String m = "";
        String input = "";
        String input2 = "";
        char x;
        
        do {
            System.out.print("Enter a question: ");
            input = keyboard.nextLine();
            s = r.nextInt(19) + 1;
            
            switch (s){
                case 1:
                m = "Signs point to yes.";
                break;
                
                case 2:
                m = "Yes.";
                break;
                
                case 3:
                m = "Reply hazy, try again.";
                break;
                
                case 4:
                m = "Without a doubt";
                break;
                
                case 5:
                m = "My sources say no.";
                break;
                
                case 6:
                m = "As I see it, yes.";
                break;
                
                case 7:
                m = "You may rely on it.";
                break;
                
                case 8:
                m = "Concentrate and ask again.";
                break;
                
                case 9:
                m = "Outlook not so good.";
                break;
                
                case 10:
                m = "It is decidedly so.";
                break;
                
                case 11:
                m = "Better not tell you now.";
                break;
                
                case 12:
                m = "Very doubtful.";
                break;
                
                case 13:
                m = "Yes - definitely";
                break;
                
                case 14:
                m = "It is certain.";
                break;
                
                case 15:
                m = "Cannot predict now.";
                break;
                
                case 16:
                m = "Most likely.";
                break;
                
                case 17:
                m = "Ask again later.";
                break;
                
                case 18:
                m = "My reply is no.";
                break;
                
                case 19:
                m = "Outlook good.";
                break;
                
                case 20:
                m = "Don't count on it.";
                break;
            }
            System.out.println(m);
            System.out.print("Do you wish to go again(y OR n): ");
            input2 = keyboard.next();
            x  = input2.charAt(0);
            keyboard.nextLine();
            System.out.print("\f");
        } while (x == 'Y' || x == 'y');
    }
}