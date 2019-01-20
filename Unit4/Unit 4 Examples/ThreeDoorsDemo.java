import java.util.Scanner;
public class ThreeDoorsDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int k1;
        String k2, k3;

        System.out.println("Enter Gold Vault");
        System.out.println("================");

        ThreeDoors td = new ThreeDoors();

        System.out.print("Enter code for door 1===>");
        k1 = keyboard.nextInt();
        td.setA1(k1);

        keyboard.nextLine();

        if (k1 == d1Code) {
            System.out.println("Door one unlocked");
            System.out.print("Enter code for door 2===>");
            k2 = keyboard.nextInt();
            td.setA2(k2);
            if (k2.equals(d2Code)) {
                System.out.println("Door two unclocked");
                System.out.print("Enter code for door 3===>");
                k3 = keyboard.nextInt();
                td.setA3(k3);
            }
            else {
                System.out.println("Door two locked!");
            }
        }
        else {
            System.out.println("Door one locked!");
        }
    }
}