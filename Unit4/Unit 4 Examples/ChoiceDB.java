import javax.swing.JOptionPane;
public class ChoiceDB
{
    public static void main(String[] args)
    {
        String letter;
        
        //creating object for input 
        Choice ch = new Choice();
        
        //input
        letter = JOptionPane.showInputDialog(null, ch.getQuestion(), "Question 1", 3);
        
        //set user's choice
        ch.setChoice(letter);
        
        //displaying result
        JOptionPane.showMessageDialog(null, "You chose " + ch.getChoice() + "\n" + ch.classify(), "Question 1", 1);
        
        //input
        letter = JOptionPane.showInputDialog(null, ch.getQuestion2(), "Question 2", 3);
        
        //set user's choice
        ch.setChoice(letter);
        
        //displaying result
        JOptionPane.showMessageDialog(null, "You chose " + ch.getChoice() + "\n" + ch.classify2(), "Question 2", 1);
        
        //input
        letter = JOptionPane.showInputDialog(null, ch.getQuestion3(), "Question 3", 3);
        
        //set user's choice
        ch.setChoice(letter);
        
        //displaying result
        JOptionPane.showMessageDialog(null, "You chose " + ch.getChoice() + "\n" + ch.classify3(), "Question 3", 1);
    }
}