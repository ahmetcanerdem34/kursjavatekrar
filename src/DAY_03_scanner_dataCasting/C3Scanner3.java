package DAY_03_scanner_dataCasting;

import java.util.Scanner;

public class C3Scanner3 {

	public static void main(String[] args) {
		
		//Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini
		//isteyip prizmanin hacmini hesaplayip yazdirin
		

		
		Scanner scan=new Scanner (System.in);
		System.out.println("dikdörtgenin uzun kenarýný, kýsa kenarýný ve yüksekliðini giriniz :");
		double uzunKenar=scan.nextDouble();
		double kisaKenar=scan.nextDouble();
		double yukseklik=scan.nextDouble();
		
		double hacim=uzunKenar*kisaKenar*yukseklik;
		
		
		System.out.println("Dikdörtgenin Hacmi :"+ hacim);
		
//		4.5
//		3.6
//		6
//		Dikdörtgenin Hacmi :97.19999999999999
		
		
		scan.close();
		
		
	}

}
