package calculator;

public class JavaCalculator {
	
	public void sum(int a, int b) {
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		JavaCalculator cal= new JavaCalculator();
		cal.sum(10, 1);
	}
	

}
