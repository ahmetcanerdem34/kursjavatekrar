package MentorBizimArrayArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoruArrayList16_06 {

	public static void main(String[] args) {
		
		
		 /*
         * 10 elamanli bir string Array olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler=
         * {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet",
         * "Ali"};
         *
         * OUTPUT : String[] isimler=
         * {"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal"
         * ,"Ahmet","Ali"};
         */
		
		String arr[]={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet"};
		
		List<String> yeniListe = new ArrayList(Arrays.asList(arr));
		
		System.out.println(yeniListe);
			
		
		
		String eleman8=yeniListe.get(8);
	
		
		
		yeniListe.add(3, eleman8);
		System.out.println(yeniListe);
	
		String eleman4=yeniListe.get(5);
		
		yeniListe.add(8, eleman4);
		System.out.println(yeniListe);
	}

}
