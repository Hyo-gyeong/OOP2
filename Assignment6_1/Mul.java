
public class Mul extends Calc{

	int rslt;
	
	Mul(int a, int b){
		rslt = this.calculate(a, b);
		printRslt();
	}
	
	int calculate(int a, int b){
		setValue(a, b);
		return a*b;
	}
	
	public void printRslt() {
		System.out.println(rslt);
	}
}
