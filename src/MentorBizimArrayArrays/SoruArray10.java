package MentorBizimArrayArrays;

import java.util.Scanner;

public class SoruArray10 {

	public static void main(String[] args) {
		
		
		  // Kullanicidan aldigimiz 8 elemanli arrayin icinde 
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		
		int arr[]= new int[8];
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i < arr.length; i++) {//8 e eþit yukrda))
			System.out.println(i+". sayýyý giriniz ");
			
			arr[i]=scan.nextInt();
			
		}
		int count =0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]%3==0) {
				count++;
			}
		}
		System.out.println("3 ile bölünen sayý :" + count);
//		0. sayýyý giriniz 
//		3
//		1. sayýyý giriniz 
//		4
//		2. sayýyý giriniz 
//		3
//		3. sayýyý giriniz 
//		0
//		4. sayýyý giriniz 
//		5
//		5. sayýyý giriniz 
//		4
//		6. sayýyý giriniz 
//		-23
//		7. sayýyý giriniz 
//		21
//		3 ile bölünen sayý :4
	}

}
