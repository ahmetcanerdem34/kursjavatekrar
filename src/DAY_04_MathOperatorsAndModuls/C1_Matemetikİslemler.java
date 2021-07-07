package DAY_04_MathOperatorsAndModuls;

public class C1_MatemetikÝslemler {

	public static void main(String[] args) {
	
		int num3=4;
		double num5=24.56;
		
		double num7=num5/num3;
		
		System.out.println(num7);
		//6.14-----> double geniþ ve . nýoktalý olduðu için ona göre sonuç verecektir

		int num4=6;
		int num6=7;
		
		
		double sonuc=num3*num4/num6;
		
		System.out.println(sonuc);
		//3.0
		double sonuc1=(double)num3*num4/num6;
		System.out.println(sonuc1);
		//3.4285714285714284------>. noktadan sýonraki sayýlarýda görmek istiyorsam eþitliðin saðýna double yazmam gerekir
	}

}
