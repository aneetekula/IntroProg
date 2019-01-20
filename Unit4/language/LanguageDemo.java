/**
 * Created by Aneesh R Tekulapally on 3/29/2017.
 */
import java.util.Scanner;
public class LanguageDemo {
    public static void main(String[] args) {
        //vars
        String word1, word2, word3, word4, word5;

        //Scanner object
        Scanner keyboard = new Scanner(System.in);

        //Language object
        Language l = new Language();

        //header
        System.out.println("Latin Translation Test");
        System.out.println("======================");

        //getting input for question1 and setting variable
        System.out.print(l.getQuestion1());
        word1 = keyboard.nextLine();
        l.setWord1(word1);

        //classifying ans1
        System.out.println(l.classify1());

        //getting input for question2 and setting variable
        System.out.print(l.getQuestion2());
        word2 = keyboard.nextLine();
        l.setWord2(word2);

        //classifying ans2
        System.out.println(l.classify2());

        //getting input for question3 and setting variable
        System.out.print(l.getQuestion3());
        word3 = keyboard.nextLine();
        l.setWord3(word3);

        //classifying ans3
        System.out.println(l.classify3());

        //getting input for question4 and setting variable
        System.out.print(l.getQuestion4());
        word4 = keyboard.nextLine();
        l.setWord4(word4);

        //classifying ans4
        System.out.println(l.classify4());

        //getting input for question5 and setting variable
        System.out.print(l.getQuestion5());
        word5 = keyboard.nextLine();
        l.setWord5(word5);

        //classifying ans5
        System.out.println(l.classify5());
    }
}
