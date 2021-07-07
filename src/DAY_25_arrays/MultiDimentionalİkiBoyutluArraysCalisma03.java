package DAY_25_arrays;

import java.util.Arrays;

public class MultiDimentionalÝkiBoyutluArraysCalisma03 {

	public static void main(String[] args) {
		
		/*
		**tek boyutlu diziyi eleman vererek yazdýralým
		int sayilar[] = new int[5];
		*/
		
		int sayilar[]= new int[5];
		sayilar[0]=0;
		sayilar[4]=5;
		sayilar[3]=2;
		sayilar[2]=1;
		System.out.println(Arrays.toString(sayilar));//[0, 0, 1, 2, 5]-->deðer vermediðimiz 1 e 0 atadý
		
		int arr[][]=new int[5][3];
		arr[0][0]=1;
		arr[4][1]=1;
		arr[4][2]=1;
		System.out.println(Arrays.deepToString(arr));//[[1, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 1, 1]]
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				arr[i][j]=8;
//				8 8 8 
//				8 8 8 
//				8 8 8 
//				8 8 8 
//				8 8 8 
				
			}
			
		}
		
		
		for (int i = 0; i < arr.length; i++) {
				
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.println();
		}
	}

}
