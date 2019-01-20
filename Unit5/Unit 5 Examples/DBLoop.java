import javax.swing.JOptionPane;
public class DBLoop {
    public static void main(String[] args) 
    throws InterruptedException{
        String inputString;
        int count = 0;
        int num;
        
        inputString = JOptionPane.showInputDialog(null, "Loop how many times?", "DBLoop", 3);
        num = Integer.parseInt(inputString);
        
        while (count < num) {
            count ++;
        }
        JOptionPane.showMessageDialog(null, "Count = " + count, "DBLoop", 1);
        System.exit(0);
    }
}