/**
 * Created by Aneesh R Tekulapally on 4/4/2017.
 */
import java.util.Scanner;
public class AdeventureDemo {
    public static void main(String[] args) {
        //vars
        String choice;

        //Scanner object
        Scanner keyboard = new Scanner(System.in);

        //Adventure object
        Adeventure adeventure = new Adeventure();

        //header
        System.out.println("Adventure Time");
        System.out.println("===============");

        //First Question
        System.out.print(adeventure.getQuestion1());

        //setting choice
        choice = keyboard.nextLine();


        adeventure.setChoice(choice);


        System.out.print(adeventure.Classify(1));

        if (adeventure.answer != false)
        {
            choice = keyboard.nextLine();
            adeventure.setChoice(choice);

            System.out.print(adeventure.Classify(2));
            if (adeventure.answer != false)
            {
                choice = keyboard.nextLine();
                adeventure.setChoice(choice);

                System.out.print(adeventure.Classify(3));
            }
        }
    }
}
