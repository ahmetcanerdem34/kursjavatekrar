package DAY_08_nested�f;

import java.util.Scanner;

public class C1_Nested�f1 {

	public static void main(String[] args) {
/*

		Soru 9) Interview Question
	Kullanicidan artik yil olup olmadigini kontrol
	etmek icin yil girmesini isteyin.
	Kural 1: 4 ile bolunemeyen yillar artik yil degildir
	Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar
	artik yildir
	Kural 3: 4�un kati olmasina ragmen 100 ile
	bolunebilen yillardan sadece 400�un
	kati olan yillar artik yildir
		
		 */ 
		
		Scanner scan = new Scanner (System.in);
		System.out.print("y�l giriniz:");
		int y�l=scan.nextInt();
		
		if (y�l%4==0){
			
			System.out.println("art�k y�l");
	
		
		}else {
			
			System.out.println("art�k y�l de�ildir");
			
//			y�l giriniz:2021
//			art�k y�l de�ildir
			
//			y�l giriniz:2022
//			art�k y�l de�ildir
			
//			y�l giriniz:2004
//			art�k y�l
			
			scan.close();
		}
	}

}
