package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma02 {

	public static void main(String[] args) {
		
		
		//kullanýcýdan 35 tan küçük pozitif bir sayý alýn 
		//farklý method da girilen sayýnýn faktoriyrlini hesaplayýp  yazdýýran bir metod oluþturun
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("35 küçük pozitif tamsayý griniz :");
		int sayi=scan.nextInt();
		
		if(sayi<=0 || sayi>35) {
			System.out.println("1 ve 35 arasýnda sayý giriniz :");
			
			
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
	//35 küçük pozitif tamsayý griniz :5
	//120
		
	}

}
