package apr_2023;



class MyNumber{
	
	int number;
	int count;

	public MyNumber(int number) {
		this.number=number;
	}

/*My Answer
	public boolean isPrime() {
		for(int i=1; i<=number; i++) {
			if(number%i==0) count++;
		}
		if(count==2) return true;
		else return false;
	}
	*/
	
	public boolean isPrime() {
		if(number<2) {	return false;} //Guard Check first!
		for(int i=2; i<=number-1; i++) {
			if(number%i==0) return false;
		}
		return true;
	}

	public int sumUptoN() {
		int sum=0;
		for(int i=1;i<=number; i++) {
			sum +=i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int diSum=0;
		//Except 1 and number
		for(int i=2; i<=number-1;i++) {
			if(number%i==0) diSum+=i;
			
		}
		//Adding all the divisors
//		for(int i=1; i<=number; i++) {
//			if(number%i==0) diSum+=i;
//		}
		return diSum;
	}
	
	public void printANumberTriangle() {
		for(int i=1; i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
	
	}
	
	
}

public class Loop_02MyNumber {
}
