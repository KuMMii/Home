package object_oriented_programming;

public class BookRunner {
	
	public static void main(String[] args) {
		Book artOfComputerProgramming= new Book();
		Book effectiveJava= new Book();
		Book cleanCode= new Book();
		
		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(100);
		cleanCode.setNoOfCopies(100);
		
		artOfComputerProgramming.increaseCopies(100);
		effectiveJava.increaseCopies(400);
		cleanCode.increaseCopies(300);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		
		Book book =new Book(123,"Object Oriented Programming with Java", "Ranga");
		
		book.addReview(new Review(10,"Great Book", 5));
		book.addReview(new Review(101,"Awesome", 5));
		
		System.out.println(book);
		
	}

}
