package DAY_03_scanner_dataCasting;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		
		//kullan�c�dan ismini isteyin ve ilk harfini b�y�k harf olarak yaz�n
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�sminizi giriniz :");
		String isim=scan.nextLine().toUpperCase();
		
		
		char ilkHarf=isim.charAt(0);
		System.out.println("�sinizin ilh harfi :"+ ilkHarf);
		System.out.println("�sminizin ilk harfi :"+isim.charAt(0));
	
//		�sminizi giriniz :Mehmet Tan�
//		�sinizin ilh harfi :M
//		�sminizin ilk harfi :M
		
		scan.close();
		
		
		
	}

}
