import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Write a description of class RockPaperScissors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RockPaperScissors{
   public static void main(String[] args){
       Scanner keyboard = new Scanner(System.in);
       String start;
       String choice;
       int wins = 0;
       int losses = 0;
      
       String compValue;
       JOptionPane.showMessageDialog(null, "Welcome to rock paper scissors. R is Rock. S is Scissors. P is Paper");
       
     
           for (int i = 1; i < 2; i--){
                int rand = (int)(3*Math.random())+1;
           if (rand == 1){
               compValue = "Rock";
            }else if (rand == 2){
                compValue = "Scissor";      
            }else if (rand == 3){
                compValue = "Paper";
            }else{
                compValue = "Error";                
            }
            choice = JOptionPane.showInputDialog("Rock, Paper or Scissors?");
            if ((choice.equals("R") && rand == 1)){
                JOptionPane.showMessageDialog(null, "You chose rock\nComputer chose rock\nIt's a tie!\nYou have won " + wins + " times. You have lost " + losses + " times.");
            }else if ((choice.equals("S")) && rand == 2){
                JOptionPane.showMessageDialog(null, "You chose scissors\nComputer chose scissors\nIt's a tie!\nYou have won " + wins + " times. You have lost " + losses + " times.");
            }else if ((choice.equals("P")) && rand == 3){
                JOptionPane.showMessageDialog(null, "You chose paper\nComputer chose paper\nIt's a tie!\nYou have won " + wins + " times. You have lost " + losses + " times.");
            }else if ((choice.equals("R") && rand == 2)){
                ++wins;
                JOptionPane.showMessageDialog(null, "You chose rock\nComputer chose scissors\nYou Win!\nYou have won " + wins + " times. You have lost " + losses + " times.");
                
            }else if ((choice.equals("S")) && rand == 1){
                ++losses;
                JOptionPane.showMessageDialog(null, "You chose scissors\nComputer chose rock\nYou Lose!\nYou have won " + wins + " times. You have lost " + losses + " times.");
                
            }else if ((choice.equals("S")) && rand == 3){
                ++wins;
                JOptionPane.showMessageDialog(null, "You chose scissors\nComputer chose paper\nYou Win!\nYou have won " + wins + " times. You have lost " + losses + " times.");
                
            }else if ((choice.equals("R") && rand == 3)){
                ++losses;
                JOptionPane.showMessageDialog(null, "You chose rock\nComputer chose paper\nYou Lose!\nYou have won " + wins + " times. You have lost " + losses + " times.");
                
            }else if ((choice.equals("P")) && rand == 2){
                ++losses;
                JOptionPane.showMessageDialog(null, "You chose paper\nComputer chose scissors\nYou Lose!\nYou have won " + wins + " times. You have lost " + losses + " times.");
                
            }else if ((choice.equals("P")) && rand == 1){
                ++wins;
               JOptionPane.showMessageDialog(null, "You chose paper\nComputer chose rock\nYou Win!\nYou have won " + wins + " times. You have lost " + losses + " times.");
                
            }else{
                System.out.println("Error");
            }
        }
       
    }
}