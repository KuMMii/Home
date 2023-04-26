package Loop;

public class Loop_01For {
	
	public static void main(String[] args) {
		
	MyNumber number = new MyNumber(2);
	boolean isPrime=number.isPrime();
	System.out.println("isPrime "+isPrime);
	
	int sum = number.sumUptoN();
	System.out.println("sumUptoN " +sum);
	
	int sumOfDivisors= number.sumOfDivisors();
	System.out.println("sumOfDivisors " +sumOfDivisors);
	
	number.printANumberTriangle();
	}

}
