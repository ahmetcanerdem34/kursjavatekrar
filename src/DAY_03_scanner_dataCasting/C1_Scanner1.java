package DAY_03_scanner_dataCasting;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("l�tfen isminizi ve soyisminiz  giriniz :");
		String isimSoyisim=scan.nextLine();
		
		
		System.out.println("isim ve Soyisminiz :" + isimSoyisim);
		
		System.out.println("KAYDINIZ ALINMI�TIR...");
		
//		
//		l�tfen isminizi ve soyisminiz  giriniz :Ahmet Kurtaran
//		isim ve Soyisminiz :Ahmet Kurtaran
//		KAYDINIZ ALINMI�TIR...
		
		scan.close();
	}

}
