package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_�fStCal�sma04_ehliyet {

	public static void main(String[] args) {
		
		  /*
        Kulan�c�dan arac�n�n h�z�n� al�n�z
        Trafik cezas�n�n de�erini hesaplay�n.
            45 h�z s�n�r�d�r.
            E�er h�z�n�z 55-74 aras�nda ise:
            Ceza 100 $'d�r.

            E�er h�z�n�z 75 - 84 aras�nda ise:
            Ceza 150 $'d�r.

            E�er h�z�n�z 85 -94 aras�nda ise:
            Ceza 320 $'d�r.

            E�er h�z�n�z 94'den daha fazla ise:
            Ceza 500 $'d�r.

            ve ayr�ca,
            E�er s�r�c�n�n ehliyeti yoksa cezaya 200 $ eklenir.

            �rn: H�z�n�z 77 iken cezan�z 150$'d�r ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            �rn;

            currentSpeed(H�z�n�z) 87
            ve isDriverLicenceAvailable(Ehliyeti var m�?) = true;

            sonu� 320 olmal�d�r.

            currentSpeed(H�z�n�z) 65
            ve isDriverLicenceAvailable(Ehliyeti var m�?) = false;

            sonu� 300 olmal�d�r.
     */
			
		Scanner scan = new Scanner(System.in);
		System.out.print("arac�n h�z�n� giriniz :");
		int hiz=scan.nextInt();
		System.out.print("ehliyetiniz var m� :");
		String ehliyet=scan.next().toLowerCase();
	
		
		if (hiz>55 && hiz<77) {
			
			if(ehliyet.contains("evet")) {
				
				System.out.println("Ceza 100 $'d�r.");
			}else {
				System.out.println("cezan�z 300$");
			}

		}else if(hiz>75 && hiz<84) {
			
			if(ehliyet.contains("evet")) {
				
				System.out.println("Ceza 150 $'d�r.");
			}else {
				System.out.println("cezan�z 450$");
			}
		
		}else if(hiz>85 && hiz<94) {
			
			if(ehliyet.contains("evet")) {
				
				System.out.println("Ceza 320 $'d�r.");
			}else {
				System.out.println("cezan�z 520$");
			}
				
			}else if(hiz>94) {
				
				if(ehliyet.contains("evet")) {
					
					System.out.println("Ceza 500 $'d�r.");
				}else {
					System.out.println("cezan�z 700$");
					
//					arac�n h�z�n� giriniz :78
//					ehliyetiniz var m� :hay�r
//					cezan�z 450$
					
//					arac�n h�z�n� giriniz :90
//					ehliyetiniz var m� :evet
//					Ceza 320 $'d�r.
					
					scan.close();

				}
			}
	}

}
