import javax.swing.JOptionPane;
public class MusicDB
{
    public static void main(String[] args)
    {
        //variables for conversion
        int track;
        double price;
        
        Music music = new Music();
        
        //Getting Input
        String inputString = JOptionPane.showInputDialog(null, "Enter the genre of your music", "MusicDB", 3);
        music.setGenre(inputString);
        
        String inputString2 = JOptionPane.showInputDialog(null, "Enter the artist of your music", "MusicDB", 3);
        music.setArtist(inputString2);
        
        String inputString3 = JOptionPane.showInputDialog(null, "Enter the album name of your music", "MusicDB", 3);
        music.setAlbum(inputString3);
        
        String inputString4 = JOptionPane.showInputDialog(null, "Enter the number of tracks of your music", "MusicDB", 3);
        track = Integer.parseInt(inputString4);
        music.setTrack(track);
        
        String inputString5 = JOptionPane.showInputDialog(null, "Enter the price of your music", "MusicDB", 3);
        price = Double.parseDouble(inputString5);
        music.setPrice(price);
        
        //Displaying output
        JOptionPane.showMessageDialog(null, "The genre name is " + music.getGenre() + "\nThe artist name is " 
                            + music.getArtist() + "\nThe album name is " + music.getAlbum() + "\nThere are " + music.getTrack() 
                            + " tracks" + "\nThe price is $" + music.getPrice(), "MusicDB", 1);
                            
        System.exit(0);
    }
}