import java.util.Scanner;
public class MusicTester
{
    public static void main(String[] args)
    {
       Scanner keyboard = new Scanner(System.in);
       
       Music music = new Music();
       
       //Header
       System.out.print("Music Input");
       System.out.print("\n===========");
       
       //Getting Input
       System.out.print("\nEnter the genre of your music====>");
       String a = keyboard.nextLine();
       music.setGenre(a);
       
       System.out.print("Enter the artist of your music====>");
       String b = keyboard.nextLine();
       music.setArtist(b);
       
       System.out.print("Enter the album name====>");
       String c = keyboard.nextLine();
       music.setAlbum(c);
       
       System.out.print("Enter the number of tracks in album===>");
       int d = keyboard.nextInt();
       music.setTrack(d);
       
       System.out.print("Enter the price of album=====>");
       double e = keyboard.nextDouble();
       music.setPrice(e);
       
       //Displaying outputs
       System.out.print("\nThe name of the genre is " + music.getGenre());
       System.out.print("\nThe name of the artist is " + music.getArtist());
       System.out.print("\nThe name of the album is " + music.getAlbum());
       System.out.print("\nThere are " + music.getTrack() + " tracks.");
       System.out.print("\nThe price is $" + music.getPrice());
    }
}