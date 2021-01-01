package MirasAlma;

public class Rectangle extends GeometricObject{
	
	private double width;
	private double height;
	
	/*
	 * Geometrik nesnelerin ortak ozelliklerini tutan degiskenler
	 * GeometrikNesne sinifinda tutuldu
	 * extends edilerek diger siniflarin da kullanýlmasý saglandi
	 */
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
