package DAY_06_iFstatements;

public class C5_ÝfStCalýsma03_methodlu {

	public static void main(String[] args) {
		
		/*
        Oluþturulan bu 3 int içinde en yüksek deðerli olaný bulun.
        Bu en yüksek numarayý yazdýrýn.

        Not: Num1 = 18 veya Num2 = 25 deðerini deðiþtirdiðinizde kodunuz maksimum deðeri yazmalýdýr.
        Tüm farklý senaryolarda maksimum sayýyý yazdýrmalýdýr
    */
		
		
		enbuyukBul(34,32,45);
		System.out.println("***********************");
		
		enbuyukBul(2,5,-4);
		System.out.println("*************************");
		
		enbuyukBul(2,34,-6);
		

	}

	public static void enbuyukBul(int num1, int num2, int num3) {
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("en büyük num1");
		
		}else if(num2>num1 && num2 > num3) {
			System.out.println("en büyük num2");
		}else {
			System.out.println("en büyük num3");
			
//			en büyük num3
//			***********************
//			en büyük num2
//			*************************
//			en büyük num2
		
		}	
	}

}
