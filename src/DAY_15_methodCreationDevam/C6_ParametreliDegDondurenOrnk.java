package DAY_15_methodCreationDevam;

public class C6_ParametreliDegDondurenOrnk {

	public static void main(String[] args) {


		boolean d = karsilastir(5,3);
		
		
		System.out.println("5 3 ten büyük mü ?" + d);
		//5 3 ten büyük mü ?true
		
		//d değerini değiştirip başka soralım
		
		
		d= karsilastir(456,453);
		System.out.println(d);
		//true
		
	

	}
public static boolean karsilastir(int a , int b) {
	

	boolean durum= a>b ? true : false;
	
	return durum;
	
	
	
}
}
