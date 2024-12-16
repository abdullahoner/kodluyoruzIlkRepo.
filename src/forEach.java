import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int [] sayilar = {1,2,3,4,5};

        for (int i :sayilar) {
            //System.out.println(i);
        }
    int [][] numbers = {{1,2,3},{4,5,6},{7,8,9,},{10,11,12}};

        for (int i = 0; i < numbers.length ; i++) {

            for (int j = 0; j <numbers[i].length ; j++) {
                //System.out.println(numbers[i][j]);
            }
        }

        System.out.println(Arrays.binarySearch(sayilar, 4));

    }
}
