package DAY_15_methodCreationDevam;

public class C6_ParametreliDegDondurenOrnk {

	public static void main(String[] args) {


		boolean d = karsilastir(5,3);
		
		
		System.out.println("5 3 ten b�y�k m� ?" + d);
		//5 3 ten b�y�k m� ?true
		
		//d de�erini de�i�tirip ba�ka soral�m
		
		
		d= karsilastir(456,453);
		System.out.println(d);
		//true
		
	

	}
public static boolean karsilastir(int a , int b) {
	

	boolean durum= a>b ? true : false;
	
	return durum;
	
	
	
}
}
