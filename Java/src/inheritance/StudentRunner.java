package inheritance;

public class StudentRunner {
	public static void main(String[] args) {
		
//	Student student = new Student();
//	student.setName("Ranga");
//	student.setEmail("Ranga@gmail.com");
	
	
	//IS A relationship
	
//	Person person= new Person();
//	person.setName("Ranga");
//	person.setEmail("ranga@gmail.com");
//	person.setPhoneNumber("123-234-345");
//	String value=person.toString();
//	System.out.println(value);
//	System.out.println(person);
		
		
		Employee employee = new Employee("Ranga", "CEO");
//		employee.setName("Ranga");
		employee.setEmail("Ranga@gmail.com");
		employee.setPhoneNumber("123-234-345");
		employee.setTitle("CEO");
		employee.setEmployerName("Jobs");
		employee.setEmployeeGrade('A');
		
		System.out.println(employee);
	}
}
