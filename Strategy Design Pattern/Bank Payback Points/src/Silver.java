
public class Silver implements Strategy {

	public int getPayBackPoints(int Purchase_Amount) {
		/*
		 * Silver Card gets 1 Pay Back Point for every Rs. 150/- Purchase
		 */		
		return(Purchase_Amount/150);
	}

}
