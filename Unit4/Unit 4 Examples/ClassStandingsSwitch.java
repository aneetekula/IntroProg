import java.util.Scanner;
public class ClassStandingsSwitch {
    public static void main(String[] args)
    {
        int grade;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to WW-P Genesis");
        System.out.println("========================");
        
        System.out.print("What grade are you in===>");
        grade = keyboard.nextInt();
        
        switch(grade) {
            case 9:
            System.out.println("\nGrade = " + grade + "\nYou are a Freshman");
            break;
            
            case 10:
            System.out.println("\nGrade = " + grade + "\nYou are a Sophomore");
            break;
            
            case 11:
            System.out.println("\nGrade = " + grade + "\nYou are a Junior");
            break;
            
            case 12:
            System.out.println("\nGrade = " + grade + "\nYou are a Senior");
            break;
            
            //case (grade > 12):
            //can't use ranges in a switch structure
            
            default:
            System.out.println("\nGrade = " + grade + "\nError ... Invalid Input!");
            break;
        }
    }
}