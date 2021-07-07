package DAY_09_turnary;

import java.util.Scanner;

public class C1_Turnary1 {

	public static void main(String[] args) {
		
		
		int sayi=10;
		
		System.out.println("giirlen sayý : " + (sayi%2==0 ? "çift" : "tek"));
		//giirlen sayý : çift
		
		
		int sayi1=36;
		
		
		String sonuc=(sayi1%6==0 ? "çift" : "tek");
		System.out.println("girilen sayýnýn mod6 sýnýn sonucu :" +sonuc);
		//girilen sayýnýn mod6 sýnýn sonucu :çift
		
		
		

		int y =1;
		int z=1;		
		int a =y<10 ? y++: z++;
		
		System.out.println(y + "," + z + "," + a );
		//2,1,1
		
		
		System.out.println(y++);//2
		System.out.println(++y);//4
		System.out.println(y);//4
		
		
		
		// soru: kullanýcýdan 2 sayý alýn ve yazdýrýn ve buyuk olaný yazýrýn
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("sayý giriniz :");
		int a1=scan.nextInt();
		int b1=scan.nextInt();
		
	   String sonucc= a1>b1 ? "a buyuktur b1 den" : "b1 buyuktur a1 den";
	   
	   System.out.println(sonucc);
	   
//	   sayý giriniz :34
//	   56
//	   b1 buyuktur a1 den
		
	   
	   System.out.println(sayi%2==0 ? "çift" : "tek");
		System.out.println();
		
		
		
		scan.close();	
		
	}

}
