package apr_2023;

import java.util.Arrays;

public class Array_01 {

	public static void main(String[] args) {
		int [] array1  = {1,2,3,4,5,6,7,8};
		for(int i=0; i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		
		
		int [] marks= new int[5];
		for(int i : marks) {
			System.out.println(i);
		}
		Arrays.fill(marks, 100);
		for(int i : marks) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.equals(marks, array1));
		//compares the arrays if they are same or not
		int [] array2  = {1,2,3,4};
		int [] array3  = {1,2,3,4};
		System.out.println(Arrays.equals(array2, array3));
		//true
		int [] array4  = {2,1,3,4};
		int [] array5  = {1,2,3,4};
		System.out.println(Arrays.equals(array4, array5));
		//false
		
	}
}
