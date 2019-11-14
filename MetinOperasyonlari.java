
public class MetinOperasyonlari {

	public static void main(String[] args) {

		String isim; // referans oluþtu
		isim = new String("Steven"); // string nesnesi oluþtu

		String soyisim = "King";
		String yas = new String("42");

		System.out.println("ad soyad=" + isim + " " + soyisim);
		System.out.println(isim.length()); // isim uzunluðu
		System.out.println(isim.charAt(2)); // 0 dan baþlar. Diziler üzerinde iþlem yapýlýyor gibi düþünebiliriz
		System.out.println(isim.substring(0, 3)); // 0 ile 3 arasýndaki karakterleri yazdýrýr 3 dahil deðildir.

		yas = new String("22"); // yeni deðer atama
		int stevenYasi = Integer.valueOf(yas);
		System.out.println("yas=" + stevenYasi);

	}

}
