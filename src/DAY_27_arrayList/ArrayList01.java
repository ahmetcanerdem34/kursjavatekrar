package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		        // set methodu=istenen indexteki elemaný kaldýrýr; bizim istediðimiz elemaný
				// replace eder yani koyar
		
		List<String> isimler = new ArrayList<>();
		
		isimler.add("Galatasaray");
		isimler.add("Fernerbahçe");
		isimler.add("Beþiktaþ");
		isimler.add("Trabzonspor");
		isimler.add("Akhisar");
		isimler.add("Göztepe");
		isimler.add("Sivas Spor");
		isimler.add("Bursa Spor");
		
		System.out.println(isimler);//[Galatasaray, Fernerbahçe, Beþiktaþ, Trabzonspor, Adana Demirspor, Göztepe, Sivas Spor, Bursa Spor]
		
		isimler.set(0, "Demirspor");
		isimler.set(1, "Samsunspor");
		isimler.set(2, "Eskiþehir Spor");
		isimler.add("Kütahya Spor");
		System.out.println(isimler);//[Demirspor, Samsunspor, Eskiþehir Spor, Trabzonspor, Akhisar, Göztepe, Sivas Spor, Bursa Spor, Kütahya Spor]
		
		Collections.sort(isimler);
		System.out.println(isimler);//[Akhisar, Bursa Spor, Demirspor, Eskiþehir Spor, Göztepe, Kütahya Spor, Samsunspor, Sivas Spor, Trabzonspor]
	}

}
