import java.util.Scanner;
import java.awt.Toolkit;
public class sportsTeams {
    public static void main(String[] args) {
        int player = 0;
        int pteams; //players per team
        int teams; 
        int r; //remaining players
        
        Scanner keyboard = new Scanner(System.in);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        System.out.println("Sport's Team Calculator");
        System.out.println("=======================");
        
        System.out.print("Enter total number of players: ");
        player = keyboard.nextInt();
        
        while(player > 0) {
            System.out.print("Enter number of players per team " + "\nAt least 9 no more than 15:");
            pteams = keyboard.nextInt();
            teams = player/pteams;
            if (pteams<9 || pteams > 15) {
                System.out.println("\n" + pteams + " is an INVALID number " + "\n of players per team, " + 
                        "please re-enter... " + "At least 9 no more than 15");
                tk.beep();
            }
            if (pteams>=9 && pteams <= 15) {
                System.out.println("\nFrom " + player + " total players...");
                r = player % pteams;
                System.out.println("There will be " + teams + " teams of " + pteams + " players. "
                        + "\nwith " + r + " players left over.");
                break;
            }
        }
    }
}