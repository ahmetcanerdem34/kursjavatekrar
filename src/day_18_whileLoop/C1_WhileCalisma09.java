package day_18_whileLoop;

public class C1_WhileCalisma09 {

	public static void main(String[] args) {
		 /*
        Girilen bir sayýya kadar olan sayýlardan sadece tek olanlarýný ekrana yazdýrýnýz.
         girilen sayý dahil
        */// TODO Auto-generated method stub

		int girilenSayi=1;
		
		while(girilenSayi<=50) {
			
			if(girilenSayi%2==1) {
				
				System.out.print(girilenSayi+" ");
				//1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 
			}
			girilenSayi++;
		}
	}

}
