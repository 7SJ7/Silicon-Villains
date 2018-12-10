import java.util.ArrayList;

public class Person {
	private String ID;
	private String name;
	private int age;
	ArrayList<Project> A;
	ArrayList<Person> people;
	private final int Salary= 15000;// add fixed salary

	Person(String ID, String name, int age) {
		this.ID = ID;
		this.name = name;
		this.age = age;
	}

	public int timePerProject() {
		// this method should return members individual time contribution on all
		// projects.
		return 0;
	}

	public int timePerMember() {
		// this method should return each members individual time contributed on the
		// project.
		return 0;
	}

	public String productsParticipated() {
		// this method should return each members individual time contributed on the
		// project.
		return null;
	}

	public String printOnePerson(String ID) {
		Person exactPerson = retrievePerson(ID);// we get employee with this ID
		if (exactPerson != null) {
			return exactPerson.toString();
		} else
			return "Person with this ID: " + ID + " does not exist.";

	}
	
	public String getID() {
		return this.ID;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String toString() {

		final String END_OF_LINE = System.lineSeparator();
		String info = "ID of a person: " + this.ID + END_OF_LINE;
		info += "Name: " + this.name + END_OF_LINE;
		info += "Age: " + this.age + " years" + END_OF_LINE;
		info += "Salary: " + this.Salary + " SEK per month" + END_OF_LINE;


		return info;
	}
}
