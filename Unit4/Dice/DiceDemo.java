public class DiceDemo
{
    public static void main(String[] args)
    {
        // Create two instances of the Die class.
        Die die1 = new Die();
        Die die2 = new Die();
        Die die = new Die();
        int Total = 0;

        // Rolling the dice
        System.out.println("Rolling the dice...\n");
        die1.roll();
        die2.roll();

        // Display the values of the dice.
        die.setDies(die1.getValue(), die2.getValue());
        
        System.out.println(die1.getValue() + " AND " +
            die2.getValue());
            
        System.out.print("\nTotal = " + die.getTotal());
            
        System.out.print("Stickman Says: " + die.Nickname());
            
    }
}