package Mentor;

public class SoruArray06 {

	public static void main(String[] args) {
		
		
		  /* write a Java program to removes a specific element from an array and put the
	         * remaining elements in a new array and prints the new array 
	         *( bir diziden belirli bir ??eyi kald?rmak i?in bir Java program? yaz?n ve
	         *yeni dizide kalan ??eler ve yeni diziyi yazd?r?n) 
	         * Input :{1,2,3,4,5,6} element:6 
	         * Output : [1,2,3,4,5]
	         */

		 int input[]={1,2,3,4,5,6};
		 int sayi=6;
		 
		
		 
		 for (int i = 0; i < input.length; i++) {
			 
			 if(input[i]!=6) {
			 
				System.out.print(input[i]+" ");
				 
			 }
			
		}
		
		
		
			
	}

}
