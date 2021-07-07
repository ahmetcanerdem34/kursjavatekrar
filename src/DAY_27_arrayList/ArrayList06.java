package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		
		
		List<String> isimler = new ArrayList<>();
		
		isimler.add("Burak");
		isimler.add("Hakan");
		isimler.add("Ahmet");
		
		System.out.println(isimler);//[Burak, Hakan, Ahmet]
		
		isimler.set(0, "Ahmet");
		isimler.set(2, "Burak");
		System.out.println(isimler);//[Ahmet, Hakan, Burak]
		
		isimler.set(1, "");
		System.out.println(isimler);//[Ahmet, , Burak]
		
		int arr[]= {4,6,5,3,7,2};
		

		
		
		
		
		
		
		

	}

}
