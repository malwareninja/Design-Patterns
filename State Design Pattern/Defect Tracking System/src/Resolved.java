
public class Resolved implements State{
	
	public void doAction(Context context) {
		System.out.println("Defect is Resolved...");
		context.setState(this);
	}
	
	public String toString() {
		return "Resolved";
	}
	
}