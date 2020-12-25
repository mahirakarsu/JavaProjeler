package OverLoadingAndOverRides;

public class Test {
	
	
	public static void main(String[] args) {
		
		YardimciSinif nesne  =  new YardimciSinif(3,5);
		
		int sonuc = nesne.Hesapla(nesne.sayi1,nesne.sayi2);
		
		System.out.println(sonuc);
		
		
		
		
		
	}
}
