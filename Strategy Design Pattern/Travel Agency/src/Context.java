
public class Context {
	Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public int executeStrategy(int Booking_Date_Diff, int No_Of_Travelers, int Price) {
		return strategy.getDiscount(Booking_Date_Diff, No_Of_Travelers, Price);
	}
}
