package prob06_update;

public abstract class Arith {
	protected int a;
	protected int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
}
