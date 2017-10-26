import java.text.NumberFormat;
import java.util.Locale;

/*

 * Author  : Suraj S. Mundalik
 * Website : http://suraj-mundalik.info
 */

public class Payroll_System {

	public static void main(String[] args) {
		//Create a Context
		Context context;
		
		System.out.println("*** Payroll System ***\n");		
		int SE_Basic_Pay = 62000;					//Software Engineer Basic Pay
		int PL_Basic_Pay = 71000;					//Project Lead Basic Pay
		int PM_Basic_Pay = 84000;					//Project Manager Basic Pay
		
		//Calculate Salary for 4 Software Engineers
		System.out.print("Salary for 4 Software Engineer : ");
		context = new Context(new Software_Engineer());
		int SE_Gross_Pay = context.executeStrategy(SE_Basic_Pay);
		String SE_Gross_Pay_For_4 = NumberFormat.getNumberInstance(Locale.US).format(SE_Gross_Pay * 4);
		System.out.println("Rs. "+SE_Gross_Pay_For_4+"/-");
		
		//Calculate Salary for 2 Project Lead
		System.out.print("Salary for 2 Project Lead : ");
		context = new Context(new Software_Engineer());
		int PL_Gross_Pay = context.executeStrategy(PL_Basic_Pay);
		String PL_Gross_Pay_For_2 = NumberFormat.getNumberInstance(Locale.US).format(PL_Gross_Pay * 2);
		System.out.println("Rs. "+PL_Gross_Pay_For_2+"/-");
		
		//Calculate Salary for 1 Project Manager
		System.out.print("Salary for 1 Project Manager : ");
		context = new Context(new Software_Engineer());
		int PM_Gross_Pay = context.executeStrategy(PM_Basic_Pay);
		String PM_Gross_Pay_For_1 = NumberFormat.getNumberInstance(Locale.US).format(PM_Gross_Pay);
		System.out.println("Rs. "+PM_Gross_Pay_For_1+"/-");
	}

}
