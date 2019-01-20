public class Disount
{
    public static void main(String[] args)
    {
        /*
         * The Programming process p.38(PIPO)
         * Purpose - to calculate a discount
         * Input - initialize variables &/Or
         *              get user input
         *              (initilazie price % discountRate percentage)
         * Process- convet % to decimal form
         *             calculate the dicountAmt ($money)
         *             calculate the salePrice
         *             (use variables to create calculations)
         *Output - display price, discountRate, discountAmt, salePrice
         */            
        
         double price = 39;
         double discountRate = 5;
         
         double discountAmt;
         double salePrice;
         
         //test your output by validating!!
         //Calculator - type buttons as you are saying this sentence
         //"100" "minus" "10" "%" "equals"
         
         discountAmt = price * (discountRate/100);
         salePrice = (1 - (discountRate/100)) * price;
         
        System.out.println("Discount Calculations" + "\n=========================");
        System.out.println("Orginal Price: $" + price);
        System.out.println("Discount Rate: " + discountRate + "%");
        
        //System.out.println("Discount Amount: $" + discountAmt);
        //System.out.println("Salesprice: $" + salePrice);
        
        System.out.printf("Discount Amount = $%,.2f", discountAmt);
        System.out.printf("\nSalesprice = $%,.2f", salePrice);
    }
}