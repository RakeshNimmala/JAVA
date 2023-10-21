package interfaceex;

public class RateOfInterest {
	
	public static void main(String[] args) {
		Bank b=new HDFC();
		Bank b1=new SBI();
		
	float f1=	b.rateOfInterest();
	float f2=b1.rateOfInterest();
		
		System.out.println(f1);
		System.out.println(f2);
	}

}
