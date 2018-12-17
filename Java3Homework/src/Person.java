import java.util.Calendar;

public class Person {
	private String name;
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	private int birthYear;
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public Person(String name,int birthYear) {
		this.name = name;
		this.setBirthYear(birthYear);
	}
	public int age() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR)-birthYear;
	}
	public void input(Person person){
		this.name = person.name;
		this.birthYear = person.birthYear;
	}
	public void input(String name,int birthYear){
		this.name = name;
		this.birthYear = birthYear;
		
		//setName(name); reason if we already have public setter?
		//setBirthDay(year)
	}
	public Person output(){
		return this;
	}
	public void changeName(String name,int birthYear) {
		this.name=name;
	}

}
