package functional_programming;

import java.util.List;

public class MethodReferencesRunner {
	
	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Ant","Bat","Cat","Dog","Elephant").stream()
						.map(s->s.length())
						.forEach(s->System.out.println(s));

		List.of("Ant","Bat","Cat","Dog","Elephant").stream()
		.map(String::length)
		.forEach(MethodReferencesRunner::print); //shortcut for 'class.method(parameter)'
		
		Integer max=List.of(12,46,31,75)
				.stream().filter(MethodReferencesRunner::isEven)
				.max(Integer::compare)
				.orElse(0);
		System.out.println(max);
		
	}
	
	public static boolean isEven(Integer i) {
		return i%2==0;
	}

}
