import java.util.Scanner;

public class class01 {
    public static void main(String[] args) {

        /*
        not ortalamalarını hesaplama
         */
        Scanner scan = new Scanner(System.in);
        int sayac=0,tarih,muzik,matematik,turkce,fen,sosyal,toplam = 0;

        System.out.print("lütfen tarih notunuzu giriniz : ");
        tarih = scan.nextInt();
        toplam = toplam+tarih;
        sayac++;
        System.out.print("lütfen muzik notunuzu giriniz : ");
        muzik = scan.nextInt();
        toplam = toplam+muzik;
        sayac++;
        System.out.print("lütfen matematik notunuzu giriniz : ");
        matematik = scan.nextInt();
        toplam = toplam+matematik;
        sayac++;
        System.out.print("lütfen turkce notunuzu giriniz : ");
        turkce = scan.nextInt();
        toplam = toplam+turkce;
        sayac++;
        System.out.print("lütfen fen notunuzu giriniz : ");
        fen = scan.nextInt();
        toplam = toplam+fen;
        sayac++;
        System.out.print("lütfen sosyal notunuzu giriniz : ");
        sosyal = scan.nextInt();
        toplam = toplam+sosyal;
        sayac++;

        System.out.println("ortalamanız : "+toplam/sayac);



    }
}
