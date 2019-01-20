public class Car
{
    //variables
    private int Year;
    private String Make;
    private String Model;
    private double Speed;
    private double Seconds;
    
    public Car(int y, String m, String mm)
    {
        Year = y;
        Make = m;
        Model = mm;
    }
    
    public void setYear(int y)
    {
        Year = y;
    }
    
    public void setMake(String m)
    {
        Make = m;
        
    }
    
    public void setModel(String mm)
    {
        Model = mm;
    }
    
    public void setSpeed(double s)
    {
        Speed = s;
    }
    
    public void setSeconds(double ss)
    {
        Seconds = ss;
    }
    
    public int getYear()
    {
        return Year;
    }
    
    public String getMake()
    {
        return Make;
    }
    
    public String getModel()
    {
        return Model;
    }
    
    public double getSpeed()
    {
        return Speed;
        
    }
    
    public double getSeconds()
    {
        return Seconds;
    }
    
    public void Accelerate()
    {
        Speed = Speed + (Seconds);
    }
    
    public void Deccelerate()
    {
        Speed = Speed - (5 * Seconds);
    }
}