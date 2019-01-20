import javax.swing.JOptionPane;
public class MovieDB 
{
    public static void main(String[] args) {
        //vars
        int tickets;
        String choice;
        String inputString;
        
        //movie object
        Movie m = new Movie();
        
        //getting question
        inputString = JOptionPane.showInputDialog(null, m.getQuestion(), "Movie Program", 3);
        m.setChoice(inputString);
        
        //getting ticket question
        inputString = JOptionPane.showInputDialog(null, m.getTicketQuestion(), "Movie Program", 3);
        tickets = Integer.parseInt(inputString);
        m.setTickets(tickets);
        
        //making decision
        JOptionPane.showMessageDialog(null, m.getDecision(), "Movie Program", 1);
        
        //exiting
        System.exit(0);
    }
}