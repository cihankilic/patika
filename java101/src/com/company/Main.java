import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Bu projede kullanıcının not girişini yaptığı 6 dersin
	   not ortalaması bulunduktan sonra kullanıcının geçme
	   durumu terminale yazdırılmaktadır.
	 */
        int mat, fizik,kimya, turkce, tarih, muzik;

        Scanner imp = new Scanner(System.in);

        System.out.println("Matematik ders notu: ");
        mat = imp.nextInt();

        System.out.println("Fizik ders notu: ");
        fizik = imp.nextInt();

        System.out.println("Kimya ders notu: ");
        kimya = imp.nextInt();

        System.out.println("Türkçe ders notu: ");
        turkce = imp.nextInt();

        System.out.println("Tarih ders notu: ");
        tarih = imp.nextInt();

        System.out.println("Müzik ders notu: ");
        muzik = imp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;

        double sonuc = toplam / 6.0;

        System.out.println("Ortalama Sonucu : "+ sonuc);

        

    }
}
