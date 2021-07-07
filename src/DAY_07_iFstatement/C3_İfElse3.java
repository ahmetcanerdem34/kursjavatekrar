package DAY_07_iFstatement;

import java.util.Scanner;

public class C3_ÝfElse3 {

	public static void main(String[] args) {
		
		
		//Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu 
		//birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana 
		//“Eskenar degil” yazdirin.
		
		Scanner scan = new Scanner (System.in);
		System.out.print("kenar uzunluklarý giriniz :");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		
		
		if(kenar1==kenar2 && kenar1==kenar3) {
			
			System.out.println("“Eskenar ucgen”");
		}else {
			
			System.out.println("“Eskenar degil”");
			
//			kenar uzunluklarý giriniz :34.6
//			34.6
//			34.6
//			“Eskenar ucgen”
			
//			kenar uzunluklarý giriniz :45
//			65
//			45
//			“Eskenar degil”
			
			scan.close();
		}
	}

}
