package DAY_14_methodCreation;

public class C2_MethodCre2 {
	
	public static void main(String[] args) {
		//method �a��rman�n s�ras�da �nemli de�il
		
		topla();
		//toplama =15
		
		carp();//isterseniz methodu �a��r�ss�n�z istemezseniz �a��rmazs�n�z
		//muraya yazmazsan�z �al��maz
//		carpma i�leminin sonucu = 50

		//bierdaha �a���rabilirsiniz
		
		topla();
		//toplama =15
		
		ortalama();//methodu yazd�m yani call ettim
		//2 sayinin ortalamas� =10
		
		ortalama2(45, 5);
		//25.0
	}
	
	public static void ortalama2(double sayi3, double sayi4) {
		
		
		System.out.println((sayi3 +sayi4)/2);
	
		
		
	}

	public static void ortalama() {
		
		int sayi1=45;
		int sayi2=5;
		
		System.out.println("2 sayinin ortalamas� =" +(sayi1 + sayi2)/5);
		
		
		
	}

	public static void carp() {
		
		int a=5;
		int b=10;
		
		int carp=a*b;
		System.out.println("carpma i�leminin sonucu = " + carp);
				
		
		
	}
	public static void topla() {
		
		
		int a =5;
		int b=10;
		int toplam=a + b;
		System.out.println("toplama =" + toplam);
		
	}
	
	
	
	
	

}
