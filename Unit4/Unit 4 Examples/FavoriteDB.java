import javax.swing.JOptionPane;
public class FavoriteDB
{
    public static void main(String[] args)
    {
        //vars
        String inputString;
        int letter;
        
        Favorite f = new Favorite();
        
        //input
        inputString = JOptionPane.showInputDialog(null, f.getQuestion(), "Favorite", 3);
        
        //converting String to int
        letter = Integer.parseInt(inputString);
        
        //setting user input
        f.setLetter(letter);
        
        //displaying result
        JOptionPane.showMessageDialog(null, f.classify(), "Favorite", 1);
    }
}
