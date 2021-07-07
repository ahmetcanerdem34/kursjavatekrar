package DAY_15_methodCreationDevam;

import java.util.Scanner;

public class C1_MethodSoru {

	public static void main(String[] args) {

		/*
        Soru 1 ) Kullanicidan bir tam sayi alin. 
        Bu sayinin negatif veya pozitif oldugunu, 
        tek mi cift mi oldugunu ve 
        uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
        100’den kucukse sadece 1’ler basamagini yazdirin.
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("tam sayý giriniz :");
		int sayi=scan.nextInt();
		
		
		negatifPozitif(sayi);
		
		tekMiciftMi(sayi);
		
//		tam sayý giriniz :34
//		pozitif
//		çift

		
		

	}
	public static void tekMiciftMi(int sayi) {
		
		
	if (sayi%2==0) {
		
		System.out.println("çift");
		
	}else {
		
		System.out.println("tek");
	}
		
	}

	public static void negatifPozitif(int sayi) {
		
		
		if(sayi>0) {
			
			System.out.println("pozitif");
			
		}else {
			System.out.println("negatif");
		}
		
	}
	
	
	
	

}
