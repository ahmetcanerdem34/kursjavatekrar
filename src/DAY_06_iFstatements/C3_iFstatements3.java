package DAY_06_iFstatements;

import java.util.Scanner;

public class C3_iFstatements3 {

	public static void main(String[] args) {
		
	
		//kullan�c�dan gun ismini al�n gun hafta i�i veya hafta sonu oldu�unu yazd�r�n
				//��nk� string non primitivedir ve metodu vard�r
		
		Scanner scan= new Scanner(System.in);
		System.out.print("g�n ismi giriniz :");
		String gun=scan.nextLine().toLowerCase();//strimg de e�itlik i�in equals kullan�yoruz
		
		
		if(gun.equals("pazartesi" ) || gun.equals("sal�") || gun.equals("�ar�amba") || gun.equals("per�embe") || gun.equals("cuma" ) ){
			
			System.out.println("girilen g�n haftai�idir..");
			//g�n ismi giriniz :sal�
			//girilen g�n haftai�idir..
			
		}
		if(gun.equals("cumartesi") || gun.equals("pazar")) {
			
			System.out.println("girilen g�n haftasonudur");		
//			g�n ismi giriniz :pazar
//			girilen g�n haftasonudur
			
			scan.close();
		}
	
		
	}

}
