package functional_programming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list=List.of("Apple","Bat","Cat","Dog");
		printWithFP(list);
		printWithFPWithFiltering(list);
		
		List<Integer> list1=List.of(1,4,7,9);
		printNumWithFPFilter(list1);
	}

	private static void printBasic(List<String> list) {
		for(String string:list) {
			System.out.println(string);
		}
	}

	private static void printBasicWithFiltering(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")){
			System.out.println(string);
			}
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(
				element -> System.out.println("element - "+element) //lamda expression
				);
	}

	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
			.filter(element->element.endsWith("at")) //intermediate operation:output of the operation is another stream
				.forEach(element -> System.out.println(element)); //terminal operation:consume entire stream or return one result back
	}
	
	private static void printNumWithFPFilter(List<Integer> list1) {
		
		list1.stream().filter(element->element%2==1).forEach(element -> System.out.println(+element));
	}

}
