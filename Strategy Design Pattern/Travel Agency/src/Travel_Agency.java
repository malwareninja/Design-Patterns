/*
 * Author  : Suraj S. Mundalik
 * Website : http://suraj-mundalik.info
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Travel_Agency {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		//Create a Trip
		String destination = "Goa";
		int total_price = 25000;
		String st_date = "26/10/2017";			
		Date start_date = df.parse(st_date);
		int duration = 12;
		
		System.out.println("*** Travel Agency ***\n");
		System.out.println("Trip Details");
		System.out.println("* Destination : "+destination);
		System.out.println("* Start Date : "+st_date);
		System.out.println("* Total Price : "+total_price);
		
		//Book a Trip, you can read input from user as well :-P
		String name = "Suraj Mundalik";
		String bk_date = "16/10/2017";
		Date booking_date = df.parse(bk_date);
		int no_of_travelers = 9;
		int discount = 0;
		//Find how many days prior is booking done to avail discount
		int date_diff = (int)(start_date.getTime() - booking_date.getTime())/ (24 * 60 * 60 * 1000);

		//Summary
		System.out.println("\n*** Booking Details ***\n");
		System.out.println("* Destination : "+destination);
		System.out.println("* Start Date : "+st_date);
		System.out.println("* Booking Date : "+bk_date);
		System.out.println("* Customer Name : "+name);
		System.out.println("* No of Travelers : "+no_of_travelers);
		System.out.println("* Total Price : Rs. "+total_price+ "/-");		
		
		//Create a Context
		Context context;
		
		if(date_diff > 30) {
			context = new Context(new Discount_20_Percent());
			discount = context.executeStrategy(date_diff, no_of_travelers, total_price);
			System.out.println("* Discount  : Rs. "+discount+ "/-");
		}
		if(date_diff > 20 && date_diff < 30) {
			context = new Context(new Discount_15_Percent());
			discount = context.executeStrategy(date_diff, no_of_travelers, total_price);
			System.out.println("* Discount  : Rs. "+discount+ "/-");
		}
		if(date_diff < 20) {
			context = new Context(new No_Discount());
			discount = context.executeStrategy(date_diff, no_of_travelers, total_price);
			System.out.println("* Discount  : Rs. "+discount+ "/-");
		}
		
		System.out.println("* Net Price  : Rs. "+(total_price - discount)+ "/-");
	}

}
