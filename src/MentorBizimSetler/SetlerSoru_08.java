package MentorBizimSetler;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SetlerSoru_08 {

	public static void main(String[] args) {
		
		
			// Verilen bir Array'deki tekrarli elemanlari silip
	        // unique elemanlardan olusan bir Array'e ceviren 
	        // bir method yaziniz
				
		int arr[]= {9,3,7,5,1,7,3};
		
//		ArrayList<Integer> yeni = new ArrayList<>();
//			
//		for (Integer each : arr) {
//			
//			yeni.add(each);
//		}
//		System.out.println(yeni);
//		
		
		//int arrYeni[] = tekrariSil(arr);
		System.out.println(Arrays.toString(tekrariSil(arr)));
		
	}

	public static int[] tekrariSil(int[] arr) {
		
    HashSet<Integer> hs = new HashSet<>();//yukardaki array i hs ye �evirdik, array liste �evirmeye gerek kalmad�
		
		for (Integer each : arr) {//aech le arr nin her bir eleamn�n� al , hs. add le herbirini hs ye ekle
			
			hs.add(each);
			
			
		}
		
		System.out.println(hs);
		
		int index=0;
		int arrYeni[]= new int[hs.size()];//hs yi array e �evirdik
		
			for (int each : hs) {//each le hs nin her bir eleman�n� al arrYeni ye ata, arr indexle art��� i�in index++ koyduk 
								//hs nin siz � na kadar gitsin

				arrYeni[index]=each;//index yerine countta yazabilirz ayn� �ey.  
				index++;
			}
		
		return arrYeni;
		
	}

}
