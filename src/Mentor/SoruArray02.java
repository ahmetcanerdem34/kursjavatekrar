package Mentor;

public class SoruArray02 {

	public static void main(String[] args) {
		
		/*
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlar�n�n ayn� olup olmad���n� kontrol edin)
        int []arr={2,6,4,8,2,6,2};
         */

		int []arr={2,6,4,8,2,6,2};
		boolean ayniMi=false;
		
//		arr[0]=2;
//		arr[arr.length-1]=2;
		
		
		if(arr[0]==arr[arr.length-1]) {
			ayniMi=true;
			
		}else {
			ayniMi=false;
		}
		System.out.println("ilk ve son :" +ayniMi);
		
	}

}
