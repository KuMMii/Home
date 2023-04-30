package array_arrayList;

public class Array_04StringRunner {
 public static void main(String[] args) {
	String [] week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

	String longDay="";
	for(String day:week) {
		if(longDay.length()<day.length())
			longDay=day;
	}
	 System.out.println(longDay);
	 
	 
	 for(int i=(week.length-1);i>=0;i--) {
		 System.out.println(week[i]);
	 }
	 
	 
}
 
}
