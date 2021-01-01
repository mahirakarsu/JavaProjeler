
public class ThisKullanimi {
	int x = 1;
	int y =2;
	int z = 3;
	public ThisKullanimi() {
		this.x = 5;
	}
	public ThisKullanimi(int y) {
		this();
		this.y = 6;
	}
	public ThisKullanimi(int x , int y, int z) {
		this(y);

		this.z = z;
		/*
		 * bu constructor ile nesne olusturuldugunda once tek parametreyeli cons.'a gidicek
		 * sonra oradan parametresiz constructor'a gidicek
		 * ardýndan en bastaki degerleri(1,2,3) x,y,z degiskenlerie atadýktan sonra
		 * constructora geri donup sirasiyla once 5 degerini x degiskenine,
		 * sonra 6 degerini y degiskenine,
		 * en sonda da parametreden gelen degeri z degiskenine atýyacak
		 * this() ile cons. arasýnda gezilerek deger atamasý yapýlabilr
		 * bu sayede kod tekrarýndan kaçýnýlmýþ olur.
		 */
	}
	
	public void yaz() {
		System.out.println(" x : " + this.x + " y : " + this.y + " z : " +this.z);
	}
}
