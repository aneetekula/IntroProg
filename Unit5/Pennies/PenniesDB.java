import javax.swing.JOptionPane;
public class PenniesDB {
    public static void main (String[] args) {
          int daysInputed;
          int dayNumber = 0;
          double total = 0;
          double pennies = 0.5;
          String inputString;
          
          inputString = JOptionPane.showInputDialog(null, "You will recive a penny on day 1." +
                "\nEach day your pay rate will double. \nYour goal is to earn oover $1,000,000.00" 
                + "\n\nHow many days will you work?", 
                "Pennies", 3);
          daysInputed = Integer.parseInt(inputString);
          
          while(daysInputed >= 0) {
              dayNumber++;
              //JOptionPane.showMessageDialog(null, "Days = " + dayNumber + "\nPennies = " + pennies + (pennies = pennies * 2) +
                    // "\nTotal = " + total + "\nTotal Dollars = $" + (total * 0.01) + (total = total + pennies), "Pennies", 1);
               pennies = pennies * 2;
               total = total + pennies;
              if (dayNumber == daysInputed) {
                  break;
              }
          }
          JOptionPane.showMessageDialog(null, "Days = " + dayNumber + "\nPennies = " + pennies +
                     "\nTotal = " + total + "\nTotal Dollars = $" + (total * 0.01), "Pennies", 1);
          System.exit(0);
    }
}