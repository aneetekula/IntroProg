import javax.swing.JOptionPane;
public class WidgetDB
{
    public static void main(String[] args)
    {
        //input
        String inputString = JOptionPane.showInputDialog(null, "How many widgets are needed:", "Widgets Calculator", 3);
        double widget = Double.parseDouble(inputString);
        
        Widget w = new Widget(widget);
        
        double timeR = Math.ceil(w.getDays());
        
        //output
        JOptionPane.showMessageDialog(null, "It will take " + timeR + " days to create " + w.getWidget() + " widgets.", 
                        "Widgets Calculator", 1);
                        
        System.exit(0);
    }
}