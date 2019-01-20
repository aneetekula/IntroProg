import java.util.Scanner;
public class MovieScanner
{
    public static void main(String[] args) {
        //Scanenr object
        Scanner k = new Scanner(System.in);
        
        //vars
        String choice;
        int tickets;
        
        //Movie object
        Movie m = new Movie();
        
        //getting question
        System.out.print(m.getQuestion());
        choice = k.nextLine();
        m.setChoice(choice);
        
        //getting number of tickers
        System.out.print(m.getTicketQuestion());
        tickets = k.nextInt();
        m.setTickets(tickets);
        
        //making decision
        System.out.print(m.getDecision());
    }
}