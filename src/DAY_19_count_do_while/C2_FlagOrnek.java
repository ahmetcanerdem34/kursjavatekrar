package DAY_19_count_do_while;

import java.util.Scanner;

public class C2_FlagOrnek {

	public static void main(String[] args) {
	
		
				//kullanýýcdan bir cümle alýn
				//cumlede buyuk harfvar mý yok mu yazdýrýn
				//while loop ile yapýlacak
		
		Scanner scan= new Scanner (System.in);
		System.out.print("bir cümle giriniz :");
		String cumle=scan.nextLine();
		
		String flag="yok";
		int index =0;
		
		while(index<cumle.length()) {
			
			if(cumle.charAt(index)>='A' && cumle.charAt(index)<='Z') {
			flag=" var";
				
				
			}
			index++;
			
		}
			System.out.println("bu cümlede büyük harf :" +" "+ flag);	
			
			
			
//			bir cümle giriniz :AHMET java öðreniyor
//			bu cümlede büyük harf :  var
			
			scan.close();
	}

}
