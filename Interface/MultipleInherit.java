package interfaceex;

public class MultipleInherit implements Bank,Bank2 {

	public float rateOfInterest() {
		
		return 7.7f;
		
	}
	
	public static void main(String[] args) {
		MultipleInherit m=new MultipleInherit();
		float f=m.rateOfInterest();
		System.out.println(f);
	}

}
