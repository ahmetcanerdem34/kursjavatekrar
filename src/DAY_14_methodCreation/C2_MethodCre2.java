package DAY_14_methodCreation;

public class C2_MethodCre2 {
	
	public static void main(String[] args) {
		//method çaðýrmanýn sýrasýda önemli deðil
		
		topla();
		//toplama =15
		
		carp();//isterseniz methodu çaðýrýssýnýz istemezseniz çaðýrmazsýnýz
		//muraya yazmazsanýz çalýþmaz
//		carpma iþleminin sonucu = 50

		//bierdaha çaýðýrabilirsiniz
		
		topla();
		//toplama =15
		
		ortalama();//methodu yazdým yani call ettim
		//2 sayinin ortalamasý =10
		
		ortalama2(45, 5);
		//25.0
	}
	
	public static void ortalama2(double sayi3, double sayi4) {
		
		
		System.out.println((sayi3 +sayi4)/2);
	
		
		
	}

	public static void ortalama() {
		
		int sayi1=45;
		int sayi2=5;
		
		System.out.println("2 sayinin ortalamasý =" +(sayi1 + sayi2)/5);
		
		
		
	}

	public static void carp() {
		
		int a=5;
		int b=10;
		
		int carp=a*b;
		System.out.println("carpma iþleminin sonucu = " + carp);
				
		
		
	}
	public static void topla() {
		
		
		int a =5;
		int b=10;
		int toplam=a + b;
		System.out.println("toplama =" + toplam);
		
	}
	
	
	
	
	

}
