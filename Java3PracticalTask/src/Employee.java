
public class Employee {
	private String name;
	private float rate;		//float is enough for this example
	private float hours;
	public static float totalSum;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rate
	 */
	public float getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(float rate) {
		totalSum = totalSum-hours*this.rate;	//event or extract method
		this.rate = rate;
		totalSum = totalSum+hours*rate;			//event or extract method
	}
	/**
	 * @return the hours
	 */
	public float getHours() {
		return hours;
	}
	/**
	 * @param hours the hours to set
	 */
	public void setHours(float hours) {
		totalSum=totalSum-this.hours*rate; //event or extract method 
		this.hours = hours;
		totalSum=totalSum+hours*rate;	   //event or extract method
	}
	
	public Employee() {
		
	}
	
	public Employee(String name,float rate) {
		this.setName(name);
		this.rate = rate;
	}
	
	public Employee(String name, float rate, float hours) {
		this.name=name;
		this.rate=rate;
		this.hours=hours;
		totalSum = totalSum+rate*hours;		//event or extract method
	}
	
	float salary() {
		return rate*hours;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public String toString() {
		return "Name: " + this.getName() +"\n"
				+ "Rate: "+ this.rate +"\n"
				+ "Hours: " + this.hours +"\n"
				+ "Total sum: " + this.totalSum;
	}
	
	public void changeRate(float rate) {
		totalSum = totalSum - this.rate*hours;	//event or extract method
		this.rate = rate;
		totalSum = totalSum + this.rate*hours;	//event or extract method
	}
	
	float bonuses() {
		return salary()*0.1f;
	}
	
}
