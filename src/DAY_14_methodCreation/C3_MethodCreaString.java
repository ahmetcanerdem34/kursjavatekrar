package DAY_14_methodCreation;

public class C3_MethodCreaString {

	public static void main(String[] args) {
		
		mesajYaz("Ferhat", "Aykan", 27);
		
//		merhaba
//		isminiz :Ferhat
//		Soyisminiz :Aykan
//		Ya��n�z :27
//		
		System.out.println("*****************");
		
		mesajYaz("Mehmet", "Karamano�lu", 43);
	
//		merhaba
//		isminiz :Mehmet
//		Soyisminiz :Karamano�lu
//		Ya��n�z :43

		System.out.println("*********************");
		
		mesajYaz(" ", "K*******", 45);
		
//		merhaba
//		isminiz : 
//		Soyisminiz :K*******
//		Ya��n�z :45
		
		System.out.println("***********************");
		characterYaz('#');
		//#
		
		
	}
	
	public static void mesajYaz(String isim, String soy�sim, int yas) {
		
		System.out.println("merhaba");
		System.out.println("isminiz :" + isim);
		System.out.println("Soyisminiz :" + soy�sim);
		System.out.println("Ya��n�z :" + yas);
		
		
	}
	
	public static void characterYaz(char c) {
		
		System.out.println(c);
		
		
		
		
	}

}
