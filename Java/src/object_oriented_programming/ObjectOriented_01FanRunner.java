package object_oriented_programming;

public class ObjectOriented_01FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.3643, "GREEN");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}
	
}
