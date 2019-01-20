public class Rectangle
{
    private double length; //private is an access specifier
    private double width;
    
    //no-arg constructor
    public Rectangle()// (no arguements here)
    {
        length = 50;
        width = 100;
    }
    
    /**
     * 3 mutator "set" methods
     */
    public void setLength(double len) //void is the return type
    {
        length = len;
    }
    
    public void setWidth(double w)
    {
        width = w;
    }
    
    public void setLengthANDWidth(double len, double w)
    {
        length = len;
        width = w;
    }
    
    /**
     * 3 accessor "get" methods
     */
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getArea()
    {
        return length * width;
    }
}