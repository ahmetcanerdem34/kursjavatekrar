package DAY_07_iFstatement;

import java.util.Scanner;

public class C5_�fEle5 {

	public static void main(String[] args) {
		
		
				//soru: kullan�c�dan 2 say� isteyin, say�lar�n 2 side pozitifse say�lar�n yazd�r�n
				//2 side negatifse say�lar�n �arp�m�n� yaz�d�rn
				//farkl� i�aretlere sahipse farkl� i�aretlerle i�lem yapamzs�n�z yaz�n
				//say�lardan s�f�ra e�it olan varsa s�f�r �arpmaya g�re yutan elemand�r yazd�r�n
		
			Scanner scan=new Scanner (System.in);
			System.out.print("2 sayi girniz :");
			int sayi1=scan.nextInt();
			int sayi2=scan.nextInt();
			
			if(sayi1>0 && sayi2>0) {
				System.out.println("Girilen say�lar :" +sayi1+" "+ sayi2);
				
			}else if(sayi1<0 && sayi2<0) {
				
				System.out.println(sayi1*sayi2);
				
			}else if(sayi1==0 || sayi2==0) {
				
				System.out.println("s�f�r �arpmaya g�re yutan elemand�r...");
			}else {
				
				System.out.println("farkl� i�aretlere sahipse farkl� i�aretlerle i�lem yapamzs�n�z...");
				
//				2 sayi girniz :45
//				54
//				Girilen say�lar :45 54		
				
//				2 sayi girniz :-7
//				-6
//				42

//				2 sayi girniz :0
//				0
//				s�f�r �arpmaya g�re yutan elemand�r...
				
//				2 sayi girniz :56
//				-6
//				farkl� i�aretlere sahipse farkl� i�aretlerle i�lem yapamzs�n�z...
scan.close();
			}
			
		
		
	}

}
