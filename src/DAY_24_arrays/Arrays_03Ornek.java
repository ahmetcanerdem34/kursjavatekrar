package DAY_24_arrays;

import java.util.Arrays;

public class Arrays_03Ornek {

	
	public static void main(String[] args) {
		//Soru 2: Verilen bir array�in tum elemanlarini toplayan bir program yazalim.
		
		
		
				int arr[] = {10, 15,2,45,78};//bu say�lar� toplamak i�in bir konteryer gerekiyor, yani int top=0; elemanlar� al ekle
				
				int toplam=0; //bu lokal variabble dir de�er atamal�y�z sonra �al��maz
				
				for (int i = 0; i < arr.length; i++) {

					toplam+=arr[i];		
				}
				System.out.println(toplam);
				//150
				System.out.println(Arrays.toString(arr));
				//dizinin elemanlar�--->[10, 15, 2, 45, 78]
				
}
}