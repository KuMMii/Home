package apr_2023;

import java.math.BigDecimal;

public class ArrayList_02Exercise {

	public static void main(String[] args) {
		Student student = new Student("Ranga", 87,36,72,94,95,1);
		Student student1 = new Student("AKG", 87,36,72,94,11);
		Student student2 = new Student("Frog",87,36,72);

		int number=student.getNumberOfMarks();
		System.out.println(number);
		
		int sum=student.getTotalSumOfMarks();
		System.out.println(sum);
		
		int maximumMark=student.getMaximumMarks();
		System.out.println(maximumMark);
		
		int minimumMark=student.getMinimumMarks();
		System.out.println(minimumMark);
		
		BigDecimal average=student.getAverageMarks();
		System.out.println(average);
		
		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);
		
		student.removeMarkAtIndex(1);
		System.out.println(student);
	}
	
}
