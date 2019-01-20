import java.util.Scanner;
public class Pennies {
    public static void main (String[] args) 
    throws InterruptedException {
          int daysInputed;
          int dayNumber = 0;
          int total = 1;
          int pennies = 1;
          
          Scanner keyboard = new Scanner(System.in);
          
          System.out.println("A Penny for Pay");
          System.out.println("===============");
          
          System.out.println("1 penny on day 1, pay doubles each day you work...");
          
          System.out.print("\nHow many days will you work===>");
          daysInputed = keyboard.nextInt();
          
          while(daysInputed >= 0) {
              dayNumber++;
              System.out.println("Day = " + dayNumber);
              System.out.println("Pennies = " + pennies);
              pennies = pennies * 2;
              System.out.println("Total = " + total);
              System.out.println("Total Dollars = $" + (total * 0.01) + "\n");
              total = total + pennies;
              Thread.sleep(1000);
              if (dayNumber == daysInputed) {
                  break;
              }
          }
    }
}