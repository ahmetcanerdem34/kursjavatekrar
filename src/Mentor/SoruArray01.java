package Mentor;

import java.util.Arrays;

public class SoruArray01 {

	public static void main(String[] args) {
	
		
		/*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlar�n�n ortalama de�erini hesaplayan ve
         * ortalamadan b�y�k olan elemanlari yazd�r�n bir java program� yaz�n)
         * input[]= {1,2,3,4,5,6,7} 
         * Output : 4
         */
	
		 int input[]= {1,2,3,4,5,6,7};
		 
		double top=0;
		
		for (int each : input) {
			
			top=top+each;//28
			
		}
		double ort=top/input.length;
		System.out.println("verilen arrayin ortalamas� :"+ort);
		//verilen arrayin ortalamas� :4.0
		
		
		for (int each : input) {
			
			if(each>ort) {
				
				System.out.println("ortlamadan buyuk olanlar :" + each);
//				ortlamadan buyuk olanlar :5
//				ortlamadan buyuk olanlar :6
//				ortlamadan buyuk olanlar :7
				
	
			}
		
		}

		
		
	}

}
