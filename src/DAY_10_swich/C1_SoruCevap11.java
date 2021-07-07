package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap11 {

	public static void main(String[] args) {
		
		/*
		 Kullanicidan bir character girmesini isteyiniz
		 Character harf ise kucuk harf olup olmadigini kontrol ediniz
		 Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
		 Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
		 Harf degilse ekrana "Harf degil" yazdiriniz
	*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("karakter giriniz :");
		String karakter=scan.next();
		
		
		if(karakter.charAt(0)>='a' && karakter.charAt(0)<='z') {
			
			  System.out.println("küçük harf");
		}else if((karakter.charAt(0)>='A' && karakter.charAt(0)<='Z')) {
			
			System.out.println("büyük harf");
		}
		else {
			System.out.println("harf değil");
			
			scan.close();
		}
	}

}
