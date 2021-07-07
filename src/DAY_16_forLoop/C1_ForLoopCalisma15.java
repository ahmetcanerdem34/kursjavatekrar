package DAY_16_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma15 {

	public static void main(String[] args) {
		
        /*
        Girilen bir stringdeki a harfi sayýsýný bulunuz.
         c harfine sýra gelirse döngüden çýkýlsýn

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("bir cümle giriniz");
		String cumle=scan.nextLine();
		
		int toplam=0;
		
		
		for (int i = 0; i < cumle.length(); i++) {
			
			if(cumle.toLowerCase().charAt(i)=='a') {
				toplam++;
				
			}else if(cumle.toLowerCase().charAt(i)=='c'){
				break;
			}
			
		}
		System.out.println(toplam);
	}

}
