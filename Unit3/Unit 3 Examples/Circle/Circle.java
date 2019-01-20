public class Circle
{
    private double radius;
    
    public Circle(double r)
    {
        radius = r;
    }
    
    public void setRadius(double r)
    {   
        radius = r;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getArea()
    {
        return Math.pow(radius, 2) * Math.PI;
    }
}