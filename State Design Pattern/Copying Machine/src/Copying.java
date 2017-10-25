
public class Copying implements State{

	public void doAction(Context context) {
		System.out.println("Copying all the copies...Done!");
		context.setState(this);
	}
	
	public String toString() {
		return "Copying";
	}
}
