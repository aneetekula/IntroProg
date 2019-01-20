/**
 * Created by Aneesh R Tekulapally on 4/4/2017.
 */
public class Adeventure {
    //vars
    private String choice1;
    private String d1, d2, d3, d4, d5, d6, win;
    public String question1, question2, question3;
    boolean answer;
    public String message;

    public Adeventure() {
        //no-arg constructor

        //user choice
        choice1 = "";

        //questions
        question1 = "You are in a little boat in the middle of the Indian Ocean and a Great White Shark is coming at you. \nThe only things you have is your paddle, a fish, and a life vest\nWhat do I do: " +
        "\n1) Use the paddle to fight the shark" +
        "\n2) Throw the fish to distract the shark" +
        "\n3) Jump of the boat and float using the life vest" +
        "\n\nEnter here: ";
        question2 = "You survive the attack and find an island to stay on. \nYou get hungry and want to find food and the only three locations are the ocean, the forest or the mountain\nWhat do I do:" +
        "\n1) Climb the mountain to find some mountain goat" +
        "\n2) Look in the forest for berries or other edible plants" +
        "\n3) Look for crabs and other seafood in the ocean " +
        "\n\nEnter here: ";
        question3 = "You find and kill a mountain goat and think of a way to escape. \nYour option wait for a plan and use a flare, swim to the closest civilization, or wait for someone to find you\nWhat do I do:" +
        "\n1) Signal a plane using a flare" +
        "\n2) Swim to a nother island with some civilization" +
        "\n3) Wait for someone to find you " +
        "\n\nEnter here: ";

        //death messages
        d1 = "The shark breaks your paddle and then eats you";
        d2 = "The shark does not get distracted and comes to your boat and eats you";
        d3 = "You see a snake and it bites you in the leg and you die due to poisoning";
        d4 = "You start swimming but the shark comes back and eats you";
        d5 = "You try signaling the pilot of the plane but he doesn't see you and you die of starvation";
        d6 = "On the way to another island a hurricane comes and you get drowned in the waves";

        //win statement
        win = "Someone finds you at the island the next day and takes you with him back to the mainland";

        //message return statement
        message = "";
    }

    public String getQuestion1()
    {
        return question1;
    }

    public String getQuestion2()
    {
        return question2;
    }

    public String getQuestion3()
    {
        return question3;
    }

    public String getDeath1()
    {
        return d1;
    }

    public String getDeath2()
    {
        return d2;
    }

    public String getDeath3()
    {
        return d3;
    }

    public String getDeath4()
    {
        return d4;
    }

    public String getDeath5()
    {
        return d5;
    }

    public String getDeath6()
    {
        return d6;
    }

    public String getWin()
    {
        return win;
    }

    public void setChoice(String c)
    {
        choice1 = c;
    }

    public String Classify(int x)
    {
        switch(x)
        {
            case 1:
            switch(choice1)
            {
                case "1":
                message = d1;
                answer = false;
                break;

                case "2":
                message = d2;
                answer = false;
                break;

                case "3":
                message = question2;
                answer = true;
                break;

                default:
                answer = false;
                message = "You made an INVALID choice";
                break;

            }
            break;

            case 2:
            switch(choice1)
            {
                case "1":
                //Correct Choice
                message = question3;
                answer = true;
                break;

                case "2":
                message = d3;
                answer = false;
                break;

                case "3":
                answer = false;
                message = d4;
                break;

                default:
                answer = false;
                message = "You made an INVALID choice";
                break;
            }
            break;

            case 3:
            switch(choice1)
            {
                case "1":
                message = d5;
                answer = false;
                break;

                case "2":
                //Correct Choice
                message = d6;
                answer = false;
                break;

                case "3":
                message = win;
                answer = true;
                break;

                default:
                answer = false;
                message = "You made an INVALID choice";
                break;
            }
            break;
        }
        return message;
    }
}
