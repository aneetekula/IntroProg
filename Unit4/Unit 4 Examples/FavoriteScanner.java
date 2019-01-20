import java.util.Scanner;
public class FavoriteScanner
{
    public static void main(String[] args)
    {
        //scanner object
        Scanner keyboard = new Scanner(System.in);
        
        Favorite f = new Favorite();
        
        //getting input
        System.out.print(f.getQuestion());
        int letter = keyboard.nextInt();
        
        //seting user's choice
        f.setLetter(letter);
        
        //displaying result
        System.out.print(f.classify());
    }
}