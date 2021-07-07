package DAY_04_MathOperatorsAndModuls;

public class C3_ModulsOrnek {

	public static void main(String[] args) {
		
		//veirlen bir integer ýn birler basamaðýný yazdýrýn
	
		
		int sayi=1469;
		
		
		int birler=sayi%10;
	
		System.out.println("sayýnýn birler basamaðý :" + birler);
		//sayýnýn birler basamaðý :9
		
		sayi/=10;//geriye kalan sayý yani; 146
		
		System.out.println("geriye kalan asyý :" +sayi);
		//geriye kalan asyý :146
		
		int birler1= sayi%10;//þimdide 146 nýn ilk basamaðýný bulalým
		System.out.println("146 nýn birler basamaðý :" + birler1);
		//146 nýn birler basamaðý :6
		
		
		
		
	}

}
