
public class Context {
	Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public int executeStrategy(int Basic_Pay) {
		return strategy.getGrossPay(Basic_Pay);
	}
}
