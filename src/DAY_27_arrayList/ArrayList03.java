package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
	
	       	//kullanýcýdan pozitif bir tamsayý alýn
				//aldýðýnýz sayýdan küçük olan fibonacci dizisi elemanlarýný yazdýrýn
				
				//1 1 2 3 5 8 
				//sayýmýz  olsun mesela
				
				//kullanýcýdan sayý alalým
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz :");
		int sayi=scan.nextInt();
		
		        //kullanýcýnýn kaç gireceðini bilmiyoruz
				//en doðrusu list le yapmak
		
		List<Integer> fibo = new ArrayList<>();
		
		fibo.add(1);
		fibo.add(1);
		
		
		System.out.println(fibo);
		

		System.out.println("************************");
		
		//get. yý kullanarak 0 ve 1 dekini kullanabiliriz
		
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
