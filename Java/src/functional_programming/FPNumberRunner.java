package functional_programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(4,6,8,13,3,15);
		//numbers.stream().forEach(element->System.out.println(element));
	
		squareNum();
		lowerCase();
		length();
		fpSum(numbers);
	}

	private static void optional() {
		List.of(12,46,32,76).stream().filter(n->n%2==1).max((n1,n2)->Integer.compare(n1, n2)).orElse(0);
		//if the result is null, it will show me 0.
	}
	private static void maxGet() {
		List.of(12,43,32,76).stream().max((n1,n2)->Integer.compare(n1, n2)).get();
	}
	private static void max() {
		List.of(12,43,32,76).stream().max((n1,n2)->Integer.compare(n1, n2)); //get optional back
	}
	
	private static void list() {
		List.of(12,43,32,76).stream().filter(e->e%2==0).collect(Collectors.toList()); //saving elements in a list
	}
	private static void squareList() {
		IntStream.range(1, 11).map(e->e*e).boxed().collect(Collectors.toList());
		//until the map(), it returns integerpipeline which is not int.
		//boxed() helps to convert that to the integer.
	}
	
	private static void length() {
		List.of("Apple","Ant","Bat").stream().map(s->s.length()).forEach(element->System.out.println(element));
	}

	private static void lowerCase() {
		List.of("Apple","Ant","Bat").stream().map(s->s.toLowerCase()).forEach(element->System.out.println(element));
	}

	private static void squareNum() {
		IntStream.range(1,11).map(e->e*e).forEach(p->System.out.println(p));
	}
	
//compare those two methods
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2)->number1+number2); //reduce:terminal operation
		//starting value, (parameters)->action)
		//no mutation
		//focus on what to do
		//lambda=shortcut format method
		//if the code is 1 line, no need to use braces and return
	}

	private static int normalSum(List<Integer> numbers) {
		int sum=0;
		for(int number:numbers) {
			sum+=number; //mutation
		}
		return sum;
	}
}
