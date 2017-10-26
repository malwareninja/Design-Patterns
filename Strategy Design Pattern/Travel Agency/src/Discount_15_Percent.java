
public class Discount_15_Percent implements Strategy {

	public int getDiscount(int Booking_Date_Diff, int No_Of_Travelers, int Price) {
		double result = 0;
		if(Booking_Date_Diff > 20 && Booking_Date_Diff < 30) {
			result = 0.15 * Price;		//15% Discount
		}
		if(No_Of_Travelers >= 4) {
			result += 0.04 * Price;		//4% Additional Discount
		}
		return((int)result);
	}
}
