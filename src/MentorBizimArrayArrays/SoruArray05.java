package MentorBizimArrayArrays;

import java.util.Arrays;

public class SoruArray05 {

	public static void main(String[] args) {
		
		 /*   $ ve  � isareti olanlarin toplamlarini ayri ayri bulun
        String str = "$1 $23 $134 $2 $7 $24 32� �40 �2 �65 �4";
        */
		
		String str = "$1 $23 $134 $2 $7 $24 32� �40 �2 �65 �4";//stringi array a �evirece�iz
		
		String arr[]=str.split(" ");//arraye bu �ekilde bu�luklardan ay�r dedik,str den gelen o�luklu gelsin ve par�lans�n--bo�luk, hi�lik de�il
		
		System.out.println(Arrays.toString(arr));//[$1, $23, $134, $2, $7, $24, 32�, �40, �2, �65, �4]
		
		int topdolar=0;//intiliaz in�ilayz diyoruz ilk de�er atamaya
		int topeuro=0;

		for (int i = 0; i < arr.length; i++) {
			//burda dolarl� ve ueoro lular� ayr� ayr� �artla bulmal�y�m
			
			if(arr[i].contains("$")) {//bu �ekilde al�p say�ya �evirmeliyim
				
				topdolar+=Integer.parseInt(arr[i].replace("$", ""));//DOLAR OLANLARI GET�R ONLARI SAYIYA �EV�R CUNK� ONLAR STR�NG, REPLACE DE DOLAR ��ARET�N� ALIP SAYIYI YALNIZ BIRAKTIK
				
				//e�er � i�areti varsa ayn� i�lem
			}else
				topeuro+=Integer.parseInt(arr[i].replace("�", ""));//wrapper class dan-- String non primitive Integer de non primitive onun i�in buyuk harf
				
				
			}
			System.out.println(topdolar);
			System.out.println(topeuro);
//			[$1, $23, $134, $2, $7, $24, 32�, �40, �2, �65, �4]
//					191
//					143
		}
	}


