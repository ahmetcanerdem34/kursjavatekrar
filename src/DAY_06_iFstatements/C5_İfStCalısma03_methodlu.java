package DAY_06_iFstatements;

public class C5_�fStCal�sma03_methodlu {

	public static void main(String[] args) {
		
		/*
        Olu�turulan bu 3 int i�inde en y�ksek de�erli olan� bulun.
        Bu en y�ksek numaray� yazd�r�n.

        Not: Num1 = 18 veya Num2 = 25 de�erini de�i�tirdi�inizde kodunuz maksimum de�eri yazmal�d�r.
        T�m farkl� senaryolarda maksimum say�y� yazd�rmal�d�r
    */
		
		
		enbuyukBul(34,32,45);
		System.out.println("***********************");
		
		enbuyukBul(2,5,-4);
		System.out.println("*************************");
		
		enbuyukBul(2,34,-6);
		

	}

	public static void enbuyukBul(int num1, int num2, int num3) {
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("en b�y�k num1");
		
		}else if(num2>num1 && num2 > num3) {
			System.out.println("en b�y�k num2");
		}else {
			System.out.println("en b�y�k num3");
			
//			en b�y�k num3
//			***********************
//			en b�y�k num2
//			*************************
//			en b�y�k num2
		
		}	
	}

}
