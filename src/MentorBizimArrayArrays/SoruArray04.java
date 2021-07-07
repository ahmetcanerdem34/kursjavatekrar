package MentorBizimArrayArrays;

public class SoruArray04 {

	public static void main(String[] args) {
		
		/*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum deðeri bulan bir yöntem yazýn )
         * Input : {{1,2,3},{4,5},{6,7,8}} 
         * Output : 8 
         */
		
		/*
		 * 1,2,3-->0.kat
		 * 4,5-->1.kat
		 * 6,7,8-->2.kat
		 */
		int [][]Input ={{1,2,3},{4,5},{6,7,8}};
		
		System.out.println(maxdegeribul(Input));//burda syso içinde yazdýrmýþ olduk
		
		
	}

	public static int maxdegeribul(int [][]Input) {
		int max=Input[0][0];//0 ra týyalým dedik;
		
		for (int kat = 0; kat < Input.length; kat++) {
			
			for (int daire = 0; daire < Input[kat].length; daire++) {//burda kat.length önemli
				if(Input[kat][daire]>max) {
					max=Input[kat][daire];
				}
				
			}
			
			
		}
		
		
		return max;
		
		
		
		
		
		
		
	}

}
