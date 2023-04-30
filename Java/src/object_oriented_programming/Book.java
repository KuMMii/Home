package object_oriented_programming;

import java.util.ArrayList;

public class Book {
	private int noOfCopies;
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews= new ArrayList<Review>();
	
	public Book(int id, String name, String author) {
		this.id=id;
		this.name=name;
		this.author=author;
	}
	public Book() {};

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if(noOfCopies>0)
		this.noOfCopies = noOfCopies;
	}

	public void increaseCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies+howMuch);
	}
	public void decreaseCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies-howMuch);
	}
	public void addReview(Review review) {
		this.reviews.add(review);
		
	}
	
	public String toString() {
		return String.format("id= %d ,name = %s ,author = %s,"
				+ "Reviews = [%s]", id, name,author, reviews);
	}
		
}
