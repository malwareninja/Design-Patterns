
public class Warming implements State{

	public void doAction(Context context) {
		context.setReadyLight("Flashing");
		System.out.println("Initial Checks Successful...");
		context.setState(this);
	}
	
	public String toString() {
		return "Warming";
	}
}
