
public class Available implements State{
	
	public void doAction(Context context) {
		System.out.println("Bug is now Available...");
		context.setState(this);
	}
	
	public String toString() {
		return "Available";
	}
}
