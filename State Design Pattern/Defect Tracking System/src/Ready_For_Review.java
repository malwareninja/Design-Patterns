
public class Ready_For_Review implements State{
	//Intentionally kept as 1
	private int status = 1;
	
	public void doAction(Context context) {
		System.out.println("Defect is Ready for Review...");
		context.setState(this);
	}
	
	public String toString() {
		return "Ready for Review";
	}
	
	public boolean getResolveStatus() {
		//Toggle status
		status ^= 1;
		if(status == 1) {
			return(true);
		}		
		return(false);
	}
}
