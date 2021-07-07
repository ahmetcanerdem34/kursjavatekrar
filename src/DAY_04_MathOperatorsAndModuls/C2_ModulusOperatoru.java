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
		
		//856 sayýsýnýn birler basamðý kaçtýr
		
		int a =856;	
		System.out.println("kalan eþitir=" + a%10);
		//kalan eþitir=6
		a/=10;
		System.out.println("kalan eþitir=" + a%10);
		//kalan eþitir=5
		a/=10;
		
		System.out.println("kalan eþitir=" + a%10);
		//kalan eþitir=8
		
	System.out.println("*************************************************");
		
	//soru : kullanýýcdan 4 basamklý sayý alalým ve sayýnýn basamklarýnýn ters sýrada yazalým
	//bir sayýnýn basamklarýný elde etmek için 2 iþlemi tekrar tekrar yaparýz
	//1. iþlem en sondaki basamaðý elde etmek sonra onu yok etmek
	//2. iþlem bu iþlemi basamk sayýsý kadar yapmalýyým, 3 basam 3 , 4 basamak 4 kere ister
	
	
	
	Scanner scan=new Scanner (System.in);
	System.out.print("basamaklarýný bulmak için 4 basamaklý sayý giriniz :");
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
	
	
//	basamaklarýný bulmak için 4 basamaklý sayý giriniz :3456
//	6543
	
	
	int toplam= birler + onlar + yuzler + binler;
	//tolama sonucu
	System.out.println("toplama sonucu :" +toplam);
	//18
	
	System.out.println("********************************************");
	
	
	
	
	
scan.close();	
	
	
	

	}

}
