package DAY_14_methodCreation;

public class C3_MethodCreationParametreli {

	public static void main(String[] args) {
		
		
		topla(10,5,4, 3.7);
		//22.7
		
		topla(25,35,7,3.5);
		//70.5
		
		carp(25, 12);
//		300
		//birdaha carpý kullanalým
		
		carp(12, 17);
//		204

		
		cikarma(50.5,25.5);
		//25.0
		

	}
	public static void cikarma(double a, double b) {
		
		double cikarma=a-b;
		
		System.out.println(a-b);
		
		
	}
	public static void topla(int a, int b, int c, double d) {
		
		
		double toplam=a + b + c + d;
		
		System.out.println(toplam);
		
		
	}
	
	public static void carp(int a, int c) {
		
		int carp=a*c;
		
		System.out.println(carp);
		
		
	}
	
	
	
	
	

}
