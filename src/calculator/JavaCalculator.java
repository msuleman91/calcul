package calculator;

public class JavaCalculator {
	
	public int sum(int a, int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		
		JavaCalculator cal= new JavaCalculator();
		System.out.println(cal.sum(10, 1));
	}
	

}
