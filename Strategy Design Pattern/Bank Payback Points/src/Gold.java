
public class Gold implements Strategy {

	public int getPayBackPoints(int Purchase_Amount) {
		/*
		 * Gold Card gets 1 Pay Back Point for every Rs. 100/- Purchase
		 */		
		return(Purchase_Amount/100);
	}

}
