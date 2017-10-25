
public class Ready implements State{
	
	public void doAction(Context context) {
		context.setReadyLight("On");
		context.setDisplayPanel("No. of Copies : 1 | Size : Normal");
		System.out.println("::: Display Panel :::\n"+context.getDisplayPanel());
		System.out.println("Ready Light : "+context.getReadyLight());
		context.setState(this);
	}
	
	public String toString() {
		return "Ready";
	}
}
