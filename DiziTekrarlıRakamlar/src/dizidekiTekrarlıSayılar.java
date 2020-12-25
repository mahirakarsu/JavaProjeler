
public class dizidekiTekrarlıSayılar {
	public static void main(String[] args) {

		int[] dizi = { 4, 3, 7, 5, 7, 3, 5, 7, 4, 2, 8, 9 };

		int index = 0;
		for (int k = 0; k < dizi.length; k++) {
			// tum dizi donulur.
			int sayi = dizi[k];
			// her dongude bir sonraki rakam kontrol edilir.
			for (int i = k + 1; i < dizi.length; i++) {

				if (sayi == dizi[i]) {// aynı rakam var ise
					index = i;
					for (int j = index; j < dizi.length - 1; j++) {
						dizi[j] = dizi[j + 1];// bulunan rakam yerine bir sonraki rakam gelir
						index++;
					}
					dizi = sil(dizi);// kaydırma islemi sonraki fazla rakam diziden sililir.
				}
			}
		}

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]);
			// dizi yazdırılır.
		}
		
		

	}

	public static int[] sil(int[] dizi) {
		int[] yenidizi = new int[dizi.length - 1];
		for (int i = 0; i < dizi.length - 1; i++) {
			yenidizi[i] = dizi[i];
		}
		return yenidizi;
	}
}
