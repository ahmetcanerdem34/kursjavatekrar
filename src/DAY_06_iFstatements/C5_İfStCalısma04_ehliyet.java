package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_ÝfStCalýsma04_ehliyet {

	public static void main(String[] args) {
		
		  /*
        Kulanýcýdan aracýnýn hýzýný alýnýz
        Trafik cezasýnýn deðerini hesaplayýn.
            45 hýz sýnýrýdýr.
            Eðer hýzýnýz 55-74 arasýnda ise:
            Ceza 100 $'dýr.

            Eðer hýzýnýz 75 - 84 arasýnda ise:
            Ceza 150 $'dýr.

            Eðer hýzýnýz 85 -94 arasýnda ise:
            Ceza 320 $'dýr.

            Eðer hýzýnýz 94'den daha fazla ise:
            Ceza 500 $'dýr.

            ve ayrýca,
            Eðer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hýzýnýz 77 iken cezanýz 150$'dýr ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hýzýnýz) 87
            ve isDriverLicenceAvailable(Ehliyeti var mý?) = true;

            sonuç 320 olmalýdýr.

            currentSpeed(Hýzýnýz) 65
            ve isDriverLicenceAvailable(Ehliyeti var mý?) = false;

            sonuç 300 olmalýdýr.
     */
			
		Scanner scan = new Scanner(System.in);
		System.out.print("aracýn hýzýný giriniz :");
		int hiz=scan.nextInt();
		System.out.print("ehliyetiniz var mý :");
		String ehliyet=scan.next().toLowerCase();
	
		
		if (hiz>55 && hiz<77) {
			
			if(ehliyet.contains("evet")) {
				
				System.out.println("Ceza 100 $'dýr.");
			}else {
				System.out.println("cezanýz 300$");
			}

		}else if(hiz>75 && hiz<84) {
			
			if(ehliyet.contains("evet")) {
				
				System.out.println("Ceza 150 $'dýr.");
			}else {
				System.out.println("cezanýz 450$");
			}
		
		}else if(hiz>85 && hiz<94) {
			
			if(ehliyet.contains("evet")) {
				
				System.out.println("Ceza 320 $'dýr.");
			}else {
				System.out.println("cezanýz 520$");
			}
				
			}else if(hiz>94) {
				
				if(ehliyet.contains("evet")) {
					
					System.out.println("Ceza 500 $'dýr.");
				}else {
					System.out.println("cezanýz 700$");
					
//					aracýn hýzýný giriniz :78
//					ehliyetiniz var mý :hayýr
//					cezanýz 450$
					
//					aracýn hýzýný giriniz :90
//					ehliyetiniz var mý :evet
//					Ceza 320 $'dýr.
					
					scan.close();

				}
			}
	}

}
