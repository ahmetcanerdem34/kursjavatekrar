package DAY_02_scanners;

import java.util.Scanner;

public class C3_Scanner3 {
	
	public static void main(String[] args) {
		
		//kullan�c�dan ismini ve soyismini al�p aralar�nda bo�luk b�rakarak isim soyisim yazd�r�n
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("l�tfen isminizi ve soyisminiz  giriniz :");
		String isim=scan.nextLine();
		String soy�sim=scan.nextLine();
		
		System.out.println("�sim ve Soyisminiz :"+isim+" "+soy�sim);
		
//		l�tfen isminizi ve soyisminiz  giriniz :Ahmet Can
//		Temur
//		�sim ve Soyisminiz :Ahmet Can Temur
//		
		
		scan.close();
		
	}

}
