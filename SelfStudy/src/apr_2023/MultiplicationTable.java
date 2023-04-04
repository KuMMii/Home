package Refactoring;

public class MultiplicationTable {
	void print() {
		print(5);
	}
	
	void print(int table) {
		print(table, 1, 10);
	}
	
	void print(int table, int from, int to) {
		for(int i =from; i<=to; i++) {
			System.out.printf("%d * %d = %d", table, i, table*i);
		}
	}

	public static void main(String[] args) {
		MultiplicationTable table= new MultiplicationTable();
		table.print();
	}

}
