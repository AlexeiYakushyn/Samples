/**
 * Created by alexei.yakushin on 20.06.2017.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOfTwo {
    public static boolean powerOfTwo(int num) {
        return (num > 0) && ((num & (num - 1)) == 0);
    }

    public static void main(String[] args) throws IOException {

        // Enter the number to check
        BufferedReader scnr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("If you want to know if the number is a power of two, input the number!");
        int number = Integer.parseInt(scnr.readLine());
        System.out.println("");

        // check out
        if(powerOfTwo(number)){
            System.out.println("YES, the number is a power of two.");
        }else {
            System.out.println("NO, the number is Not a power of two.");
        }

        // descriptive small test
        System.out.println("");
        System.out.println("Check if 64 is power of two " + powerOfTwo(64));
        System.out.println("Check if 4096 is power of two " + powerOfTwo(4096));
        System.out.println("Check if 55 is power of two " + powerOfTwo(55));
        System.out.println("Check if 62 is power of two " + powerOfTwo(62));
        System.out.println("Check if -64 is power of two " + powerOfTwo(-64));

    }

}


