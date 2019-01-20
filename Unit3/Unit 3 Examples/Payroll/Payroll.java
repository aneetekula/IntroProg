public class Payroll
{
    private double hoursWorked;
    private double payRate;
    private int numberOfDependents;
    
    public Payroll()
    {
        hoursWorked = 0;
        payRate = 8.38;
        numberOfDependents = 0;
    }
    
    public void sethoursWorked(double hw)
    {
        hoursWorked = hw;
    }
    
    public void setpayRate(double pr)
    {
        payRate = pr;
    }
    
    public void setnumberOfDependents(int nod)
    {
        numberOfDependents = nod;
    }
    
    public double gethoursWorked()
    {
        return hoursWorked;
    }
    
    public double getpayRate()
    {
        return payRate;
    }
    
    public int getnumberOfDependents()
    {
        return numberOfDependents;
    }
    
    public double getGrossPay()
    {
        return (hoursWorked * payRate);
    }
    
    public double getFWT()
    {
        return (0.2 * (getGrossPay() - numberOfDependents *38.46));
    }
    
    public double getnetPay()
    {
        return (getGrossPay() - getFWT());
    }
}