package maybecalc;

public class Calculator {

	
	private Operation operation;

	public Calculator(Operation operation) {
		super();
		this.operation = operation;
	}
	
	public float Calculation(float a,float b) {
		return operation.Calculate(a, b);
	}
	
	
}
