// Gross Pay (Main)

import java.util.*;

public class GrossPay {

   public static void main(String[] args){
       double gross_reg_earn, gross_ot_earn;
       double reg_hrs, ot_hrs, tax_held, tax_rate, hrs_rendered;
       double rate_per_hr, total_net;

       reg_hrs = 40;
     Scanner reader = new Scanner (System.in);
        System.out.println("Please Input Hours Rendered: ");
            hrs_rendered = reader.nextDouble();
        System.out.println("Please Input Tax Rate: ");
            tax_rate = reader.nextDouble();
        System.out.println("Please Input Rate Per Hour: ");
            rate_per_hr = reader.nextDouble();

     ot_hrs = (hrs_rendered - reg_hrs);
     gross_reg_earn = (reg_hrs *rate_per_hr);
     gross_ot_earn = (ot_hrs * 1.5 * rate_per_hr);
     tax_held = (gross_reg_earn * (tax_rate/100));
     total_net = (gross_reg_earn + gross_ot_earn - tax_held);

     System.out.println("Hours Rendered: "+hrs_rendered);
     System.out.println("Tax Rate: "+tax_rate);
     System.out.println("Rate Per Hour: "+rate_per_hr);
     System.out.println();
     System.out.println("Overtime Hours: "+ot_hrs);
     System.out.println("Gross Regular Earnings: "+gross_reg_earn);
     System.out.println("Gross Overtime Earnings: "+gross_ot_earn);
     System.out.println("Tax Held: "+tax_held);
     System.out.println("Total Net Earnings:" +total_net);

   }


}
