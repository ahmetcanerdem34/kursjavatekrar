package DAY_25_arrays;

public class MultiDimentionalArrays02 {

	public static void main(String[] args) {
		
		//verilen 2 katlý bir array in tum elemanlarýný toplamýný bulalým
		
		int arr[][]= {{23,45,76},{54,78,90},{45,65,9},{45,65}};
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				
				toplam+=arr[i][j];
			}
		}
		System.out.println("multidimentional içerisnediki sayýlarýn toplamý ="+toplam);
		//multidimentional içerisnediki sayýlarýn toplamý =595

	}

}
