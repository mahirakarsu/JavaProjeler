package OverLoadingAndOverRides;

public class OverLoading {



	public static void main(String[] args) {
		
		double sayi1 = 5.4;
		double sayi2 =34.3;
		
		int a = 3;
		int b = 1_000_000_000;
		
		/*
		 * gonderilen parametrenin int ya da double olmasina gore
		 * metod seciliyor
		 * metod isimlerinin ayni olmasi herhangi bir problem yaratmiyor.
		 */
		
		double doubleMaxSayi = max(sayi1, sayi2);
		int intMaxSayi = max(a,b);
		
		System.out.println(" max. double sayi degeri : " + doubleMaxSayi);
		System.out.println("------");
		System.out.println(" max. int sayi degeri : " + intMaxSayi);
		
	}
	public static int max(int sayi1, int sayi2) {
		return  (sayi1 > sayi2) ? sayi1 : sayi2;
		
	}
	public static double max(double sayi1, double sayi2) {
		return (sayi1 > sayi2) ? sayi1 : sayi2;
		
	}
	
	
	


}
