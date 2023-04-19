package apr_2023;

class WhileNumberPlayer{

	int limit;
	public WhileNumberPlayer(int limit) {
		this.limit=limit;
	}
	public void printSquaresUptoLimit() {
		int i=1;
		while((i*i)<limit) {
			System.out.print(i*i+" ");
			i++;
		}
	}
	public void printCubesUptoLimit() {
		int i=1;
		while((i*i*i)<limit) {
			System.out.print(i*i*i+" ");
			i++;
		}
		
	}
	
}

public class Loop_04WhileNumberPlayer {

}
