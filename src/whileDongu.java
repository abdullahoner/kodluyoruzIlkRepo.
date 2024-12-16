public class whileDongu {
    //
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    static void sum(int a, int b) {
        int toplam = a + b;
        System.out.println(toplam);
    }
    static void show()
    {
        System.out.println("Show metodu..");
        return;
    }

    public static void main(String[] args) {

        sum(7 ,9);
        show();

    }
}
