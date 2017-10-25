
public class Set_Hours implements State {
	
	public void doAction(Context context) {
		context.setHours();
		context.setState(this);
	}
	
	public String toString() {
		return "Set Hours";
	}
}
