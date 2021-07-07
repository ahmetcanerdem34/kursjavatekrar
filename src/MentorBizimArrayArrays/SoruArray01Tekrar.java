package MentorBizimArrayArrays;

import java.util.Scanner;

public class SoruArray01Tekrar {

		public static void main(String[] args) {
			// kg-gr, km-ml,saat-saniyeye,dolar-tl,derece-celvin
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen birimi giriniz");
			String birim = scan.next();
			System.out.println("Lutfen miktar giriniz");
			double miktar = scan.nextDouble();
			
			
			donusturucu(birim, miktar);
			
		
		}
		public static double donusturucu(String birim, double miktar ) {
			
			switch(birim) {
			
			case "kg" :
				System.out.println(miktar*1000); 
				break;
			case "km" :
				System.out.println(miktar*1.6);
				break;	
			case "saat" :
				System.out.println(miktar*60*60);
				break;
			case "dolar" :
				System.out.println(miktar*8.14);
				break;
			case "derece" :
				System.out.println(miktar+273);
				break;
			default :
				System.out.println("Yanlis girdiniz");
			}
			return miktar;
			
			
		}
	}
	
		
		

			
			
		