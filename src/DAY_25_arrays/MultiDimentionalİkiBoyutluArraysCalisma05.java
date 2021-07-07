package DAY_25_arrays;

import java.util.Arrays;

public class MultiDimentionalÝkiBoyutluArraysCalisma05 {

	public static void main(String[] args) {
		
		     //dizi 1 ve dizi 2 olmak üzere 2 dizimiz var
				//1. diziyi 2. ye kopyalamak istiyorsak
				//2. için yeni bir diz oluþturmalýyýz
				
		int dizi1[]= {12,34,43,56,65,76,67};
		int dizi2[]= {54,67,76,54,43,32,21};
		
		String birlestir=Arrays.toString(dizi1);
		String birlestir2=Arrays.toString(dizi2);
		System.out.println(birlestir +" "+birlestir2);//[12, 34, 43, 56, 65, 76, 67] [54, 67, 76, 54, 43, 32, 21]

			
		int dizi3[]=new int[dizi1.length];
		
		
		for (int i = 0; i < dizi3.length; i++) {
			
			dizi3[i]=dizi1[i];
			
		}
		for (int i = 0; i < dizi3.length; i++) {
			
			if(dizi3[i]!=0) {
				
				System.out.print(dizi3[i]+" ");//12 34 43 56 65 76 67 
			}
			
		}
	}

}
