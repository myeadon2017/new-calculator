package maybecalc;

public class Multiplication implements Operation {
	private float c;
	@Override
	public float Calculate(float a, float b) {

		c = a*b;
		return c;
	}
	
	
}


