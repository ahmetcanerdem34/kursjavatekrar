package DAY_04_MathOperatorsAndModuls;

public class C3_ModulsOrnek {

	public static void main(String[] args) {
		
		//veirlen bir integer �n birler basama��n� yazd�r�n
	
		
		int sayi=1469;
		
		
		int birler=sayi%10;
	
		System.out.println("say�n�n birler basama�� :" + birler);
		//say�n�n birler basama�� :9
		
		sayi/=10;//geriye kalan say� yani; 146
		
		System.out.println("geriye kalan asy� :" +sayi);
		//geriye kalan asy� :146
		
		int birler1= sayi%10;//�imdide 146 n�n ilk basama��n� bulal�m
		System.out.println("146 n�n birler basama�� :" + birler1);
		//146 n�n birler basama�� :6
		
		
		
		
	}

}
