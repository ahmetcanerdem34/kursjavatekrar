package DAY_25_arrays;

import java.util.Arrays;

public class Calisma_Array2 {

	public static void main(String[] args) {
		
		int arr[]= {23,45,65,45,56};//bu dizi içerisinde 45 var mý diye soralým
		
		boolean flag=false;
		int sayi=53;//45 te //aradýðýnýz sayý bu dizi de var sonuc verdi
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==sayi) {
				flag=true;
				
			}
			
		}
			if(flag) {
				
				System.out.println("aradýðýnýz sayý bu dizi de var");
				//aradýðýnýz sayý bu dizi de var
			}else {
				System.out.println("aradýðýnýz sayý bu diz de yok");
				//aradýðýnýz sayý bu diz de yok
			}
			
			System.out.println("*************************");
			
			//binary yöntemiyle sayýlarýn kaçýncý indexte olduðuna bakýyoruz;
			//yapalým ama öncesinde sýralamalýyýz
			
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));//[23, 45, 45, 56, 65]
			
			System.out.println(Arrays.binarySearch(arr, 23));//0
			System.out.println(Arrays.binarySearch(arr, 45));//2
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
