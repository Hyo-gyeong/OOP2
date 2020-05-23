
public class Add extends Calc{

	int rslt;
	
	Add(int a, int b){
		rslt = this.calculate(a, b);
		printRslt();
	}
	
	int calculate(int a, int b){
		setValue(a, b);
		return a+b;
	}
	
	public void printRslt() {
		System.out.println(rslt);
	}
}
