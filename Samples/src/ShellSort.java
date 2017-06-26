/**
 * Created by degget on 26.06.2017.
 */

import java.util.Arrays;

public class ShellSort {

    public static void shell(int[] a) {
        int increment = a.length / 2;
        while (increment > 0) {
            for (int i = increment; i < a.length; i++) {
                int j = i;
                int temp = a[i];
                while (j >= increment && a[j - increment] > temp) {
                    a[j] = a[j - increment];
                    j = j - increment;
                }
                a[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }

    public static void main(String[] args) {


        int[] myArr = new int[]{1, 23, 3, 8, 2, 4, 4, 26, 32, 48, 54, 1024, 575, 368, 10, 11};

        System.out.println("Array till sort");

        for (int i = 0; i < myArr.length; i++) {

            System.out.print(myArr[i] + " ");
        }
        System.out.println("");

        System.out.println("Array after sort");

        shell(myArr);

        for (int j = 0; j < myArr.length; j++) {

            System.out.print(myArr[j] + " ");
        }
    }
}

