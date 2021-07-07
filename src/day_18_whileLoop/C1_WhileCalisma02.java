package day_18_whileLoop;

import java.util.Scanner;

public class C1_WhileCalisma02 {

	public static void main(String[] args) {
		
		
		/*  Problem Tan�m�
        Verilen iki say�n�n kombinasyonunu bulan kodu yaz�n�z.
        Hat�rlatma C(n,r) = n! / (r!(n-r)!)
        Ekran ��kt�s�
        Birinci say�y� giriniz: 15
        Ikinci say�y� giriniz: 4
        Kombinasyon: 1365
        Birinci say�y� giriniz: 5
        Ikinci say�y� giriniz: 3
        Kombinasyon: 10
      */
		
		//int verirseniz kapasitesi kar��lamaz girilen say�lar�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("say� giriniz");
		long a=scan.nextInt();
		System.out.println("say� giriniz");
		long b=scan.nextInt();
		
		faktoriyel(a);
		kombi(a,b);
		
	
}

	public static void kombi(long a, long b) {
		
		long sonuc;
		sonuc=faktoriyel(a)/((faktoriyel(b)*(a-b)));
		
		System.out.println("kombinasyon : "+sonuc);
		
	}

	public static long faktoriyel(long sayi) {
		long faktr=1;
		for (long i = 0; i < sayi; i++) {
			
			faktr*=i;
			
		}
		return faktr;
		
	}
	
	
	
}