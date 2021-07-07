package DAY_06_iFstatements;

import java.util.Scanner;

public class C3_iFstatements3 {

	public static void main(String[] args) {
		
	
		//kullanýcýdan gun ismini alýn gun hafta içi veya hafta sonu olduðunu yazdýrýn
				//çünkü string non primitivedir ve metodu vardýr
		
		Scanner scan= new Scanner(System.in);
		System.out.print("gün ismi giriniz :");
		String gun=scan.nextLine().toLowerCase();//strimg de eþitlik için equals kullanýyoruz
		
		
		if(gun.equals("pazartesi" ) || gun.equals("salý") || gun.equals("çarþamba") || gun.equals("perþembe") || gun.equals("cuma" ) ){
			
			System.out.println("girilen gün haftaiçidir..");
			//gün ismi giriniz :salý
			//girilen gün haftaiçidir..
			
		}
		if(gun.equals("cumartesi") || gun.equals("pazar")) {
			
			System.out.println("girilen gün haftasonudur");		
//			gün ismi giriniz :pazar
//			girilen gün haftasonudur
			
			scan.close();
		}
	
		
	}

}
