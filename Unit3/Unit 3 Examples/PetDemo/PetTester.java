import java.util.Scanner;
public class PetTester
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Pet Demo");
        System.out.print("\n=========");
        
        Pet pet = new Pet();
        
        System.out.print("\nEnter the name of your pet====>");
        String n = keyboard.nextLine();
        pet.setName(n);
        
        System.out.print("Enter the type of your pet====>");
        String t = keyboard.nextLine();
        pet.setType(t);
        
        System.out.print("Enter the age of your pet====>");
        int a = keyboard.nextInt();
        pet.setAge(a);
        
        System.out.print("\nThe name of your pet is " + pet.getName());
        System.out.print("\nThe type of your pet is " + pet.getType());
        System.out.print("\nThe age of your pet is " + pet.getAge());
    }
}