package MirasAlma;

public class TestGeometricObje {
	public static void main(String[] args) {
		Circle c = new Circle(5.2);
		
		System.out.println(c.getColor());
		// color degiskeni GeometricObject sinifinda bulunuyordu ama
		// Inheritence sayesinde Circle sinifindan türetilmiþ c nesnesi ile erisebildik
	}
}
