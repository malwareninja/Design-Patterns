/*
 * Author  : Suraj S. Mundalik
 * Website : http://suraj-mundalik.info
 */

public class DTS {

	public static void main(String[] args) {
		System.out.println("*** Defect Tracking System ***\n");
		//Create a Context
		Context context = new Context();
		
		Available av = new Available();
		In_Progress inp = new In_Progress();
		Ready_For_Review rfr = new Ready_For_Review();
		Resolved res = new Resolved();
		
		while(true) {
			/*		
			 * This loop will iterate twice,
			 * as we have intentionally kept the 'status' field in,
			 * Ready_For_Review as false or not resolved
			 */
			av.doAction(context);			//Defect acquired, move to Available state
			inp.doAction(context);			//Now move to In-Progress state
			rfr.doAction(context);			//Now move to Ready for Review state
			if(rfr.getResolveStatus()) {	//If the defect is resolved 
				res.doAction(context);		//Move to Resolved state
				break;
			}
											//Otherwise repeat the DTS cycle as usual
			System.out.println("Bug is not resolved. Repeat again!\n");
		}
	}
}