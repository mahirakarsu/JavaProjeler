
public class passByValue {
	public static void main(String[] args) {
		
		int x = 5;
		System.out.println("Before invoke the metod : " + x);
		increment(x);
		
		System.out.println("after invoke the metod : " + x);
		
	}
	
	public static void increment(int x) {
		x++;
		//yeni bir x degiþkeni yaratýldý. yaratýlan x degiþkeni parametre ile gelen
		// x degiþkeninden farklý. bu yuzden metod icinde yapýlan degiþiklik
		// x degiskenini etkilemez
		System.out.println("value in metod : " + x);
	}
}
