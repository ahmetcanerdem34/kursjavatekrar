package MentorBizimArrayArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoruArrayList16_03 {

	public static void main(String[] args) {
		
//		2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanlarý bir
//		listeye kopyalayan ve harf sýrasýna göre yazdýran bir METHOD yazýnýz.
//		Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
//		   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

 //       String isim[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};

		
		String isim[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};//bu bizim array imiz
		
		

		yeniListe(isim);
		
		
		/*
		 * Ali","Veli","Ayse"-->0. kat
		 * "Hasan","Can"------>1.kat
		 * "Suzan"----->>>2.kat
		 * 
		 * 		
		 */

}

	public static void yeniListe(String str[][]) {
		
		List<String> yeniListe= new ArrayList<>();//tum elemnlarý atacaðýmýz yeni listemiz
		
		for (int kat = 0; kat < str.length; kat++) {
			
			for (int daire = 0; daire < str[kat].length; daire++) {//neden length cunki str bir array
				
				yeniListe.add(str[kat][daire]);
				
			}
			
		}
		System.out.println(yeniListe);//[Ali, Veli, Ayse, Hasan, Can, Suzan]
		
		Collections.sort(yeniListe);
		System.out.println(yeniListe);//[Ali, Ayse, Can, Hasan, Suzan, Veli]
		
	}
}