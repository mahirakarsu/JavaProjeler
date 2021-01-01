package P1;

public class C2 {
	
	void aMethod() {
		C1 o = new C1();//nesne olusturuldu
		System.out.println(o.a);// a public oldugu icin aynı paket icinde ulasilabilir.
		System.out.println(o.b); // b default oldugu icin aynı paket icinde ulasilabilir
		//System.out.println(o.c); c private oldugu icin aynı pakette olmasına ragmen ulasilamaz
		
		o.m1(); // public bir metod oldugu icin ulasilir
		o.m2(); // default metod oldugu icin ulasilir
		//o.m3();  private oldugu icin ulaşılmaz
		
		/*
		 * aynı paket icinde oldugunda, public ve default olan degişken ve metodlara ulasılabilir
		 * ancak private degisken ve metodlara ulasılamaz
		 */
		
		
		
	}

}
