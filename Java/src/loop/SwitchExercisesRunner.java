package loop;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		System.out.println(isWeekDay(5));

	}
	
	public static boolean isWeekDay(int dayNumber) {
		switch(dayNumber) {
//		case 0: case 6: return false;
		
		case 1: case 2: case 3:
		case 4:	case 5: return true;
		}
		return false;
	}

	public static String detemineNameOfDay(int dayNumber) {
		String result = "";
		switch (dayNumber) {
		case 0: return "Sun";
		case 1: return "Mon";
		case 2: return "Tue";
		case 3: return "Wed";
		case 4: return "Thu";
		case 5: return "Fri";
		case 6: return "Sat";
		}
		return "Invalid";
	}
}
