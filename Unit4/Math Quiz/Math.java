import java.util.Random;
public class Math {
    public String question;
    public String question1;
    public String question2;
    public String message;
    int randomNumber1;
    int randomNumber2;
    int randomNumber3;
    int randomNumber4;
    int randomNumber5;
    int randomNumber6;
    int total;
    int total1;
    int total2;
    private int choice;
    private int choice1;
    private int choice2;

    public Math() {
        question = "";
        question1 = "";
        question2 = "";
    }

    public void setChoice(int c) {
        choice = c;
    }

    public int getChoice() {
        return choice;
    }
    
    public void setChoice1(int c) {
        choice1 = c;
    }

    public int getChoice1() {
        return choice;
    }
    
    public void setChoice2(int c) {
        choice2 = c;
    }

    public int getChoice2() {
        return choice;
    }

    public String getQuestion() {
        Random rand = new Random();
        randomNumber1 = rand.nextInt(150);
        randomNumber2 = rand.nextInt(150);
        question = "Answer the 3 additional problems... \n\n" + randomNumber1 + " + " + randomNumber2 + " = ";
        return question;
    }

    public String getQuestion1() {
        Random rand = new Random();
        randomNumber3 = rand.nextInt(150);
        randomNumber4 = rand.nextInt(150);
        question1 =  "\n\n" + randomNumber3 +  " + " + randomNumber4 + " = ";
        return question1;
    }

    public String getQuestion2() {
        Random rand = new Random();
        randomNumber5 = rand.nextInt(150);
        randomNumber6 = rand.nextInt(150);
        question2 = "\n\n" + randomNumber5 + " + " + randomNumber6 + " = ";
        return question2;
    }

    public int getTotal() {
        total = randomNumber1 + randomNumber2;
        return total;
    }

    public int getTotal1() {
        total1 = randomNumber3 + randomNumber4;
        return total1;
    }

    public int getTotal2() {
        total2 = randomNumber5 + randomNumber6;
        return total2;
    }

    public String getClassify() {
        if (!(getTotal() == getChoice())) {
            message = getChoice() + " is incorrect!" + "\n(" + getTotal() + " is correct)";
        }
        else {
            message = getChoice() + " is correct";
        }
        return message;
    }

    public String getClassify1() {
        if (!(getTotal1() == getChoice())) {
            message = getChoice() + " is incorrect!" + "\n(" + getTotal1() + " is correct)";
        }
        else {
            message = getChoice() + " is correct";
        }
        return message;
    }

    public String getClassify2() {
        if (!(getTotal2() == getChoice())) {
            message = getChoice() + " is incorrect!" + "\n(" + getTotal2() + " is correct)";
        }
        else {
            message = getChoice() + " is correct";
        }
        return message;
    }
}