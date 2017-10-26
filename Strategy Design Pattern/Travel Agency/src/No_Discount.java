
public class No_Discount implements Strategy {

	public int getDiscount(int Booking_Date_Diff, int No_Of_Travelers, int Price) {
		double result = 0;
		if(Booking_Date_Diff < 20) {
			result = 0;					//No Discount
		}
		if(No_Of_Travelers >= 4) {
			result = 0.03 * Price;		//3% Discount
		}
		return((int)result);
	}
}
