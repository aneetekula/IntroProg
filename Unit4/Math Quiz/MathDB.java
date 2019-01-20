import javax.swing.JOptionPane;
public class MathDB {
    public static void main(String [] args) {
      String inputString;
      int num1;
      int num2;
      int num3;
      
      Math m = new Math();
      
      inputString = JOptionPane.showInputDialog(null, m.getQuestion(), "Math Quiz", 3);
      num1 = Integer.parseInt(inputString);
      m.setChoice(num1);
      
      JOptionPane.showMessageDialog(null, m.getClassify(), "Math Quiz", 1);
      
      inputString = JOptionPane.showInputDialog(null, m.getQuestion1(), "Math Quiz", 3);
      num2 = Integer.parseInt(inputString);
      m.setChoice(num2);
      
      JOptionPane.showMessageDialog(null, m.getClassify1(), "Math Quiz", 1);
      
      inputString = JOptionPane.showInputDialog(null, m.getQuestion2(), "Math Quiz", 3);
      num3 = Integer.parseInt(inputString);
      m.setChoice(num3);
      
      JOptionPane.showMessageDialog(null, m.getClassify2(), "Math Quiz", 1);
      
      System.exit(0);
    }
}