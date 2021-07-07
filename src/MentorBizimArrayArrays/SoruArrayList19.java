package MentorBizimArrayArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoruArrayList19 {

	public static void main(String[] args) {
		
		/*
		 Bir integer list oluþturunuz ve bu list'deki tum sayýlarýn karesinin
		toplamýný For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
		  */

		List<Integer> sayi = new ArrayList<>(Arrays.asList(2,4,5,6,9,13,18,20,-5,-3,-6,-8,-20));
		Integer arr[]=new Integer[sayi.size()];
		List<Integer> kareleri = new ArrayList<>();
		
		int carpim=1;
		int kare=1;
		int kareToplam=0;
		for (Integer each : sayi) {
			
			kare=each*each;
			kareToplam+=kare;

		}
		for (int i = 0; i < arr.length; i++) {
			carpim=sayi.get(i)*sayi.get(i);
			arr[i]=carpim;
			kareleri.add(carpim);
			
		}
			
			System.out.println(kare);//400
			System.out.println(kareToplam);//1138
			System.out.println(Arrays.toString(arr));
			System.out.println(kareleri);
	}

}
