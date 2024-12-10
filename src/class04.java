import java.util.Scanner;

public class class04 {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
         */

        Scanner scan = new Scanner(System.in);
        int km;
        double perKm = 2.20,total,startPrice = 10;
        System.out.print("mesafeyi giriniz : ");
        km = scan.nextInt();



        total = (km*perKm);
        total +=startPrice;


        if (total<19){
            System.out.println("tutar : 20 TL");
        }else {
            System.out.println("tutar : "+total);
        }
    }
}
