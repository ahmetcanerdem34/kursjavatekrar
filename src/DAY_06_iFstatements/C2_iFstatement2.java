package DAY_06_iFstatements;

import java.util.Scanner;

public class C2_iFstatement2 {

	public static void main(String[] args) {
		
		//soru kullan�cdan bir say� isteyin ve say�n�n tekmi �ift mi onu yazd�r�n
		
				Scanner scan=new Scanner (System.in);
				
				System.out.print("istedi�iniz g�n�n ilk harfini giriniz :");
				char ilkHarf=scan.next().toLowerCase().charAt(0);
				
				
				if(ilkHarf=='p') {
					
					System.out.println("pazartesi - per�embe - pazar");
				}
				
				if(ilkHarf=='s') {
					
					System.out.println("sal�");
				}
				
				if(ilkHarf=='�') {
					System.out.println("�ar�amba");
				}
				
				if(ilkHarf=='c') {
					
					System.out.println("cuma - cumartesi");
				}
				else if(ilkHarf >'a' != ilkHarf < 'z' )  {
					
					System.out.println("yanl�� g�n karakteri girdiniz...");
					
					
					
//					istedi�iniz g�n�n ilk harfini giriniz :p
//					pazartesi - per�embe - pazar
					
//					istedi�iniz g�n�n ilk harfini giriniz :%
//					yanl�� g�n karakteri girdiniz...
					
//					istedi�iniz g�n�n ilk harfini giriniz :c
//					cuma - cumartesi

				}
	}
				
		
	}


