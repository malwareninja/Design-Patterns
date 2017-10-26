
public class Context {
	Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public int executeStrategy(int Purchase_Amount) {
		return strategy.getPayBackPoints(Purchase_Amount);
	}
}
