import java.util.Scanner;

public class class02 {
    public static void main(String[] args) {
        /*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV
oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */


        double kdvTutari,kdvliTutar,kdvsizTutar,kdvOrani = 0.18;

        System.out.println("ürün tutarı giriniz");
        Scanner tutar = new Scanner(System.in);

        kdvsizTutar = tutar.nextDouble();
        if (kdvsizTutar>999) {
            kdvliTutar = kdvsizTutar + (kdvsizTutar * kdvOrani);

            kdvTutari = kdvliTutar - kdvsizTutar;

            System.out.println("kdv tutarı : " + kdvTutari +
                    "\n kdvli tutar : " + kdvliTutar +
                    "\n kdvsiz tutar : " + kdvsizTutar+
                    "\n kdv oranı : "+ kdvOrani);
        }else{
           kdvOrani = 0.8;
            kdvliTutar = kdvsizTutar + (kdvsizTutar * kdvOrani);

            kdvTutari = kdvliTutar - kdvsizTutar;

            System.out.println("kdv tutarı : " + kdvTutari +
                    "\n kdvli tutar : " + kdvliTutar +
                    "\n kdvsiz tutar : " + kdvsizTutar+
                    "\n kdv oranı : "+ kdvOrani);

        }


    }
}
