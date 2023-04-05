package apr_2023;

public class Book {
	private int noOfCopies;

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
	
	
		
}
