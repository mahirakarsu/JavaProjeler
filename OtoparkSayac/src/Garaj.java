import java.util.Calendar;

public class Garaj {



	int girisSaati;
	int girisDakikasi;
	int cikisSaati;
	int cikisDakikasi;
	
	int gecenSaat;
	int gecenDakika;
	
	final static double saatUcreti = 10;//deneme amacli saat ucreti belirlendi
	double dakikaUcreti;

	Calendar calendar=Calendar.getInstance();

	
	 
	
	public Garaj() {
		//arac�n giris yapmas� ile nesne olusturulmus olucak
		//ve girisin saat ve dakika degerleri al�nacak

		this.girisSaati = calendar.get(Calendar.HOUR_OF_DAY);
		this.girisDakikasi = calendar.get(Calendar.MINUTE);
		
		//dogru hesaplama icin saatlik ucret, dakika cinsinde cevrildi
		this.dakikaUcreti = saatUcreti / 60;
	}
	


	public int gecenSure() {
		//arac�n garajda kaldigi sureyi dakika cinsinden bulan metod
		gecenSaat=cikisSaati - girisSaati;
		gecenDakika = (cikisDakikasi - girisDakikasi) + ( gecenSaat * 60);
		return gecenDakika;
	}
	public double tutarHesapla() {
		//odenecek tutar hesab�
		return dakikaUcreti * gecenSure();
		 
	}
	
	public void cikisYapiliyor() {
		/*
		 * cikis anindaki saat/dakika verisini alabilmek icin 
		 * tekrardan Calendar nesnesi olusturuldu
		 */
	
		Calendar c = Calendar.getInstance();
		
		//cikis zamanina dair saat ve dakika verisi
		cikisSaati = c.get(Calendar.HOUR_OF_DAY);
		cikisDakikasi = c.get(Calendar.MINUTE);
		
		
		// virgul sonras� fazla basamak olmas�n� onlemek amacli
		double ucret = (double)((int)(tutarHesapla()*100))/100;
		
		System.out.println("�cret : " + ucret);
		
	}
	
	
	
	
	
	



}
