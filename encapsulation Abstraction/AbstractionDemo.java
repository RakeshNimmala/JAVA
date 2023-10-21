package encap_abstract;

public class AbstractionDemo {
	public static void main(String[] args) {
		
		Employee c=new Contractor("Rakesh",12,180);
		System.out.println("Employee name :" +c.getName());
		System.out.println("PaymentPerHour :" +c.getPaymentPerHour());
		System.out.println("Employee salary :" +c.calculateSalary());
		
		Employee f=new FullTimeEmployee("shanthi",15,190);
		System.out.println("Employee name :" +f.getName());
		System.out.println("PaymentPerHour :" +f.getPaymentPerHour());
		System.out.println("Employee salary :" +f.calculateSalary());

	}

}
