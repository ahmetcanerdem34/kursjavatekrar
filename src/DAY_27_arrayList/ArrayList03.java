package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
	
	       	//kullan�c�dan pozitif bir tamsay� al�n
				//ald���n�z say�dan k���k olan fibonacci dizisi elemanlar�n� yazd�r�n
				
				//1 1 2 3 5 8 
				//say�m�z  olsun mesela
				
				//kullan�c�dan say� alal�m
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz :");
		int sayi=scan.nextInt();
		
		        //kullan�c�n�n ka� girece�ini bilmiyoruz
				//en do�rusu list le yapmak
		
		List<Integer> fibo = new ArrayList<>();
		
		fibo.add(1);
		fibo.add(1);
		
		
		System.out.println(fibo);
		

		System.out.println("************************");
		
		//get. y� kullanarak 0 ve 1 dekini kullanabiliriz
		
		System.out.println(fibo.get(0) + fibo.get(1));
		
		for (int i = 2; fibo.get(i-2) + fibo.get(i-1)< sayi; i++) {
			
			fibo.add(fibo.get(i-2) + fibo.get(i-1));
			
		}
		System.out.println(fibo);
		
		
		int i =2;
		int yeniSayi=0;
		
		
		while(yeniSayi<sayi) {
			
			yeniSayi=fibo.get(i-2)+ fibo.get(i-1);
			fibo.add(yeniSayi);
			i++;
		}
		System.out.println(fibo);
		
		
		
		
		
		
		
		
		
		
		
	}

}
