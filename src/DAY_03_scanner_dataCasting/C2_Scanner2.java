package DAY_03_scanner_dataCasting;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		
		//kullanýcýdan ismini isteyin ve ilk harfini büyük harf olarak yazýn
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Ýsminizi giriniz :");
		String isim=scan.nextLine().toUpperCase();
		
		
		char ilkHarf=isim.charAt(0);
		System.out.println("Ýsinizin ilh harfi :"+ ilkHarf);
		System.out.println("Ýsminizin ilk harfi :"+isim.charAt(0));
	
//		Ýsminizi giriniz :Mehmet Taný
//		Ýsinizin ilh harfi :M
//		Ýsminizin ilk harfi :M
		
		scan.close();
		
		
		
	}

}
