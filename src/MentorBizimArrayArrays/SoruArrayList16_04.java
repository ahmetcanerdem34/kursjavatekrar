package MentorBizimArrayArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoruArrayList16_04 {

	public static void main(String[] args) {
	
		
		 /*
		   Bir integer list olu�turunuz ve bu list�deki tum say�lar�n karesinin
		   toplam�n� For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.
		    */
		
		//2 �ekilde liste haz�rlayabiliriz
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
		
		//olu�turmu� oldu�umuz bu listeyi bir array olu�turarak iine ataybilirz
		
		//Integer arr[]= new  Integer[]; buras� hata verir arr uzunluk ister bizde yukardaki listenin uzunlu�unu buraya verelim
		
		Integer arr[]= new  Integer[liste.size()];
		
		for (int i = 0; i <arr.length; i++) {
			
			arr[i]=liste.get(i);
			
		}
		System.out.println(Arrays.toString(arr));
		//[2, 3, 4, 5, 6, 7]
	}

}
