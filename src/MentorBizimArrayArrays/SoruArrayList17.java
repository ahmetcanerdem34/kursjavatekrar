package MentorBizimArrayArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SoruArrayList17 {

	public static void main(String[] args) {
		
		
		/*
		 * Task: Be� elemanli bir String list olusturup asagidaki islemleri yapin
		 * Isimler : {hakan,reha,ahsen,ipek,haluk}
		 * -) hakan yerine ahmet ekleyiniz.
		 * -) 3. index'e zehra'y� ekleyiniz.
		 * -) haluk'u listeden siliniz.
		 * -) cemal'i 'u listeye ekleyiniz.
		 * -) List'in buyuklugunu bulunuz.
		 * -) Alfabetik siraya koyunuz,
		 * -) List'in elemanlarinin tamamini siliniz.
		 */
		
		
		List<String> isimler = new ArrayList<>(Arrays.asList("Hakan","Haluk","K�r�at","Kamil","Arda"));
		
		isimler.add(0, "Ahmet");
		isimler.add(3, "Zehra");
		isimler.add("Cemal");
		System.out.println(isimler);
		System.out.println(isimler.size());
		
		Collections.sort(isimler);
		System.out.println(isimler);
		
		isimler.clear();
		System.out.println(isimler);
		
//		        [Ahmet, Hakan, Haluk, Zehra, K�r�at, Kamil, Arda, Cemal]
//				8
//				[Ahmet, Arda, Cemal, Hakan, Haluk, Kamil, K�r�at, Zehra]
//				[]
	}

}
