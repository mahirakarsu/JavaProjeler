
public class passByValue {
	public static void main(String[] args) {
		
		int x = 5;
		System.out.println("Before invoke the metod : " + x);
		increment(x);
		
		System.out.println("after invoke the metod : " + x);
		
	}
	
	public static void increment(int x) {
		x++;
		//yeni bir x degi�keni yarat�ld�. yarat�lan x degi�keni parametre ile gelen
		// x degi�keninden farkl�. bu yuzden metod icinde yap�lan degi�iklik
		// x degiskenini etkilemez
		System.out.println("value in metod : " + x);
	}
}
