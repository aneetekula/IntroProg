public class Payroll
{
    private double hoursWorked;
    private double payRate;
    private double pay;
    
    public Payroll() //no-arg constructor
    {
        hoursWorked = 0.0;
        payRate = 0.0;
    }
    
    public void sethoursWorked(double hw)
    {
        hoursWorked = hw;
    }
    
    public void setpayRate(double pr)
    {
        payRate = pr;
    }
    
    public double gethoursWorked()
    {
        return hoursWorked;
    }
    
    public double getpayRate()
    {
        return payRate;
    }
    
    public double getRegPay()
    {
        return (40 * payRate);
    }
    
    public double getOThwrk()
    {
        return (hoursWorked - 40);
    }
    
    //returning grosspay
    public double getGrossPay()
    {
        
        if (hoursWorked > 40)
        {
             pay = ((40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5)));
        } else
        {
         pay = (hoursWorked * payRate);
    }

    return pay;
    }
}