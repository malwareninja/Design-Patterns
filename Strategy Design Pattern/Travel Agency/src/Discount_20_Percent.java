
public class Discount_20_Percent implements Strategy{
	
	public int getDiscount(int Booking_Date_Diff, int No_Of_Travelers, int Price) {
		double result = 0;
		if(Booking_Date_Diff > 30) {
			result = 0.5 * Price;		//20% Discount
		}
		if(No_Of_Travelers >= 4) {
			result += 0.05 * Price;		//5% Additional Discount
		}
		return((int)result);
	}
}
