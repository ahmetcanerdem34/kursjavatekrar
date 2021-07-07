package DAY_15_methodCreationDevam;

public class C8_ParametreliParametresizGenelOrnk {

	public static void main(String[] args) {
		
		//iki parametre göndereceğiz 
		
		
		int maxi=max(5,3);
		//5
		
		System.out.println(maxi);
		
		int mini=min(456,766);
		//456
		
		System.out.println(mini);
		
		

	}
	
	public static int max(int a ,int b) {
		
		if(a > b) {
			
			return a;
		}else {
			
			return b;
		}
	}

		public static int min(int a, int b) {
			
			return (a < b) ?  a : b; 
			
			
		}
}
