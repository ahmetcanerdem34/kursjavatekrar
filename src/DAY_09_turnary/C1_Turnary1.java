package DAY_09_turnary;

import java.util.Scanner;

public class C1_Turnary1 {

	public static void main(String[] args) {
		
		
		int sayi=10;
		
		System.out.println("giirlen say� : " + (sayi%2==0 ? "�ift" : "tek"));
		//giirlen say� : �ift
		
		
		int sayi1=36;
		
		
		String sonuc=(sayi1%6==0 ? "�ift" : "tek");
		System.out.println("girilen say�n�n mod6 s�n�n sonucu :" +sonuc);
		//girilen say�n�n mod6 s�n�n sonucu :�ift
		
		
		

		int y =1;
		int z=1;		
		int a =y<10 ? y++: z++;
		
		System.out.println(y + "," + z + "," + a );
		//2,1,1
		
		
		System.out.println(y++);//2
		System.out.println(++y);//4
		System.out.println(y);//4
		
		
		
		// soru: kullan�c�dan 2 say� al�n ve yazd�r�n ve buyuk olan� yaz�r�n
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("say� giriniz :");
		int a1=scan.nextInt();
		int b1=scan.nextInt();
		
	   String sonucc= a1>b1 ? "a buyuktur b1 den" : "b1 buyuktur a1 den";
	   
	   System.out.println(sonucc);
	   
//	   say� giriniz :34
//	   56
//	   b1 buyuktur a1 den
		
	   
	   System.out.println(sayi%2==0 ? "�ift" : "tek");
		System.out.println();
		
		
		
		scan.close();	
		
	}

}
