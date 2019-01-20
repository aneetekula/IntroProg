public class CellPhone
{
    private String name; //company name
    private String itemName;
    private double price;
    private int stock;
    
    public CellPhone(String nam, String in, double p, int s)
    {
        name = nam;
        itemName = in;
        price = p;
        stock = s;
    }
    
    public void setName(String nam)
    {
        name = nam;
    }
    
    public void setItemName(String in)
    {
        itemName = in;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
    
    public void setStock(int s)
    {
        stock = s;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getItemName()
    {
        return itemName;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public double getValue()
    {
        return price * stock;
    }
}