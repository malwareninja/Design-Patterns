
public class Display_Time implements State {
	
	public void doAction(Context context) {
		System.out.println("::: Current Time :::");
		System.out.println("Hours : Minutes :: " + context.getHours() + " : " + context.getMinutes());
		context.setState(this);
	}
	
	public String toString() {
		return "Display Time";
	}
}
