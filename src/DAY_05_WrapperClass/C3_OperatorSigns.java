package DAY_05_WrapperClass;

public class C3_OperatorSigns {

	public static void main(String[] args) {
		
		//= javda bunu ad� atama ya da assignment
		
		
		
		System.out.println(5+2==7);//true
		System.out.println(5*2==15);//false
		
		int sayi1=5;
		int sayi2=4;
		
		boolean sonuc=5 + 2 != 7; // ---> 7 e�it de�il yediye anlam�na gelir
		System.out.println(sonuc);//false
		
		boolean sonuc1=(5*2 !=15);
		System.out.println(sonuc1);//True
		System.out.println(5*2>15);//false
		
		
		
		
		
		boolean isGreat=sayi1>sayi2;//say� 1 sayi 2 den buyuk mu? an�lm� verir boolean true ya da false d�nd�r�r
		System.out.println(isGreat);//true
		
		
		boolean isSmall=sayi1<sayi2;//k���k m�?
		System.out.println(isSmall);//false
	
		boolean isEqual=sayi1==sayi2;//E��T M� 2 SAYI ANLAMINA GEL�YOR
		System.out.println(isEqual);//false
		
		
		System.out.println(sayi1==5);
		System.out.println(sayi2==4);
		System.out.println(sayi1==1);
//		true
//		true
//		false
		
		
		System.out.println(sayi1!=sayi2);//c�mlenin anlam� sayi 1 sayi 2 ye e�it de�il =>true
		
		
	}

}
