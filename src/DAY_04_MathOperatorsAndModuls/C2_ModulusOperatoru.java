package DAY_04_MathOperatorsAndModuls;

import java.util.Scanner;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		
		
		int i=25;
		
		int modul=24%5;
		
		System.out.println(modul);//4
		
		System.out.println(36%6);
		System.out.println(45%4);
//		0
//		1
		
		System.out.println("***********************************");
		
		//856 say�s�n�n birler basam�� ka�t�r
		
		int a =856;	
		System.out.println("kalan e�itir=" + a%10);
		//kalan e�itir=6
		a/=10;
		System.out.println("kalan e�itir=" + a%10);
		//kalan e�itir=5
		a/=10;
		
		System.out.println("kalan e�itir=" + a%10);
		//kalan e�itir=8
		
	System.out.println("*************************************************");
		
	//soru : kullan��cdan 4 basamkl� say� alal�m ve say�n�n basamklar�n�n ters s�rada yazal�m
	//bir say�n�n basamklar�n� elde etmek i�in 2 i�lemi tekrar tekrar yapar�z
	//1. i�lem en sondaki basama�� elde etmek sonra onu yok etmek
	//2. i�lem bu i�lemi basamk say�s� kadar yapmal�y�m, 3 basam 3 , 4 basamak 4 kere ister
	
	
	
	Scanner scan=new Scanner (System.in);
	System.out.print("basamaklar�n� bulmak i�in 4 basamakl� say� giriniz :");
	int sayi=scan.nextInt();
	
	
	int birler=sayi%10;
	sayi/=10;
	
	int onlar=sayi%10;
	sayi/=10;
	
	int yuzler=sayi%10;
	sayi/=10;
	
	int binler=sayi%10;
	sayi/=10;
	
	System.out.print(birler);
	System.out.print(onlar);
	System.out.print(yuzler);
	System.out.print(binler);
	
	
//	basamaklar�n� bulmak i�in 4 basamakl� say� giriniz :3456
//	6543
	
	
	int toplam= birler + onlar + yuzler + binler;
	//tolama sonucu
	System.out.println("toplama sonucu :" +toplam);
	//18
	
	System.out.println("********************************************");
	
	
	
	
	
scan.close();	
	
	
	

	}

}
