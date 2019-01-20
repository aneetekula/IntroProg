public class Widget
{
    private double widgets;
    
    public Widget(double w )
    {
        widgets = w;
    }
    
    public void setWidget(double w)
    {
        widgets = w;
    }
    
    public double getWidget()
    {
        return widgets;
    }
    
    public double getDays()
    {
        return (getWidget()/(2 * 10 * 8));
    }
}