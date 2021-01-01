package MirasAlma;

import java.util.Date;

public class GeometricObject {
	
	private String color;
	private boolean full;
	private Date createDate;
	
	
	public GeometricObject() {
		color = "white";
		createDate= new Date();
	}
	
	
	
	public GeometricObject(String color, boolean full) {
		this();
		this.color = color;
		this.full = full;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFull() {
		return full;
	}
	public void setFull(boolean full) {
		this.full = full;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	// toString metodu, ust sinif olan Object sinifinden overrides edildi
	public String toString() {
		return "olusturuldu : " + createDate+ "\nrenk : "+ color + " dolu mu: " + full;
	}
	

}
