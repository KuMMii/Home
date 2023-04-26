package String;

public class String_01 {
public static void main(String[] args) {
	String someString = "This is a lot of text again";
	for(int i=0; i<someString.length();i++) {
		System.out.println(someString.charAt(i));
	}
	
	StringBuilder sb = new StringBuilder("TEst");
	StringBuffer sbu = new StringBuffer("TEst");
	//I can change the String with string builder and string buffer
	//StringBuilder is for multithread.
	sb.setCharAt(1,'e');
	System.out.println(sb);

	sbu.setCharAt(1,'e');
	System.out.println(sb);
	
}
}
