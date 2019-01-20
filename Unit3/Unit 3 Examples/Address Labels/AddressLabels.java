public class AddressLabels
{
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String cityName;
    private String stateName;
    private String zipCode;
    
    public AddressLabels(String fName, String lName, String sAdd, String c, String s, String z)
    {
        firstName = fName;
        lastName = lName;
        streetAddress = sAdd;
        cityName = c;
        stateName = s;
        zipCode = z;
    }
    
    public void setfName(String f)
    {
        firstName = f;
    }
    
    public void setlName(String l)
    {
        lastName = l;
    }
    
    public void setsAdd(String a)
    {
        streetAddress = a;
    }
    
    public void setcityName(String c)
    {
        cityName = c;
    }
    
    public void setstateName(String s)
    {
        stateName = s;
    }
    
    public void setzipCode(String z)
    {
        zipCode = z;
    }
    
    public String getfName()
    {
        return firstName;
    }
    
    public String getlName()
    {
        return lastName;
    }
    
    public String getsAdd()
    {
        return streetAddress;
    }
    
    public String getcityName()
    {
        return cityName;
    }
    
    public String getstateName()
    {
        return stateName;
    }
    
    public String getzipCode()
    {
        return zipCode;
    }
}