import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by degget on 29.05.2017.
 */
  /*
Сумма цифр трехзначного числа
*/
public class SumOfDigits {



        public static void main(String[] args) throws IOException {

            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(scanner.readLine());

            int num1 = num%10;
            int num2 = (num%100)/10;
            int num3 = (num%1000)/100;

            int sum = num3+num2+num1;

            System.out.println(sum);


        }

    }
