package MentorBizimArrayArrays;

public class Soru01 {

	
		
		public static void main(String[] args) {
			
			//array= boyut esnekliği yoktur
			//sabit eleman belirlenir, uni de ders alınacak ders sayısı belli dir 10 ders en fazla al kalamazsan default değer atar
			 // soforun gideceği yol saati 
			//15 saat git yada daha az sen bilirsin, kalan saatlere default değer atar
			
			/*
			 We have a loud talking parrot. The "hour" parameter is the current hour time in the range 
			 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
			 */
			
	        boolean talking=true;
	        int hour=0;
	        parrotTrouble1(talking,hour);
//	      System.out.println(parrotTrouble(talking,hour));
	//  }
	//  public static boolean parrotTrouble(boolean talking, int hour) {
////	          if((hour>20||hour<7)&&(talking==true)){
//	          return true;
////	          }else{
////	            return false;
////	          }
////	          
	            
	          
	}
	    public static void parrotTrouble1(boolean talking,int hour) {
	        System.out.println((hour>20||hour<7)&&(talking==true)?true:false);
	        
	    }
}

	
