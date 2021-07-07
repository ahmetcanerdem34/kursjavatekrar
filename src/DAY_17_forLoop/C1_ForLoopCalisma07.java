package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma07 {

	public static void main(String[] args) {
		
		
		//kullanýcýdan pozitif tam sayý alýn
		//1 den kullanýcýnýn girdiði sayýya kadar tum tam sayýlarýn toplamýný yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		
		
		System.out.println("sayý giriniz :");
		int sayi=scan.nextInt();
		
		int toplam=0;
		for (int i = 1; i < sayi; i++) {
			
			toplam+=i;
			
			
		}
		System.out.print("girilen sayýya kadar olan sayýlarýn toplamý :" +toplam);
//		sayý giriniz :
//			35
//			girilen sayýya kadar olan sayýlarýn toplamý :595
scan.close();
	}

}
