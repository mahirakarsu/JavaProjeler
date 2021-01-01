package MirasAlma;

public class Circle extends GeometricObject {

	private double yariCap;

	/*
	 * Cemberin kendi ozelligi olan yaricap degiskenini Cember sinifinda yazdýk
	 * ancak genel olarak tum geometrik nesnelerde bulunan ozellikleri ise
	 * GeometrikNesne sinifinda yazdýk ve Cember sinifini GeometrikNesne sinifinden
	 * extends ettik. Boylece diger GeometrikNesne sinifindaki degiskenlere Cember
	 * sinifindan erisebilicez
	 * 
	 */

	public Circle() {

	}

	public Circle(double yaricap) {
		this.yariCap = yaricap;
	}
	
	public Circle(double yaricap, String renk, boolean full) {
		this.yariCap=yaricap;
		setColor(renk); // ust sinifin setter metodu sayesinde deger atadýk
		setFull(full); 
	}
	
	public double alanHesapla() {
		return yariCap * yariCap * Math.PI;
	}
	
	public double cevreHesapla() {
		return 2 * yariCap * Math.PI;
	}
	
	public double getCap() {
		return 2 * yariCap;
	}
	
	public void yazdir() {
		System.out.println(getCreateDate() + " tarihinde olusturuldu");
		//Inheritence sayesinde  getCreateDate() metoduna GeometricObject sinifindan ulastik
	}

	public double getYariCap() {
		return yariCap;
	}

	public void setYariCap(double yariCap) {
		this.yariCap = yariCap;
	}

}
