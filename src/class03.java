import java.util.Scanner;

public class class03 {
    public static void main(String[] args) {
        /*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */
        int a,b;
        double c;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. kenarı giriniz : ");
        a = scan.nextInt();

        System.out.print("2. kenarı giriniz : ");
        b = scan.nextInt();

        c = Math.sqrt((a*a)+ (b*b));

        System.out.println("Hipotenüs : "+ c);




    }
}
