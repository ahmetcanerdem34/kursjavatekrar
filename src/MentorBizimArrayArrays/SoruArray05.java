package MentorBizimArrayArrays;

import java.util.Arrays;

public class SoruArray05 {

	public static void main(String[] args) {
		
		 /*   $ ve  £ isareti olanlarin toplamlarini ayri ayri bulun
        String str = "$1 $23 $134 $2 $7 $24 32£ £40 £2 £65 £4";
        */
		
		String str = "$1 $23 $134 $2 $7 $24 32£ £40 £2 £65 £4";//stringi array a çevireceðiz
		
		String arr[]=str.split(" ");//arraye bu þekilde buþluklardan ayýr dedik,str den gelen oþluklu gelsin ve parçlansýn--boþluk, hiçlik deðil
		
		System.out.println(Arrays.toString(arr));//[$1, $23, $134, $2, $7, $24, 32£, £40, £2, £65, £4]
		
		int topdolar=0;//intiliaz inþilayz diyoruz ilk deðer atamaya
		int topeuro=0;

		for (int i = 0; i < arr.length; i++) {
			//burda dolarlý ve ueoro lularý ayrý ayrý þartla bulmalýyým
			
			if(arr[i].contains("$")) {//bu þekilde alýp sayýya çevirmeliyim
				
				topdolar+=Integer.parseInt(arr[i].replace("$", ""));//DOLAR OLANLARI GETÝR ONLARI SAYIYA ÇEVÝR CUNKÜ ONLAR STRÝNG, REPLACE DE DOLAR ÝÞARETÝNÝ ALIP SAYIYI YALNIZ BIRAKTIK
				
				//eðer £ iþareti varsa ayný iþlem
			}else
				topeuro+=Integer.parseInt(arr[i].replace("£", ""));//wrapper class dan-- String non primitive Integer de non primitive onun için buyuk harf
				
				
			}
			System.out.println(topdolar);
			System.out.println(topeuro);
//			[$1, $23, $134, $2, $7, $24, 32£, £40, £2, £65, £4]
//					191
//					143
		}
	}


