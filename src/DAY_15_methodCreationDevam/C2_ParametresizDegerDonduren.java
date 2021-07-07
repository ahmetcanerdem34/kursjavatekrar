package DAY_15_methodCreationDevam;

import java.util.Scanner;

public class C2_ParametresizDegerDonduren {

	public static void main(String[] args) {
		
	int d=topla();
	
	System.out.println("sonucunuz :" + d);
	//sonucunuz :15
	
	int g=topla();
	System.out.println(g);
	//15
		
	double sonuc=carp();
	
	System.out.println("carpma iþlemi sonucu :"+ sonuc);

	}
	
	//void kullanmayacaðýz deðerdöndürecek int türünde
	
	public static int topla() {
	
		int a =10;
		int b=5;
		int toplam =a+b;
		
		
		return toplam;
		
		
		
	}
	
	///yeni bir method yazalým double dönsün
	
	public static double carp() {
		
		int a =5;
		double b=2.7;
		
		
		return a*b;//bu þekildede kodu kýsalttta biliriz
		
	}

}
