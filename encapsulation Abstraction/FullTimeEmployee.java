package encap_abstract;

public class FullTimeEmployee extends Employee {
	
	private int workingHours;

	public FullTimeEmployee(String name, int paymentPerHour,int workingHours) {
		super(name, paymentPerHour);
		this.workingHours=workingHours;
	}
	public int calculateSalary() {
		return getPaymentPerHour()*workingHours;
	}
	

}
