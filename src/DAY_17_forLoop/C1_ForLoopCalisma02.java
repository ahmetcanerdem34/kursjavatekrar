package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma02 {

	public static void main(String[] args) {
		
		
		//kullan�c�dan 35 tan k���k pozitif bir say� al�n 
		//farkl� method da girilen say�n�n faktoriyrlini hesaplay�p  yazd��ran bir metod olu�turun
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("35 k���k pozitif tamsay� griniz :");
		int sayi=scan.nextInt();
		
		if(sayi<=0 || sayi>35) {
			System.out.println("1 ve 35 aras�nda say� giriniz :");
			
			
		}else if(sayi<35 && sayi>0) {
			
			foktoriyelHesapla(sayi);
		}

	
	}

	public static void foktoriyelHesapla(int m) {
		int carpim=1;
		for (int i = 1; i <=m; i++) {
			
			carpim*=i;
			
		}
	System.out.println(carpim);
	//35 k���k pozitif tamsay� griniz :5
	//120
		
	}

}
