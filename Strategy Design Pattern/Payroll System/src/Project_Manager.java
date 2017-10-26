
public class Project_Manager implements Strategy{
	
	public int getGrossPay(int Basic_Pay) {
		double gross = 0;
		/*
		 * Basic Pay + 40% of Basic Pay Travelling Allowance
		 * + 40% of Basic Pay On Site Allowance
		 */
		gross = Basic_Pay + (0.4 * Basic_Pay) + (0.4 * Basic_Pay);
		return((int)gross);
	}
}
