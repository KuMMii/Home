package array_arrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student {
	String name;
	ArrayList<Integer> marks= new ArrayList<Integer>();
	public Student(String name, int... marks) {
		this.name=name;
		
		for(int mark: marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum=0;
		for(int i : marks) {
			sum+=i;
		}
		return sum;
	}

	public int getMaximumMarks() {
		return Collections.max(marks);
	}

	public int getMinimumMarks() {
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum=getTotalSumOfMarks();
		int number=getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(number),3,	RoundingMode.UP);
	}
	
	public String toString() {
		return name+ marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

}

public class ArrayList_03Student_ {
	
}

