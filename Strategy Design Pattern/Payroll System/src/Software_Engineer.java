
public class Software_Engineer implements Strategy{
	
	public int getGrossPay(int Basic_Pay) {
		double gross = 0;
		gross = Basic_Pay + (0.2 * Basic_Pay);	//Basic Pay + 20% of Basic Pay Travelling Allowance
		return((int)gross);
	}
}
