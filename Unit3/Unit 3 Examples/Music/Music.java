public class Music
{
    private String genre;
    private String artist;
    private String album;
    private int track;
    private double price; 
    
    public Music()
    {
        genre = "Rap";
        artist = "Kanye West";
        album = "Watch the Throne";
        track = 13;
        price = 9.99;
    }
    
    public void setGenre(String gen)
    {
        genre = gen;
    }
    
    public void setArtist(String art)
    {
        artist = art;
    }
    
    public void setAlbum(String alb)
    {
        album = alb;
    }
    
    public void setTrack(int tra)
    {
        track = tra;
    }
    
    public void setPrice(double pri)
    {
        price = pri;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public String getAlbum()
    {
        return album;
    }
    
    public int getTrack()
    {
        return track;
    }
    
    public double getPrice()
    {
        return price;
    }
}