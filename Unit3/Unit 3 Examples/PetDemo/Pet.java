public class Pet
{
    public Pet()
    {
        name = "";
        type = "";
        age = 0;
    }
    
    private String name;
    private String type;
    private int age;
    
    public void setName(String nam)
    {
        name = nam;
    }
  
    public void setType(String typ)
    {
       type = typ; 
    }
    
    public void setAge(int ag)
    {
        age = ag;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getType()
    {
        return type;
    }
    
    public int getAge()
    {
        return age;
    }
}