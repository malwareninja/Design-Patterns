/*
 * Author  : Suraj S. Mundalik
 * Website : http://suraj-mundalik.info
 */

import java.util.Scanner;
import java.io.IOException;

public class Digital_Watch {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//Create a Context
		Context context = new Context();
	    
		Display_Time dt = new Display_Time();
		Set_Hours sh = new Set_Hours();
		Set_Minutes sm = new Set_Minutes();
		
		System.out.println("*** Digital Watch ***\n");
		
		//Set initial state to Display Time
		context.setState(dt);
		
		char btn;
		
		while(true) {
			String current_state = context.getState().toString();
			if( current_state.equals("Display Time") ) {
				dt.doAction(context);
			}
			System.out.println("Current State : "+current_state);						
			while(true) {
				System.out.println("Press any button (A or B only)...");
				btn = sc.next().charAt(0);
				if(btn == 'A' || btn == 'a' || btn == 'B' || btn == 'b') {
					break;
				}
			}
			/*
			 * Case 1 : 
			 * 			Current State  : Display Time
			 * 			Button Pressed : A
			 * 			Action 		   : Go To Set Hours state
			 */
			if( (btn == 'A' || btn == 'a') && current_state.equals("Display Time") ) {
				context.setState(sh);
			}
			/*
			 * Case 2 : 
			 * 			Current State  : Display Time
			 * 			Button Pressed : B
			 * 			Action 		   : No change in the state
			 */
			else if( (btn == 'B' || btn == 'b') && current_state.equals("Display Time") ) {				
			}
			/*
			 * Case 3 : 
			 * 			Current State  : Set Hours
			 * 			Button Pressed : A
			 * 			Action 		   : Go To Set Minutes state
			 */
			else if( (btn == 'A' || btn == 'a') && current_state.equals("Set Hours") ) {
				context.setState(sm);
			}
			/*
			 * Case 4 : 
			 * 			Current State  : Set Hours
			 * 			Button Pressed : B
			 * 			Action 		   : Advance/Increment Hours field in Context
			 */
			else if( (btn == 'B' || btn == 'b') && current_state.equals("Set Hours") ) {
				sh.doAction(context);
			}
			/*
			 * Case 5 : 
			 * 			Current State  : Set Minutes
			 * 			Button Pressed : A
			 * 			Action 		   : Go To Display Time state
			 */
			else if( (btn == 'A' || btn == 'a') && current_state.equals("Set Minutes") ) {
				context.setState(dt);
			}
			/*
			 * Case 6 : 
			 * 			Current State  : Set Minutes
			 * 			Button Pressed : B
			 * 			Action 		   : Advance/Increment Minutes field in Context
			 */
			else if( (btn == 'B' || btn == 'b') && current_state.equals("Set Minutes") ) {
				sm.doAction(context);
			}
		}
	}
}
