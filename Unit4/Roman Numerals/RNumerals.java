public class RNumerals
{
    private int number;
    public String question;
    private String message;
    
    public RNumerals()
    {
        //no-arg constructor
    }
    
    public String getQuestion()
    {
        question = "Enter a roman numeral between 1 and 10:";
        return question;
    }
    
    public void setNumber(int n)
    {
        number = n;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public String getNumeral()
    {
        if (number == 1)
        {
            message = "You entered 1 the roman numeral is I";
        }
        else if (number ==2)
        {
            message = "You entered 2 the roman numeral is II";
        }
        else if (number ==3)
        {
            message = "You entered 3 the roman numeral is III";
        }
        else if (number ==4)
        {
            message = "You entered 4 the roman numeral is IV";
        }
        else if (number ==5)
        {
            message = "You entered 5 the roman numeral is V";
        }
        else if (number ==6)
        {
            message = "You entered 6 the roman numeral is VI";
        }
        else if (number ==7)
        {
            message = "You entered 7 the roman numeral is VII";
        }
        else if (number ==8)
        {
            message = "You entered 8 the roman numeral is VII";
        }
        else if (number ==9)
        {
            message = "You entered 9 the roman numeral is IX";
        }
        else if (number ==10)
        {
            message = "You entered 10 the roman numeral is X";
        }
        else 
        {
            message = "You entered an invalid number";
        }
        return message;
    }
}