package DAY_15_methodCreationDevam;

public class C5_ParametreliDegDonduren {

	public static void main(String[] args) {
		
		
		double d =carp(2.7f, 5.3f);
		System.out.println("carpma sonucu :" + d);
		
		d = carp(2.6f, 5.7f);
		
		System.out.println(d);

		
		double b=bol(5, 3);
		
		System.out.println(b);
		
	}
	
	public static int topla(float a, float b) {
		
		int toplam= (int)(a+b);
		
		return (int) (a + b);
		
	}
	
	public static double carp(float a, float b) {
		
		return a*b;
		
	}
	
	public static double bol(int a , int b) {
		
		return ((double)a/b);
		
		
		
	}

}
