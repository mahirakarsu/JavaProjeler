package OverLoadingAndOverRides;

public class YardimciSinif extends AnaSinif{

	int sayi1;
	int sayi2;
	
	
	public YardimciSinif() {
		
	}
	
	public YardimciSinif(int sayi1, int sayi2) {
		
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
	}
	
	/*
	 * Ust sinifta yer alan ayn� isme sahip ,
	 * ayni tipte parametreye sahip olan Hesapla() metodu
	 * fark� body
	 * yaptigi hesaplama farkl�.
	 * Bu siniftan olusturulan nesne ile Hesapla metoduda erisildiginde
	 * (AnaSinif'tan extends edilmi� olmasina ragmen )
	 * AnaSinif'da yer alan Hesapla metoduna degilde
	 * YardimciSinif'da yer alan Hesapla metoduna erisir.
	 */
	public int Hesapla(int x, int y) {
		return sayi1 * 2 + (sayi2 + 4);
	}
	
	
	
	
	
	
}
