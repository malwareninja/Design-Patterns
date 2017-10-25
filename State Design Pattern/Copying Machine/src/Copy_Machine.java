/*
 * Author  : Suraj S. Mundalik
 * Website : http://suraj-mundalik.info
 */
import java.util.Scanner;

public class Copy_Machine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Create a Context
		Context context = new Context();
		
		System.out.println("*** Copying Machine ***\n");
		
		char user_in;
		OFF off = new OFF();
		Warming warm = new Warming();
		Ready ready = new Ready();
		Copying copy = new Copying();
		String current_state;		
		
		System.out.println("Power is OFF. Would you like to turn it ON? (Y/N)  ");
		user_in = sc.next().charAt(0);
		
		if(user_in == 'Y' || user_in == 'y') {
			System.out.println("Turning the Machine On...");
			context.setState(warm);
			while(true) {
				current_state = context.getState().toString();
				System.out.println("\nCurrent State : "+current_state);
				
				if(current_state.equals("Warming")) {
					warm.doAction(context);
					context.setState(ready); 		//Now machine moves to Ready state
				}
				else if(current_state.equals("Ready")) {
					ready.doAction(context);
					//Now on user input move to Copying state
					System.out.println("Press Start button (S)...");
					user_in = sc.next().charAt(0);
					if(user_in == 'S' || user_in == 's') {				
						context.setState(copy);
					}
				}
				else if(current_state.equals("Copying")) {
					copy.doAction(context);
					context.setState(ready);		//Move back to Ready state once all copies are done
				}
			}
		}
		else {
			context.setState(off);
			System.out.println("\nCurrent State : "+context.getState().toString());
			off.doAction(context);		//Machine is Off
		}
	}

}
