
public class Classic implements Strategy {

	public int getPayBackPoints(int Purchase_Amount) {
		/*
		 * Class Card gets 1 Pay Back Point for every Rs. 200/- Purchase
		 */		
		return(Purchase_Amount/200);
	}

}
