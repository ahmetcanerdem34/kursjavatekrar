package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		
		//kullan�c�dan bir c�mle ve aramak istedi�i bir String isteyin
				//c�mle stringi i�eriyorsa"ba�ar�l�" de�ilse "ba�ar�s�z" yaz�n

		
		//kullan�c�dan bir c�mle ve alrak istedi�i bir String isteyin
				//c�mle stringi i�eriyorsa"ba�ar�l�" de�ilse "ba�ar�s�z" yaz�n
				
				
				
				
				Scanner scan=new Scanner(System.in);
				System.out.print("bir c�mle giriniz :");
				String cumle=scan.nextLine();
				System.out.println("aramak istedi�iniz kelimeyi yaz�n�z :");
				String kelime=scan.next();
				
				System.out.println(cumle.contains(kelime) ? "ba�ar�l�" : "ba�ar�s�z");
				//ba�ar�l�
				
				System.out.println("******************************");
				
				if (cumle.contains(kelime)) {
					System.out.println("ba�ar�l�");
					
				}else {
					System.out.println("g�zel");
					
//					bir c�mle giriniz :hedef java
//					aramak istedi�iniz kelimeyi yaz�n�z :
//					g�zel
//					ba�ar�s�z
//					******************************
//					g�zel

					
				}
	}

}
