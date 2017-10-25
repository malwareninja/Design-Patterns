
public class In_Progress implements State{
	
	public void doAction(Context context) {
		System.out.println("Defect is In-Progress...");
		context.setState(this);
	}
	
	public String toString() {
		return "In-Progress";
	}
}
