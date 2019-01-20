import java.text.DecimalFormat;
public class Movie
{
    public String question;
    private String choice;
    private int tickets;
    public String message;
    public String ticketQuestion;
    private double totalPrice;
    
    public Movie()
    {
        choice = "";
        message = "";
        question = "";
    }
    
    public void setChoice(String c) {
        choice = c;
    }
    
    public void setTickets(int t) {
        tickets = t;
    }
    
    public String getChoice() {
        return choice;
    }
    
    public int getTickets() {
        return tickets;
    }
    
    public String getTotalPrice() {
        totalPrice =((getTickets() * 10) + (getTickets() * 10 * 0.07));
        DecimalFormat format1 = new DecimalFormat("$.00");
        return format1.format(totalPrice);
    }
    
    public String getQuestion() {
        question = "Welcome to AMC Theaters" + "\n=====================" 
                            + "\n1) Star Wars: Rogue One"
                            + "\n2) Sucide Squad"
                            + "\n3) Deadpool"
                            + "\n4) Doctor Strange"
                            + "\n5) Fast and Furious" 
                            + "\nMake your selection: ";
        return question;
    }
    
    public String getDecision() {
        switch(getChoice()) {
            case "1":
            if (tickets <= 0) {
                message = "That is an invalid number of tickets";
            }
            else if (tickets < 200) {
                message = "\n" + getTickets() + " ticket(s) + tax for movie: " 
                        + "\n1) Star Wars: Rogue One = " + getTotalPrice();
            }
            else {
                message = "\nYou entered more than 200 tickets";
            }           
            break;
            
            case "2":
            if (tickets <= 0) {
                message = "That is an invalid number of tickets";
            }
            else if (tickets < 200) {
                message = "\n" + getTickets() + " ticket(s) + tax for movie: " 
                        + "\n1) Suicide Squad = " + getTotalPrice();
            }
            else {
                message = "\nYou entered more than 200 tickets";
            }    
            break;
            
            case "3":
            if (tickets <= 0) {
                message = "That is an invalid number of tickets";
            }
            else if (tickets < 200) {
                message = "\n" + getTickets() + " ticket(s) + tax for movie: " 
                        + "\n1) Deadpool = " + getTotalPrice();
            }
            else {
                message = "\nYou entered more than 200 tickets";
            }    
            break;
            
            case "4":
            if (tickets <= 0) {
                message = "That is an invalid number of tickets";
            }
            else if (tickets < 200) {
                message = "\n" + getTickets() + " ticket(s) + tax for movie: " 
                        + "\n1) Doctor Strange " + getTotalPrice();
            }
            else {
                message = "\nYou entered more than 200 tickets";
            }    
            break;
            
            case "5":
            if (tickets <= 0) {
                message = "That is an invalid number of tickets";
            }
            else if (tickets < 200) {
                message = "\n" + getTickets() + " ticket(s) + tax for movie: " 
                        + "\n1) Fast and Furious = " + getTotalPrice();
            }
            else {
                message = "\nYou entered more than 200 tickets";
            }    
            break;
            
            default:
            message = "\nYou entered " + getChoice() + " that is an invalid choice";
        }
        return message;
    }
    
    public String getTicketQuestion() {
        ticketQuestion = "Enter the number of tickets needed: ";
        return ticketQuestion;
    }
}

    