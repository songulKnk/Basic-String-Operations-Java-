
public class MetinOperasyonlari {

	public static void main(String[] args) {

		String isim; // referans olu�tu
		isim = new String("Steven"); // string nesnesi olu�tu

		String soyisim = "King";
		String yas = new String("42");

		System.out.println("ad soyad=" + isim + " " + soyisim);
		System.out.println(isim.length()); // isim uzunlu�u
		System.out.println(isim.charAt(2)); // 0 dan ba�lar. Diziler �zerinde i�lem yap�l�yor gibi d���nebiliriz
		System.out.println(isim.substring(0, 3)); // 0 ile 3 aras�ndaki karakterleri yazd�r�r 3 dahil de�ildir.

		yas = new String("22"); // yeni de�er atama
		int stevenYasi = Integer.valueOf(yas);
		System.out.println("yas=" + stevenYasi);

	}

}
