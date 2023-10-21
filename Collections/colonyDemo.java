package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class colonyDemo {
	
	public static void main(String[] args) {
		City c1=new City(1,"LB nagar");
		City c2=new City(2,"Hayath nagar");
		City c3=new City(3,"SR nagar");
		
		ArrayList<City> a=new ArrayList<>();
		
		a.add(c1);
		a.add(c2);
		a.add(c3);
		
		Iterator i=a.iterator();
		
		while(i.hasNext()) {
			City ct=(City) i.next();
			System.out.println(ct.PinCode+" " + ct.colony);
		}
		


	}

}
