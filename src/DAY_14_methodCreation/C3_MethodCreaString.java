package DAY_14_methodCreation;

public class C3_MethodCreaString {

	public static void main(String[] args) {
		
		mesajYaz("Ferhat", "Aykan", 27);
		
//		merhaba
//		isminiz :Ferhat
//		Soyisminiz :Aykan
//		Yaþýnýz :27
//		
		System.out.println("*****************");
		
		mesajYaz("Mehmet", "Karamanoðlu", 43);
	
//		merhaba
//		isminiz :Mehmet
//		Soyisminiz :Karamanoðlu
//		Yaþýnýz :43

		System.out.println("*********************");
		
		mesajYaz(" ", "K*******", 45);
		
//		merhaba
//		isminiz : 
//		Soyisminiz :K*******
//		Yaþýnýz :45
		
		System.out.println("***********************");
		characterYaz('#');
		//#
		
		
	}
	
	public static void mesajYaz(String isim, String soyÝsim, int yas) {
		
		System.out.println("merhaba");
		System.out.println("isminiz :" + isim);
		System.out.println("Soyisminiz :" + soyÝsim);
		System.out.println("Yaþýnýz :" + yas);
		
		
	}
	
	public static void characterYaz(char c) {
		
		System.out.println(c);
		
		
		
		
	}

}
