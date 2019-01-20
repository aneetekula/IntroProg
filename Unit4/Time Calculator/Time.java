public class Time
{
    private int seconds;
    public String question;
    private String message;
    
    public Time()
    {
        //no-arg constructor
    }
    
    public void setSeconds(int s)
    {
        seconds = s;
    }
    
    public int getSeconds()
    {
        return seconds;
    }
    
    public String getQuestion()
    {
        question = "Enter a number of seconds:";
        return question;
    }
    
    public String getCalculation()
    {
        if (seconds < 0)
        {
            message = "That is and invalid number of seconds";
        }
        else if (seconds < 60)
        {
            message = "You entered " + getSeconds() + " seconds";
        }
        else if (seconds <= 3600)
        {
            message = "You entered " + getSeconds() + " seconds which is " + seconds/60 + " minute(s)";
        }
        else if (seconds <= 86400)
        {
            message = "You entered " + getSeconds() + " seconds which is " + seconds/3600 + " hour(s)";
        }
        else if (seconds >= 86400)
        {
            message = "You entered " + getSeconds() + " seconds which is " + seconds/86400 +  " day(s)";
        }
        return message;
    }
}