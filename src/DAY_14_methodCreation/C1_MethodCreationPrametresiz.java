package DAY_14_methodCreation;

public class C1_MethodCreationPrametresiz {

	public static void main(String[] args) {
		
		yazdir();//yazdým ve aþaðýdaki iþlemi buraya çaðýrdým
//		merhaba
//		ferhat
//		nasýlsýn
//		iyimisin
		
		
		System.out.println("*************");
		
		yazdir();//tekrar çaðüýrýyorum
		
//		*************
//		merhaba
//		ferhat
//		nasýlsýn
//		iyimisin

			System.out.println("**************");
			
			//tekrar yazdýrýyorum
			
			yazdir();
			
//			**************
//			merhaba
//			ferhat
//			nasýlsýn
//			iyimisin
			
			System.out.println("************************");


		for (int i = 0; i < 3; i++) {
			
			yazdir();//yazdýr methodu 3 defa çalýþsýn ve her defasýnda 1 boþluk býraksýn
			System.out.println("***************");
			
//			************************
//			merhaba
//			ferhat
//			nasýlsýn
//			iyimisin
//			***************
//			merhaba
//			ferhat
//			nasýlsýn
//			iyimisin
//			***************
//			merhaba
//			ferhat
//			nasýlsýn
//			iyimisin
//			***************
		}

	}
	
	//void demek deðer döndermeyen metod=DEÐER DÖNDERMEYEN NEDEMEK
	//method sonucunda iþlem  sonuç üretmiyorsa buna void denir
	
	//parametresiz yapalým, yani method içi boþ
	
	public static void yazdir() {//yukarý gidip bu isimle main methodu içinde çaðrmalýyým
		
		System.out.println("merhaba");
		System.out.println("ferhat");
		System.out.println("nasýlsýn");
		System.out.println("iyimisin");
		
		//burayý bu þekilde çalýþtýrýsam sonuç çýkmaz
		//çünkü methodlar main methodud içinde çalýþýr
		
		
		
	}
	

}
