package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_ÝfStCalýsma05_gunayyýl {
public static void main(String[] args) {
	
	
	  /*
    Kullanýcýdan bir tarihi gün, ay ve yýl þeklinde alýp bu tarihi
    ay, gün, yýl ve yýl, ay, gün sýralarýna çevirerek yazan bir kod yazýnýz.

    Örnek Ekran Çýktýsý
    Lütfen günü giriniz: 10
    Lütfen ayý giriniz: 02
    Lütfen yýlý giriniz: 2009
    Gün ay yýl: 10.02.2009
    Ay gün yýl: 02.10.2009
    Yýl ay gün: 2009.02.10
    */
	
	Scanner scan = new Scanner(System.in);
	System.out.print("gün giriniz :");
	int gun=scan.nextInt();
	System.out.println("ay giriniz :");
	int ay=scan.nextInt();
	System.out.println("yýl giriniz :");
	int yil=scan.nextInt();
	
	if(gun>0 && gun<=31) {
		
		System.out.println(gun);
	}else {
		System.out.println("yanlýþ giriþ yaptýnýz, program sonlanýyor");
		
	}
	
	if(ay>0 && ay<=12) {
		
		System.out.println(ay);
	}else {
		System.out.println("yanlýþ girdiniz program sonlanýyor");
		return;
	}
	
	if (yil>0) {
		
		System.out.println(yil);
	}else {
		System.out.println("yanlýþ giriþ yaptýnýz");
		return;
	}
	System.out.println("ay/gün/yýl:" +ay+"/"+gun+"/"+yil);
	
//	gün giriniz :5
//	ay giriniz :
//	7
//	yýl giriniz :
//	2019
//	5
//	7
//	2019
//	ay/gün/yýl:7/5/2019
	
//	gün giriniz :4
//	ay giriniz :
//	12
//	yýl giriniz :
//	2018
//	4
//	12
//	2018
//	ay/gün/yýl:12/4/2018
	
	
	
}
}








