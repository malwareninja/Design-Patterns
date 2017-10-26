
public class Project_Lead implements Strategy{
	
	public int getGrossPay(int Basic_Pay) {
		double gross = 0;
		/*
		 * Basic Pay + 30% of Basic Pay Travelling Allowance
		 * + 30% of Basic Pay On Site Allowance
		 */
		gross = Basic_Pay + (0.3 * Basic_Pay) + (0.3 * Basic_Pay);
		return((int)gross);
	}
}
