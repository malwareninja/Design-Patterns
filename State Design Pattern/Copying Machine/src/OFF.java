
public class OFF implements State{
	
	public void doAction(Context context) {
		System.out.println("Machine is Off");
		context.setState(this);
	}

	public String toString() {
		return "OFF";
	}	
}
