package DAY_24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_04Ornek {

	public static void main(String[] args) {
	
		//kullan�c�dan de�erler alarak bir int array olu�turun
				//ben kullan�c�n�n ka� de�er girece�ini bilmiyorum
				//ka� de�er girece�ini alal�m �nce
				//onun i�in de�erler almadan �nce uzunlu�unu almam laz�m
				//ona g�re for da yapal�m
				
				Scanner scan=new Scanner (System.in);
				System.out.println("diiznin ka� elemandan olaca��n� giirniz :");
				int uzunluk=scan.nextInt();
				
				int arr[]= new int[uzunluk];
				System.out.println("l�tfen say�lar� giriniz");
				
				for (int i = 0; i < arr.length; i++) {
					
					arr[i]=scan.nextInt();
					
				}
				System.out.println(Arrays.toString(arr));
//				diiznin ka� elemandan olaca��n� giirniz :
//					7
//					l�tfen say�lar� giriniz
//					34
//					32
//					32
//					434
//					55
//					44
//					32
//					[34, 32, 32, 434, 55, 44, 32]

	}

}
