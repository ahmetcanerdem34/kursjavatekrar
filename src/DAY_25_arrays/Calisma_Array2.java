package DAY_25_arrays;

import java.util.Arrays;

public class Calisma_Array2 {

	public static void main(String[] args) {
		
		int arr[]= {23,45,65,45,56};//bu dizi i�erisinde 45 var m� diye soral�m
		
		boolean flag=false;
		int sayi=53;//45 te //arad���n�z say� bu dizi de var sonuc verdi
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==sayi) {
				flag=true;
				
			}
			
		}
			if(flag) {
				
				System.out.println("arad���n�z say� bu dizi de var");
				//arad���n�z say� bu dizi de var
			}else {
				System.out.println("arad���n�z say� bu diz de yok");
				//arad���n�z say� bu diz de yok
			}
			
			System.out.println("*************************");
			
			//binary y�ntemiyle say�lar�n ka��nc� indexte oldu�una bak�yoruz;
			//yapal�m ama �ncesinde s�ralamal�y�z
			
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));//[23, 45, 45, 56, 65]
			
			System.out.println(Arrays.binarySearch(arr, 23));//0
			System.out.println(Arrays.binarySearch(arr, 45));//2
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
