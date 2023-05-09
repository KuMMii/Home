package functional_programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {
		return number%2==0;
	}
}
	class EvenNumberConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}
	class NumberSquareMapper implements Function<Integer, Integer>{

		@Override
		public Integer apply(Integer number) {
			return number*number;
		}
	}

public class LambdaBehindTheScreensRunner {
	//1.Storing functions in variables
	//2.Passing functions to methods
	//3.Returning functions from methods

	public static void main(String[] args) {
		Predicate<? super Integer> evenPredicate = n->n%2==0;
		Predicate<? super Integer> oddPredicate = createOddPredicate();
		List.of(23,34,54,45,18,36).stream().filter(evenPredicate).forEach(e->System.out.println(e));
		List.of(23,34,54,45,18,36).stream().filter(new EvenNumberPredicate()).forEach(e->System.out.println(e));
		List.of(23,34,54,45,18,36).stream().filter(new EvenNumberPredicate()).forEach(new EvenNumberConsumer());
		List.of(23,34,54,45,18,36).stream().filter(n->n%2==0).map(new NumberSquareMapper()).forEach(e->System.out.println(e));
		
	}

	private static Predicate<? super Integer> createOddPredicate() {
		return n->n%2==1;
	}
}
