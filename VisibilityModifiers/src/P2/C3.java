package P2;

import P1.C1;

public class C3 {

	void aMethod() {
		C1 o =new C1(); // C1 farklı pakette oldugu icin import edilmeli
		System.out.println(o.a); // a public oldugu icin erisilir
		//System.out.println(o.b);  b default oldugu icin farklı paketten erisilemez
		//System.out.println(o.c);  c private oldugu icin farklı paketten erisilemez
		
		o.m1(); // public bir metod oldugu icin erisilir
		//o.m2() 	default oldugu icin farklı paketten erisilemez
		// o.m3()  private oldugu icin farklı paketten erisilemez

		/*
		 * sonuc olarak aynı pakette iken public ve defaultlara erisilebilir
		 * private erisilemez
		 * farkli pakette ise sadece public olanlara erisilir
		 * default ve private olanlara erisilemez
		 */
		
	}
}
