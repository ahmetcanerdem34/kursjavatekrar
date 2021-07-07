package MentorBizimArrayArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoruArrayList16_04 {

	public static void main(String[] args) {
	
		
		 /*
		   Bir integer list oluþturunuz ve bu list’deki tum sayýlarýn karesinin
		   toplamýný For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
		    */
		
		//2 þekilde liste hazýrlayabiliriz
//		List<Integer> liste= new ArrayList();
		
//		liste.add(4);
//		liste.add(5);
//		liste.add(2);
//		liste.add(3);
		
		List<Integer> liste= new ArrayList(Arrays.asList(2,3,4,5,6,7));
		int karesi=0;
		int toplam=0;
		for (Integer each : liste) {
			
			karesi=each*each;
			toplam+=karesi;
		}
		System.out.println(toplam);//139
		
		//oluþturmuþ olduðumuz bu listeyi bir array oluþturarak iine ataybilirz
		
		//Integer arr[]= new  Integer[]; burasý hata verir arr uzunluk ister bizde yukardaki listenin uzunluðunu buraya verelim
		
		Integer arr[]= new  Integer[liste.size()];
		
		for (int i = 0; i <arr.length; i++) {
			
			arr[i]=liste.get(i);
			
		}
		System.out.println(Arrays.toString(arr));
		//[2, 3, 4, 5, 6, 7]
	}

}
