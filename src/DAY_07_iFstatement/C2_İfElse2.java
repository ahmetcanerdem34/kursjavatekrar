package DAY_07_iFstatement;

import java.util.Scanner;

public class C2_�fElse2 {

	public static void main(String[] args) {
		
		
		//Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup 
		//olmadigini yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.print("bir kararkter giriniz :");
		char karakter=scan.next().toLowerCase().charAt(0);
		
		
		if(karakter>='a' && karakter<='z') {
			
			System.out.println("girilen karakter harftir");
		}else {
			
			System.out.println("girilen karakter harf de�ildir");
//			bir kararkter giriniz :t
//			girilen karakter harftir
			
//			bir kararkter giriniz :+
//			girilen karakter harf de�ildir
		}
		
		//Soru 3) Kullaniciya yasini sorun, eger yas 65�den kucuk ise �emekli olamazsin, 
		//calismalisin�, 65�den buyukse �Emekli olabilirsin� yazdirin
		
		System.out.print("YA�INIZI G�R�N�Z :");
		int yas =scan.nextInt();
		
		
		if(yas>=65) {
			
			System.out.println("emekli olabilirsiniz");
		}else {
			
			System.out.println("emekli olamazs�n�z");
			
//			YA�INIZI G�R�N�Z :66
//			emekli olabilirsiniz
			
//			YA�INIZI G�R�N�Z :54
//			emekli olamazs�n�z
			
			scan.close();
		}
		
		
		
		
		
	}
}
