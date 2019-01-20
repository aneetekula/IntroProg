public class Favorite
{
    public String question;
    private int letter;
    public String message;
    
    public Favorite()
    {
        //no arg constructor
    }
    
    public String getQuestion()
    {
        question = "It's Sundae Sunday!" + "\nVote for your favorite and get a small free sundae..." +
                    "\n\n1) Oreo" +
                    "\n2) Cookie" +
                    "\n3) Brownie" +
                    "\nPlease enter a number: ";
        return question;
    }
    
    public void setLetter(int l)
    {
        letter = l;
    }
    
    public int getLetter()
    {
        return letter;
    }
    
    public String classify()
    {
        if (letter == 1)
        {
           message = "\nYou chose 1" + "\nYou have earned a Oreo sundae for taking this survey!";
        }
        else if (letter == 2)
        {
           message = "\nYou chose 2" + "\nYou have earned a Cookie sundae for taking this survey!";
        }
        else if (letter ==3)
        {
           message = "\nYou chose 3" + "\nYou have earned a Brownie sundae for taking this survey!";
        }
        else 
        {
           message = "\nYou entered an INVALID choice!" + "\nYou entered: " + letter;
        }
        return message;
    }
}