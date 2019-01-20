import java.util.Scanner;
public class PayRollScanner{
    public static void main(String[] args){
        //vars
        double gp;
        double fwt;
        double np;
        
        //create objects...
        Scanner s = new Scanner(System.in);
        Payroll p = new Payroll();
        
        //Initial Hud Setup...
        System.out.print("GroupoCorp Payroll Calculator");
        System.out.print("\n=============================");
        
        //Begin collecting Users  Info.../ create vars...
        
        
        System.out.print("\nEnter hours worked======>");
        double hw = s.nextDouble();
        System.out.print("Enter hourly pay rate===>$");
        double pr = s.nextDouble();
        System.out.print("Enter # of dependents===>");
        int dp = s.nextInt();
        
        
        System.out.print("\n\nProcessing Payroll...");
        
        
        //enter into object
        p.sethoursWorked(hw);
        p.setpayRate(pr);
        p.setnumberOfDependents(dp);
        
        //get info back
        hw = p.gethoursWorked();
        pr = p.getpayRate();
        dp = p.getnumberOfDependents();
        
        
        //display info to user...
        System.out.printf("\nHours Worked = %,.2f", hw); 
        System.out.printf("\nPay Rate = $%,.2f", pr);
        System.out.print("\nDependents = " + dp);
        
        
        gp = p.getGrossPay();
        fwt = p.getFWT();
        np = p.getnetPay();
        
        //display calcs
        System.out.printf("\n\nGross Pay = %,.2f", gp); 
        System.out.printf("\nFederal Withholding Tax = $%,.2f", fwt);
        System.out.printf("\nNet Pay = %,.2f", np);
        
        System.out.print("\n\nPayroll Processing Complete!");

    }
}