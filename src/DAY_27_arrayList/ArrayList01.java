package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		        // set methodu=istenen indexteki eleman� kald�r�r; bizim istedi�imiz eleman�
				// replace eder yani koyar
		
		List<String> isimler = new ArrayList<>();
		
		isimler.add("Galatasaray");
		isimler.add("Fernerbah�e");
		isimler.add("Be�ikta�");
		isimler.add("Trabzonspor");
		isimler.add("Akhisar");
		isimler.add("G�ztepe");
		isimler.add("Sivas Spor");
		isimler.add("Bursa Spor");
		
		System.out.println(isimler);//[Galatasaray, Fernerbah�e, Be�ikta�, Trabzonspor, Adana Demirspor, G�ztepe, Sivas Spor, Bursa Spor]
		
		isimler.set(0, "Demirspor");
		isimler.set(1, "Samsunspor");
		isimler.set(2, "Eski�ehir Spor");
		isimler.add("K�tahya Spor");
		System.out.println(isimler);//[Demirspor, Samsunspor, Eski�ehir Spor, Trabzonspor, Akhisar, G�ztepe, Sivas Spor, Bursa Spor, K�tahya Spor]
		
		Collections.sort(isimler);
		System.out.println(isimler);//[Akhisar, Bursa Spor, Demirspor, Eski�ehir Spor, G�ztepe, K�tahya Spor, Samsunspor, Sivas Spor, Trabzonspor]
	}

}
