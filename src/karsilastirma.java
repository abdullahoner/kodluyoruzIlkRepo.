public class karsilastirma {
    public static void main(String[] args) {

        int a = 5, b = 10, c = 20;
        System.out.println(a == b);

        boolean kosul1 = (a < b);
        boolean kosul2 = (a > c);

        boolean sonuc = kosul1 || kosul2;

        System.out.println(sonuc);

        c = (a > b) ? 5 : 7;
        System.out.println(c);

        System.out.println("0000000000000000000000");
        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(++var2);
        System.out.println("0000000000000000000000");
        int i =1;
        while (i<=5){
            System.out.println(i);
            i++;
        }
    }
}
