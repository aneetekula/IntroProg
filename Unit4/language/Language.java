/**
 * Created by Aneesh R Tekulapally on 3/29/2017.
 */
public class Language {
    private String word1, word2, word3, word4, word5;
    private String ans1 = "salve" ,ans2 = "vale",ans3 = "bellum" ,ans4 = "cibus", ans5 = "somnum";
    public String question1, question2, question3, question4, question5;
    public String message;

    public Language() {
        //no-arg constructor
    }

    public void setWord1(String w1) {
        word1 = w1;
    }

    public void setWord2(String w2) {
        word2 = w2;
    }

    public void setWord3(String w3) {
        word3 = w3;
    }

    public void setWord4(String w4) {
        word4 = w4;
    }

    public void setWord5(String w5) {
        word5 = w5;
    }

    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }

    public String getWord3() {
        return word3;
    }

    public String getWord4() {
        return word4;
    }

    public String getWord5() {
        return word5;
    }

    public String getQuestion1() {
        question1 = "Type 'hello' in latin===>";
        return question1;
    }

    public String getQuestion2() {
        question2 = "Type 'goodbye' in latin===>";
        return question2;
    }

    public String getQuestion3() {
        question3 = "Type 'war' in latin===>";
        return question3;
    }

    public String getQuestion4() {
        question4 = "Type 'food' in latin===>";
        return question4;
    }

    public String getQuestion5() {
        question5 = "Type 'sleep' in latin===>";
        return question5;
    }

    public String classify1() {
        if(word1.equalsIgnoreCase(ans1)) {
            message = "You typed '" + getWord1() + "'" + "\nCorrect\n";
        }
        else {
            message = "You typed '" + getWord1() + "'" + "\nIncorrect\n";
        }
        return message;
    }

    public String classify2() {
        if(word2.equalsIgnoreCase(ans2)) {
           message = "You typed '" + getWord2() + "'" + "\nCorrect\n";
        }
        else {
            message = "You typed '" + getWord2() + "'" + "\nIncorrect\n";
        }
        return message;
        }

    public String classify3() {
        if(word3.equalsIgnoreCase(ans3)) {
            message = "You typed '" + getWord3() + "'" + "\nCorrect\n";
        }
        else {
            message = "You typed '" + getWord3() + "'" + "\nIncorrect\n";
        }
        return message;
    }

    public String classify4() {
        if(word4.equalsIgnoreCase(ans4)) {
            message = "You typed '" + getWord4() + "'" + "\nCorrect\n";
        }
        else {
            message = "You typed '" + getWord4() + "'" + "\nIncorrect\n";
        }
        return message;
    }

    public String classify5() {
        if(word5.equalsIgnoreCase(ans5)) {
            message = "You typed '" + getWord5() + "'" + "\nCorrect\n";
        }
        else {
            message = "You typed '" + getWord5() + "'" + "\nIncorrect\n";
        }
        return message;
    }
}
