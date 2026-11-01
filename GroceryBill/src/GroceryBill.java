import java.util.Scanner;

public class GroceryBill {

	public static void main(String[] args) {
		try (Scanner scnr = new Scanner(System.in)) {
			double decimalCoupon;
			
			// Prompt user for coupon amount as a decimal
			System.out.println ("How much is your coupon? Divide the % by 100.");
			decimalCoupon = scnr.nextDouble();
						
			
			if (decimalCoupon > 1 || decimalCoupon <= 0) {
				decimalCoupon = 0.1;
			}
			
			System.out.println ("Enter your grocery bill total for Week 1");
			double groceryWeekone1 = scnr.nextDouble();
			
			System.out.println ("Enter your grocery bill total for Week 2");
			double groceryWeektwo1 = scnr.nextDouble();
			
			System.out.println ("Enter your grocery bill total for Week 3");
			double groceryWeekthree1 = scnr.nextDouble();
			
			System.out.println ("Enter your grocery bill total for Week 4");
			double groceryWeekfour1 = scnr.nextDouble();

			double monthTotal = (groceryWeekone1 + groceryWeektwo1 + groceryWeekthree1 + groceryWeekfour1);
			
			System.out.println ("Your monthly grocery bill total without the coupon is $" + monthTotal);
			
			System.out.println ("Your average weekly grocery bill without the coupon is $" +
			monthTotal/4);
			
			double deductCoupon = (monthTotal*(1-decimalCoupon)); 
			
			System.out.println ("Your average monthly grocery bill with the coupon is $" + deductCoupon);
			
			System.out.println ("Your average weekly grocery bill with the coupon is $" + deductCoupon/4);
			
		}
		
	}

}
