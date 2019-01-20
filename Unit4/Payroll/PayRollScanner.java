import java.util.Scanner;
public class PayRollScanner{
    public static void main(String[] args){
        //variables
        double gp;
        double fwt;
        double np;
        
        //create objects...
        Scanner s = new Scanner(System.in);
        Payroll p = new Payroll();
        
        //Header
        System.out.println("Payroll Calculator by Aneesh Tekulapally");
        System.out.println("=======================================");
        
        //Input
        
        System.out.print("Enter hours worked======>$");
        double hw = s.nextDouble();
        System.out.print("Enter hourly pay rate===>$");
        double pr = s.nextDouble();
        
        //enter into object
        p.sethoursWorked(hw);
        p.setpayRate(pr);
        
        //Returning Information
        hw = p.gethoursWorked();
        pr = p.getpayRate();
        gp = p.getGrossPay();
 
        if (hw > 40)
        {
            System.out.print("\nPay with Overtime");
            System.out.print("\n============");
        } else if (hw <= 40)
        {
            System.out.print("\nRegular Pay");
            System.out.print("\n===========");            
        }
        
        //display info to user...
        System.out.printf("\nHours Worked = %,.2f", hw); 
        System.out.printf("\nPay Rate = $%,.2f", pr); 
        
        //display calculations
        if (hw > 40)
        {
                    System.out.printf("\n\nRegular Pay = $%,.2f", p.getRegPay()); 
                    System.out.printf("\nOvertime Hours Worked = %,.2f", p.getOThwrk());
                    System.out.printf("\nOvertime Pay Rate = $%,.2f", (1.5 * p.getpayRate()));
                    
                    System.out.printf("\nOvertime Pay = $%,.2f", (p.getOThwrk()) * (1.5 * p.getpayRate()));
                    
                    System.out.printf("\n\nGross Pay = $%,.2f", gp);                     
        } else if (hw <= 40)
        {
                    System.out.printf("\nGross Pay = %,.2f", gp); 
        }
    } 
}