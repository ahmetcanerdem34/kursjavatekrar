package DAY_16_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma15 {

	public static void main(String[] args) {
		
        /*
        Girilen bir stringdeki a harfi say�s�n� bulunuz.
         c harfine s�ra gelirse d�ng�den ��k�ls�n

        Bug�n hava oldukca g�zel.-> 2
         str.CharAt(0)

         */
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("bir c�mle giriniz");
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
