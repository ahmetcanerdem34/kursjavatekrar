package DAY_05_WrapperClass;

public class C3_OperatorSigns {

	public static void main(String[] args) {
		
		//= javda bunu adý atama ya da assignment
		
		
		
		System.out.println(5+2==7);//true
		System.out.println(5*2==15);//false
		
		int sayi1=5;
		int sayi2=4;
		
		boolean sonuc=5 + 2 != 7; // ---> 7 eþit deðil yediye anlamýna gelir
		System.out.println(sonuc);//false
		
		boolean sonuc1=(5*2 !=15);
		System.out.println(sonuc1);//True
		System.out.println(5*2>15);//false
		
		
		
		
		
		boolean isGreat=sayi1>sayi2;//sayý 1 sayi 2 den buyuk mu? anþlmý verir boolean true ya da false döndürür
		System.out.println(isGreat);//true
		
		
		boolean isSmall=sayi1<sayi2;//küçük mü?
		System.out.println(isSmall);//false
	
		boolean isEqual=sayi1==sayi2;//EÞÝT MÝ 2 SAYI ANLAMINA GELÝYOR
		System.out.println(isEqual);//false
		
		
		System.out.println(sayi1==5);
		System.out.println(sayi2==4);
		System.out.println(sayi1==1);
//		true
//		true
//		false
		
		
		System.out.println(sayi1!=sayi2);//cümlenin anlamý sayi 1 sayi 2 ye eþit deðil =>true
		
		
	}

}
