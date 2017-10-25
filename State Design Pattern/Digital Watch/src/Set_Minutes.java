
public class Set_Minutes implements State {
	
	public void doAction(Context context) {
		context.setMinutes();
		context.setState(this);
	}
	
	public String toString() {
		return "Set Minutes";
	}
}
