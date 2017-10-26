/*
 * Author  : Suraj S. Mundalik
 * Website : http://suraj-mundalik.info
 */

public class Bank_Payback_Points {

	public static void main(String[] args) {
		//Create a Context
		Context context;
		
		System.out.println("*** Bank Pay Back Points ***\n");
		
		//Find Pay Back Points for Following Cards & Purchase made on that
		System.out.println("Type of Card \tPurchase Amount \tPay Back Points Earned");
		context = new Context(new Classic());
		System.out.println("Classic \tRs. 50,000/- \t\t\t"+context.executeStrategy(50000));
		context = new Context(new Silver());
		System.out.println("Silver \t\tRs. 50,000/- \t\t\t"+context.executeStrategy(50000));
		context = new Context(new Gold());
		System.out.println("Gold \t\tRs. 70,000/- \t\t\t"+context.executeStrategy(70000));

	}

}
