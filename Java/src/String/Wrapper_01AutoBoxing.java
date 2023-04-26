package String;

public class Wrapper_01AutoBoxing {
public static void main(String[] args) {
	Integer seven1 = Integer.valueOf(7);
	Integer seven2= 7;	//auto boxing
	Integer seven3=7;
	if(seven2==seven3) System.out.println(true);
	else System.out.println(false);
	
	System.out.println(Integer.MAX_VALUE); //auto boxing
	System.out.println(Integer.MIN_VALUE); //auto boxing
	System.out.println(Integer.SIZE); //auto boxing
	System.out.println(Integer.BYTES); //auto boxing
	
}
}
